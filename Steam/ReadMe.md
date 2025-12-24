# Build Libbaray Management 

## Entities 
We will Book Entity representing book 
We will Author representing Author 
Library class with collection of books
```java
class Book {
    
}
```


## Has A  and Is - A
```java 
class Parent {
    
}

class Child extends Parent {
    
}

class Book {
    //...
    Author author;
}

class Person {
    
}
class Employee extends  Person {
    
}
```


**************Problems**************
## Functional 1

#1
public List<Integer> doubling(List<Integer> nums) {
return nums.stream().map(i->i*2).collect(Collectors.toList());
}

#2
public List<Integer> square(List<Integer> nums) {
return nums.stream().map(i->i*i).collect(Collectors.toList());
}

#3
public List<String> addStar(List<String> strings) {
return strings.stream().map(i->i+"*").collect(Collectors.toList());
}

#4
public List<String> copies3(List<String> strings) {
return strings.stream().map(i-> i+i+i).collect(Collectors.toList());
}

#5
public List<String> moreY(List<String> strings) {
return strings.stream().map(i-> "y"+i+"y").collect(Collectors.toList());
}

#6
public List<Integer> math1(List<Integer> nums) {
return nums.stream().map(i->(i+1)*10).collect(Collectors.toList());
}


#7
public List<Integer> rightDigit(List<Integer> nums) {
return nums.stream().map(i-> i%10).collect(Collectors.toList());
}

#8
public List<String> lower(List<String> strings) {
return strings.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
}

#9
public List<String> noX(List<String> strings) {
return strings.stream().map(i-> i.replace("x","")).collect(Collectors.toList());
}


## Functional 2


#1
public List<Integer> noNeg(List<Integer> nums) {
return nums.stream().filter(i-> i>=0).collect(Collectors.toList());
}

#2
public List<Integer> no9(List<Integer> nums) {
return nums.stream().filter(i-> i%10!=9).collect(Collectors.toList());
}

#3
public List<Integer> noTeen(List<Integer> nums) {
return nums.stream().filter(i-> i<13 || i>19).collect(Collectors.toList());

}

#4
public List<String> noZ(List<String> strings) {
return strings.stream().filter(i-> !i.contains("z")).collect(Collectors.toList());
}

#5
public List<String> noLong(List<String> strings) {
return strings.stream().filter(i-> i.length()<4).collect(Collectors.toList());
}

#6
public List<String> no34(List<String> strings) {
return strings.stream().filter(i-> i.length()!=3 && i.length()!=4).collect(Collectors.toList());
}

#7
public List<String> noYY(List<String> strings) {
return strings.stream().map(i-> i+"y").filter(i->!i.contains("yy")).collect(Collectors.toList());
}

#8
public List<Integer> two2(List<Integer> nums) {
return nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
}

#9
public List<Integer> square56(List<Integer> nums) {
return nums.stream().map(n -> n*n+10).filter(i -> i % 10 != 5 && i % 10 !=6).collect(Collectors.toList());
}
