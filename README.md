# Lab 6: Doubly Linked List

## Objective.
- Create a `Node<E>` class using generics to hold a value and the prev/next node in the list.
- Using `Node`, implement a `DoublyLinkedList` class that implements the provided `List` interface.
- Test your program by writing test cases using `JUnit` with 80% code coverage.

### Node<E> Class

You will use this `Node<E>` class to represent a node in your `DoublyLinkedList`. This class should be able to hold a value 
of any type and the previous/next node when appropriate. When there is no previous or next node, the values should be `null`.
Create and implement the class as you see fit with necessary instance variables, constructors, and getter/setter methods, 
keeping in mind how it will be used by other classes.

In addition to the required `Node` functionality, your `Node` class should include the following methods.

- Overrides `String toString()` to print out the value of the node
- Overloads `boolean equals(Node<E> node)` and returns true if the nodes are equivalent and false otherwise

As an example `Node` class should print `rubber goose` and `false` when the following program is run.
**This is not a comprehensive test of the functionality of your class. You are responsible for rigorously testing your own program.**

```
Node<String> first = new Node<>("obtuse");  
  
Node<String> next = new Node<>("rubber goose");  
first.setNextNode(next);  
next.setPrevNode(first);  
  
Node<String> after = new Node<>("guava juice", next);  
next.setNextNode(after);  
System.out.println(after.getPrevNode().getValue()); // "rubber goose"  
  
Node<String> last = new Node<>("giant snake");  
System.out.println(next.equals(last));
```

### DoublyLinkedList

Create a class `DoublyLinkedList<E>` that implements the provided `List` interface. This class should implement a doubly 
linked list of a generic type using `Node<E>`. 

Since your class implements the `List` interface, your class must contain (at least) all the methods defined by the interface. 
They should fulfill the functionality described by the comments in the interface and throw all exceptions as described. 
You may add any private helper methods or private instance variables you need to complete the functionality of the class.
You will at least need to a default constructor that creates an empty list.

*Tip:* Create a new class called `DoublyLinkedList` then add `implements List` to the header. Then use the context actions
to populate your class with all the required method headers and Javadoc comments(this will save you a lot of time!). 
Since you are implementing an interface that uses generics, you will need to use `Object` in place of `E` for your program. 
If you run into errors when creating and manipulating node, _casting_ should help resolve the error.

Your class should produce the stated output for the given program.
**This is not a comprehensive test of the functionality of your class. You are responsible for rigorously testing your own program.**

```
DoublyLinkedList<Integer> list = new DoublyLinkedList<>();  
list.add(10);  
list.add(20);  
list.add(30);  
System.out.println(list.toString()); // [10, 20, 30]  
  
list.add(2, 40);  
list.add(0, 5);  
list.set(2, 50);  
System.out.println(list.toString()); // [5, 10, 50, 40, 30]  
  
list.remove(4);  
list.remove(2);  
System.out.println(list.size()); // 3  
System.out.println(list.toString()); // [5, 10, 40]
```
### JUnit

This lab, we are going to start **JUnit testing**. JUnit is a framework for creating and running test cases in your project. 
From here on out, you will need to write appropriate JUnit tests for all of your projects. For this lab, create a class
called `DoublyLinkedListTest` for your test cases.

*Tip:* To easily create your test class, put your cursor in your class header and press 'Alt-Enter' then select 'Create test'.
From the menu, you can then select all the methods you want to create tester methods, and it will auto-generate your class
for you. Then, use context actions again to add to the correct library to your classpath. This is often significantly easier
than searching for the necessary package.

The number of tests you write doesn't matter as much as the quality of your tests. One way to assess test quality is through 
**code coverage** (how many lines of source code have been run by the test cases). When you run your tests, you can generate 
a code coverage report which will tell you what percentage of the lines of code in your main program were executed by the 
test cases. The first 80% is generally straightforward to cover; it's the last 20% that is tricky. Ideally your test cases 
will cover all 100%, but for this project we will aim for 80%.

When writing test cases, focus not just on writing tests to test the accuracy of your code, but the resiliency. Write tests 
to check that your code is throwing errors when appropriate and rejecting inaccurate input. Coming up with these **edge cases** 
can be difficult, but is often the most valuable part of testing.

**Resources**
- [Getting Started with JUnit 5](https://www.jetbrains.com/help/idea/junit.html)
- [Creating Tests](https://www.jetbrains.com/help/idea/create-tests.html)
- [Running Tests with Coverage](https://www.jetbrains.com/help/idea/running-test-with-coverage.html#run-config-with-coverage)
- [Reading the Coverage Report](https://www.jetbrains.com/help/idea/viewing-code-coverage-results.html)


### Javadoc

For your `Node` class and `DoublyLinkedList` class, generate proper Javadoc documentation. The classes you generate to run 
your JUnit test do not have to commented using Javadoc notation, but should still include inline comments and follow style 
conventions to make their function understandable to an outside user.

## Rubric

**Rubric**

*Course Content*

- 6 points - All required items are present.
- 5 points - Task was completed, but supplementary materials are weak or missing.
    - Code was uncommented.
    - Solution is correct but is significantly difficult to read, highly inefficient, very clumsy, very difficult to extend etc. From the original Jargon File, we would refer to solutions like this as *kluge*.
    - Reflection questions related to content were incorrect.
- 4 points - Task was attempted, but is missing major components.
    - Coding prompt was only partially completed
    - Some deliverables are missing
- 3 points - Did not attempt or student should reattempt.

*Workforce Readiness*

- 4 points - Exemplified  WFR standards
    - Language is professional.
    - Work is clear and easy to read.
    - Used deductive reasoning guide solution.
    - Reflection on own work was thoughtful and honest.
- 3 points - Practiced WFR standards
    - Language is readable but not professional.
    - Work is understandable but not completely clear.
    - Reflection on own work was weak.
    - Citations were not complete.
- 2 points - Developing WFR standards
    - Work is unprofessional. Significant spelling or grammar errors.
    - Did not attempt or student should reattempt.


---
# Style Guidelines
## Lab 6: Style Guide

### Comments

The expectations for Javadoc comments are the same as the previous lab.  [Here is the IntelliJ  documentation](https://www.jetbrains.com/help/idea/javadocs.html) again if you need more information. In addition to Javadoc comments, your code should include regular comments to explain anything that is not immediately obvious.

# Data Structures Style Guide

In this course, we will not only practice writing code but how to write good code. Learning how to write good code  includes a number of stylistic conventions. As we move further into the course, the expectations for appropriate  style and documentation will become more extensive as we continue to practice. It is expected that you keep the style  guidelines introduced in previous assignments in mind during the current assignment. This document will include a generic introduction to aspects of style relevant to this class in addition to specifics regarding this assignment.

## Types of Style Guidelines

There are six main categories of guidelines to look out for during this course.

### Formatting


Formatting refers to the way code is structured. This includes indentations, brackets, and whitespace. Using clear and  consistent formatting throughout makes writing and reading code easier. It is even more important when multiple people  are working on the same program. In IntelliJ, there are built-in formatting rules which you can apply by:

- Going in the _Code_ menu and selecting _Reformat Code_.
- Using the keyboard shortcut, which by default is Ctrl+Alt+L on Windows and Opt+Cmd+L on Mac.

### Comments

Comments are statements of code that are not executed by the compiler or interpreter. We use them to explain what  different pieces of do. Regardless of the complexity of the program, commenting all of your work appropriately is a good  habit to get into.

In general, your comments should:

- Be concise: only write as much as is necessary to convey relevant information
- Help the reader: write them with the intention of a third party using them to understand your code, especially if it  is not immediately obvious
- Break the code into smaller units: Comments help separate code at logical breaks like the beginning of a loop, a new  step in a larger calculation, or at the beginning of a function

Commenting can be used as part of an effective code writing strategy as well. Instead of commenting after the code is  written, try commenting before writing the code. By breaking down your program logically into smaller chunks and then  working on those small chunks individually, you can avoid some bugs and logical errors

#### Javadoc

Javadoc is a tool that generates Java code documentation in the HTML format from Java source code. The documentation is  formed from Javadoc comments that are usually placed above classes, methods, or fields.
### Naming

Naming variables, constants, functions, and classes is key to writing good code. Names should help the reader understand  what is going on in your program.

In general, names should be:

- Accurate and informative: Names should reflect the contents or purpose of the entity as much as possible
- Concise: Names should be as concise as possible without sacrificing the above bullet point too much. It's a balance.
- Consistent: Use consistent names and naming conventions throughout your programs. See the section below for more  information about Java-specific conventions.

#### Java Conventions

In Java there are a few different conventions programmers use.

- For variables and functions, we will typically use camelCase
- For constants, we use CAPS_SNAKE_CASES
- For files, we use UpperCamelCase

### Maintainability

Maintainable code is easy to work on, update, and change without the original author needing to be present.  Maintainability is a broad catch-all category for other aspects of good code that make it easy for you and others on  your team to work on and debug code.

### Efficiency

It is important to not only write code that is correct, but efficiently uses resources (primarily memory and time). We  will talk about this more extensively later in the course, but is something to keep in mind. Efficient code is  increasing important as we write code to handle larger and larger inputs.

### Concision

Your code should be as concise as possible without sacrificing readability. Just like with commenting, this is a  balance.  
