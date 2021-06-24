# Kotlin 입문기

1. [변수](#1-변수)
2. [자료형](#2-자료형)
3. [메소드](#3-메소드)
4. [연산자](#4-연산자)
5. [제어흐름](#5-제어흐름)
6. [배열](#6-배열)

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
