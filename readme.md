# Hacker Rank - Java

## Description

Collection of various Hacker Rank problems written in Java.

## Categories in Progress

* **Algorithms**

## Structure

This repository aims to keep each category & sub categories in their own directory to reflect the structure of Hacker Rank's problem sets; e.g. algorithms -> warmup -> *problem*. Each problem will compile & able to be ran on the command line as well as, include a makefile & input.txt file to display the results. Each program is designed to consume the included input file.

## Program Execution

The following command is used to execute each of the programs:

```bash
java <program name> < input.txt
```

## Program Compilation

Each program has been compiled with the following command (included in the corresponding makefile):

```~$ javac <program name>.java```

At the time of writing, the compilation & execution of each of the programs has been done with Cygwin.

## Setup

The compilation & execution of each program requires a Java JDK. After installation of Java, it should be saved in the PATH variable like:

```bash
export PATH=$PATH:"/cygdrive/C/Program Files/Java/<jdk version>/bin/"
```

At the time of writing, compilation & execution has been tested with Cygwin