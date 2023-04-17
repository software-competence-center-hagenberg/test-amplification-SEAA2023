set package=%1
set testclasspath=%package:.=\%

javac -d .\target\test-classes -classpath .;%JUNIT%;target\classes\;target\test-classes\ src\test\java\%testclasspath%\test\*_%2Test_%3_%4_*.java

java -Dseed=%3 -Dlimit=%4 -classpath .;%JUNIT%;%HAMCREST%;target\classes\;target\test-classes\ org.junit.runner.JUnitCore %1.test.Regression_%2Test_%3_%4_