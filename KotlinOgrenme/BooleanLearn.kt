package KotlinOgrenme

fun main() {

    /*
    boolean sadece iki sonuc gösterebilir: True ve False
    Boolean çoğunlukla bir işlemin ne durumda olduğunu öğrenmemizi sağlar
     */
    var myBoolean = true
    myBoolean = false
    println(myBoolean)
    //booleanı belirterekte yazabiliriz ama gerek yoktur

    var isAlive : Boolean = true

    /*
    Boolean belirli şekillerden oluşur:
    <  -> küçüktür
    >  -> Büyüktür
    <= -> küçük müdür?
    >= -> büyük müdür?
    == -> eşit midir?
    != -> eşit değildir
    && -> AND, ve
    || -> Or , veya
     */

    println(3 < 5) //True
    println(6 > 10) //False
    println(3 == 3) // eşitmidir = True
    println(4 != 5) //4 5 e eşit değildir True
}