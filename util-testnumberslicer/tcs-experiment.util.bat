@echo off

SETLOCAL ENABLEDELAYEDEXPANSION

set "class_list=Stack LinkedList HashSet ArrayList TreeSet TreeMap HashMap"
set "seed_list=54676380 101322511 379375655 939145594 1082618794 1191369007 1256357748 1264048269 1321793073 2070236138"
set "limit_list=2 4 8 16 32 64 128 256 512"

rem set "class_list=Stack"
rem set "seed_list=54676380"
rem set "limit_list=128 256 512"


for %%l in (%limit_list%) do (
	SET /A lm = %%l
    SET /A search = %%l + 1
    rem echo !search!

	for %%s in (!seed_list!) do (
	  set seed=%%s
		for %%c in (!class_list!) do (
   		  set class=%%c
		  echo Slice test class %%c with seed %%s and test limit %%l.
	
		  if !search! LSS 10 (	
		    call java -jar target/util-testnumberslicer-0.0.1-SNAPSHOT-jar-with-dependencies.jar -f tests2slice/Regression_!class!Test_!seed!_1024_0.java -s test00!search! -o tests2slice/Regression_!class!Test_!seed!_!lm!_s.java
		  ) else (
		  	if !search! LSS 100 (
		      call java -jar target/util-testnumberslicer-0.0.1-SNAPSHOT-jar-with-dependencies.jar -f tests2slice/Regression_!class!Test_!seed!_1024_0.java -s test0!search! -o tests2slice/Regression_!class!Test_!seed!_!lm!_s.java
		    ) else (
  		      call java -jar target/util-testnumberslicer-0.0.1-SNAPSHOT-jar-with-dependencies.jar -f tests2slice/Regression_!class!Test_!seed!_1024_0.java -s test!search! -o tests2slice/Regression_!class!Test_!seed!_!lm!_s.java
		    )
		  )
		) 
	) 
)

echo ### finished ###





