package at.scch.test.util;

import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.Option;

@CommandLine.Command(name = "testnumberslicer", mixinStandardHelpOptions = true, version = "testnumberslicer 0.1", showDefaultValues = true,
description = "uses given test input file and removes all content after test method with given name and saves it with appropriate name")
public class TestNumberSlicerMain implements Callable<Integer> {

	@Option(names = {"-f", "--testFile"}, description = "The test file to split.", required=true)
	File testFile;

	@Option(names = {"-s", "--searchString"}, description = "Name of the test as marker to remove content of the file", required=true)
	String searchString;
	
	@Option(names = {"-o", "--outputLocation"}, description = "Path to write resulting test file to.", required=true)
	Path outputLocation;
	
	public static void main(String[] args) throws Exception {
		System.exit(new CommandLine(new TestNumberSlicerMain()).execute(args));
	}
	
	@Override
	public Integer call() throws Exception {
		
		TestNumberSlicer testNumberSlicer = new TestNumberSlicer(testFile);
		testNumberSlicer.sliceBeforeTest(searchString, outputLocation, true);
		
		
		return 0;
		
	}

}
