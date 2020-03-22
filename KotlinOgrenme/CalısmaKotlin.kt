package KotlinOgren

fun main() {
/*
    val ıntNumber = 25
    println(ıntNumber * 2 - 5)
    val ıntNumber1 = 65
    println(ıntNumber+ıntNumber1)
    //65 70 85 gibi

    var myIntegrer : Int
    myIntegrer = 25
    println(myIntegrer)

    var myIntegrer1 : Int = 35
    println(myIntegrer1)

    val ıntMax : Int = Int.MAX_VALUE
    println(ıntMax)
    val ıntMin : Int = Int.MIN_VALUE
    println(ıntMin)



    //Double and Float

    val pi = 3.14
    println(pi * 2.0)

    val myDouble : Double = 10.52
    println(myDouble)

    val myDouble1 = 10.58
    println(myDouble1)
    println(myDouble1 + 5)

    val myFloat = 10.58F
    println(myFloat)

    val myFloat1 : Float = 10.58f
    println(myFloat1)

    val doubleMax : Double = Double.MAX_VALUE
    val floatMax : Float = Float.MAX_VALUE
    println(doubleMax) // daha çok değer 64 bit daha büyük
    println(floatMax) //32 bit daha küçük

    val myAge = 23
    val someAge = 2
    println(myAge/someAge)

    val myAge1 =23.0
    val someAge1 = 2
    println(myAge1/someAge1)

    //veri türleri küçükten büyüğe
    // Byte > Short > Int > Long
    //Float > Double

    //veri tipinin alabileceği maksimum ve minumum değeri öğren

    val byteMin : Byte = Byte.MIN_VALUE
    val byteMax : Byte = Byte.MAX_VALUE
    println(byteMin)
    println(byteMax)

    //Long ve Float tanımlama

    val myLong = 2500L
    println(myLong)
    val myFloat3 = 23.5f
    println(myFloat3)

    //val myByte : Byte = 145    !!




    //String

    val myString = "Murat Can Hasbet"
    println(myString)
    println(myString.length)

    val newMyString = "murat Can Hasbet"
    println(newMyString.capitalize())
    println(newMyString.toUpperCase())
    println(newMyString.toLowerCase())
    println(newMyString.capitalize())

    val name = "Murat can"
    val surname = "Hasbet"

    val fullName = name + " " + surname
    println(fullName)

    println("Benim adım $name soyadım ${surname}")

    val larsName : String = "Lars"
    println(larsName)

    println("Bugün ders çalışmadım \nfakat yazılımla uğraştım")

    println("""Bugün ders çalışmadım \n fakat yazılıma uğraştım""")

    val myAge = 18
    println("Yaşınız:" + myAge)

    val myString3 = "Murat Can"
    println(myString3.get(2))
    println(myString3[2])

    println(myString3.subSequence(0,3))

    val myChar = 'c'
    println(myChar)

    val myNumber = 5
    val myNumber1 = "5"
    println(myNumber + 5)
    println(myNumber1 + 5)




    val myBoolean = true
    val meBoolean : Boolean = false
    println(myBoolean)
    println(meBoolean)

    /*
    <
    >
    <=
    >=
    ==
    !=
    &&
    ||
     */

    println(2<1)
    println(3>2)
    println(3==3)
    println(4 != 4)

    println("Bir sayı giriniz?")
    val myOperasian = readLine()!!.toInt()
    if (myOperasian in 45..90){
        println("Doğru cevap")
    }


    /*
    .toString()
    .toInt()
    .toDouble
    .toByte()
    .toFloat()
    .toString()
    .toChar()
     */

    val myNumber = "15"
    val myToNumber = myNumber.toInt()
    println(myToNumber * 2)

    val myNumber1 = 23
    val myToNumber1 = myNumber1.toDouble()
    println(myToNumber1 / 2)

    val myNumber2 = 25
    val myToString = myNumber2.toString()
    println(myToString + 2)

    val myValue : Long = 20
    val myToValue = myValue.toInt()
    println(myToValue)

    val myInt = 45000
    val myShort = myInt.toShort()
    println(myShort)

    val doubleNumber = 58.89845
    val myNewInt = doubleNumber.toInt()
    println(myNewInt)



    val myArray = arrayOf("Murat","Caner","Ahmet")

    println(myArray[2])
    println(myArray.get(2))
    println(myArray.size)

    myArray[0] = "Hasbet"
    println(myArray.get(0))

    myArray.set(1,"Murat CAN")
    println(myArray[1])

    myArray.set(2,"Fenerbahçe")
    println(myArray[2])

    myArray[0] = "Beşiktaş"
    println(myArray[0])

    var myArray2 = arrayOf(1,2,3,4)
    myArray2 = myArray2.plus(5)
    println(myArray2[4])
    for (i in myArray2)
        println(i)

    val meArray = arrayOf(true,34,"Murat")
    println(meArray[0])

    val newArray = doubleArrayOf(1.2,5.5)
    println(newArray.get(0))

    var array1 = arrayOf(1,2,3,4,5)
    array1 = array1.reversedArray()
    for (element in array1)
        println(element)

    var meArrayOf = arrayOf(1,2,3,4,5)
    meArrayOf.reverse()
    for (m in meArrayOf){
        println(m)
    }

    var array4 = arrayOf(15,48,2)
    println(array4.sum())


    //ArrayList

    val myArrayList = ArrayList<String>()
    myArrayList.add("Murat")
    myArrayList.add("Can")
    myArrayList.add("Hasbet")
    println(myArrayList[1])
    myArrayList.add(1,"Caner")
    println(myArrayList.get(1))

    val myArray = ArrayList<Int>()
    myArray.add(5)
    myArray.add(10)
    for (m in myArray){
        println(m)
    }

    val nameArray = arrayListOf<Any>("Murat", true,5)
    for (i in nameArray){
        println(i)
    }
    println(nameArray[1])

    nameArray.clear()
    println(nameArray)



    val mySet = setOf<Int>(1,2,3,3,4)

    println(mySet.size)

    val name = HashSet<String>()
    name.add("Murat")
    name.add("Can")

   val mySet1 = setOf<String>("Caner", "Can")
    println(mySet1.forEach { println(it) })

    val nums = setOf<Int>(11,56,3,4,8,9)

    println(nums.count())
    println(nums.max())
    println(nums.min())
    println(nums.sum())
    println(nums.average())

    println("2.eleman şudur${nums.elementAt(1)}")
    println(nums.contains(56))

    var number = 55
    println("nums adlı değişkende ${number} var mıdır? : ${nums.contains(number)}")

    println("Şunlar var mıdır ${nums.containsAll(setOf<Int>(56,60,20))}")




    val fruitArray = arrayOf("Apple","Banana")
    val caloriesArray = arrayOf(100,150)

    println("${fruitArray[0]} : ${caloriesArray[0]}")
    println("${fruitArray[1]} : ${caloriesArray[1]}")

    val fruitCalorieMap = hashMapOf<String,Int>()
    fruitCalorieMap.put("Apple",100)
    fruitCalorieMap.put("Banana",150)
    println(fruitCalorieMap["Apple"])
    println(fruitCalorieMap["Banana"])

    val myHasMap = HashMap<String,String>()
    myHasMap.put("Sivas","Kangal")
    println(myHasMap["Sivas"])

    val myNewMap = hashMapOf<String,Int>("Kangal" to 1500,"Sivas" to 25000)
    println(myNewMap["Kangal"])
    println(myNewMap["Sivas"])


 */

    









}