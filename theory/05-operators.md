#### operators and operands

2(operand) +(operator) 3(operand) = 5

#### operators in java

- `Uniary operator:` The Java unary operators require only one operand.
  Examples:

  ```java
    public class OperatorExample {
        public static void main(String args[]) {
            int a = 10;
            System.out.println(++a); // 11
            System.out.println(a++); // 11(12)
            System.out.println(a--); // 12(11)
            System.out.println(--a); // 10
        }
    }
    // TODO: need to understnd the calculation of ~(bitwise not) operator.
  ```

- `Arthmatic operator:` Java arithmetic operators are used to perform addition, subtraction, multiplication, and division.

```java
public class OperatorExample {
  int a = 10;
  int b = 5;
  public static void main(String[] args) {
    System.out.println(a + b) // 15
    System.out.println(a - b) // 5
    System.out.println(a * b) // 50
    System.out.println(a / b) // 2
    System.out.println(a % b) // 0
  }
}
```

- `shift operator:` Java left shift operator `<<` is used to shift all of the bits in a value to the left side of a specified number of times.

```java
public class OperatorExample{
public static void main(String args[]){
System.out.println(10<<2);//10*2^2=10*4=40
System.out.println(10<<3);//10*2^3=10*8=80
System.out.println(20<<2);//20*2^2=20*4=80
System.out.println(15<<4);//15*2^4=15*16=240
}}
```

The Java right shift operator >> is used to move the value of the left operand to right by the number of bits specified by the right operand.

```java
public class OperatorExample {
public static void main(String args[]){
System.out.println(10>>2);//10/2^2=10/4=2
System.out.println(20>>2);//20/2^2=20/4=5
System.out.println(20>>3);//20/2^3=20/8=2
}}
```

- `Relational operator:`

- `Bitwise operator:`

- `Logical operator:`

- `Ternary operator:` Ternary operator is used as one line replacement for if-then-else statement

```java
public class OperatorExample {
    public static void main(String args[]) {
        int number = 4;
        boolean isEven = number % 2 == 0 ? true : false;
    }
}
```

- `Assignment operator:` it is used to assign the value.

```java
public class OperatorExample{
    public static void main(String args[]) {
    int a=10;
    int b=20;
    a+=4;//a=a+4 (a=10+4)
    b-=4;//b=b-4 (b=20-4)
    System.out.println(a); // 14
    System.out.println(b); // 16
  }
}
```
