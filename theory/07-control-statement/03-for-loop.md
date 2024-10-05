#### for loop

Ans: It is used to iterate the items. If the number of `iteration is fixed` it is recommended to use for loop.
Syntax:

```java
for(initialization; condition; increment/decrement){
//statement or code to be executed
}
```

Example:

```java
public class ForExample {
    public static void main(String[] args) {
        // Code of Java for loop
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
1
2
3
4
5
6
7
8
9
10
*
**
***
****
*****
******

*/
```

- `for-each Loop`: The for-each loop is used to traverse array or collection. It works on the basis of elements and not the index. It returns element one by one in the defined variable.

Syantax:

```java
for(data_type variable : array_name) {
//code to be executed
}
```

Example:

```java
public class ForEachExample {
    public static void main(String[] args) {
        //Declaring an array
        int arr[]={12,23};
        //Printing array using for-each loop
        for(int i:arr) {
            System.out.println(i);
        }
    }
}
/*
12
23
*/
```

- `Labeled For Loop:` We can have a name of each Java for loop. To do so, we use label before the for loop. It is useful while using the nested for loop as we can break/continue specific for loop.

```java
public class LabeledForExample {
    public static void main(String[] args) {
        //Using Label for outer and for loop
        aa:
            for(int i=1; i<=3; i++) {
                bb:
                    for(int j=1; j<=3; j++) {
                        if(i==2 && j==2){
                            break aa;
                        }
                        System.out.println(i +" " + j);
                    }
            }
    }
}
/*
1 1
1 2
1 3
2 1
*/
```
