# Driver Generator
## Description
This tool is intended to generate driver classes to protocol the internal state of an object instance during execution. 
Currently, for the generation, all parameter-less public methods of the source class returning a value, are considered as methods providing the _internal_ object state data. 
All other public methods are considered methods which probably influence the object state. Providing a list of methods can be used to restrict them further.

The purpose of the generated classes is to expose only methods, and to delegate only to those methods of the source class, which are likely to change the internal state of the object. On every call of such state changing method, the _internal_ state of the object is recorded to a file.

In further consequence, this object state data could then be used to _learn_ the internal relations and behavior of an object instance and to detect deviations. 

## Building
The project is built with maven and comes with preconfigured launch configurations for the Eclipse IDE. A call to `mvn verify` should create the jar driver-generator-<version>jar-with-dependencies.jar in the target directory.

## Usage
### Calling DriverClassGenerator (csv configuration required)
For now, the call of DriverClassGenerator requires to specify the argument `-csv=<Resourcename>` as the first argument. This file specifies configures the classes and its methods that should be considered during driver class generation.

The CSV-File has to contain a column for the fully qualified class name and the modifying methods, and can additionally contain a third column with methods representing the internal state.

If no state methods are provided for a class, the default behaviour will collect all remaining public methods without parameter and consider those as representing the internal state.

#####  Note:
Because a method cannot be considered modifying and representing the internal state at the same time, all methods present in the first method list, will be ignored when collecting methods for internal state.

#### Example setup
When specifying a file instead of lising classes, only specified methods are considered modifying.

The file has to be located in /src/main/resources/ when running in Eclipse. When running the jar, File either has be provided in /src/main/resources/ before building the jar - or specified with its path relative to the jar-file.

For example

`experiment.util.Stack,push pop clear,isEmpty size peek`

can be used for generating a testdriver for Stack, which provides actually modifying methods for calling.

An example call to run that, is
`java -cp collection-experiment.jar;driver-generator-0.0.1-SNAPSHOT-jar-with-dependencies.jar at.scch.test.internalstate.driver.generator.DriverClassGenerator -csv=MethodLists.csv`

The example file src/main/resources/MethodLists.csv contains a proposal configuration for all containers in experiment.util.

Any further arguments will be ignored. Mixing of approaches is currently not possible.

### Optional: Specifying output directory
Per default, files are generated into drivers_generated. You can overwrite this behaviour with VM argument `-Doutputdir=<path>`.

### Optional (only concerns resulting Drivers): Seed and Limit in Driver-Output
Every testdriver generates a csv-File as output. By specifying `-Dseed=` and `-Dlimit=` when running the Driver (e.g. when running junit), the resulting filename will be adapted accordingly.

## Limitations
Currently generation supports only classes which expose a public or protected parameter-less constructor.