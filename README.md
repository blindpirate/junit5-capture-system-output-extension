## A JUnit 5 extension to capture stdout/stderr in tests

The original code is [here](https://github.com/sbrannen/junit5-demo/blob/master/src/test/java/extensions/CaptureSystemOutputExtension.java), 
this repo is just publishing it to maven central repository.

## Usage

Maven:

```
<dependency>
     <groupId>com.github.blindpirate</groupId>
     <artifactId>junit5-capture-system-output-extension</artifactId>
     <version>0.1.1</version>
     <scope>test</scope>
</dependency>

```

Gradle:

```
repositories {
    mavenCentral()
}

testCompile 'com.github.blindpirate:junit5-capture-system-output-extension:0.1.1'
```
