echo [INFO] Use maven eclipse-plugin download jars and generate eclipse project files.
echo [Info] Please add "-Declipse.workspace=<path-to-eclipse-workspace>" at the end.
cd ..
mvn eclipse:clean eclipse:eclipse
