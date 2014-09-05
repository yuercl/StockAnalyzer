echo [INFO] Package the jar in target dir.

cd ..

cat pom.xml | sed 's/<targetPath>.\/<\/targetPath>/<targetPath>..\/<\/targetPath>/g'  > pom.xml.package
mv pom.xml pom.old
mv pom.xml.package pom.xml
echo set targetPath = ../ for mvn package

mvn clean package -Dmaven.test.skip=true
rm pom.xml
mv pom.old pom.xml

cd target
echo jar file builed found
find ./ -maxdepth 1 -name '*.jar' -type f
echo rename jar file with parckage date...
JARTIME=`date +%F"-"%H%M%S | sed 's/-//g' | awk '{print $1".jar"}'`

FILENAMES=`find ./ -maxdepth 1 -name '*.jar' -type f`
for file in $FILENAMES
do
  jarName=`echo $file | sed 's/jar//g' | awk '{print $1}'`
  jarName=$jarName$JARTIME
  mv $file $jarName
done

echo rename jar end...
