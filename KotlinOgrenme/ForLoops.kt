package KotlinOgren

fun main() {

    //For Döngüsü - For Loop

    val myArrayOfNumber = arrayOf(1,2,3,4,5,6,7,8)
    val newArray = myArrayOfNumber[0] * 3
    println(newArray)

    //bu işlemi daha kısa yolla yapmak için for dan yararlanır
    //for sayesinde arrayOf daki tüm değeri yazdırabiliriz

    val myNumber = arrayOf(12,17,25,30,29)
    for (number in myNumber){
        val q = number / 3 * 5
        println(q)
    }
    //burada myNumber daki değişkenleri for döngüsü sayesinde number a atıyoruz
    //daha sonra for sayesinde tüm numaraları üçle bölüp 5 le çarpıyoruz

    //bu işlemin daha karmaşık ve çok kullanılmayan bir diğer yöntemi ise:

    for(i in myArrayOfNumber.indices){
        val qz = myArrayOfNumber[i] / 3 * 5
        println(qz)
    }

    for (m in 0..15){
        println(m)
    }
    //burada m değişkenin içine 0 dan 15 e kadar sayıyı attık
    // .. çift nokta ile o sayı arasındaki sayıları alırız

    //sadece sayılarda olmuyor diğer veri tiplerini de kullanabiliyoruz

    val myString = ArrayList<String>()
    myString.add("Murat")
    myString.add("Can")
    myString.add("Caner")

    for (mu in myString){
        println(mu)
    }

    //for döngüsünün bir başka şeyi ise .forEach tir. aynı işlevi yaparlar fakat
    //çok tercih edilmez

    myString.forEach { println(it) }



    }