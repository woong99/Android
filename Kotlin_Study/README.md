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

# Android_UI

1. [화면 그리기](#1-화면-그리기)
2. [LinearLayout](#2-linearlayout)

---

# Android_Essential

1. [Activity](#1-activity)
2. [Listener](#2-listener)
3. [Intent](#3-intent)
4. [Fragment](#4-fragment)

---

# Kotlin 입문기

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

---

# Android_UI

---

## 1. 화면 그리기

### 안드로이드에서 화면을 그리는 방법

- XML을 이용한다

### XML이란?

- DSL Language -> Domain Specific Language
- 안드로이드 UI를 그리기 위해 특화된 언어이다

### 핸드폰마다 화면 크기가 다 다른데 어떻게 화면을 그려야 할까?

- 픽셀 , dpi, dp 단위
- 픽셀 -> 핸드폰 화면에서 빛이 나오는 전구 -> 가장 작은 단위
- dpi -> dot per inch

* ldpi -> 120 (1인치에 120픽셀)
* mdpi -> 160
* hdpi -> 240
* xhdpi -> 320
* xxhdpi -> 480
* xxxhdpi -> 640

- dp -> Density Independent Pixel
- 픽셀 독립적인 단위

## 2. LinearLayout

### 레이아웃 종류

- 속성
  - match_parent: 해상도와 상관없이 화면을 꽉 채워준다 (전체 화면 100%)
  - wrap_content: 크기가 정해져 있지 않지만 text 크기만큼만 지정한다
- LinearLayout
  - orientation: 반드시 들어가는 속성, 데이터가 들어가는 방향을 정해준다
    - horizontal: 수평방향
    - vertical: 수직방향
  - gravity: 자식 View들의 중력방향을 결정
  - layout_gravity: 레이아웃안에서 어디에 위치 할 것인지 정해준다
  - ignoregravity: gravity 설정 상태에서 특정 자식 View에 대해 속성 무시

---

# Android_Essential

## 1. Activity

- Activity란?
- 앱의 한 화면이다
- Life Cycle(수명 주기)
- onCreate
  - Activity가 만들어질 때 단 한 번만 호출된다
  - Activity를 만들 때 단 한 번만 하면 되는 작업들은 여기에서 해준다
- onStart
- onResume
  - 다시 앱으로 돌아올 때 무조건 호출
  - Activity가 다시 호출 될 때 하면 되는 작업들을 여기에서 해준다
- onPause
  - 화면의 일부가 가려 졌을 때
- onStop
  - 화면 전부가 보이지 않을 때
- onDestroy

```Kotlin
  //cmd + n -> Override Method -> 선택
  //ex)
  override fun onStart(){
    super.onStart()
    // ~~~
  }
```

---

## 2. Listener

- **익명함수/클래스**란?
  - 이름이 없는 함수/클래스
  - 이름을 만들어 줄 필요가 없다
  - 한 번만 사용한다
- **View**를 Activity로 가져오는 방법

```kotlin
  // 1. 직접 찾아서 가져온다
    val textView : TextView = findViewById(R.id.hello)
  // 2, XML을 import해서 가져온다
    hello // 입력 후 option + enter로 import
```

- **Button** 사용법

```Kotlin
  // 1 -> 람다 방식
  hello.setOnclickListener{
    // ~~~
  }
  // 2 -> 익명 함수 방식
  hello.setOnclickListener(object : View.OnClickListener){
    override fun onClick(v : View?){
      // ~~~
    }
  }
  // 3 -> 이름이 필요한 경우
  val click = object: View.OnClickListener{
    override fun onClick(v : View?){
      // ~~~
    }
  }
  hello.setOnClickListener(click)
```

- **View** 조작하기
  - setText
  - setImageResource 등등

---

## 3. Intent

- 의도, 요구, 의사 전달, 요청
- Intent 사용
  - Activity 와 Activity
  - Android System 과 내 App(전화)
  - 다른 App 과 내 App -> 무작정 사용 X, 상호합의 필요
- 요청의 종류
  - 전달만 하는 요청
  - 리턴을 받는 요청
- Intent의 종류
  - 명시적 인텐트 -> 정확히 대상에게 요청
  - 암시적 인텐트 -> 할 수 있는 대상에게 요청

### Intent 사용 예시

```Kotlin
  // 정보 넘기기
  class Intent1
  val intent = Intent(this@Intent1, Intent2::class.java)
  intent.putExtra("number1" , 1)
  intent.putExtra("number2" , 2)
  startActivity(intent)

// 정보 받기
  class Intent2
  val number1 = intent.getInExtra("number1" , 0)
  val number2 = intent.getInExtra("number2" , 0)

  val result = number1 + number2
  val resultIntent = Intent()
  resultIntent.putExtra("result", result)
  setResult(Activity.RESULT_OK, resultIntent) // 결과값 넣어주기
  this.finish() // -> Activity 종료

// Apply (블록 지어져 있어서 가독성이 더 좋고 유시보수가 좋다)
  intent2.apply {
    this.putExtra("number1", 1)
    this.putExtra("number2", 2)
  }
  startActivityForResult(intent2, 200)
```

---

## 4. Fragment

- Activity -> 앱에 보이는 한 화면의 단위
- Activity가 가지고 있는 문제
  - Activity가 길어지게 되면 (파트 1,2,3,4,5,6) -> 관리 포인트가 많아진다 -> 관리가 어려워진다
- 다양한 디바이스에서 오는 문제
  - 안드로이드 디바이스가 너무 다양하다
  - 안드로이드 핸드폰만 있는게 아니다 -> 테블릿이 있다
- 사용처
  - Activity의 파트를 나누어서 책임진다
- Fragment
  - Life Cycle이 존재한다
  - Activity 종속적이다
- **사용법**
  - XML에 ViewComponent로 추가한다
  - 코드(동적)로 추가한다
- 데이터 전달 방법
  - Activity -> Fragment : argument 와 bundle
  - Fragment -> Activity : 자체 구현(Listener 구현)

```XML
  <fragment
    android:id="@+id/fragment_01"  // id 필수!
    // name 을 통해 설정
    android:name="com.example.myapplication.Fragment_01"
    android:layout_width="match_parent"
    android:layout_height="300dp" />

```

### XML로 추가하기

```Kotlin
  // XML로 추가하기
  class ~~~ : Fragment(){ // Fragment를 상속받는다
  override fun onCreateView( // View를 그리는 애
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Fragment가 인터페이스를 처음으로 그릴 때 호출된다.
        // inflater -> View를 그려주는 역할
        // container -> 부모 View
        return inflater.inflate(R.layout.fragment_01, container, false) // View 타입 Return

    }
  }
```

### 동적으로 추가하기

```Kotlin
  // 동적으로 추가하기
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle", "onCreate")

        val fragmentOne: Fragment_01 = Fragment_01()

        button.setOnClickListener {
            // Fragment를 동적으로 작동하는 방법
            // Fragment 붙이는 방법 replace/add
            val fragmentManager: FragmentManager = supportFragmentManager
            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction() // beginTransaction() -> 시작
            fragmentTransaction.replace(R.id.container, fragmentOne) // 할 일
            fragmentTransaction.commit() // commit -> 끝
            // 끝을 내는 방법
            // commit       -> 시간 될 때 해 (좀 더 안정적)
            // commitnow    -> 지금 당장해
        }
        button2.setOnClickListener {
            // Fragment remove/detach 하는 방법
            // attach 와 detach 하는 Fragment는 동일해야한다
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()

            // remove는 붙였다 땠다 가능
            // detach는 다시 붙이기 X

        }
    }
```

### Activity -> Fragment

#### Fragment에 data를 넣어주는 방법

```Kotlin
  val fragmentOne : FragmentOne = FragmentOne()
  val bundle: Bundle = Bundle()
  bundle.putString("hello", "hello")
  fragmentOne.arguments = bundle // fragmentOne에 bundle이 할당
```

```Kotlin
  // Argument의 data 가져오기
  override fun onActivityCreated(savedInstanceState: Bundle?) {
        val data = arguments?.getString("hello")
        Log.d("data", data.toString())
        super.onActivityCreated(savedInstanceState)
    }
```

### Fragment -> Activity

```Kotlin
  interface OnDataPassListener{ // interface 생성
    fun onDataPass(data : String?)
  }

  lateinit var dataPassListener : OnDataPassListener

  override fun onAttach(context: Context) {
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener // as = 형변환
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Activity의 OnCreate에서 했던 작업을 여기에서 한다
        pass.setOnClickListener {
            dataPassListener.onDataPass("Good Bye")
        }
    }
```

#### 받는 쪽으로 가서

```Kotlin
  class ~~ : FragmentOne,OnDataPassListener{
    override fun onDataPass(data: String?) { // interface 구현
        Log.d("pass", "" + data)
    }
  }
```

---

## 5. NullSafety

- Kotlin 특징 -> Null에 대해서 안전하다

- Null vs 0
  - 0 : 휴지를 다 쓰고 휴지심만 남은 상태
  - Null : 휴지심도 없는 상태, **존재하지 않는 상태**, 모르는 상태
- Null이 안전하지 않은 이유
  - 0 + 10 = 10
  - Null + 10 = ?
  - button.setOnClickListener -> O
  - Null.setOnClickListener -> Error
  - NullPointExceptionError 발생

### 예시

```Kotlin
  if(number != null){
    number += 10
  }

  if(number != null){
    button.setOnClickListener
  }
```

### Kotlin이 Null Safety 하기 위해서 사용하는 문법

- **?** : Null이 아니라면 이하 구문 실행
- !! : Null이 아님을 개발자가 보장, 최대한 사용하지 않도록 한다

### 사용방법

- button?.setOnClickListener -> ? 앞이 Null이 아니면 실행
- button!!.setOnClickListener

### Null 타입

- Int, Double, Float, Class -> Null이 될 수 없는 타입
- Int?, Double?, Float?, Class? -> Null이 될 수 있는 타입

### 예시

```Kotlin
  val number: Int = Null // 문법 오류
  val number: Int? = Null // 가능

  val number2 = number? + number1 // 문법 우류
  val number2 = number?.plus(number1) // ~~?.plus, minus 등 문법 존재, number가 null이 아니면 실행

  fun plus(a: Int, b: Int?): Int{
    if (b != null) return a + b
    else return a
  }

  fun plus2(a: Int, b: Int?): Int?{ // return 타입도 null 가능하게
    return b?.plus(a)
  }
```

### !! 사용 예시

```Kotlin
  val number5: Int = number1 + 10 // 에러 : number1의 타입이 Int일 수도 Null일 수도 있다
  val number5: Int = number1!! + 10 // number1이 Null이 아니라는 것을 개발자가 보증, 비추!!

```

### 엘비스 연산자 (삼항 연산자) -> ?:

```Kotlin
  val number = number1 ?: 10 // number1이 Null이면 10대입, 아니면 number1 값 대입
```

---

## 6. LateInit

- init -> 초기값 설정
- late -> 늦게, 나중에

- 초기값을 나중에 설정해주겠다
- 초기값이 설정되지 않았을 때 호출을 하면 에러 발생

### 예시

```Kotlin
  lateinit var lateCar: Car // Int, Double 등과 같은 primitive type에서는 사용 불가
```

---

## 7. Resource

- res 폴더
  - colors.xml -> 색 관리
  - strings.xml -> 문자 관리
  - themes.xml -> 앱의 기본 환경 관리 (색,,)

#### 나중에 가면 수 많은 파일이 있을탠데, 하나씩 찾아가면서 바꿀 수 없으므로 이런식으로 관리해준다.

### colors.xml, strings.xml 예시

```xml
  <color name="textview_color">#F44336</color>
  <string name="hello">안녕하세요.~~~~~~</string>
  <!-- 입력 후 원하는 레이아웃으로 이동 -->
```

```Kotlin
  android:background="@color/textview_color"
  android:text="hello"
```

### Resource 예시

```Kotlin
  // 둘 다 가능
  // 1
  val ment1 = resource.getString(R.string.hello)

  // 2
  val ment2 = getString(R.string.hello)

  val color = getColor(R.color.textview_color)
```

---

## 8. Context

#### 역할 : ActivityMangerService(개발하기 편하도록 미리 구현 해놓은 기능)에 접근 하도록 해주는 역할 -> 주변 정보

#### 안드로이드는 이미 많은 부분들이 만들어져 있다 -> 이런 것들을 사용하기 위해서는 **Context**가 필요한 경우가 많다

- 종류
  - Activity의 Context -> Activity의 주변 정보
  - Application의 Context -> Application의 주변 정보
  - **ApplicationContext > ActivityContext**

### 사용 방법

```Kotlin
  val context: Context = this // 상속 받는다
  val applicationContext = getApplicationContext()
```

---

## 9. Thread

#### Thread(쓰레드) = 작업 흐름

#### 안드로이드의 Thread

- MainThread
- 기타 Thread

#### Thread가 여러 개 있는 경우 -> 여러 가지 일을 한 번에 할 수 있다

#### 안드로이드 MainThread의 특징

- UI Thread이다
  - 사용자의 inout을 받는 Thread
- **절대 정지시킬 수 없다!**
  - 정지시키거나 종료시키면 더 이상 사용자의 input을 받을 수 없다

### Thread 사용 빙밥

```Kotlin
  val runnable: Runnable = object : Runnable{
    override fun run() {
      // ~~~~~~~~~~~~~~
            }
  }
  val thread: Thread = Thread(runnable)
  thread.start // .start를 해야 Thread 작동

  // 람다 방식
  Thread(Runnable{
    // ~~~~
  })

  // 기타 함수
  Thread.sleep(10000) // 10000ms 후 작동
  runOnUiThread{} // MainThread에서 돌아가는 Thread이다.
```

---
