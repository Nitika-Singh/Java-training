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



#### Day 02 (Recap)

* Technically, if you want to create a new reference type, you define a class
* Class represents a real world entity
* Class has characteristics (variables) and behavior(methods)
* Create an instance of the class using __new__ keyword; Create objects by instantiating a class using __new__ keyword
* __Person sam = new Person();__
* sam is on the stack. The Person object is created on the heap
* 


#### Day 03 (Recap)

* String in Java is an immutable reference type
* String literals are stored in __String pools__
* Every literal has a reference from an object in the heap
* Strings can be created with or without using __new__ keyword
* When you try to change the value of a string, a new literal is created and a new implicit object is created on the heap to refer to the literal
* Lot of string manipulation leads to a lot of objects on the heap
* So strings are better used as Constants (final)
* If you want to manipulate strings use __StringBuffer__ class instead


#### Extensibility

* Class has attributes and methods
* When there is a __has-a__ relationship you represent that using variables in your class
* Car __has-a__ model, color, year of make
* Define a class and create model, color and yearOfMake variables
* __is-a__ relationship
* Car __is-a__ Vehicle
* Using a keyword __extends__

#### Rules of inheritance in Java

* Derived class constructor __SHOULD__ have a call to the __SUPER class__ constructor using __super__ keyword


#### Day 04 (Recap)

* Base class object is created when a derived class is instantiated.
* Base class can act as a reference to Derived class object

``` java
class Book {}
class HistoryBook extends Book {}
class MathsBook extends Book {}

Book b1 = new Book();
HistoryBook hb = new HistoryBook();

Book b = new HistoryBook();
b = new MathsBook();

void read(Book book) {
	book.flipPages();
}

read(new MathsBook());
read(new HistoryBook());

```

### abstract classes

* Similar to normal classes; can have variables; methods; constructors; can extends other classes;
* CAN have __abstract__ methods also
* Abstract methods are those that don't have any implementation; and are marked as __abstract__
* CANNOT be instantiated


### Day 05 (recap)

* __java.util__ contains collection classes
* List, Set and Map
* Set does not allow duplicates
* Map is a key-value pair collection
* Growable collections


* __Maven__ project or __Gradle__
* Maven gives you a structure for your project
* It is a build tool
* You can write code, run test cases, package your code
* You can include the libraries that you want to use


### Day 06 (recap)

* static keyword
* static means __shared__. Shared by all the objects of a class.
* There is only one copy of a static variable in the entire application
* You can initialize static members using static initializer block __static {}__
* Static members are loaded the first you access the class to instantiate or access a static member
* From static methods, you cannot access a __non-static__ member directly
* static methods are not overridden
* The more you use static methods, lesser the extensibility. Use static members judiciously

* Exception Handling
* try, catch, finally, throw, throws
* Checked and Unchecked exceptions
* Checked exceptions need to be handled in your program either using try-catch or giving a warning using throws keyword
* Any exception of type RuntimeException is an unchecked exception
* Modern libraries like Spring handle the exceptions internally, so use of finally, throws isn't a major issue.







