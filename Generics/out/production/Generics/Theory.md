# Generics

**Gneric introduced in java from the version of JDK 5**

Generics gives us the ablility to write a function or class or interface in a general way.

Example : 

The algorithm for implementing a stack is the same irrespective of datatypes . If we want to write a stack algorithm for String and Integer type we have to write two same algorithm with different types. Here repeatation comes into the picture and to avoid this repeatation we can use Generics.

# Gererics is Parametererized Type

To specify a Generic we have to write parameters with classes, methods, interfaces and we write those parameters within the angular brackets <> . Generally those parameters are defined as a uppercase single alphabet (e.g T, U) . Those parameters act as a general datatype. If we provide  a Integer value then it's gonna act like a Integer type.

# Generic Class

### Syntax of Declaring a Generic Class

```java
access-specifier class class-name <type-arg-list> {

}
```

### Syntax of Creating a Generic Class Object

```java
class-name<type-arg-list> object-name = new constructor-name<>(cons-arg-list);
```

```java
// this Demo is a generic class having one parameter as T. T is a placeholder
class Demo<T> {
    T obj; // delcaring a obj of type T
    // consructor that populating the class obj with a value
    Demo (T obj) { 
        this.obj = obj;
    }

    void print () {
        System.out.println ("the value of the current object is : " + this.obj);
    }
}


class Main {
    public static void main (String[] args) {
        // creating a Demo class object with defining that <T> is going to act as an Integer.
        Demo<Integer> o1 = new Demo<>(78);
        o1.print();

        // here we are not defining the type of <T> but T will String type cause we have passed a String value inside the constructor.
        Demo o2 = new Demo("Biswajit");

        // this is not gonna work. Cause w've said that <T> will be Integer but using the constructor we are passing String that is not applicable. We have to pass Integer insted.
        //Demo<Integer> o3 = new Demo("Biswajit");
    }
}
```

# Generics works only with reference types

Did you notice that when declaring objects of class Demo w've allways used Integer insted of int. The reason behind is we can't use primitive datatype as a parameter value it should be Wrapper class of that primitive type. 

- Integer insted of int
- Float insted of float
- Double insted of double
- Character insted of char
- String
- Boolean insted of boolean

# Generic Types Differ Based on Their Type Arguments

See in the above example if we want to do this ``` o2 = o1 ``` then we will get an error!
Why ? Because o1 is Integer generic type and o2 is String generic type and we can not assign a Integer inside a String. So for o1 ``` Demo<T>``` is Integer and for o2 ``` Demo<T>``` is String.
Conclusion is generics are differents based on their parameters are the giving while creating an object.

# How Generic Improve Type Safety

**Example 1**

```java
class Demo<T> {
    T a;

    Demo (T a) {
        this.a = a;
    }

    T getValue () {
        retutn this.a;
    }
}

class Main {
    public static void main (String[] args) {
        Demo<Integer> obj = new Demo<>(78);
        // Storing the value in int type is possible since the type of the given value remains same.
        int a = obj.getValue();
        System.out.println(a);
    }
}
```

**Example 2**

```java
class Demo{
    Object a;

    Demo (Object a) {
        this.a = a;
    }

    Object getValue () {
        retutn this.a;
    }
}

class Main {
    public static void main (String[] args) {
        Demo obj = new Demo(78);
        // here you can't store the value in int type since the given is now of type Object.
        int a = obj.getValue();
        System.out.println(a);
    }
}
```

If you look carefully Example 1 and Example 2 both are same but in Example 1 we've used Generic and in Example 2 we've used Object class.
Now Generic and Object both can store any kind of type. 

- Generic use as a placeholder whatever value you have passed based on that value Generic placeholder will automatically place the Wrapper class reference to that place where Generics are being used.
- When we are passing any Wrapper class reference Java automatically convert that class type to the object type using auto-casting feature of Java. So it means the object is no longer of the type that you have provided, the type of the value will be Object.
  Now if you want to store the value that you have provided in the provided type variable you can't do that. You can do this using the manual typecasting. 

So Generic is more type safe due to it do not typecast the value. In Generic the value remains of the same type as it was provided.

# Bounded Types

This is the way that ensures that the Generic type should be any subclass type of given superclass.
It looks like this 

```java
class class-name <T extends Superclass-name> {

}
```

Now the <T> will only be the type of subclasses of the given super class.

**Example**

```java
class Demo <T extends Number> {
    // Here the T have to be the type of any sub classes of the Number class
    // So T could be 
    // Integer 
    // Float
    // Double
    // But it could not be 
    // String
    // Character
    // Due to String and Character are not subclasses of Number class.
}
```

So, conclusion is using Bounded type we are restricting <T> to be able to be any type.

**Example**

```java
class Demo<T extends Number> {
    T a;

    Demo (T a) {
        this.a = a;
    }

}

class Main {
    public static void main(String[] args) {
        // this is possbile since Integer is a subclass of Number.
        Demo<Integer> obj1 = new Demo<>(45);

        // this is NOT possible since String is not a subclass of Number.
        Demo<String> obj2 = new Demo<>("Biswajit");
    }
}
```

# Wildcard Arguments

If two generic classes are different types the wildcard argument could be useful to compatible them to each other.
If One class is of Integer type and other one is Double type then wildcard will compatible the Integer type of Double type.
<?> this sign is use as wildcard argument.

```java
public class Hello {

    public static void main(String[] args) {
        Demo<Integer> ob1 = new Demo<>(new Integer[] {1,2,3,4,5});
        Demo<Double> ob2 = new Demo<>(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0});

        // Here the ob1 is Integer and ob2 is Double type and because of wildcard ob1 is made compatible of ob2. So that both can work together.
        // Without wildcard this will produce an Error saying requied <Integer> provided <Double>.
        System.out.println(ob1.sameAvg(ob2));
    }

}


class Demo<T extends Number> {
    T[] arr;

    Demo (T[] arr) {
        this.arr = arr;
    }

    double avarage () {
        double sum = 0.0;
        for ( int i = 0; i < arr.length; i++ ) {
            sum += arr[i].doubleValue();
        }

        return sum / arr.length-1;
    }

    // this is how wildcard approach is applied.
    boolean sameAvg(Demo<?> ob) {
        if (avarage() == ob.avarage())
            return true;
        return false;
    }
}
```

# Generic Method

So far we have seen class member methods that were dealing with Generic types but types were same as class Generic type.

This is not mandetory to be the generic type same as the class generic type. A method could have it's own generic types and number of generic types could be anything.

**Example**

```java
class Demo {
    <T> void display (T[] arr) {
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.println (arr[i]);
        }
    }
}
```

In this above example as you can see the class itself is a simple non-generic class but the method is a generic method. This is also possible so method could be generic on it's own and also it can use the same type of it's class have.





# Generic Constructor

Just like classes and methods a constructor can generic also.

**Example**

```java
class Demo {
    double a;
    <T extends Number> Demo(T a) {
        this.a = a;
    }
}
```

 
