package KotlinOgren

fun main() {

    //If Controll

    //if kontrolleri adı üstünde belli bir durumun doğruluğunu kontrol eder.
    //if eğer demektir eğer belirlediğimiz koşul doğruysa çalışır

    val ifTest = 15

    if (ifTest < 10){
        //eğer koşul doğruysa buradaki kod çalıştırılır
        println("ifTest 10'dan küçüktür")
    }else if (ifTest < 14){
        println("ifTest 14'ten küçüktür")
        //eğer if kontrolü doğru değilse else if kontrolünde kod çalıştırılır
    }else{
        println("ifTest 14'ten büyüktür.")
        //eğer hiçbir koşul değilse en son olsa else konuşulu çalıştırılır
    }

    //if else örnek

    val number = -10

    if (number > 0){
        println("Pozitif Sayı")
    }else{
        println("Negatif Sayı")
    }

    //if'i bir değişkenin içinde kullanmak

    val numberOne = -1
    val result = if (numberOne > 0){
        println("Pozitif Sayı")
    }else{
        println("Negatif Sayı")
    }
    println(result)



    


}