Java Learning Journey
📌 By Aditya Saxena
This repository documents my Java learning journey as I prepare for backend development roles. Each day's progress is organized systematically, covering Java basics, object-oriented programming (OOP), and important interview questions.

📌 Day 1: Understanding Classes, Objects, and Reference Variables
1️⃣ What is a Class?
A class is a blueprint for creating objects. It defines properties (variables) and behaviors (methods).
Example: 
class Student {
    String name;
    int age;
    String favouriteSubject;
}
2️⃣ What is an Object?
An object is an instance of a class that has real data stored in memory.
Objects are created using the new keyword.
Example:
Student s1 = new Student();

3️⃣ Reference Variables
A reference variable holds the memory address of an object.
Example:
Student s1 = new Student();
Here, s1 is a reference variable pointing to an object of Student in heap memory.

4️⃣ Role of this Keyword
this refers to the current instance of a class.
It is used when local variables inside a constructor/method have the same name as instance variables.

Example:
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name; // Refers to instance variable
        this.age = age;
    }
}
5️⃣ How Objects are Created in Heap Memory
When new is used, the object is stored in Heap Memory.
The reference variable is stored in Stack Memory.
Example Memory Allocation:

Stack Memory                Heap Memory
-------------               -----------------------
s1 (Reference)  ----->   Student Object { name, age }


📌 Important Interview Questions
💡 These questions are commonly asked in interviews to test Java fundamentals.

1️⃣ What is the difference between a Class and an Object?
Feature	Class	Object
Definition	Blueprint of an entity	Instance of a class
Memory	No memory allocation	Takes memory in Heap
Example	class Car { }	Car c = new Car();

2️⃣ What is the purpose of this keyword in Java?
✅ this refers to the current instance of the class.
✅ It is used to resolve variable shadowing.
✅ It can also call other constructors in the same class (this()).

3️⃣ How is an Object stored in memory?
The reference variable is stored in Stack Memory.
The actual object is stored in Heap Memory.
The reference variable points to the memory address of the object.

4️⃣ What happens if we do not create a constructor in Java?
Java automatically provides a default constructor that initializes instance variables with default values.
