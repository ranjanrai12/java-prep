#### do-while loop

`do-while` loop is used to iterate a part of the program `repeatedly`, until the specified condition is true. If the number of iteration is not fixed and must have to execute the loop at least once, it is recommended to use a `do-while` loop.

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= 3);
    }
}
/*
1
2
3
*/
```
