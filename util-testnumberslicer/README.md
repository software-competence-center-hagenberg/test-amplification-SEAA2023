# Util Test File Slicer
## Description
This command line tool uses given test input file and removes all content after test method with given name and saves it with appropriate name.

In our context it is used to split a test file with a given number of generated and ascending numbered tests into several test files with specific number of tests (see example batch file `tcs-experiment.util.bat`)  

## Building
The project is built with maven. A call to `mvn verify` should create the jar util-testnumberslicer-<version>jar-with-dependencies.jar in the target directory.

## Usage
Calling resulting java archive file (e.g. `java -jar target/util-testnumberslicer-0.0.1-SNAPSHOT-jar-with-dependencies.jar` provides appropriate usage info.

Note: for example usage see `tcs-experiment.util.bat` which uses the the folder **test2slice** as source and target folder for test files and which assumes source files to follow a certain naming convention. 
