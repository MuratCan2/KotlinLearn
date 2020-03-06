package KotlinOgrenme

fun main() {
    //String

    /*
    string metin demektir
    " " arasında yazdıklarımız metin yani string olarak algılanır
    bir diğer adı dizelerdir
    kısaltışı str dir
     */
    val myString = "murat can Hasbet"
    val name = "James"
    val surname = "Hetfield"
//string yapılı değişkenleri bir arada kullanmak için toplayabiliriz
    val fullname =name + " " + surname
    println(fullname)

    // " " -> boşluktur
    //Böyle de yazabiliriz
    val larsName : String = "Lars"

    // """ """ üç tırnak işaretiyle dizinin içindeki \n gibi özellikleri metine çevirir

    println("bugün hava çok sıcak \n yarın soğuk olacakmış")
    // \n bir alt satıra geçilmesini sağlar
    println("""Kotlindeki bu \n işaret bir alt satıra geçmemimizi sağlar""")
    //burada ise """ """ üçlü tırnak işareti kullanarak dizimizin içindeki özellikleri metine çevirdik

    //string yapı ile değişkenleri bir arada kullanma
     //1
    val myAge = 18
    println("Yaşınız:" + myAge)
    //2.yol
    println("sizin yaşınız $myAge'dir.")
    //dizelerin içinde değişkenleri veya bir şeyi tanımlamak isterken
    // sadece $ veya ${} kullanırız.


    //methotlar
    //methotlar . (nokta) işaretinden sonra yapılır. seçtiğimiz değişkende işlemler yapar

    println(myString.capitalize())

    /*
    .capitalize() string ifadenin ilk harfini büyütür
    bu işlem çoğunlukla internetten veri çektiğimizde isimlerin büyük harfle başlamasını sağlar

     */

    println(myString.length)
    // .length stringin içinde kaç karakter vardır onu gösterir
    // boşluklarda karakter olarak algılanır

    println(myString.get(2))
    // .get() indeksleri getirmeye yarar
    //kotlinde indekler 0 la başlar bu yüzden 2 dediğimizde 3.karakteri getirir
    //bir diğer indeks çağırma yoluda değişkenadı[] dır

    println(myString[2])

    println(myString.toUpperCase())
    // .toUpperCase() dizelerin içindeki metni büyük harfe çevirir
    println(myString.toLowerCase())
    // .toLowerCase()  dizelerin içindeki metni küçük harflere çevirir

    println(myString.subSequence(0,5))
    // .subSequence() belli bir indeks ayaralığını getirebilmemizi sağlar
    // .subSequence(başlangıçindex,bitişindex)


    //kotlindeki '' işaretleri ile "" işaretleri bir değildir
    //'' işareti karakterleri saklamak için 'c' Char denir buna
    // " " işareti dize yani stringi oluşturmak için kullanılır

    // sayılar eğer "" dizeler şeklinde yazılırsa bir sayı olarak değil metin olarak algılanır

    val myNumber = 5
    val myNumber1 = "5"

    println(myNumber + 5)
    //mynumber ın içinde ınt değerli bir sayı olduğundan 5 le toplanır

    println(myNumber1 + 5)
    //myNumber1 string yapılı olduğundan 5 i metin olarak algılar bu yüzden 5 i bitişik yaz







}