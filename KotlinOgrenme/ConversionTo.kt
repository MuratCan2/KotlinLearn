package KotlinOgrenme

fun main() {

    //Birbirine dönüştürmek - conversion
    /*
    .toVeritipi olarak yazılır
    bu sayede bir değişkenin, değerin veri tipini değiştirebilir
    en çok stringden ınt e ıntten stringe çevrilir
toByte() = Byte veri türüne çevirir
toShort() = Short veri türüne çevirir
toInt() = Int veri türüne çevirir
toLong() = Long veri türüne çevirir
toFloat() = Float veri türüne çevirir
toDouble() = Double veri türüne çevirir
toChar () = Char veri türüne çevirir
     */

    var number = 5
    var longNumber = number.toLong()
    println(longNumber)
    //değerimiz yine 5 çıkmıştır. .toLong() işlemiyle sadece değerimizin veri tipini değiştirdik
    // Int veri tipine sahip değeri Long veri tipine çevirdik

    var stringNumber = "15"
    var newIntNumber = stringNumber.toInt()
    println(newIntNumber * 2)

    /*
    15 i parantez içinde yazdığımız için bilgisayar metin olarak algıladı
    bunu .toInt() yoluyla Int değere dönüştürerek 2 yle çarpabildik
    .to işleminin önemide burada açığa çıkıyor
    çünkü biz kullanıcıdan değer aldığımızda ilk başta konsol string olarak algılar
    matematiksel işlem yapmak için ise ınt değere çevirmemiz lazım.
     */

    //büyük veri tipinden küçük veri tipine dönüştürmek:

    var value1 : Long = 200
    var value2 = value1.toInt()
    println(value2)

    /*
    burada küçük bir değer yazsakta büyük bitlik bir veri türüne atanmış
    bu değeri ınt değerine çevirerek ondan daha küçük bite sahip bir veri türüne dönüştürdük
    bu sayede alandan da tasaruf ettik
     */

    /*
    tip dönüşümlerde dikkat edilmesi gerek şey:
    küçük değerler alabilen bir veri türünü büyük veri türlerine dönüştüsekte bir hata almayız
    fakat büyük veriyi küçük veri tipine dönüştürmek istediğimizde veri kaybı yaşarız
    örneğin:
     */

    // Short veri tipi en fazla 32767 değer alabilir

    val myShortNumber : Short = 32767
    val myIntNumber = myShortNumber.toInt()
    println(myIntNumber) //32767

    //küçük veri tipindeki değer büyük veri tipine çevirince herhangi bir kayıp yaşamadık

    val ıntNumbers = 45000
    val newShortNumber = ıntNumbers.toShort()
    println(newShortNumber) //-20536

    //değeri büyük olanı, küçük veri türüne çevirmeye çalışınca veri kaybı yaşadık

    val doubleNumbers : Double = 55.256842
    val doubleToInt = doubleNumbers.toInt()
    println(doubleToInt)

    /*
    burada ise kesirli bir sayıyı tam sayıya çevirmek istedik
    Int sadece tam sayıyla işlem yapabildiği için . dan sonrasını
    almayarak veri kaybına sebebiyet verdi
     */





}