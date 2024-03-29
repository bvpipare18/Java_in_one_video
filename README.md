# Learning Java

1.  Everything in Java must be written inside class, i.e. it's a strict OOP.

2.  In Java, Execution starts from main() method.

3.  void - returns nothing

    - print() - method

4.  Source File ---> Compiler ---> Byte Code

5.  To Run Byte Code we need Platform that is JVM(Java Virtual Machine).

6.  Java is Platform Indpendent.

7.  Primitive Data Types - Summary

    | DataType  | Keyword | Size(bit) | Size(byte) | Min      | Max      |
    | --------- | ------- | --------- | ---------- | -------- | -------- |
    | character | char    | 16        | 2          | 0        | 65535    |
    | byte      | byte    | 8         | 1          | -128     | 127      |
    | short     | short   | 16        | 2          | -32768   | 32767    |
    | integer   | int     | 32        | 4          | -2e31    | -2e31-1  |
    | float     | float   | 32        | 4          | 1.4e-45  | 3.4e+38  |
    | long      | long    | 64        | 8          | -2e63    | -2e63-1  |
    | double    | double  | 64        | 8          | 4.9e-324 | 1.8e+368 |
    | boolean   | boolean | NA        | NA         | false    | true     |

8.  For E.g.

    ```
    - int i = 5:
      - int --> DataType
      - i --> Variable
      - 5 --> Value

    `VALID` --> int i = 5, float f =5, double = 5
    `INVALID` --> int i = 5.5
    ```

9.  Java is strict `OOP` it means Every variable must be declare by some DataType.

## 10. Working with Java Fundamentals

    - Java Variables

11. You can name variable as you like.
    - No special Charachters other than '$ \_'.
    - VALID --> abc, $abc, _abc, ab4c, abc$d
    - INVALID --> 3abc
12. Once you define the variable Value you can change.

    ```
    int num = 500000000;
        IS EQUALS To
    int number = 50_00_00_000;
    ```

13. double i = 5.5; - is a VALID to use it as we must deine variable

    ```
         float i = 5.5f;
    ```

14. To assign small values like `5` we must use `'short'` DataType instead of `'int'`.

15. To use only single value we can also use

    ```
    byte b = 5;
    ```

16. To use value `bigger than 10` digits we must `use 'long'` and while dealing with
    these we must also `specify 'l'` at the end of the number.

    ```
    long big_value = 5l;
    ```

17. - Implicit conversion
      ```
      double d1 = 5;
      ```
    - Typecasting/Explicit conversion
      ```
      int k = (int) 5.6;
      ```

18. Typecasting Possibilities

    ![Image added](Typecasting.jpg)

## 19. Naming Convention in Java.

- Variable Name
  ```
  sname,stockprice
  ```
- Class Name
  ```
  String, Integer, Student, Worker, Engineer
  ```
- Interface Name

  ```
  Runable, Serializable
  ```

- Interface

  ```
  Adjective
          e.g. Runable, Readable, Remote

  `able` can be added at the end of the words.
  ```

- Class

  ```
  Noun
      e.g. Student, Person, Computer, HashMap
  ```

  ### 👆👆 for both Interface & Class Names we should always prefer first letter as Capital.

- Method

  ```
  Verb
      e.g. actiomPerformed, run, print, write
  ```

- Variable

  ```
      e.g. stockprice, bankdetails
  ```

- Constant

  ```
      e.g. PI, DENSITY, MAX_PRICE
  ```

- CAMEL CASING RULE

  ```
     e.g. MyFirstJavaClass, CheatSheet
  ```

  | Variable | Constant | Constructor | Method | Interface   |
  | -------- | -------- | ----------- | ------ | ----------- |
  | abc      | ABC      | Abc()       | abc()  | Stretchable |

20. Arithmetic Operators in Java

    - Arithmetic
      ```
      +, -, *, /, %
      ```
    - int division
      ```
      6/4;
      Answer = 1
      ```
    - double division = (double) 6/4;

      ```
      Answer = 1.5
      ```

    - n++ --> n+=1 --> n = n+ 1 all are equal & they are called as `Short Hand Operator`.

      ```
      int m = 55; int n = 45;
      m = ++n; // first  increments
      System.out.println(m) --> 46
      ```

      ```
      m = n++; //first assigns and then increments
      System.out.println(m) --> 45
      ```

21. If-Else Selection Statements

    - When you have more than 1 statement after 'if' then you must specify inside a `'curly braces{}'.`

22. Ternary & Switch Operator

    - ternary Operator
      ?: --> condition?exp1:exp2

      if condition is true execute exp1 otherwise exp2
      OR/Equals to
      if (condition) {
      exp1
      } else {
      exp2
      }

      int i = 8; int j = 0;
      int(i>6){
      j = 1;
      }else{
      j =2;
      }

      Above 👆👆 code can be written as
      j = i>6?1:2;

23. Fundamentals of Java
    Selection Statement: Switch Statement

    - You can use DataType 'int,String & char' in switch case.
      Syntax:
      switch(variable_name){
      case 1:
      break;
      case 2:
      break;

          case n:
              break;
          default:

      }

24. While & For iteration Statements

    - Most of the loops will have 3 points we must remember
      Initialization,Condition,Increment/Decrement

    - while --> Executing for particular time & then stopping.
    - do while --> Executes at leat Once.
    - for --> If you know the starting & endpoint.
    - for-each also called enhanced for loop --> Made for arrays & collection.

25. Loops Assignment

    - 1
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5
      1 2 3 4 5 6

    - A
      A B
      A B C

    - ***
      -     *
      -     *
      ***

26. Break & continue

    - continue --> It will skip the current iteration and it will execute other
      iterations of loop.

    - break --> It will break at that points & will come out of that loop.

27. Class & Objects

    - Java follows OOPS concept viz is Classes & Objects.
    - For e.g. To Construct a building we must have blueprint of building.
    - Building is an 'Object' to build any object JVM needs a Structure/Blueprint
      that blueprint is a 'Class'.

    - What is Class?
      Class defines the structure of an object and working of an object.

      Class Structure
      class Building{
      int floors;
      public static provideAcc(){

                      }
                  }

      Object -
      Phone -->
      Knows Something - Variable - structure of phone --> color,logo
      Does Something - Method - behavior of object

    - To create a object of class
      We use 'new' Keyword to create object & it is responsible for
      allocating memory.
      for e.g.
      Calculator obj = new Calculator();
      /_
      Calculator - DataType
      obj - Reference variable
      new Calculator() - Object
      Calculator() - Constructor
      _/

    - Whenever if you want to use variable or method of other class in main
      method we must always use object reference to access it.

28. Constructor in Java
    class A{
    int i;// 4 bytes, Default value = 0
    float f; // 4 bytes, default value = 0.0

        public A(){ // Constructor

        }

    }
    public static void main(String[] args) {
    A obj = new A(); //Object creation
    }

    - When do we use Constructor???
      Whenever we want to create object of a class.

    - Execution of code always starts from main() method.
      public static void main(String[] args) {

      }
      main(String[] args) - It takes string array as a parameter.
      void - it will return nothing

      To call any method in java we require object.

      Que - What is Deadlock????
      Ans - You can not call main() without object and You can not create
      object without main().
      Solution - Specify main method as a 'static'.

      make it as 'public'

    - Object will take some space in HEAP Memory.

      28.1 Information on Constructor

    - Constructor is Member method.
    - Constructor will have same name as class name.
    - Every class will have constructor,Even if you don't mention.
    - Constructor will Never Return Anything that the reason we don't
      mentioned Anything in a return type and we'll mention 'public'
      Access Modifier.
    - Constructor will be used to allocate memory for Object.
    - As soon as you create a object it will call constructor automatically.
    - Default constructor
      public ClassName(){

          }

    - What is Constructor Overloading???
      Class having Multiple constructors with different parameters.

    - Multiple Constructors
      class A{
      int i;
      float f;

          public A(){ // Default Constructor

          }
          public A(int k){ //Constructor with 1 parameter --> Paramaterized Constructor

          }
          public A(int k,float j){ //Constructor with 2 parameter

          }

      }

    - Object Creation
      public static void main(String[] args) {
      A obj = new A();
      A obj = new A(6);
      A obj = new A(6,3.5f);
      }

29. Constructor Example

    - If we don't have constructor in class then while creating object of class
      it will allocate some memory.

30. this keyword

    - When do we use 'this' keyword???
      Whenever the instance variable & local variable is same.

    - Local varibale always shadows/dominates instance variable.
    - To solve this problem we must use 'this' keyword.
      instance Local
      this.num1 = num1;
      this.num2 = num2;

          OR/Equals

    - Use different name for local varibles & instance variable.
      instance Local
      num1 = number1;
      num2 = number2;

31. Method & Constructor Overloading
    NOTE -->

    - We can use Multiple methods with same name but, different parameters.

    - What is Method Overloading??
      Same Method name & different parameters.

    - What is Constructor Overloading???
      Class having Multiple constructors with different parameters.

      The way we create a object & parameters we pass will decide which constructor
      to be called is constructor Overloading.

32. static Keyword

    - Bcoz when we create a object it takes space in HEAP Memory.

    - Therefore we need to load class before creating object.

    - Whenever we load the class so there is special memory in JVM that
      memory which stores class files is called Class Loader Memory.

    - Two employees working in same company and they both have Same CEO
      named "Bill" and after some months CEO changes then that changes must
      apply for all the employees. in this case... - two employees

    - If you want some variables do not be object specific then you must
      use 'static' keyword for that variable.

    - If, Some variables are same in both objects then we can also use
      className to access that variable.

      obj.ceo = "Bill"; --> class_name.ceo = "Bill";

    - To access non static variable we must use object_name.

    - To acces static variable we can use object as well as Class Name.

    - To access static variable we dont need object instead we can use Class_name.

    - public static void main(String[] args)
      To access main() method we dont need a objet bcoz it has been mentioned
      as static.

    - T
      static{

      }
      It doesn't matter how many object you create the above block
      Will execute only once.

    - If you want to initialize static variable you need 👆👆above
      Static block.

    - If you want to initialize non static variable you need a Constructor.

    - It doesn't matter how many object you create class will load once.
      No.of times you can create a object.

    - Static block will execute first then constructor will execute.
      Sequence doesn't matter.

    - IMPORTANT & SPOILER ALERT

      - Static variables are same for all the objects
      - Non static variables are different for all the objects
      - Can not use non-static variable in static block

    - You can use static variable inside a static block.

33. Inner Class

    - Inside a class we can have variables & methods.But to use those non static methods
      we must create object of that class.

    - We can create a class inside a class.

    - In order to access inner class we need outer class & the same case with
      objects to create object of inner class we must use object of outer class.

    - Syntax for accesing nested class
      outer_class_name.inner_class_name new_object_name = object_of_outer_class.new inner_class_name();
      For e.g.
      Outer.Inner obj1 = obj.new Inner();

    - In order to access static class we dont use object of outer class instead we use Outer class.
      For e.g.  
       Outer.Inner obj1 = new Outer.Inner();

    - Inner Class 1. Member Class - (without 'static' keyword) explained in previous commit. 2. Static Class - explained in these commit. 3. Anonymous Class - We will see after interfaces, abstract

34. Array Theory

    - Array - Collection of elements having simiar data type
      For e.g. 4 Cups filled by Tea placed on Tray.
      4 Cups - elements
      Tea - Similar data type
      Tray - Array

    - In java, index number starts with 0,1,2,3.... so on.

    - 1 Dimensional(1D) Array - Array having 50 values

    - ArrayIndexOutOfBound -> If you go beyond your array limit.

    - 2D Array - Arrays having rows and columns

    - Suppose 20 guests visited Your house and you have to serve Tea to all of them but in your
      house there are 3 trays
      1st carrying 8 Cups
      2nd carrying 6 Cups
      3rd carrying 6 Cups

    - Matrics
      0 1 2 3 4 5 6 7

          0   1   1   1   1   1   1   1   1
          1   1   1   1   1   1   1   0   0
          2   1   1   1   1   1   1   0   0

          tray[3][8]

    - Array
      a) 1D array
      b) 2D array
      c) Jagged array

    - Syntax
      data_type name_of_array[] = new data_type[size_of_array];
      E.g. int nums[] = new int[4];
      In JVM inside heap memory 4 blocks will be assign and initially by default
      values for all the boxes will be ZERO.

    - 2D Array
      int a[] = {1,2,3,4};
      int b[] = {2,4,6,8};
      int c[] = {5,6,7,8};

          Instead we can use single array

          int d[][] = {
                      {1,2,3,4},
                      {2,4,6,8},
                      {5,6,7,8}
          };

    - Jagged Array
      int a[][] = {
      { 1, 2, 3, 4, 5 },
      { 2, 4, 6, 8 },
      { 5, 6, 7, 8, 9, 10 }
      };

35. Enhanced For loop
    can be used for 1D as well as 2D array
    1D -
    int a[] = { 1, 2, 3, 4, 5, 6 };
    for (int i : a) {
    System.out.println(i);
    }

        2D -
            int d[][] = { { 1, 2, 3, 4, 5 }, { 2, 4, 6, 8 }, { 5, 6, 7, 8, 9, 10 } };
            for (int k[] : d) { //Bcoz it will return first array
                for (int l : k) {
                    System.out.print(" " + l);
                }
                System.out.println();
            }

36. Varags --> Variable arguments / Variable length arguments
    Let us supose you dont want your number of arguments to be specific and your variably
    passing n arguments and that n could be of any number.
    We can pass any number of arguments once you use this Concept Varags.

        class Calculator {
            public int add(int... n) { // 4,5,6,7,8,9 - it will come as a array
                int sum = 0;
                for (int i : n) {
                    sum += i;
                }
                return sum;
            }
        }

        public class VaragsDemo {
            public static void main(String[] args) {
                Calculator obj = new Calculator();
                System.out.println(obj.add(4, 5, 6, 7, 8, 9));
                System.out.println(obj.add(4, 5, 6, 7, 8, 9, 10, 11, 12));
            }
        }

37. OOPS CONCEPT 1. Inheritance 2. Abstraction 3. Data Hiding 4. Encapsulation

        1.  Inheritance --> You manufactured Calculator & added feature of addition but after
                some months user wants that Calculator to perform  subtraction as well then
                you must extend those existing properties while adding feature of
                subtraction by using keyword "extends".You must create object Sub class in main
                method to have to have result of "Addition" & "subtraction".

            -   In C/C++
                    Base class --> Derrived class
            -   In Java
                    Super class --> Sub class
            -   In OOP
                    Parent --> Child

            -   Single level inheritance

                class Calculator {
                    public int add(int i, int j) {
                        return i + j;
                    }
                }

                class CalcAdv extends Calculator {
                    public int sub(int i, int j) {
                        return i - j;
                    }
                }

            -   Multilevel Inheritance

                class Calculator {
                    public int add(int i, int j) {
                        return i + j;
                    }
                }

                class CalcAdv extends Calculator {
                    public int sub(int i, int j) {
                        return i - j;
                    }
                }

                class CalcVeryAdv extends CalcAdv {
                    public int multi(int i, int j) {
                        return i * j;
                    }
                }

            -   1. Calculator & CalcAdv, CalcAdv & CalcVeryAdv --> Single Level Inheritance
                2. Calculator & CalcAdv & CalcVeryAdv --> Multi Level Inheritance
                3. Java Does not support Multiple Inheritance.

            -   Inheritance has a two types of relationship
                1. IS-A --> One class extending another class.
                    E.g. Dog IS-A Animal

                2. HAS-A --> In a class creating a object of another class.
                    E.g. Bathroom HAS-A Tub.

            -   But if you consider two of them then it will be considered as Singlelevel Inheritance.

    37.1 Super Method 1. When we create a object of Sub/Child class it also calls the
    constructor of Super&Sub class as well.

            2.  When we create a object of Sub/Child class by passing parameters it calls
                the Paramaterized Constructor of Sub class and Default Constructor of Super class.

            3.  To solve above 👆👆 2nd problem we must specify super() method by passing
                parameter in Sub Class.

            4.  Every constructor has super() method.

            5.  If you want to call Paramaterized constructor of super class and Default constructor
                of sub class. Then you must specify super(5) in default constructor of sub class.

    37.2 Multiple Inheritance
    Case 1:
    class C{

                }
                main(){
                    C obj = new C();
                    obj.show();
                }

            -   Bcoz show() method is not present class C it will give compile time error.

            Case 2:
                class A{

                }
                class C extends A{

                }
                main(){
                    C obj = new C();
                    obj.show();
                }

            -   Bcoz show() method is not present in both the classes it will give compile time error.

            Case 3:
                class A{
                    show();
                }
                class B{
                    show();
                }
                class C extends A,B{

                }
                main(){
                    C obj = new C();
                    obj.show();
                }

            -   Bcoz show() method is present in both the classes it will have confusion to show()
                method to call for these type of problems is called Ambiguity problems.

            Case 4:
                class A{

                }
                class B{
                    show();
                }
                class C extends A,B{

                }
                main(){
                    C obj = new C();
                    obj.show();
                }

            -   It will call show() method present in B class

        -   To solve these type above 👆 problems java removes Multiple inheritance & java does not
            support Multiple inheritance directly.

        -   Using classes you can not achieve Multiple Inheritance.

38. ASCII --> American Standard Code for Information Interchange

39. Method Overriding

    - Child class method will override the method of Parent class.

    Case 1:
    class A{
    public static show(){
    System.out.println("in A");
    }
    }
    class B extends A{

        }

        B obj = new B();
        obj.show();

    OUTPUT - in A

    Case 2: Method Overriding
    class A{
    public static show(){
    System.out.println("in A");
    }
    }
    class B extends A{
    @Override
    public static show(){
    System.out.println("in B");
    }
    }

    OUTPUT - in B

40. Dynamic Method Dispatch

    - How to create reference of super class and object of sub class?
      e.g. A obj = new B();
      A - reference, new B() - object
      Ans - If you have a reference of super class & object of sub class
      you can call only those method which are there in Super class
      & as well as in Sub class.

    - To achieve Dynamic Method Dispatch we use runtime polymorphism.

41. Encapsulation

    - What is Encapsulation>
      Binding data with methods

    - You will be having class inside it will have object which

      - Knows Something --> variables
      - Does Something --> methods

    - Whenever you create a Variables inside class make sure that those Variables
      only be changed with the help of Method.

    - We access through the main method instead we should use Setters and Getters.

    - Setters --> used to set the value(setting the value)
    - Getters. --> used to get the value(fetching)

    - Make sure variables you will use must be private.
    - Methods who will access those variables should be public.

    - As you can conclude from above👆👆 two Statements is that you are restricting
      or binding variables data to specific methods is called Encapsulation.

    - Why we need Encapsulation?
      To keep our data safe

42. Wrapper Class | Autoboxing

    - Whenever we assign some data to certain variables using primitive data_type
      so as Java is strict OOP Language so we will create object of Everything.

      Primitive data_type Wrapper Class

    1.  char Character
    2.  byte Byte
    3.  short Short
    4.  int Integer
    5.  long Long
    6.  float Float
    7.  double Double
    8.  boolean Boolean

    - Whenever you put primitive value in object is called Boxing/Wrapping.
      int i = 5; // Primitive Datatype
      Integer ii = new Integer(i);// Boxing - Wrapping

      int j = ii.intValue(); // Unboxing - Unwrapping

      Integer value = i;// Autoboxing
      int k = value; // Autounboxing

    - To access static method we can use Class_Name

43. Abstract Keyword

    - We can use abstract in a Class as well as in method.

    - So if you dont want anyone to create object of any specific class then we
      specify that Class as 'ABSTRACT'.
      e.g. abstract class Human{

      }

    - Once you specify class as abstract no one can create object of that class.

    - To declare any method we use abstract keyword.
      E.g.

      - Declaration --> public abstract void eat();
      - Defining -->
        public void eat(){

                }

    - Whenever you have abstract method inside a class that class must be declared
      as abstract.

    - VALID CASES
    - Case 1
      class Human {
      public void eat() {

              }

              public void walk() {

              }
          }

          Human object = new Human();

    - Case 2
      abtract class Human {
      public void eat() {

              }

              public void walk() {

              }
          }

      We can't create a object of these class

    - Case 3
      abtract class Human {
      //Declaration
      public abtract void eat();

              //Definition
              public void walk() {

              }
          }

      We can't create a object of these class

    - It is not compulsory to always have a abstract method inside a abstract class.

    - INVALID CASE
      Case 4
      class Human {
      //Declaration
      public abtract void eat();

              //Definition
              public void walk() {

              }
          }

    - If we are using abstract method in a class (written above) then we must
      also specify that class as abstract class.

    - If you are extending abstract class which contains abstract method in it then
      we must define the method inside newly created class(viz. Sub class)
      otherwise it will also become abstract Class.

      abstract class Human { //Abstract

          public abstract void eat();

          public void walk() {

          }

      }

      //Below class is also known as Concrete class
      class Man extends Human { //Concrete class
      public void eat() {

          }

      }

      // VALID
      Human object = new Man();
      Man object1 = new Man();

44. Why do we need abstract Classes?
    Lets say you have a class which contains two methods as an arguments Integer & Double and Print
    down.
    Case 1
    class A{
    public void show(Integer i){
    System.out.println(i);
    }

            public void show(Double i){
                System.out.println(i);
            }
        }

        Printer obj = new Printer();
        obj.show(5);
        obj.show(5.5);

    Case 2

    - Integer & Double Classes extends Number abstract class
      class Printer {
      public void show(Number i) {
      System.out.println(i);
      }
      }  
      Printer obj = new Printer();
      obj.show(5);
      obj.show(5.5);

45. Final Keyword

    - Final Keyword can be used with 3 Places.

      1.  Variables --> Once you make a variable 'final' you can't change it & it becomes CONSTANT.

          - final int DAY = 19; --> Now you can't reassign value
          - final int DAY; --> Now you can assign the value to a variable
            DAY = 19; //1st assignment
            DAY = 10; //2nd assignment is not valid to a Constant variable.

      2.  Methods --> Once you make a method 'final' in parent class you can't Override that
          method inside a child class.
          Case 1:
          class A {
          public final void show() {
          System.out.println("in A");
          }
          }

              class B extends A {
                  Below👇👇 code is NOT valid bcoz the method is final
                  public void show() {
                      System.out.println("in B");
                  }
              }

          Case 2: Method Overriding
          class A {
          public void show() {
          System.out.println("in A");
          }
          }

              class B extends A {
                  public void show() {
                      System.out.println("in B");
                  }
              }

      3.  Class --> Once you make a class as final then you can't inherit/extend that Class.
          final
          final class A {
          public final void show() {
          System.out.println("in A");
          }
          }

          //INVALID in these context
          //class B extends A {

          //}

46. Interfaces

    - class --> extends
    - interface --> implements

    - Multiple Inheritance
      A class extending/inheriting two or more classes.
      E.g.
      class B{

      }
      class C{

      }
      class A extends B,C{

      }

    - Because Multiple inheritance is not possible in java that why the 'interface' concept is
      introduced in java.
      E.g.
      interface A{

      }
      class B implements A{

      }
      class C extends B implements A{

      }

    - Some properties related 'Interfaces'
      1.Let's say in future if Pen wants to extend Writer as well as Another class
      named 'Abc' since it is not possible Multiple inheritance on java.

      2.But Pen can extend one class as usual & also Pen can implements 'n'(1,2....n)
      number of classes with the help of Interfaces.

          E.g.
          interface Writer {
              public abstract void write(); // declaration
          }

          class Pen extends Abc implements Writer {
              public void write() {
                  System.out.println("Im a Pen");
              }
          }
          class Kit {
              public void doSomething(Writer p) {
                  p.write();
              }
          }

          Kit obj = new Kit();

          Writer p = new Pen();
          obj.doSomething(p);

          Writer pc = new Pencil();
          obj.doSomething(pc);

      3.Pen class can implement 'n' number of classes.

          class Pen extends Abc implements Writer Reader ... n Classes{

          }

      4.When you create & declare any method inside a interface it is assumed to be
      'public abstract'. You don't need to specify method as public abstract it is
      already there.

          interface Writer {
              public abstract void write(); // declaration
          }

          EQUIVALENT TO

          interface Writer {
              void write(); // declaration
          }

      5.We can't define any method inside a inteerface.
      NOT VALID | NOT ALLOWED

          interface Writer {
              public abstract void write(){

              } //Definition
          }

      6.We can not create a object of Interface but we can create a Reference of it. - Writer p = new Writer(); //Object --> NOT VALID - Writer p = new Pen(); //Reference --> VALID

47. More about Interfaces

    - Why do we use Interfaces?

      - To achieve concept of generalization but we achieve this through abstract classes.

      - Project Manager

        - Experienced Programmer
        - Fresher Programmer

        Client comes and tells the Fresher Programmer to write some functions or add
        features to his existing project and Fresher Programmer finds it difficult in
        dealing with functions and he seeks the help from Experienced Programmer and
        he provides some method declaration(Interfaces) to Fresher Programmer and Now after
        getting some idea/logc/reference from Experienced Programmer he then Defines those
        Methods.

    - In order to instantiate/ create object of a interface we must firstly implement
      a interface class using another class and then
      CREATE

      - REFERENCE OF A INTERFACE
      - OBJECT OF SUB CLASS

      E.g.
      interface A{
      void show();
      }
      class B implements A{
      public void show(){
      System.out.print("I am Sub Class");
      }
      }

      A obj = new B();

    - Also we can do the same task using Anonymous Class

48. Anonymous Inner Class

    - We use Anonymous class to instantiate Interfaces.

    - It is an inner class without a name and for which only a single object is created.
    - An anonymous inner class can be useful when making an instance of an object with
      certain “extras” such as overloading methods of a class or interface, without having
      to actually subclass a class.

    E.g.
    A obj = new A() { // Anonymous Inner Class
    //The method used in Anonymous class can not be used in other classes
    public void show() {
    System.out.println("I am the best");
    }
    };
    obj.show();

    - It will not waste lots of memory.

    - Whe we use normal class it creates a new class file.

    - If your intention is not to REUSE the method defined then go for Anonymous Class.

    - You can create a object of interface class using Anonymous class you don't need
      to create a New Class to instantiate the interface.

49. Functional Interface | Lambda Expression

    - Types of Interfaces

    - Till 1.7 Version java above interface exist

      1.  Normal - Interface having more than one method.

      2.  Single abstract method (SAM) - Interface having one method.

      3.  Marker Interface - Interface which dont have any method.
          e.g. Serializable

    - From 1.8V
      1,3

      - SAM is also known as Functional Interface which have Lambda Expression inherited
        from Scala Language.

    - Syntax for Lambda Expression
      Interface_name obj_name = method_name -> method_defn;

    - 👆👆Above Syntax will work only with interface having one Method.

50. Default method in Interface

    - Abstract Class --> We can Define & Declare method

    - Interface

      - Till Java 1.7 Version --> We can Declare Method
      - From Java 1.8 Version --> We can Define Method using 'default' method

      interface Demo{
      void show();
      default void show(){
      System.out.println("In interface show method");
      }
      }

51. Multiple Inheritance issue with Interface

52. Static method in Interface

    - Interface can have static method and in order to call that static method we dont
      need to create a object of that.

    - interface Demo{
      static void show(){
      System.out.println("In interface show");
      }
      }
      Demo.show();

53. Whenever you create a variable inside interface by default it becomes CONSTANT or FINAL.
    - You can not reassign the value for that variable in another class.
