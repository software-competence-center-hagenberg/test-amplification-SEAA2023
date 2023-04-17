@echo off

set "seed_list=54676380 101322511 379375655 939145594 1082618794 1191369007 1256357748 1264048269 1321793073 2070236138"
set "limit_list=2 4 8 16 32 64 128 256 512"

rem set "seed_list=1082618794"
rem set "limit_list=32 64 128 256 512 1024"

echo ### start mutation testing

for %%l in (%limit_list%) do (
  set limit=%%l
	for %%s in (%seed_list%) do (
	  set seed=%%s
	  echo Run mutation testing for tests with seed %%s and test limit %%l.
	  call mvn org.pitest:pitest-maven:mutationCoverage -Dpitest.enableInternalStateCheck=false -Dpitest.targetTests=experiment.util.test.Regression_*Test_%%s_%%l_* -Dpitest.reportDirectory=%%s_%%l
	) 
)

for %%l in (%limit_list%) do (
  set limit=%%l
	for %%s in (%seed_list%) do (
	  set seed=%%s
	  echo Run mutation testing for tests with seed %%s and test limit %%l considering internal state.
	  call mvn org.pitest:pitest-maven:mutationCoverage -Dpitest.enableInternalStateCheck=true -Dpitest.targetTests=experiment.util.test.Regression_*Test_%%s_%%l_* -Dpitest.reportDirectory=%%s_%%l
	) 
)

echo ### finished mutation testing ###
