### Day 01

* Java is a programming language
* Statically-typed; int or boolean or string
* OO similar to C# ()
* __Platform independence__
* Compiled language
* Java is compiled to intermediate format called __bytecodes__
* Latest version of Java is __16__

#### What do you need to work with Java?

* Java Development Kit - __JDK__
* https://www.oracle.com/in/java/technologies/javase-downloads.html
* jdk folder contains a __bin__ folder
* bin contains all the tools
* bin folder contains tools like __javac__, __javadoc__, __java__

#### Hello world from a text editor

* Write a simple java program
* Compile it using java compiler - __javac__
* __javac MyFirstProgram.java__
* Compiler creates an intermediate file called __.class__ file
* .class file contains __bytecodes__
* Run it
* The tool that is used to run your java code is called __Java runtime__
* Also popularly known as Java Virtual Machine or __JVM__
* JRE, JVM, Java runtime
* Discuss it


#### Data types

* Datatypes SHOULD be specified for the variables
* Can be __int, long, boolean, double, char__
* These are called __primitive data types__
* The variables are usually stored in the stack.
* Every function gets executed in a separate stack frame. Similar to a shelf in a cupboard(stack)
* All the variables defined inside a function are called __local__ variables
* Their scope is __local__.
* All local variables MUST BE initialized to some value before using them

### Day 01 (recap)

* JDK; Tools like compiler, jvm
* public static void main(String[] args)
* Primitive data types; int, long, double, boolean, char
* JVM takes care of memory;
* Stored in stack; Every function gets executed in a stack; all the local variables are stored in the stack
* Local variables have to initialized before you use them
* Arrays; fixed sized collection
* Arrays are __reference types__ they are stored on the heap
* All primitive types are passed by value by default
* A copy of the value is taken and passed to the function. Changes made in the function does not get reflected

#### Reference types

* Strings, Arrays are examples of ref types
* Usually created using __new__ keyword
* Stored on the heap
* References are stored in the stack. THey actual object is stored on the heap
* Custom reference types
* __Class__






















