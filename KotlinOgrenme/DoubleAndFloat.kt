package KotlinOgrenme

fun main() {

    println("---Double & Float--")

    //Double ve Float kesirli sayılara denir
    //Çoğunlukla Double kullanırız

    val pi = 3.14
    println(pi * 2.0)

    val surDouble : Double = 10.5

    //Floatı tanıtmak için ise sonuna f koyarız

    val myFloat = 3.14f

    //Double ile Floatın arasındaki fark ise alabilecekleri maksimum değerlerdir
    //float daha az değer alıyorken double daha büyük değer alabilir

    //Double alabileceği mimumum ve maksimum değer
   val doubleMın : Double = Double.MIN_VALUE
    val doubleMax : Double = Double.MAX_VALUE
    println(doubleMın)
    println(doubleMax)

    //Float alabileceği minumum ve maksimum değer
    val floatMın = Float.MIN_VALUE
    val floatMax = Float.MAX_VALUE
    println(floatMın)
    println(floatMax)

    // Float 32 bitlik double 64 bittir

    //Double ın önemli olduğu yer

    val age = 23
    println(age / 2)
    //ekrana 11 yazdırdır fakat 11.5 yazdırması lazımdı
    //devreye kesirli sayılar girer

    val myAge = 23.0
    println(myAge/2)

    //cevabı 11.5 vererek doğruya ulaştık

    //Veri türleri

    /*
    veri türleri sadece ınt double veya floatla bitmiyor
    veri türlerin küçükten büyüğe sıralıyımı:
    Byte, Short, Int, Long, Float, Double
    büyüklük bitlere göre belirlenir
     */

    /* veri türlerindeki byte ne kadar küçükse o kadar az yer kaplar
    fakat çoğunlukla Int ve Double kullanırız
    Long veri türünü ise nadiren kullanılırz çünkü alabilecek değer çok büyüktür
     */

    /*
    Byte = 8 bit -127 128
    Short = 16 bit -32768 32767
    Int = 32 bit  2 31  2 31 -
    Long 64  -2 63 2 63 -1
    Float = 32
    Double = 64 bit
     */

    //bir veri türünün alabileceği minumum ve maksimum değerini öğrenmek için:

    val byteMın : Byte = Byte.MIN_VALUE
    println(byteMın)
    val byteMax : Byte = Byte.MAX_VALUE
    println(byteMax)

    //byte veri türünün minumum ve maksimum değerini ölçtük diğerlerini aynı bu şekilde yapıyoruz
    // alaileceği minumum değerini MIN_VALUE ile
    //alabileceği maksimum değerini ise MAX_VALUE ile öğreniriz

    // Long ve Floatı tanımlarken değerlerinin sonuna harf ekleriz
    // Lon için L
    // Float için F
    /*
    val myFloat = 54.5F
    val myLong = 54789523L
     */

    //veri türlerinde önemli olan minumum ve maksimum alabilecekleri değerleri aşmamaktır
    // byte ın maksimum alabileceği değer 128 dir fakat bu veri türüne 129 yazarsanız hata alırsınız
    // val byteMın : Byte = 130 -> Hata

    /*
    neden tek bir veri türünü kullanmıyoruz?
    örneğin byte ın biti shortun bitinden daha küçüktür
    bu sayede daha az yer kaplar ve daha yararlıdır
    fakat byteın alabileceği maksimum değer 128 dir
    eğer 128 den az bir değer girilecekse byte daha mantıklıdır
    fakat 128 den fazlaysa short veya diğerlerini kullanmak zorundasınız
     */

    //değişkenimizin veri türünü belirtmezsek derleyici her zaman ya Int yada Double olduğunu belirtir
    //eğer Int ve Double dışında bir veri türünü belirteceksek bunu tanımlamamız lazım









}