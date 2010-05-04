:begin

echo off

set CURRENT_DIR=%cd%
REM echo %CURRENT_DIR%
goto deploy

:install-motu-api-message
cd %CURRENT_DIR%\..\motu-api\motu-api-message
call mvn -Dmaven.test.skip=true -P %1 clean install 

:install-motu-api-rest
cd %CURRENT_DIR%\..\motu-api\motu-api-rest
call mvn -Dmaven.test.skip=true -P %1 clean install 

:install-motu-library-converter
cd %CURRENT_DIR%\..\motu-library\motu-library-converter
call mvn -Dmaven.test.skip=true -P %1 clean install 

:install-motu-library-inventory
cd %CURRENT_DIR%\..\motu-library\motu-library-inventory
call mvn -Dmaven.test.skip=true -P %1 clean install 

:install-motu-library-misc
cd %CURRENT_DIR%\..\motu-library\motu-library-misc
call mvn -Dmaven.test.skip=true -P %1 clean install 

:install-motu-processor-wps
cd %CURRENT_DIR%\..\motu-processor\motu-processor-wps
call mvn -Dmaven.test.skip=true -P %1 clean install 

cd /D %CURRENT_DIR%
:install-motu-web
REM echo install atoll-motu-web
call mvn -Dmaven.test.skip=true -P %1 clean install 

:deploy

echo undeploy motu-web with profile '%1'
call mvn -Dmaven.test.skip=true -P %1 cargo:deployer-undeploy 
echo deploy motu-web with profile '%1'
call mvn -Dmaven.test.skip=true -P %1 clean package  cargo:deployer-deploy 


:end