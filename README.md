# Encapsulation-in-Java
 Encapsulation is a fundamental concept in object-oriented programming.Encapsulation is a way to protect important parts of code by making them private and inaccessible from outside. This helps to prevent  unauthorized access. However, in order to allow controlled access, we use setters and getters.This helps in controlling access to the data and ensures the integrity of the 
object.

## Introduction

Encapsulation is one of the four fundamental OOP concepts, along with inheritance, polymorphism, and abstraction. This repository focuses specifically on encapsulation and demonstrates how it enhances modularity, flexibility, and security in Java programs.

### 1. Encapsulation
- **Description**: The concept of bundling the data (attributes) and methods (functions) that operate on the data into a single unit known as a class.
- **Benefits**: 
  - Access control: Restricts direct access to some of an object's components.
  - Modularity: Encourages a clear separation between an object's internal state and external interactions.
  - Flexibility: Allows the internal implementation of a class to change without affecting its users.


## Introduction

In Java, a constructor is a special type of method that is used to initialize objects. It is called when an object of a class is created. This repository explores various aspects of constructors, including their types, usage, and best practices.
This repository provides examples and explanations for understanding constructors in Java. Constructors are special methods used to initialize objects, and they play a crucial role in the object-oriented programming paradigm. This collection aims to help  beginners to grasp the concepts and best practices related to constructors in Java.

### 1. Constructors
- **Description**: Special methods used for initializing objects when they are created.
- **Types**:
  - Default Constructor: Automatically provided by Java if no constructor is defined.
  - Parameterized Constructor: Accepts parameters for initialization.
  - Copy Constructor: Creates a new object by copying the attributes of an existing object.
**Example**:
  public class MyClass {
      private int value;

      // Default constructor
      public MyClass() {
          this.value = 0;
      }

      // Parameterized constructor
      public MyClass(int value) {
          this.value = value;
      }
  }
