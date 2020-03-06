package KotlinOgrenme

fun main() {

    //kotlin çalışma ortamında ilk main fonskiyonu çalıştırılır.

    println("----Println-----")

    //ekranda println() sayesinde çıktı alırız.

    println("Hello World") //Hello World

    //print() ile de ekrana yazı yazdırabiliriz ama kullanılması zordur

    print("Hello World!")
    print("Hello world")
    //alt alta yazdırdığımız halde yan yana yazdırdı

    println(4*5)
    //sadece string değil sayılarla da işlem yaptırabiliriz

    println()
    //bu şekilde bir satırlık boşluk bırakabiliriz

   // tek satırlık yorum satırı için //, çok satırlı için ise /* kullanırız

    println("---Değişkenler / Veriables & Constants ---")

    var h = 3

    var y = 5

    println(h * y)

    //Değişkenler bir veriyi içinde saklamamızı sağlayabilen bir yapıdır
    //bu yapı sayesinde o veriyi hep yazdırmak yerine değişken adımızı yazabiliriz

    var age = 35
    println(age *  2 / 3)
    //şimdi age'in içinde 35 vardır age istedğimiz yerde istediğimizi yapabiliriz
    println(age + 5)
     //değişkenin bir diğer adı da val dır. aynı işlemi yaparlar fakat val sabittir değiştirilemez

    age = 45
    //burada değişken var la yazıldığından değerimizi değiştirebildik age in yeni değeri 45 dir

    println(age)

    val age2 = 52

    //gördüğünüz gibi var la aynı şekildir

    // age2 = 55 -> hata

    // age2 nin değerini değiştirmek istediğimizde hata aldık çünkü val sabittir var gibi değeri değiştirlemez
    /*
    val ı kullanma sebeplerimiz:
    değerleri sonradan değiştirilmesini istemediğimiz zamanlarda
    isim soyisim gibi değiştirilmez olan şeyler değerleri girdiğimizde val ı kullanırız
     */

    val name = "Murat"

    // name = "Hasbet" -> hata aldık

    var surname = "Hasbet"
    surname = "James"

    println(surname)

    /*
    değişken adları yazarken:
    büyük harfle başlayamaz
    semboller ve sayı ile başlayamaz = 1name veya ?name gibi
    camelCase = ilk harfi küçük diğer kelimenin harfi büyük olarak başlar
    snake_case = alt işaretiyle yazılır
    camelCase daha çok kullanılır
     */

    //veri tipinin yazım şekilleri
    //1
    val a : Int
    a = 5
    //2
    var b : Int = 7
    //istersek alt satıra istersekte tek satırda yazabiliriz
    //değişkenin veri tipini belirtmek için ":" kullanırız
    // değişkenin veri tipini çoğunlukla atamak zorunda değiliz Kotlin araçları bunu otomatik algılayabiliyor

    //burada dikkat edilmesi gereken şey değişkenin veri tipini belirtiğimizde değeri o veri tipinde olmalıdır

    // var nameString : String = 5 -> hata aldık
    //hata aldık çünkü nameString'in veri türünü string belirledik fakat değeri Int veri türünde yazdık
    // belirlediğimiz veri tipi neyse değerimizde o veri türünde olmalı

    //aynı şekilde veri türünü belirtmediğimiz değişkenlerde de geçerlidir:
    var nightName = 5
    //nightName ="String" ->

    //hata aldık çünkü değerimizi değiştirebilsekte veri tipimizi asla değiştiremeyiz




    //3
    var name1 = "Murat"
    //istersekde veri türümüzü belirtmeye biliriz çok gerekli değildir









}