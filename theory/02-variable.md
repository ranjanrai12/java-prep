#### Variable in java ?

Ans: `Variable` is used to store the value while program is getting executed and `variable` is assigned with `data type`. In other words it is a name of the` memory location`. It is a combination of `vary + able` which means its value can be changed.

```java
int data=50;//Here data is variable

```

- `Types of variable`: There are three types of variables in Java:

  - `local variable:` A local variable declared inside the body of the method, constructor or blocks. local variables are initialized when method or constructor block start and will destroy once it's end.

  ```java
    public class Test {
        public static void main(String args[]) {

        }

        void method() {
            int a = 10; // local variable
        }
    }
  ```

  - `instance variable:` Instance variable declared inside the class but outside of any method, constructor or block.
    Instance varibale are also variable of object commonly known as field or property.

    ```java
    public class Employee {
        String name // instance variable
        int age // instance variable
    }
    ```

  - `static variable:` A variable which is declared with static keyword that is known as static variable. It cannot be local and static variable are initialized only once.Memory allocation for static variables happens only once when the class is loaded in the memory.

    ```java
    // Example 1
    public class Employee {
        String name // instance variable
        int age // instance variable
        static int companyCode = 200 // static variable
    }

    // Example 2 where we can see it is initialized only once.

    public class Counter {
        static int count = 0; // Static variable

        // Constructor
        public Counter() {
            count++; // Increment the static variable
        }

        public void showCount() {
            System.out.println("Count: " + count);
        }

        public static void main(String args[]) {
            System.out.println("Hello Java");
            Simple counter1 = new Simple();
            counter1.showCount();
            Simple counter2 = new Simple();
            counter2.showCount();
        }
    }
    /*
    ** output **
        1
        2
    */
    ```
