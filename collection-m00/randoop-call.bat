set regressionname=Regression_%2Test_%3_%4_
set errorname=Error_%2Test_%3_%4_
java -classpath C:/Users/klammer/.m2/repository/com/google/guava/guava/28.2-jre/guava-28.2-jre.jar;C:/Users/klammer/.m2/repository/com/univocity/univocity-parsers/2.8.4/univocity-parsers-2.8.4.jar;C:/Users/klammer/.m2/repository/com/github/ngoanh2n/csv-comparator/1.2.0/csv-comparator-1.2.0.jar;target\classes;target\test-classes;bin;C:\temp\randoop-all-4.2.5.jar randoop.main.Main gentests --testclass=%1.%2TestDriver --junit-output-dir=src/test/java/ --regression-test-basename=%regressionname% --error-test-basename=%errorname% --junit-package-name=%1.test --randomseed=%3 --output-limit=%4 --junit-before-each=before_snippet --junit-after-each=after_snippet --omit-methods=matchInternalStateSnapshot
set package=%1
set path2Delete=%package:.=\%
del src\test\java\%path2Delete%\test\*.class
del src\test\java\%path2Delete%\test\%regressionname%.java
rem del *seed0_limit0.csv