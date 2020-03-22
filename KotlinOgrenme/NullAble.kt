package KotlinOgren

fun main() {
     //NullAbility
     //null bir şeyin boş olduğunu, içinde herhangi bir değerin olmadığını gösterir

    var myAge : String
    //println(myAge) Hata
    //hata aldık çünkü içinde herhangi bir değer yok değer olmadığını için bir şey gösteremiyor
    //fakat bunu göstermek istiyorsak halen null sayesinde gösterebiliriz
    /*
    null ın iki tür tipi vardır
    Nullable = herhangi değerin olmaması
    Non-null

    Nullable tanımlamak için soru işareti(?) kullanıyoruz
    var myAge : String? = null
     */
    var myAge1 : String? = null
    println(myAge1) //değersiz bir değişkeni yazdırabildik

    //null bir değerle işlem yapılamaz

    var myAge2 : Int? = null
    //println(myAge2*3) hata

    //örnek

    var a : String = "Abc"
    //a = null hata aldık çünkü soru işareti kullanmadık

    var b : String? = "Abc"
    b = null

    println(a.length) //3
    //println(b.length) hata aldık çünkü boş yani null bir değer ölçülemez işlem yapılamaz

    //fakat null olduğunu belirmek için ? kullansakta içine bir değer atarsak o değer üzeründen işlem görebilir

    val c :  String? = "Kotlin"
    if (c != null && c.length > 0){
        println("String of length ${c.length}")
    }else{
        println("Empty String")
    }
    //String of length 6

    // !! = görmezlikten gel geç demektir
    // ? boş değerdir veya boş değer olabilir demektir

    var myYas : Int? = null


  //1 Null Safety
    if (myYas != null){
        println(myYas * 10)
    }else{
        println("myYas null")
    }
    //2 safe call

    println(myYas?.compareTo(2))
    //normalde hata alırız bu hatayı düzeltmek için !! yazıp hatayı görmezden gel diyebiliriz
    //fakat bu app in çökmesine sebebiyet verebilir
    //o yüzden ? işaretini kullanarak hatayı çözebiliriz

    //3 elvis

    val myResult = myYas?.compareTo(2) ?: -100
    println(myResult) //-100

    // ?: yani elvis eğer null değerli bir yapı varsa o yapıyı belirlediğimiz değere eşitle demektir
    // değeri -100 e eşitledik


}

