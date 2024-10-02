#### Break Statement

Ans: When a break statement is encountered inside a `loop`(for, while, do-while) or a `switch` statement, the loop is immediately terminated and the program control resumes at the next statement following the loop.

```java
public class WhileExample {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println(a);
            if (a == 3) {
                break;
            }
            a++;
        } while (a <= 10);
    }
}
/*
1
2
3
*/
```

#### continue statement

Ans: The continue statement is used in loop control structure when need to jump to the next iteration of the loop immediately. It can be used with for loop or while loop.

```java
public class ContinueExample {
    public static void main(String[] args) {
        //for loop
        for(int i=1;i<=5;i++){
            if(i==2){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }
    }
}
/*
1
3
4
5
*/
```

- Continue Statement with Labelled For Loop

```java
public class ContinueExample3 {
    public static void main(String[] args) {
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    //using continue statement with label
                    continue aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
/*
1 1
1 2
1 3
2 1
3 1
3 2
3 3
*/
```

- Same concept will apply on while and do-while loop
