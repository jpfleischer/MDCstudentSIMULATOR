hi:
	mvn package
	java -jar target/gs-maven-0.1.0.jar

exe:
	"/c/Program\ Files\ \(x86\)/Launch4j/launch4j.exe /c/Users/stapm/cm/MDCstudentSIMULATOR/launch4j.xml"

test:
	mvn clean package
	java -jar target/gs-maven-0.1.0.jar
	