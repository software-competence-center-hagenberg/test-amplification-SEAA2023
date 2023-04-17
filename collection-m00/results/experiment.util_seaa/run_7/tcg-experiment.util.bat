@echo off

set "class_list=Stack LinkedList HashSet ArrayList TreeSet TreeMap HashMap"
set "seed_list=54676380 101322511 379375655 939145594 1082618794 1191369007 1256357748 1264048269 1321793073 2070236138"
set "limit_list=2 4 8 16 32 64 128 256 512 1024"

rem set "class_list=Stack LinkedList HashSet ArrayList TreeSet TreeMap HashMap"
rem set "seed_list=101322511 379375655 939145594 1082618794 1191369007 1256357748 1264048269 1321793073 2070236138"
rem set "limit_list=2 8 32 128 512"

for %%l in (%limit_list%) do (
  set limit=%%l
	for %%s in (%seed_list%) do (
	  set seed=%%s
		for %%c in (%class_list%) do (
		  set seed=%%c
		  echo Create tests for class %%c with seed %%s and test limit %%l.
		  call randoop-call.bat experiment.util %%c %%s %%l
		) 
	) 
)

echo ### finished test generation ###





