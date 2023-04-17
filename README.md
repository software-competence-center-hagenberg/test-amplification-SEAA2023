# Test Amplification - SEAA2023
This repository contains the data and tools used for the published evaluation of an approach to generate amplified regression tests

## General Information
The experiment to evaluate the approach has been executed on a desktop computer equipped with a 4 core (8 logical) Intel(R) i7-6700 CPU and 32 GB RAM running Windows 10 operating system. Output at the command line and the generated report files have been used to collect data and compile a data table manually as source for further analysis of the results.

All content of the repo is provided without warranty of any kind.

List of most important dependencies used:
* [Randoop 4.2.5](https://github.com/randoop/randoop/releases/tag/v4.2.5): for random test case (sequence) generation
* [PiTest 1.6.3](https://mvnrepository.com/artifact/org.pitest/pitest-maven/1.6.3): for mutation testing
* [JUnit 4.12](https://mvnrepository.com/artifact/junit/junit/4.12): as the used test framework
* [CSV-Comparator 1.2.0](https://mvnrepository.com/artifact/com.github.ngoanh2n/csv-comparator/1.2.0): for comparing the recorded state object data during test execution

## Where to find what?
The following is a rough overview of the contents of the repository's subdirectories. Some additional info can be found in the corresponding sub directories itself.

1. **collection-m00** contains source code of the SUT (custom collection class implementation), scripts for automation and rerunning the evaluation experiment `tcg-experiment.util.bat` and `pitest-experiment.util.bat`
2. **driver-generator** contains a tool to create the test adapter, that is able to collect the _internal_ object state data during test execution, semi-automatically (configuration file is needed: see `src/main/resources/experiment.util_config.csv`)
3. **util-testnumberslicer** contains a tool (maven project) that is used to create from a single multi-test file like _Regression_ArrayListTest_54676380_1024_0.java_ a number of test files with a limited number of test cases, i.e. _Regression_ArrayListTest_54676380_16_s.java_ which contains just the first 16 tests of the source file. In addition the batch file `tcs-experiment.util.bat` is provided which has been used to conduct the experiment.

## How the experiment and evaluation were conducted?
The following list gives a coarse-grained, simplified overview of the steps carried out.

1. create driver for SUT (classes): prepare necessary configuration which specifies object state revealing methods and apply **driver-generator**
2. create test cases against created test adapter: Use these generated test adapter classes as target classes to create a certain amount of random test cases for every collection class by applying Randoop (e.g. 1024 test cases) and using provided scripts in **collection-m00** 
	1. split initially generated test case files to files with given number of test cases using **util-testnumberslicer**. 
3. run comparision of the bug-finding capability by running mutation testing script (you have to ensure that created tests and test driver classes are located at the correct/configured location - see example batch file `pitest-experiment.util.bat`)
4. the output of the script is saved to a file from which important data has been extracted manually to a spreadsheet for further analysis and evaluation of the results.
5. results of the experiment run, important configuration files and the evaluation results have been archived under path `collection-m00/results/experiment.util_seaa/run_7`