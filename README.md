# Automation as API
Running automation as API with the help of java springboot. User can run the test by calling the corrosponding API. Gradle used for build automation

### Prerequisites
Java SDK 8 and above

### Build
Navigate to the directory 
For windows 
```
gradlew.bat clean build
```

For linux
```
gradlew clean build
```

### Running the code
Navigate to build/libs folder and run the below command
```
java -jar testGNdemo-0.0.1-SNAPSHOT.jar
```
Automation suite API will be started in 8080 port. Following two APIs are created in this suite
1. http://localhost:8080/google - By calling this API, First test will get executed.

2. http://localhost:8080/testodev - By calling this API, Second test will get executed.

## Authors
* **Vishnu A R** 

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


