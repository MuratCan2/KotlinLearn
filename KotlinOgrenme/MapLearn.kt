package KotlinOgren

import javax.security.auth.login.AccountNotFoundException

fun main() {

    //Map - HashMap

    /*
    Map karşılaştırmalı bir liste oluşturmak için kullanılır
    örneğin bir sporcu uygulaması yazıyoruz ve hangi besinin kaç kaloriye sahip olduğunu
    göstermeye çalışıyoruz bunu hasmap sayesine kolayca yapabiliriz
    hasmap anahtar kelime ve değerden oluşur key-Value
     */
    //arrayde de bunu yapabiliriz fakat hasmape göre uzun bir işlemdir

    val fruitArray = arrayOf("Apple", "Banana")
    val caloriesArray = arrayOf(100,150)

    println("${fruitArray[0]} : ${caloriesArray[0]}") //Apple : 100

    //burada array yoluyla istediğimizi yapabildik
    //fakat hasmap sayesinde daha kolay yapabiliriz

    val fruitCalorieMap = hashMapOf<String,Int>()
    fruitCalorieMap.put("Apple",100)
    fruitCalorieMap.put("Banana",150)
    println(fruitCalorieMap["Apple"]) //100

    //hasmap de ındexler sayılar değil anahtar kelimelerdir

    //diğer bir yöntem ise:

    val myHashMap = HashMap<String,String>()
    myHashMap.put("Murat","Sivas")

    //diğer bir yöntem ise

    val myNewMap = hashMapOf<String,Int>("Murat" to 18, "Caner" to 17)
    println(myNewMap["Caner"])

    //Örnekler

    val intMap = hashMapOf<Int,String>(1 to "Ashu", 4 to "Rohan", 2 to "Ajeet", 3 to "Vijay")

    val stringMap = hashMapOf<String,String>()
    stringMap.put("City","Delhi")
    stringMap.put("department","Development")
    stringMap.put("Hobby","Playing")

    val anyMap = hashMapOf<Any,Any>(1 to "Ashu","name" to "Rohsan",2 to 200)
    println("....Traverse intMap")

    for(key in intMap.keys) {
        println(intMap[key])
    }
    println("...Trverse StringMap...")
    for (key in stringMap.keys){
        println(stringMap[key])
    }
    println("....Travers AnyMap...")
    for (key in anyMap.keys){
        println(anyMap[key])
    }

    //burada hasmap kümesinin içindeki anahtar kelimeleri yani keyleri yazdırdık



}