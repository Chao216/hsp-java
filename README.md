Now I will start learning Java 
2023年 06月 18日 星期日 19:42:08 CST

NOTE ! when you assign variable as char, Always use '', NOT "", because "" is for string, while '' is seen as char!!! :)

## difference between `i++` and `++j`
when you use them for while/for loop, they behave the same<br/>
but when you assign to new variables, they works differently!

```java
int i = 1;
int j = 1;

int k = i++; // step1 create var_temp = i, step 2 i = i + 1, step 3 k = temp
int l = ++j; // step1 j = j + 1, step2 temp = j, step3 l = j

// Note! both i and j will be 2 after ++ operation !!!
```

## evaluate String

#### when you only want to compare value, not the address. you shoudl use `String1.equals(String2)`, not `==`

## `return` must be placed in the end of code block inside methods;

<br/>some shortcuts in IDEA
<br/>`Ctrl + Y` to delete line
<br/>`Ctrl + D` to duplicate line
<br/>`Ctrl + Alt + L` to reformat codes
<br/>`Shift + F10` to execute codes!

|modifier|self|same package|child class|different package|
|----|----|---|---|---|
|public|x|x|x|x|
|protected|x|x|x|o|
|default|x|x|o|o|
|private|x|o|o|o|

# polymorphic

if Animal is a Super class, and Cat and Dog are sub class<br/>

and we define a speak() seperately in 3 classes above<br/>

```java
public  void speak(){
        System.out.println("Hi I am an animal!");
    }

public void speak(){
        System.out.println("Hi, I am a cat!");
    }

public void speak(){
        System.out.println("Hi, I am a Dog!");
    }

```

if we do the follow 
```java
	Animal animal = new Cat();//编译类 Animal, 运行类Cat
        animal.speak();
        animal = new Dog(); //编译类还是ANmial, 运行类为Dog
        animal.speak();
        //Animal 是 Dog, Cat 的父类。

```

following results will show on screen 
> Hi, I am a cat!<br/> Hi, I am a Dog!


# polymorphic in Java
if we create super class `Animal`, and then make sub class `Tiger`, and `Sheep`<br/>
same idea A super class `Food`, then sub class `Chicken`,`Grass`<br/>
we can design method with parameters `feed(Animal animal, Food food)`. But we can pass in sub class as arguments<br/>
such as `*.feed(sheep1,grass1)` where sheep1 , and grass1 from instances of subclass Sheep, and Grass
```java

public static void main(String[] args) {
        Master Chiang = new Master("Chiang Kai-SHik");
        Grass nzGrass = new Grass("fresh new zealand grass");
        Sheep sheep1 = new Sheep("Shon");
        Chiang.feed(sheep1,nzGrass);
    }
```



# Static variable and Static Method
Static method can only access static varibale, mormal method can access both static and regular varibales.

## sequence of running priority static extends
1. super class static code block, varibale initialization
1. child class static code block, varibale initializtaion
1. super class non-static code block varibale initialization
1. super class constructor
1. child class non-static code block varibale initialization
1. child class constructor

