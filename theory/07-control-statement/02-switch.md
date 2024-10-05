#### Switch Statement.

The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement.

```java
public class SwitchExample {
    public static void main(String[] args) {
        //Declaring a variable for switch expression
        int number=20;
        //Switch expression
        switch(number){
        //Case statements
        case 10: System.out.println("10");
        break;
        case 20: System.out.println("20");
        break;
        case 30: System.out.println("30");
        break;
        //Default case statement
        default:System.out.println("Not in 10, 20 or 30");
        }
    }
}
// 20
```

- Switch Statement is fall-through: The Java switch statement is fall-through. It means it executes all statements after the first match if a break statement is not present.

```java
public class SwitchExample2 {
    public static void main(String[] args) {
        int number=20;
        //switch expression with int value
        switch(number) {
        //switch cases without break statements
        case 10: System.out.println("10");
        case 20: System.out.println("20");
        case 30: System.out.println("30");
        default:System.out.println("Not in 10, 20 or 30");
        }
    }
}
/*
20
30
Not in 10, 20 or 30
*/
```

- Nested Switch Statement

```java
public class NestedSwitchExample {
    public static void main(String args[]) {
      //C - CSE, E - ECE, M - Mechanical
        char branch = 'C';
        int collegeYear = 4;
        switch( collegeYear )
        {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}
// Data Communication and Networks, MultiMedia.
```
