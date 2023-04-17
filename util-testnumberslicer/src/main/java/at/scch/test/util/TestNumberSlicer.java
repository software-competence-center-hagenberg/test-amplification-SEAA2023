package at.scch.test.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class TestNumberSlicer{

	File testFile;
	String classNameString;

	public TestNumberSlicer(File testFile) {
		this.testFile = testFile;
		classNameString = "public class "+removeFileExtension(testFile.getName());
	}
	
	public String sliceBeforeTest(String searchString, Path outputLocation, boolean write) throws Exception {
		if(searchString == null) throw new IllegalArgumentException("Search string required!");
		if(outputLocation == null) throw new IllegalArgumentException("Output location required!");
		
		String outputClassNameString = "public class "+removeFileExtension(outputLocation.getFileName().toString());
		
		FileInputStream fis = new FileInputStream(testFile);
		InputStreamReader input = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(input);
		String data;
		String previousLine = new String();
		String result = new String();
		int i = 0;
		boolean found = false;

		while ((data = br.readLine()) != null) {
			i++;
			if(data.contains(classNameString)) {
				data = data.replace(classNameString, outputClassNameString);
			}
			if (data.contains(searchString)) {
				//System.out.println("line number -> " + i);
				found = true;
				break;
			}
			if(i>1) { //one line later
				result = result.concat(previousLine + "\n");
			}
			previousLine = data;
		}
		br.close();
		
		if(found) {
			result = result.concat("}\n");
		}
		
		//System.out.println(result);
		
		if(write) {
			FileWriter fileWriter = new FileWriter(outputLocation.toString());
			fileWriter.write(result);
			fileWriter.close();
		} else {
			System.out.println(result);
		}
		
		return result;
		
	}
	
	private String removeFileExtension (String filename) {
		return filename.replaceFirst("[.][^.]+$", "");
	}

}
