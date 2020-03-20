package KotlinOgren

fun main() {
    //kotlinde methodlar fun anahtar kelimesiyle oluşturulur
    //fonskiyonun amacı büyük rpjoleri daha küçük parçalara bölerek düzenli çalışmayı sağlamak
    //ayrıca fonksiyonun altında yazdığımız kodları başka bir yerde çağırarak kullanabiliriz
    //örneğin fun main(){} bir fonskiyon yani methotddur
    nameWrite()
    nameWrite()
    nameWrite()

    //fonskiyonu ne kadar çağırdıysak o kadar yazdırcaktır
    //dikkat edilmesi gereken fonskiyon ismi ile çağırdığımız isim aynı olmalı

    nameParametre("murat", 19)
    avg(10.0, 20.0)

    var toplam = topla(5, 10)
    println("main fundaki toplam değeri" + toplam)

    val number1 = 12.0
    val number2 = 3.0
    val result : Int

    result = addNumbers(number1,number2)
    println("Resul : $result")
}


fun nameWrite(){
    println("Murat Can")

    /*
    burada nameWrite adlı bir fonskiyon oluşturduk ve içinde bir string değer yazdırdır
    biz bu fonskiyonu her yazdırdığımızda altında ne yazdıysak o çalıştırcak
    bu sayede o kadalrı tekrar tekrar yazmayacağız

    fonskiyonun çalışması için çağrılması lazım bunu da diğer kalıcı fonskiyonun altında yapacağız

     */
}
fun nameParametre(name: String, age: Int){
    println(name)
    println(age)

    //bu işleme parametre denir
    //parametre oluştururken veri tipi neyse onu yazmalıyız yoksa hata alırız
    //parametre çağırdığımız yerde fonskiyona veri gönderilmesine denir
    //yani fonskiyona sabit bir değer oluşturacağımıza çağırdığımız yerde değer atayabilirz




}

fun avg(a:Double,b:Double) = println((a+b)/2)
//tek satırda yazabilirz

//geri dönüşü olan methodlar

fun topla(sayi: Int, sayi1: Int) : Int {
    // : Int yerine : Unit yazdırsaydık geri dönderme olmayacaktı
    //geriye göndercek bir verimiz varsa bunu belirmemiz lazım :veri tipi

    var t = sayi + sayi1
    println("topla fonskiyounToplamı : " + t)
    return t

    //return anahtar kelime sayesinde tekrar tekrar döndürebiliriz
}

fun helloFriend(isim1:String) : String{
    return "Merhaba" + isim1

    /*
    burada helloFrined adlı bir fonksiyon oluşturduk
    bir değişken oluşurup ne olduğunu açıkladık
    daha sonra tekrar nasıl döndürüleceğini yazık : String
    return anahtar kelime sayesinde verimiz tekrar döndürülecektir
    bu veriyi yazdırmak için iki yol vardır:
    veriyi çağırdığımız yerde:

    var gelenString = helloFriend("Murat")
    println(gelenString)

    diyebiliriz burada fonskiyonu yeni bir değişkenin içine atayıp yazdırdık
    veye:

    println(helloFriend("emre")

    parameter kullanmasaydık ve önceden veriyi belli etseydik:

    val s = helloFriend()
    println("Returned Massagg : $s")

    diyerek yazdırabiliriz
     */


}
//if li return

fun message(num:Int):String{
    if (num==1) return "Hello Kotlin"
    else return "this is a returned message from else"

    /*
    message adlı bir fonksiyon oluşturduk parametre oluşturup ne alacağını belirttik
    daha sonra verinin nasıl döndüreceğini belirttik
    eğer(if) deddik paramtrenin değeri 1'e eşitse şunu döndür değilse(else) şunu döndür dedik

     val m = message(1)
     println("Message = $m")

     çıktı:

     Hello Kotlin

     eğer 2 olsaydı else çalışır sonuç ise şu olurdu:

     this is a returned message from else
     */
}
/*
fun faktoriyelHesap(s: Int) : Int{
    var girilenSayi = s
    var sayac = 1
    var faktoriyel = 1

    while (sayac <= girilenSayi){
        faktoriyel = faktoriyel * sayac
        sayac++
    }
    veriyi çağırdığımız yer

    var sayi = readLine()!!.toInt()
    var HesapFaktoriyel = faktoriyelHesap(sayi

    println(hesapFaktoriyel)
    println(faktoriyelHesaplama(sayi))
 */

//örnekler

fun addNumbers(n1:Double, n2:Double): Int {
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

