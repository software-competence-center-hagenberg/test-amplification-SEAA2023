package at.scch.test.util;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

class TestNumberSlicerTest {

	@Test
	void testSlice01() throws Exception {
		String filePath = "Regression_ArrayListTest_54676380_1024_0.java";
		// TestNumberSlicer.main(new String[]{"-f", file, "-s", "test021("});
		TestNumberSlicer testNumberSlicer = new TestNumberSlicer(loadResource(filePath));
		String result = testNumberSlicer.sliceBeforeTest("test021", Paths.get("Regression_ArrayListTest_54676380_20_s"), false);

		byte[] file1Bytes = Files.readAllBytes(Paths.get(loadResource("expected_result_testSlice01.txt").getAbsolutePath()));
		String expectedString = new String(file1Bytes, StandardCharsets.UTF_8);

		assertEquals(expectedString, result, "The content in the strings should match");
	}

	private File loadResource(String path) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(path).getFile());
		System.out.println(file.getAbsolutePath());

		return file;
	}

}
