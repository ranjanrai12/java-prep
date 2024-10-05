#### What is object is object in java ?

Ans: An entity that has state and behaviour is known as an object e.g chair, bike etc..
An object has three characterstics:

- `state`: represent the data(value) of and object.
- `behaviour`: represent the behaviour(functionality) of an object such as deposit, withdraw, etc.
- `entity`: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.

`Example:` Pen is an object. Its name is Reynolds; color is white, known as its state. It is used to write, so writing is its behavior.

#### What is class ?

Ans: class is a blueprint or template that defines the structural and behaviour of objects.

A class in Java can contain:

- `Fields` or `Instance variable`: A `variable` which is created `inside the class` but `outside the method` is known as an instance variable. Instance variable doesn't get `memory at compile time`. It gets `memory at runtime` when an object or instance is created.That is why it is known as an instance variable.

- `Methods`: Method is like a function which is use to expose the behavior of an object.
  `Advantage of Method`
  - Code Reusability
  - Code Optimization
- `Constructors`:
- `Blocks`:
- `Nested class and interface`:

#### Object and Class Example: `main within` the class

```java
class Student{
    //defining fields
    int id;//field or data member or instance variable
    String name;
    //creating main method inside the Student class
    public static void main(String args[]){
    //Creating an object or instance
    Student s1=new Student();//creating an object of Student
    //Printing values of the object
    System.out.println(s1.id);//accessing member through reference variable
    System.out.println(s1.name);
    }
}
```

#### Object and Class Example: `main outside` the class

In real time development, we create classes and use it from another class. It is a `better` approach than previous one.If there are multiple classes in a single Java source file, it is a good idea to save the file name with the class name which has `main() method`.

```java
class Student {
    int id;
    String name;
}
//Creating another class TestStudent1 which contains the main method
class TestStudent1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
```

#### 3 Ways to initialize object

- `By reference variable`:

```java
class Student {
    int id;
    String name;
}

class TestStudent3 {
    public static void main(String args[]) {
        //Creating objects
        Student s1=new Student();
        Student s2=new Student();
        //Initializing objects
        s1.id=101;
        s1.name="Sonoo";
        s2.id=102;
        s2.name="Amit";
        //Printing data
        System.out.println(s1.id+" "+s1.name); // 101 Sonoo
        System.out.println(s2.id+" "+s2.name); // 102 Amit
    }
}
```

- `By method`: In below example we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method.

```java
class Student {
    int rollNo;
    String name;
    void insertRecord(int r, String n) {
        rollNo = r;
        name = n;
    }
    void displayInformation() {
        System.out.println(rollNo + " " + name);
    }
}

class TestStudent4 {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.insertRecord(102, "Karan");
    s2.insertRecord(101, "Aryan");
    s1.displayInformation(); // 102 Karan
    s2.displayInformation(); // 101 Aryan
}
```

The reference variable refers to the object allocated in the heap memory area. Here, s1 and s2 both are reference variables that refer to the objects allocated in memory.

- `By constructor`:

```java
class Employee {
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insert(101, "shyam", 30000);
        e2.insert(102, "Ram", 40000);
        e3.insert(103, "Ryan", 50000);
        e1.display(); // 101 shyam 30000
        e2.display(); // 102 Ram 40000
        e3.display(); // 103 Ryan 50000
    }
}
```

#### Different ways to create an object in java

- By new keyword
- By newInstance() method
- By clone() method
- By deserialization
- By factory method etc.

#### Anonymous object

An object which has `no reference`(The object is created and used directly without being stored in a variable) is known as an anonymous object. Such objects are usually used when the object is required for one-time use.

```java
// Class definition
class Car {
    void displayInfo() {
        System.out.println("This is a car.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Anonymous object creation and method call
        new Car().displayInfo();  // Output: This is a car.
    }
}

```

#### Creating multiple objects by one type only

```java
class Rectangle{
 int length;
 int width;
 void insert(int l,int w) {
    length=l;
    width=w;
 }
 void calculateArea() {
        System.out.println(length*width);
    }
}
class TestRectangle2 {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(),r2=new Rectangle();//creating two objects
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea(); // 55
        r2.calculateArea(); // 45
    }
}
```
