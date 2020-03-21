package KotlinOgren

import java.util.*

fun main() {
//fonskiyonları kullanırken bazen bu şekilde kullanbiliriz
    fun yasimiGoster() = 30
    yasimiGoster()
    //burada fonskiyonu çağırdığımız yere 30 sayısını atayabiliyoruz
    fun xx (x:Int,y:Int):Int = x +y
    xx(7,5)

     /*
    kullanıcı uygulamayı başlattığında bir menü görecek bu menüde 1 2 3 gibi sayılar olacak
    1 e bastığında sayıların toplamını 2 ye bastığında farkını
    3 bastığında çarpımını 4 e bastığında bölümünü yapacak
     */

    //ilk amacımız kullanıcıya menü göstermek

    //bir fonksiyonu sadece o dosyaya özgü yapmak için foksiyonun başına private yazmalıyız
    //private fun test()


    while (true){
        var kullanıcıSecimi = menuGoster()
        if (kullanıcıSecimi == 5){
            break
        }
        if (kullanıcıSecimi in 1..4) {
            println("birinci sayıyı giriniz:")
            var sayi1 = readLine()!!.toInt()
            println("İkinci sayıyı giriniz :")
            var sayi2 = readLine()!!.toInt()

            when (kullanıcıSecimi) {
                1 -> toplamaYap(sayi1, sayi2)
                2 -> cıkarmaYap(sayi1, sayi2)
                3 -> carpmaYap(sayi1, sayi2)
                4 -> bolmeYap(sayi1, sayi2)
            }

        }
        else{
            println("Hatalı giriş girdiniz")
        }


    }
    /*
    while sonsuz bir döngüdür ve iki tip işlem yapar true ve false
    biz işlemin baştan true olduğunu belirttik ve altına sonsuz döngüye aldığımız kodları yazdık
    bu işlemi uygulamanın sürekli işlem yapmasını ve bir sonraki seçeneğine geçmesi için yaptık
    fakat sonsuz döngü yaptığımız için sonunu söylememiz gerekir yoksa sürekli çalışırdı
    bunun için if dedik kullanıcıSecimi 5 e eşitse dur dedik bu duru ise break anahtar kelimesiyle yaptık
    fakat uygulamaya vermediğimiz bir sayıyı yazdırdığımızda bile devam ettiğini farkettik bu yüzden
    if dedik kullaniciSecimi 1..4 arası değer olmalı dedik bu ise in anahtar kelimesiyle yaptık
    eğer yine farklı bir sayı gelirse eğer dedik hatalı giriş yazsını göster dedik


     */


}
fun toplamaYap(sayi1: Int, sayi2: Int){
    println("sayiarın toplamı : " + (sayi1+sayi2))
}
fun cıkarmaYap(sayi1: Int, sayi2: Int){
    println("sayların çıkarımı " + (sayi1 - sayi2))
}
fun carpmaYap(sayi1: Int, sayi2: Int){
    println("sayıların çarpması : " + (sayi1 * sayi2))
}
fun bolmeYap(sayi1: Int, sayi2: Int){
    if (sayi2 != 0)
        println("Sayıların bölümü : " + (sayi1 / sayi2))
    else println("Bölen sıfır olamaz")

    /*
    bölme işlemlerinde sıfır yazdığımızda hata aldığımı fark ettik
    bunu çözmek için if dedik sayi2 0 a eşit değilse şunu yazdır dedik
    eğer değilse bölen sıfır olamaz diyerek kullanıcıya hata yaptığını biz belirttik

     */

}
private fun menuGoster() : Int{

    var tarih = tarihGoster()
    //fonksiyon yapısını program sayesinde oluşturmak için fonsksiyonun üzeirne gelip ALT + Enter yapabiliriz

    println("***** Menu | $tarih ******")
    println("1 - Topla")
    println("2 - Çıkart")
    println("3 - Çarpma")
    println("4 - bölme")
    println("5- çıkış")
    println("Seçiminiz : ")
    var secim = readLine()!!.toInt()

    return secim

    /*
    burada menü bölümünü özelleştirmek için tarih ekleyeceğiz
    fonskiyonun içinde fonskiyon oluşturabiliriz
    fonksiyonu bir değere atayarak o değeri istediğimiz yerde kullanabiliriz
    daha sonraki işlemler tarihGoster() fonskiyonu içinde yapacağız
    yani fonskiyonun içinde istediğimiz doldurabiliriz bu kodlar ise tarih adlı değişkende de çalıştırılacak
     */

}
fun tarihGoster(): String{
    val calendar = Calendar.getInstance()
    var saat = calendar.get(Calendar.HOUR)
    var dakika = calendar.get(Calendar.MINUTE)
    var saniye = calendar.get(Calendar.SECOND)
    return "$saat:$dakika:$saniye"

    /*
    Fonskiyonun String bir yapıda döndüreleceğini belirttik :String
    Calendar adlı javanın kütüphanesini kullacağız kotlinde bu kolayca yapılır
    calendar sınıfı tarih dakika saat gibi zaman terimlerini içerir

    yeni bir değişken oluşturduk bu değişkenin içinde Calendar ın getInstance() methodunu oluşturduk
    daha sonra değişkenler oluşturduk calendar adlı değişkenimizin içine Calendar sınıfından HOUR yani saati
    .MINUTE yani dakikayı .SECOND yani saniyeyi getirdik

     */
}
