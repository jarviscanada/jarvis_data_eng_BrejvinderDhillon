# Introduction
The JavaGrep app is a Java 8 implementation of the Unix, Linux `grep` command. Specifically, it recursively searches through a specified directory for a given RegEx pattern and stores the found lines into an output file. There are two implementations, one with and the other without the usage of Lambda Functions. The former being `JavaGrepLambdaImp` and the latter `JavaGrepImp`.


Developing this application required learning many things, including but not limited to:
* Building projects using Maven, IntellijIDEA & Docker.
* Linking SDKs, viewing source code and familiarizing myself with leveraging Intellij's features.
* Java I/O, RegEx, Util and other packages.
* Java coding standards.
* Java 8's new Lambda Functions and Stream APIs.
* Logging and Error Handling with SLF4J.
* Unit testing with JUnit.

# Usage
Both implementations take three arguments:

Argument | Details | Example
--- | --- | ---
`regex` | The RegEx pattern we are searching for in the lines of the files. | `.*Romeo.*Juliet.*`
`rootPath` | The path to the uppermost directory where we want our search to begin. | `./data`
`outFile` | The name of the output file to write the results of the search. | `/out/grep.txt`

To run the application:
```bash
#Navigate to the grep directory
cd core_java/grep

#Compile and package the project
mvn clean package

#Run the application
#Approach 1: Classpath and class files
java -classpath target/classes ca.jrvs.apps.grep.JavaGrepImp regex rootPath outFile

#Approach 2: Jar file
java -cp target/grep-1.0-SNAPSHOT.jar ca.jrvs.apps.grep.JavaGrepImp regex rootPath outFile
```
To run the Lambda implementation of the application:
```bash
#In pom.xml, substitute
<mainClass>ca.jrvs.apps.grep.JavaGrepImp</mainClass>
#for
<mainClass>ca.jrvs.apps.grep.JavaGrepLambdaImp</mainClass>

#Compile and package the project
mvn clean package

#Run the application
#Approach 1: Classpath and class files
java -classpath target/classes ca.jrvs.apps.grep.JavaGrepLambdaImp regex rootPath outFile

#Approach 2: Jar file
java -cp target/grep-1.0-SNAPSHOT.jar ca.jrvs.apps.grep.JavaGrepLambdaImp regex rootPath outFile
```

# Pseudocode
The application revolves around a central process method with various helper functions. The pseudocode for the `process()` method is as follows.
```
matchedLines = []
for file in listFilesRecursively(rootDir)
    for line in readLines(file)
        if containsPattern(line)
            matchedLines.add(line)
writeToFile(matchedLines)
```

# Performance Issues
This application runs into performance issues when dealing with large files. An OutOfMemoryException will be thrown if the total file size of our inputs exceed the memory of our JVM. This can be overcome by:
* increasing the memory allocation of the JVM,
* using the Stream and Lambda implementation as Streams are eager and will not keep the files in memory,
* both.

# Improvements
* Instead of having two implementations, merge them into one. Either,
    * have another argument to specify which implementation to use or
    * automatically determine it by checking the size of the input files against our JVM.
* Add other grep options
* Allow the user to pick between recursive and non-recursive searches.
