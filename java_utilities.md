# Java utilities

- dir:
  - /bin
    - jconsole = monitoring memory, heap, threads, etc
    - javac = compile file.java -> file.class
    - java = execute file.class
    - jshell = REPL java
  - /lib (libs for java dlls/.so, core jar's, JRE extensions, etc)


# Errors:

- NoClassDefFoundError = mismatch package name and folder structure
  - eg: package org.example => java src.main.java.org.example.Main (should execute from /java)
