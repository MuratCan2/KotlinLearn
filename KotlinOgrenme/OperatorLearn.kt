package KotlinOgren

fun main() {

    //Operator
    /*
    toplama çıkarma gibi işlemler için operatörlerden yararlanırız.
    çoğunlukla if kontrollerinde kullanırız
     */
    //aritmetik
    /*
    + = toplama
    - = çıkarma
    * = çarpma
    / = bölme
    % = kalan
     */

    val a = 5
    val b = 10
    println(a+b) //15
    println(b-a) //5
    println(a*b) //50
    println(b/5) //2
    println(a%b) //0


    var number = 5
    println(number) //5
    //mi bir arttırma
    number= number +1
    println(number) //6
    //şu şekilde de arttırabiliriz
    number++
    println(number)//7
    //sayıyı bir düşürmek için
    number--
    println(number)//6

    //Atama
    var y = 12
    var s = 5
    /*
    Toplama
    y += s
    println(y) //17

    -= -> Çıkarma
    *= -> çarpma
    /= -> bölme
    %= -> kalan remainder denir iki sayının bölünmesinde kalan sayıyı gösterir
     */

    //örnek

    var number1 = 12
    number1 *= 5 //number(12) * 5
    println(number1) //60

    //karşılaştırma ve eşitlik
    //if ve boolean da kullanılır

    /*
     > -> büyüktür
     < -> küçüktür
     >= -> büyüktür veya büyük müdür?
     <= -> küçüktür veya küçük müdür?
     == -> eşittir eşit midir? eşitse
     != -> eşit değildir

     */

    //örnek

    val ifnumber = 3
    val ifnumber2 = 12

    val max = if (ifnumber > ifnumber2){
        println("ifnumber, ifnumber2'denbüyüktür")
        ifnumber
    }else{
        println("ifnumber2, ifnumber'dan büyüktür")
        ifnumber2
    }
    println("max = $max")

    println(4 > 5) //False
    println(4 < 5) //true

    // && And yani ve demektir her iki koşulda doğru olmalı yoksa false çalışır
    // || Or yani veya demektir her iki koşuldan bir tanesinin doğru olması yeterlidir

    println(4>5 && 5<6) // 4 5 ten büyük olmadığı için sonuç false
    println(4>5 || 5<6) //bir yanlış ifade olduğu halde sonuc true

    //örnek

    val j = 10
    val t = 9
    val u = -1
    val result: Boolean

    result = (j>t) && (j>u)
    println(result) //true







}