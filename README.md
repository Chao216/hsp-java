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
|----|----|---|---|
|public|x|x|x|x|
|protected|x|x|x|o|
|default|x|x|o|o|
|private|x|o|o|o|
