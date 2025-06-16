 
### ✅ FIXED VERSION of README.md (with correct styling and formatting):

````markdown
# 📘 Object-Oriented Programming (OOP) in Java

This repository/document explains core Object-Oriented Programming concepts in Java with code examples, real-world analogies, and key notes for beginners and intermediate learners.

---

## 🔹 1. Class vs Object

- A **class** is a template or blueprint for creating objects.
- An **object** is an instance of a class that occupies memory.

```java
class Car {
    String color;
    void drive() {
        System.out.println("Driving...");
    }
}

Car myCar = new Car(); // Object creation
````

---

## 🔹 2. Object Properties

Each object has:

* **State** – The data it holds (`color = "Red"`)
* **Identity** – Unique reference (memory location)
* **Behavior** – What it can do (`drive()` method)

---

## 🔹 3. Dot Operator (`.`)

Used to access fields and methods of an object.

```java
myCar.color = "Blue";
myCar.drive();
```

---

## 🔹 4. The `new` Keyword

* Allocates memory at runtime.
* Returns a reference to the newly created object.

```java
Box myBox = new Box();
```

* Here, `Box` is the class.
* `myBox` is the reference variable.
* `new Box()` creates the object in memory.

---

## 🔹 5. Constructor

* A **constructor** is called when an object is created.
* It initializes the object.

```java
class Car {
    Car() {
        System.out.println("Constructor called");
    }
}

Car car1 = new Car(); // Constructor gets invoked
```

---

## 🔹 6. Reference Copying

Assigning one object reference to another does **not** create a new object.

```java
Box b1 = new Box();
Box b2 = b1; // Both refer to the same object
```

Changes made via `b2` affect the object seen by `b1` too.

---

## 🔹 7. Primitive vs Object Types

* **Primitive types** like `int`, `char`, `float` do NOT require `new`.
* **Objects** (classes) require `new` for memory allocation.

```java
int num = 5;               // Primitive
Box box = new Box();       // Object
```

---

## 🔹 8. Parameters vs Arguments

* **Parameter**: Variable in method definition.
* **Argument**: Actual value passed when method is called.

```java
int square(int i) {
    return i * i;
}

square(100); // 100 is the argument
```

---

## 🔹 9. JVM vs Compiler Roles

```java
Bus bus = new Bus();
```

* **Left-hand side (LHS)** – `bus` → Checked by **compiler**
* **Right-hand side (RHS)** – `new Bus()` → Executed by **JVM**

---

## 📝 Notes

* Java restricts direct memory manipulation to ensure **safety** (no pointer arithmetic like C++).
* Every class object must be dynamically allocated using `new`.
* Java's reference variables are safer and cannot be manually changed to point anywhere else.

---

## ✅ Summary

| Concept              | Key Point                                          |
| -------------------- | -------------------------------------------------- |
| Class                | Blueprint for objects                              |
| Object               | Real instance with memory                          |
| Dot Operator         | Access object data and behavior                    |
| `new` Keyword        | Allocates memory at runtime                        |
| Constructor          | Initializes object at creation                     |
| Primitive vs Object  | Primitives: No `new`, Objects: Use `new`           |
| References           | Assignment copies reference, not the object        |
| Parameters/Arguments | Parameter: Method variable, Argument: Passed value |
| JVM vs Compiler      | Compiler checks LHS, JVM executes RHS              |

---


## 🔹 10. `this` Keyword

- `this` refers to the **current object**.
- Useful when local variable names conflict with instance variables.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name; // Refers to instance variable
    }
}
````

---

## 🔹 11. `final` Keyword

* Makes a variable **constant** – its value cannot change after initialization.
* Commonly used for constants in **ALL\_CAPS**.

```java
final int FILE_OPEN = 2;
```

* For reference types, `final` means the reference cannot change, but the object **can**.

```java
final int[] arr = {1, 2, 3};
arr[0] = 100;   // Allowed
arr = new int[5]; // ❌ Not allowed
```

---

## 🔹 12. `finalize()` Method

* Called by the **garbage collector** before an object is destroyed.
* Can be overridden to clean up resources.

```java
protected void finalize() {
    System.out.println("Object is being garbage collected");
}
```

> Note: `finalize()` is deprecated in Java 9+. Prefer try-with-resources or manual cleanup.

---

## 🔹 13. Constructors

* A constructor runs **automatically** when an object is created.
* No return type, not even `void`.

```java
class Box {
    Box() {
        System.out.println("Constructor called");
    }
}

Box b = new Box(); // Constructor is invoked
```

---

## 🔹 14. Inheritance and Constructors

* Base class constructor is called **automatically** when derived class is created.
* Default (no-arg) constructor is invoked unless explicitly specified.

```java
class Base {
    Base() {
        System.out.println("Base Constructor");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}

// Output:
// Base Constructor
// Derived Constructor
```

* If the **base class** only has a **parameterized constructor**, the **subclass must call it using `super()`**.

```java
class Parent {
    Parent(String name) {
        System.out.println("Parent: " + name);
    }
}

class Child extends Parent {
    Child() {
        super("Ram");
        System.out.println("Child Constructor");
    }
}
```




---

## 🔹 15. Method Overloading

- You can have **multiple methods with the same name**, as long as **parameter lists are different**.
- Return type **alone** cannot be used to distinguish overloaded methods.
- Java resolves the correct method by matching the arguments at **compile-time**.

```java
class OverloadDemo {
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test(i);        // int → double, calls test(double)
        ob.test(123.2);    // exact match, calls test(double)
    }
}
````

🔸 Java uses **automatic type conversion** (int → double) only if no exact match is found.

---

## 🔹 16. Returning Objects from Methods

* Methods can return **objects**, not just primitive values.
* A new object is created and returned.

```java
class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2 = ob1.incrByTen();

        System.out.println("ob1.a: " + ob1.a); // 2
        System.out.println("ob2.a: " + ob2.a); // 12
    }
}
```

---
## 🍛 Method Overriding — "Rewriting Dad’s Rules"

### ➤ What is it?

When **child class** rewrites a method from **parent class** with **same name, same parameters**, that’s **overriding**.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {  // overrides Animal's sound()
        System.out.println("Dog barks");
    }
}
```

### ➤ Why care?

Now if you call `sound()` using a `Dog` object — Java uses **Dog's version**, not Animal's.

---

## 🎭 Dynamic Method Dispatch — "Runtime Decision Making"

### ➤ What’s the real magic?

Java doesn’t decide **which method to run** at **compile time**. It waits till **runtime**!

```java
Animal a = new Dog(); // 👈 parent reference, child object
a.sound();            // 🔥 Output: "Dog barks"
```

**Even though the type of `a` is `Animal`,** Java sees that `a` is actually pointing to a `Dog`, so it runs **Dog’s version** of `sound()`.

💡 That’s **runtime polymorphism**.

---

### ⚠️ Important: Overloading ≠ Overriding

* **Overriding** = same name + same parameters.
* **Overloading** = same name, different parameters (and maybe different return type).

---

## 🔁 Real Life Analogy

Imagine a **TV remote** (reference) that can control any TV (object). Even if the remote is labeled "Sony", if it’s actually controlling an LG TV, it’ll behave like an LG remote.

Java also checks **the actual TV** (object type), not the sticker on the remote (reference type).

---

## 🧪 Sample Code: Box Example

```java
class Box {
    void display() {
        System.out.println("This is a box");
    }
}

class GiftBox extends Box {
    void display() {
        System.out.println("This is a gift box");
    }
}

public class Test {
    public static void main(String[] args) {
        Box b = new GiftBox();  // Base class reference, child class object
        b.display();            // Calls GiftBox's display() 💥
    }
}
```

---

## 🔁 Covariant Return Types

> “If B extends A, you can override a method in A in class B and change the return type to B.”

Yes — as long as the return type of the overridden method is a **subtype** (child) of the original return type.

```java
class A {}
class B extends A {}

class Parent {
    A getObj() {
        return new A();
    }
}

class Child extends Parent {
    B getObj() {
        return new B(); // Covariant return type allowed ✅
    }
}
```

---

## 🚨 Key Notes

| Term                 | Meaning                                             |
| -------------------- | --------------------------------------------------- |
| **Overriding**       | Subclass rewrites parent method (same name, params) |
| **Overloading**      | Same method name, different parameters              |
| **Dynamic Dispatch** | Java decides at runtime which method to run         |
| **Covariant Return** | Return type can be subclass in overridden method    |

---

## 🔚 TL;DR

> **Java decides overridden method versions at runtime based on the object, not the reference.** That’s how runtime polymorphism works.

---
 

# 🚨 STATIC in Java — "Class ka Banda, Object ka Nahi"

---

## ⚙️ 1. **What is `static`?**

`static` means: **“Belongs to the class, not to objects.”**

A static member (variable/method/class block) is **shared among all objects**, and:

* You **don’t need an object** to use it.
* It gets **loaded once when the class is loaded** by JVM.

---

## 🧠 2. **Static Variables (Class Variables)**

### 🔥 Example:

```java
class Human {
    static int population = 0; // shared by all

    Human() {
        population++;
    }
}
```

### 🔍 Key Point:

* Every time a new object is made, `population` increases.
* But `population` is not stored *in each object* — it’s stored once per class.

---

## 🧠 3. **Static Methods (Utility Functions)**

### ⚡ Rules:

* Can only use **static variables** or **other static methods**.
* **Can’t use `this` or `super`** (because no object exists!).
* **Can be called without object**, like:

  ```java
  Math.sqrt(25);  // Math is a class, sqrt is static
  ```

### 🧪 Example:

```java
class MathUtils {
    static int square(int x) {
        return x * x;
    }
}
```

Use like:

```java
int result = MathUtils.square(5); // 25
```

---

## 💥 4. **Static Block — Class Ka "Startup Script"**

This block runs **once**, when the class is loaded.

### 🧪 Example:

```java
class Config {
    static int setting;

    static {
        setting = 42;
        System.out.println("Static block executed");
    }
}
```

JVM loads class → static block executes → then `main()`.

---

## 🧪 5. **Accessing Non-Static in Static (and Vice Versa)**

### ❌ Can't do this:

```java
static void show() {
    System.out.println(name); // ❌ name is non-static
}
```

### ✅ Can do this:

```java
static void show(Human h) {
    System.out.println(h.name); // ✅ explicitly pass object
}
```

Why? Because `static` doesn't belong to any particular object — it doesn't know **which object's data** you're talking about.

---

## 🧬 6. **Static Classes — Only Nested Ones Allowed**

```java
public class Outer {
    static class Inner {
        void show() {
            System.out.println("I'm static nested class");
        }
    }
}
```

You use it like:

```java
Outer.Inner obj = new Outer.Inner();
```

### ❓Why only nested?

Because a **top-level class can't be both static and standalone** — static needs to **belong to something**.

---

## 🛑 7. **Can We Override Static Methods?**

**NO!** Java resolves static methods at **compile-time**, not run-time — so **no overriding**.

### 🧪 Example:

```java
class Parent {
    static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    static void greet() {
        System.out.println("Hello from Child");
    }
}
```

If you do:

```java
Parent obj = new Child();
obj.greet();  // Output: Hello from Parent (NOT Child!)
```

💡 **This is called method hiding**, not overriding.

---

## 🧃 8. **main() is static — kyun?**

Because JVM needs to call it **without creating an object** of the class.

```java
public static void main(String[] args) {
    // must be static
}
```

---

## 🔄 9. **Analogy:**

Imagine:

* 🏫 Class = School
* 👦 Object = Student
* 📚 Static = Notice Board (same for all)
* 📓 Non-static = Personal Diary (unique for each)

---

## 🔎 Final Recap Table:

| Static Feature         | What It Means                                          |
| ---------------------- | ------------------------------------------------------ |
| Static Variable        | Shared by all objects                                  |
| Static Method          | Can’t access instance variables directly               |
| Static Block           | Runs once when class loads                             |
| Static Class (Nested)  | Can be made, used without outer class instance         |
| Can’t Use `this/super` | Because no instance exists                             |
| Can’t Override Static  | Resolved at compile-time (method hiding)               |
| main() is Static       | Because it’s entry point, called by JVM without object |

---
 
 
### 🤯 Problem Area Recap:

```java
public class Static {
    // class Test ❌ ERROR
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
```

The **weird part** is:

> Why did we need to make `Test` a `static class` inside class `Static`?
> Why would it be an **error** if it wasn’t static?

---

### 🔎 Rule #1: **Java doesn't allow non-static classes inside a static context unless they are objects.**

So when you define a class inside another class, there are **two types**:

1. **Inner Class (non-static)**
2. **Static Nested Class**

---

## 🧠 Difference:

### ✅ Non-Static Inner Class:

```java
class Outer {
    class Inner {
        // Inner class NEEDS an instance of Outer class
    }
}
```

To use it:

```java
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner(); // See that outer is needed
```

🛑 **If you try to use this in a `static context` like `main()`**, you’ll get error:

> *"No enclosing instance of type Outer is available."*

---

### ✅ Static Nested Class:

```java
class Outer {
    static class Inner {
        // This class DOES NOT depend on an Outer instance
    }
}
```

Use it like:

```java
Outer.Inner obj = new Outer.Inner(); // No need of outer object
```

---

## 🚨 Back to Your Example:

```java
public class Static {
    // If this is non-static, ❌ ERROR in main()
    static class Test {
        String name;
        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
    }
}
```

Here:

* `main()` is **static** → it runs **without any object of `Static`** class.
* So you **can’t use non-static inner classes**, because those **need an instance of outer class (`Static`)**.
* That’s why Java forces you to write `static class Test`.

Otherwise Java will cry:

> ❌ “Non-static class ‘Test’ cannot be referenced from a static context”

---

## 🎯 What does this mean?

> When you mark `class Test` as `static`, it means:
> **“Test class is no longer dependent on Static class. It lives freely.”**

It behaves **like a normal top-level class**, but it's still *logically nested inside* `Static`.

---

## 🔥 Super Important Line Explained:

> “Just as a static method of T has no current instance of T in its body, C also has no current instance of T.”

Translation:

* Just like static methods don't have access to the outer object (`this`),
* A `static class` also doesn’t have access to the outer class's instance variables or methods **unless you give it an object explicitly**.

---

## 🧃 Final Analogy (Desi Style):

Think of `Static` class as a **building**, and `Test` class as a **room inside it**.

* 🏢 **Normal Room (non-static class):** Needs the building to exist first.
* 🚪 **Independent Room (static class):** Made outside, doesn’t care if building exists. It’s just logically grouped there.

---

## ✅ TL;DR Summary:

| Term                                | Meaning                                                               |
| ----------------------------------- | --------------------------------------------------------------------- |
| `static class` inside another class | Can be used without an object of the outer class                      |
| Non-static inner class              | Needs an outer class object                                           |
| `main()` is static                  | Runs without an instance, so can't access non-static inner classes    |
| Why error without static            | Because Java doesn't know which outer object to attach to inner class |

---
 