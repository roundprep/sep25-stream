// Functional#1

1.public List<Integer> doubling(List<Integer> nums) {
return nums.stream().map(i->i*2).collect(Collectors.toList());
}
2.public List<Integer> square(List<Integer> nums) {
return nums.stream().map(i->i*i).collect(Collectors.toList());
}
3.public List<String> addStar(List<String> strings) {
return strings.stream().map(i->i+"*").collect(Collectors.toList());
}
4.public List<String> copies3(List<String> strings) {
return strings.stream().map(s -> s+s+s ).collect(Collectors.toList());
}
5.public List<String> moreY(List<String> strings) {
return strings.stream().map(s -> "y" + s + "y" ).collect(Collectors.toList());
}
6.public List<Integer> math1(List<Integer> nums) {
return nums.stream().map(s -> (s + 1 )* 10).collect(Collectors.toList());
}
7.public List<Integer> rightDigit(List<Integer> nums) {
return nums.stream().map(s -> s%10).collect(Collectors.toList());
}
8.public List<String> lower(List<String> strings) {
return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
}
9.public List<String> noX(List<String> strings) {
return strings.stream().map(s -> s.replace("x","")).collect(Collectors.toList());
}

// Functional#2

1.public List<Integer> noNeg(List<Integer> nums) {
return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
}
2.public List<Integer> no9(List<Integer> nums) {
return nums.stream().filter(n -> n % 10 != 9).collect(Collectors.toList());
}
3.public List<Integer> noTeen(List<Integer> nums) {
return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
}
4.public List<String> noZ(List<String> strings) {
return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
}
5.public List<String> noLong(List<String> strings) {
return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
}
6.public List<String> no34(List<String> strings) {
return strings.stream()
.filter(s -> s.length() != 3 && s.length() != 4)
.collect(Collectors.toList());
}
7.public List<String> noYY(List<String> strings) {
return strings.stream().map(s -> s + "y")                
.filter(s -> !s.contains("yy"))   
.collect(Collectors.toList());
}
8.public List<Integer> two2(List<Integer> nums) {
return nums.stream()
.map(n -> n * 2)
.filter(n -> n % 10 != 2)
.collect(Collectors.toList());
}
9.public List<Integer> square56(List<Integer> nums) {
return nums.stream().map(n -> n * n + 10)
.filter(n -> n % 10 != 5 && n % 10 != 6)
.collect(Collectors.toList());
}

