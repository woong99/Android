# Kotlin 입문기

1. [변수](#1-변수)
2. [자료형](#2-자료형)
3. [메소드](#3-메소드)
4. [연산자](#4-연산자)
5. [제어흐름](#5-제어흐름)
6. [배열](#6-배열)
7. [Collection](#7-Collection)
8. [반복문](#8-반복문)
9. [클래스](#9-킅래스)
10. [접근 제어자](#10-접근-제어자)
11. [상속](#11-상속)
12. [인터페이스](#12-인터페이스)
13. [제너릭](#13-제너릭)

---

## 1. 변수

### 변수의 두 종류

- 내 마음대로 원하는 것을 넣을 수 있는 상자 -> **Variable**
- 한 번 넣으면 바꿀 수 없는 상자 -> **Value**

### 변수를 선언하는 방법(1)

    var/val 변수명 = 값

```Kotlin
var num1 = 10
val num2 = 20
```

---

## 2. 자료형

- 정수형
  - Long -> Int -> Short -> Byte
- 실수형
  - Double -> Float
- 문자
  - Char
- 문자열
  - String
- 논리형(참True/ 거짓False)
  - Boolean

### 변수를 선언하는 방법(2)

    var/val 변수 : 자료형 = 값
    Kotlin에서는 Var에 한 번 값을 넣으면 그 값에 해당하는 자료형만 넣을 수 있다.

```Kotlin
var number: Int = 20
var s: String = "Hello"
val point: Double = 3.4
```

### 변수를 선언하는 방법(번외)

- a.toInt() -> a를 int형으로 바꾼다.
- b.toFloat() -> b를 float형으로 바꾼다.

```Kotlin
var e = "John"
var f = "My name is $e. Nice to meet you"

>>> My name is John. Nice to meet you
```

- var abc: Int? = null -> 자료형 뒤에 ?가 붙으면 null을 가질 수 있다.

---

## 3. 메소드

- 함수란
  - 어떤 input을 넣어주면 어떤 output이 나오는 것
  - ex) y = x + 2

### 함수를 선언하는 방법

fun 함수형 (변수명: 타입, 변수명: 타입 ....): 반환형{  
&nbsp; &nbsp; 함수 내용  
&nbsp; &nbsp; return 반환값  
 }

```Kotlin
fun plus(first: Int, second: Int): Int {
    val result = fisrt + second
    return result
}
```

### 디폴트 값을 갖는 함수 만들기

```Kotlin
fun plusFive(first: Int, second: Int = 5): Int {
    val result = Int = first + second
    return result
}
```

### 반환값이 없는 함수 만들기 (1)

```Kotlin
fun printPlus(first: Int, second: Int): Unit {
    val result = first + second
    println(result)
}
```

### 반환값이 없는 함수 만들기 (2)

```Kotlin
fun printPlus2(first: Int, second: Int) {
    val result = first + second
    println(result)
}
```

### 간단하게 함수를 선언하는 방법

```Kotlin
fun plusShort(first: Int, second: Int) = first + second
```

### 가변인자를 갖는 함수 선언하는 방법

```Kotlin
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

>>>plusMany(1,2,3....)
```

### 내부 함수 (함수 안에 함수)

```Kotlin
fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first + second
    }
    return plus(first, second)
}
```

---

## 4. 연산자

- 산술 연산자
  - +, -, \*, / (몫만 취함), % (나머지만 취함)
- 대입 연산자
  - 좌변 = 우변 (우변 값이 좌변에 들어간다)
  - a = 5 (O), 5 = a (X)
- 복합 대입 연산자
  - +=, -=, \*=, /=, %=
  - a += 10 -> a = a + 10
- 증감 연산자
  - ++, --
  - a++, a==
- 비교 연산자

  - \> , >=, <, <=, ==, !=
  - True == True -> True
  - True == False -> False
  - True != True -> False
  - True != False -> True

- 논리 연산자
  - &&, ||, !
  - True && True -> True
  - True || False -> True
  - !True -> False
  - !False -> True

---

## 5. 제어흐름

- if / else 사용하는 방법

```Kotlin
    if (a > b) {
        println("a 가 b 보다 크다")
    } else {
        println("a 가 b 보다 작다")
    }
```

- if / else / else if 사용 하는 방법

```Kotlin
   if (a > b) {
       println("a 가 b 보다 크다")
   } else if (a < b) {
       println("a 가 b 보다 작다")
   } else {
       println("a 와 b 는 같다")
   }
```

- 값을 리턴하는 if 사용 방법 (1)
  ```Kotlin
    val max = if (a > b) {
        a // 5
    } else {
        b // 10
    }
  ```
- 값을 리턴하는 if 사용 방법

  ```Kotlin
  val max1 = if (a > b) a else b
  ```

- 앨비스 연산자 (number에 null이 있으면 number2에 10 대입)

```Kotlin
    val number: Int? = null
    val number2 = number ?: 10
    println(number2)

    >>> 10
```

- When (Switch와 같은 용도)

```Kotlin
    val value: Int = 3

    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I do not know value")
        }
    }

    >>> value is 3
```

- When을 이용한 대입법

```Kotlin
    val value = 2
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)

    >>> 20
```

- 값을 리턴하는 When 구문의 경우 반드시 모든 값을 리턴

```Kotlin
    val value1: Boolean? = null
    val value2 = when (value1) {
        true -> 1
        false -> 3
        null -> 4
    }
    println(value2)

    >>> 4
```

- When의 다양한 조건식 (1)

```Kotlin
    val value: Int = 10
    when (value) {
        is Int -> println("value is int")
        else -> println("value is not int")
    }

    >>> value is int
```

- When의 다양한 조건식 (2)

```Kotlin
    val value: Int = 87
    when (value) {
        in 60..70 -> println("value in 60..70")
        in 70..80 -> println("value in 70..80")
        in 80..90 -> println("value in 80..90")
    }

    >>> value in 80..90
```

---

## 6. 배열

- 배열을 생성하는 방법 (1)

```Kotlin
    var group = arrayOf<Int>(1, 2, 3, 4, 5)
```

- 배열을 생성하는 방법 (2)

```Kotlin
    var group = arrayOf(1, 2, 3.5, "Hello", 5)
```

- 배열을 생성하는 방법 (3)

```Kotlin
    val a1 = intArrayOf(1, 2, 3) // Int 만 넣을 수 있음
    val a2 = charArrayOf('b', 'c') // Char 만 넣을 수 있음, ""는 안된다. ''만 가능. char -> '', string -> ""
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)
```

- 배열을 생성하는 방법 (4) -> **lambda**를 활용하는 방법

```Kotlin
    var a5 = Array(10, { 0 }) // 첫 번째 인자 = 배열의 Size, 두 번째 인자 = { 0 } -> 모든 값이 0이 된다.
    var a6 = Array(5, { 1;2;3;4;5 }) // { 1; 2; 3; 4; 5} ';'를 이용한다.
```

- 배열의 값을 꺼내는 방법 (1)

```Kotlin
    var group = arrayOf(1, 2, 3.5, "Hello", 5)
    val test1 = group.get(0)
    val test2 = group.get(3)
    println(test1)
    println(test2)

    >>> 1
    >>> Hello
```

- 배열의 값을 꺼내는 방법 (2)

```Kotlin
    val test = group[0]
```

- 배열의 값을 바꾸는 방법

```Kotlin
    group.set(0,100)
    group[0] = 200
```

---

## 7. Collection

- Collection

  - Imutable Collection (변경 불가능)

    - List -> 중복을 허용한다.

    ```Kotlin
       val numberList = listOf<Int>(1,2,3,4)
       println(numberList)

       >>> [1, 2, 3, 4]
    ```

    - Set -> 중복을 허용하지 않는다.

    ```Kotlin
       val numberSet = setOf<Int>(1, 2, 3, 3, 3)
       println(numberSet)

       >>> [1, 2, 3]
    ```

    - Map -> Key, Value 방식으로 저장한다.

    ```Kotlin
        val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
        println(numberMap)

        >>> {one=1, two=2}
    ```

  - Mutable Collection (변경 가능)

    - MutableList

    ```Kotlin
       val mNumberList = mutableListOf<Int>(1, 2, 3)
       mNumberList.add(3, 4)
       println(mNumberList)

       >>> [1, 2, 3, 4]
    ```

    - MutableSet

    ```Kotlin
        val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
        mNumberSet.add(10)
        println(mNumberSet)

        >>> [1, 2, 3, 4, 10]
    ```

    - MutableMap

    ```Kotlin
        val mNumberMap = mutableMapOf<String, Int>("one" to 1)
        mNumberMap.put("two", 2)
        println(mNumberMap)

        >>> {one=1, two=2}
    ```

---

## 8. 반복문

- 반복하는 방법 (1)

  ```Kotlin
    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }
  ```

- 반복하는 방법 (2)
  ```Kotlin
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자열
    }
    >>> index : 0 value : 1
    ...
  ```
- 반복하는 방법 (3)
  ```Kotlin
    a.forEach { // 기본적으로 it 사용
        println(it)
    }
  ```
- 반복하는 방법 (4)

  ```Kotlin
    a.forEach { item ->     // oo -> 을 이용해 it 대신 oo 사용
        println(item)
    }
  ```

- 반복하는 방법 (5)
  ```Kotlin
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }
  ```
- 반복하는 방법 (6)
  ```Kotlin
    for (i in 0 until a.size) {  // 0 부터 a.size 까지 반복(인덱스)
        // until 은 마지막을 포함하지 않는다.
        println(a[i])
        // println(a.get(i))
    }
  ```
- 반복하는 방법 (7)

  ```Kotlin
    for (i in 0 until a.size step (2)) {     // step 을 설정하면 뛰어서 반복
        println(a.get(i))
    }
  ```

- 반복하는 방법 (8)

  ```Kotlin
  for (i in a.size - 1 downTo (0)) {
      // 8부터 0까지 반복
      println(a[i])
  }
  ```

- 반복하는 방법 (9)
  ```Kotlin
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a[i])
    }
  ```
- 반복하는 방법 (10)
  ```Kotlin
    for (i in 0..10) {      // 마지막 숫자 포함
        println(i)
    }
  ```
- 반복하는 방법 (11)

  ```Kotlin
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++
        println(b)
    }
  ```

- 반복하는 방법 (11)

  ```kotlin
    do {            // do 부분은 무조건 한 번 실행
      println("hello")
      b++
    } while (b < c)
  ```

---

## 9. 클래스

```
  Kotlin 은 OOP(Object Oriented Programing) = 객체지향 프로그래밍

  객체란?
  -> 이름이 있는 모든 것
```

- 클래스 만드는 방법 (1)

```Kotlin
  class Car(var engine: String, var body: String) {

  }
```

- 클래스 만드는 방법 (2)

```Kotlin
  class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }
}
```

- 클래스 만드는 방법 (3) -> 1번 방법의 확장

```Kotlin
  class Car1(engine: String, body: String) {
    var door: String = ""

    // 생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}
```

- 클래스 만드는 방법 (4) -> 2번 방법의 확장

```Kotlin
  class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}
```

- 클래스를 사용하는 방법

```Kotlin
  val bigCar: Car = Car("v8 engine", "big")
  println(bigCar.engine)

  >>> v8 engine
```

- init()

```Kotlin
  class ~~~{
    ~~~
    ~~~
    init{
      /~~~~~~/
    }
  }

  >>> init이 가장 먼저 호출, 초기 셋팅을 할때 유용
```

- 오버로딩 (이름이 같지만 받는 파라미터가 다른 함수)

```Kotlin
  class TestClass() {
    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }
}
```

---

## 10. 접근 제어자

```Kotlin
  private val ~~~
```

### private 를 앞에 붙여주면 외부에서 접근이 불가능하다!

---

## 11. 상속

### 상속이란?

- 부모로부터 함수나 변수를 물려받는다.
- 자식 클래스는 부모 클래스의 타입이다

```Kotlin
  open class Car100() {
    open fun drive(): String {
        return "달린다"
    }

    fun stop() {}
  }

  // 커맨드 + n -> Override Methods 클릭
  class SuperCar100() : Car100() {
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
  }
```

## 12. 인터페이스

## 13. 제너릭

### 제너릭이란?

- 목적: 타입을 체크하는 기능
- 제너릭은 만들기 어렵고 실제로 만들일이 거의 없기 때문에 사용하는 방법만 숙지

```Kotlin
  // 제너릭을 사용하지 않은 경우
    // 형 변환을 해줘야 한다
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString() // 형변환(타입 변환)

    // 제너릭을 사용하는 경우 -> 타입이 안전하다
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // String 이라는 것을 보장 받는다

    // 강한 타입을 체크할 수 있다.
    val list3 = listOf(1, 2, 3, 4, "가", "나", 3.0)
    val list4 = listOf<Int>(1, 2, 3, "가") // 강한 타입 체크

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf(1, 2, 3, "가") // -> Any
    // 부모 : Any
    // 자식 : String, Int, Float
```
