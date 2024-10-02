#### If-else Statement

Ans: if statement is used to test the condition. It checks boolean condition: true or false.

- `if Statement:` It executes the if block if condition is true.

```java
//Java Program to demonstate the use of if statement.
public class IfExample {
    public static void main(String[] args) {
        //defining an 'age' variable
        int age=20;
        //checking the age
        if(age>18){
            System.out.print("Age is greater than 18");
        }
    }
}
// Age is greater than 18
```

- `if-else Statement:` It executes the if block if condition is true otherwise else block is executed.

```java
public class IfElseExample {
    public static void main(String[] args) {
        //defining a variable
        int number=13;
        //Check if the number is divisible by 2 or not
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}
// odd number
```

- ` if-else-if ladder Statement:` The if-else-if ladder statement executes one condition from multiple statements.

```java
public class IfElseIfExample {
    public static void main(String[] args) {
        int marks=65;

        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");
        }else{
            System.out.println("Invalid!");
        }
    }
}
// c grade
```

- `Nested if statement:` The nested if statement represents the if block within another if block. Here, the inner if block condition executes only when outer if block condition is true.

```java
public class JavaNestedIfExample {
    public static void main(String[] args) {
        //Creating two variables for age and weight
        int age=20;
        int weight=80;
        //applying condition on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }
    }
}
// You are eligible to donate blood
```
