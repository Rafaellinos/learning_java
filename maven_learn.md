# Maven

- https://maven.apache.org/docs/history.html
- Maven always have a super pom.xml, and it changes from machine to machine (based on OS, maven version etc)
- Make sure to add all dependencies and versions to guarantee reproducible build (Pin versions)

- Maven plugins vs extensions:
  - plugins = task during build lifecycle (compile, test, package).
  - extensions = alter maven internal logic, not just build phase, like wagon-ssh, tekari-lifecycle

Exemple of extensions
```xml
<extensions xmlns="http://maven.apache.org/EXTENSIONS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/EXTENSIONS/1.0.0 http://maven.apache.org/xsd/core-extensions-1.0.0.xsd">
    <extension>
        <groupId>com.soebes.maven.extensions</groupId>
        <artifactId>maven-buildtime-profiler</artifactId>
        <version>0.2.0</version>
    </extension>
</extensions>
```

Maven default order:

```txt
--Validate:
Purpose: Checks if the project is correctly configured.
Example: Ensures all required info (like pom.xml) is available and dependencies are declared properly.

--Compile:
Purpose: Compiles the source code of the project.
Example: Turns your Java .java files into .class bytecode files.

--Test:
Purpose: Runs unit tests using a framework like JUnit.
Note: These tests shouldn't require packaging or deployment.

--Package:
Purpose: Bundles the compiled code into a distributable format.
Example: Creates a .jar, .war, or .ear file.

--Verify:
Purpose: Runs checks to ensure the package is valid.
Example: Runs integration tests, code quality tools, or validations.

--Install:
Purpose: Installs the packaged artifact to your local Maven repository.
Path: Typically ~/.m2/repository/

--Deploy:
Purpose: Uploads the artifact to a remote repository (e.g., Nexus, Artifactory).
When used: In CI/CD pipelines or for team-wide distribution.
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

    <groupId>example-maven</groupId>
    <artifactId>br.com.rafaellinos</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding> <!--prefer UTF-8 encoding-->
    </properties>
</project>
```

- commands
  - `mvn verify` run any checks on results of integration tests to ensure quality criteria are met
  - `mvn versions:display-plugin-updates` diagnose version problems
  - maven surefire plugin = The Surefire Plugin is used during the test phase of the build lifecycle to execute the unit tests of an application.
  - `mvn org.apache.maven.plugins:maven-dependency-plugin:3.3.0:analyze` list undeclared dependencies
  - `mvn dependency:tree`
  - `mvn org.owasp:dependency-check-maven:check` check security problems, like commons-beanutils with CVE-2014-0114
  - `mvn buildplan:list-phase` list of plugins in each phase
  - `mvn verify -X` can show a Stale source code that trigger a re-compile, delete commented files.
    - Delete files with all lines commented or exclude with maven-compiler-plugin+configuration excludes
    - see: `https://stackoverflow.com/questions/17944108/maven-compiler-plugin-always-detecting-a-set-of-sources-as-stale`
  - `mvn project-info-reports:dependencies` dependencies.html with dependency tree and licenses
  - `mvn licence:third-party-report` gives docs in browser (third-party-report.html) licenses

Ignore dependency
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactoryId>maven-dependency-plugin</artifactoryId>
    <version>3.1.2</version>
    <configuration>
        <ignoreUnusedDeclaredDependencies>
            org.junit.jupiter:junit-jupiter-engine
        </ignoreUnusedDeclaredDependencies>
    </configuration>
</plugin>
```

- maven mvnd:
  - `mvnd verify` faster (2seg to 10seg diff) 
  - incremental build

font: https://github.com/rfichtner/maven-survival-guide
