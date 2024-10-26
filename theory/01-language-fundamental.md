#### Language Fundamental

- Identifier
- Reserved words
- Data Types
- Literals
- Arrays
- Types of variables
- var-arg methods
- main method
- command line arguments
- java coding standards

#### Identifiers
A name in java program called identifier which can be used for identification purpose it
can be method name, variable name, class name or a label name.

```java
class Test {
    public static void main(String[] arg) {
        int x = 10;
    }
}
/**
 * Identifiers are in above code 
 * 1: Test
 * 2: main
 * 3: String, as a predefined class
 * 4: arg
 * 5: x
 * */
```
#### Rules for defining java identifiers
- The only allowed characters in java identifiers are `a to z`, `A to Z`, `0 to 9`, `$`, `_`, If we are using any 
other character we will get compile time error i.e total#, name@.
- Identifier can't start with digit. i.e(total123 - valid), (123total- invalid)
- Java identifier are case-sensitive off-course java language itself is treated as case-sensitive programming language
```java
class Test {
    int number = 10;
    int Number = 10;
    int NUMBER = 10;
}
```
we can differentiate with respect to case.

- There is no length limit for java identifier but it's not recommended to take too lengthy identifiers.
- We cannot use reserved words as a identifiers.
```java
    int x = 10; // valid
    int if = 10 // invalid because we are using reserved word as a identifiers 
```
- All predefined java `class name` and `interface` names we can use as a identifiers, event though it is valid, 
but it is not a good programming practice because it reduces readability and creates confusion
```java
class Test {
    public static void main(String[] args) {
        int String = 999; // valid
        int Runnable = 888; // valid
        System.out.println(String);
        System.out.println(Runnable);
    }
}
```
#### Reserved Words
In Java some words are reserved to represent some meaning or functionality such type of words are 
called reserved words. Total 53 reserved words present in java.

`Reserved Words` -> keywords(50), Reserved Literals(3)
`Reserved Literals(3)` -> true, false, null
`keywords(50)` -> used keywords(48), unused keywords(2)
`unused keywords(2)` -> goto, const
`used keywords(48)` -> if, else, switch, ......

#### keywords for Data types (8)
- `byte`
- `sort`
- `int`
- `long`
- `float`
- `double`
- `boolean`
- `char`
- 
#### keywords for flow control (11)
- `if`
- `else` 
- `switch`
- `case`
- `default`
- `while`
- `do`
- `for`
- `break`
- `continue`
- `return`

#### keywords for modifiers (11)
- `public` 
- `private`
- `protected`
- `static` 
- `final`
- `abstract`
- `synchronized`
- `native`
- `strictfp`(1.2 v)
- `transient`
- `volatile`

With `default` it will be 12

#### keywords for exception handling (6)
- `try` 
- `catch`
- `finally`
- `throw`
- `throws`
- `assert`(1.4v)

#### class related keywords (6)
- `class`
- `interface`
- `extends`
- `implements`
- `package`
- `import`

#### Object related keywords(4)
- `new`
- `instaneof`
- `super`
- `this`

#### void related keyword(1)
- `void` (In java return type is mandatory if method won't return anything we have to declare 
that method void return type but in c language return type is optional and default return type is `int`)

#### unused keywords(2)
- `goto` (usage of `goto` several language in old language and hence some people ban keywords in java)
- `const` (use `final` insteadof const)

`Note`- `goto` and `const` are `unused keywords` and if we are trying to use we will get the compile time error.

#### Reserved literal(3)
- `true` - values for boolean data type
- `false` - values for boolean data type
- `null` - default value for object reference.

#### enum keywords(1) 
It came in 1.5v, we can use enum to define a group of named constants
```java
enum month {
    JAN, FEB, MARCH, APRIL ....
}
```

`Conclusions:`
1: All 53 reserved keywords contains only lowercase alphabet symbols.

2: In java we have only new keywords and there is no delete keywords because of destruction of
useless object is responsibility of garbage collector.

3: 
- strictfp but not strictFp
- instanceof but not instanceOf
- synchronized but not synchronize
- extends but not extend
- implements but not implement
- import but not imports
- const but not constant
