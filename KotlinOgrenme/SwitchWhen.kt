package KotlinOgren

fun main() {

    //Switch
    /*
    Switch ve When aynı if gibi kontrol yapısıdır. fakat bu yapılar elimizde
    kontrol edilcek durumun fazla olduğunda kullanırız
     */
    val day = 3
    var dayString = ""

    if (day == 1){
        dayString = "Monday"
    }else if (day == 2){
        dayString = "Tuesday"
    }else if (day == 3){
        dayString = "Wednesday"
    }
    println(dayString)

    /*
    burada day değişkenini 3 belirledik daystringi null değer olarak belirledik
    eğer yani if dedik day 1 eşitse daystring monday olsun dedik
    o değlde eğer bu sefer day 2 ye eşitse dayString Tuesday olsun dedik
    daya sonra 3. koşulu yazdık ve dayStringi yazdırdık
    day 3 olduğundan dayStringin değeri Wednesday oldu
     */

    println("Hangü gününüz nasıl geçecek?")
    val day1 = readLine()


    if (day1 == "Pazartesi"){
        println("İş başlama gününden olayı \nmutsuz geçebilir")
    }else if (day1=="Salı"){
        println("Kessinlkle iyi şeylr geçeçecek")
    }else if (day1 == "Çarşamba"){
        println("Bir teklif alabilirsiniz")
    }else{
        println("Yanlış bir ifade girdiniz veya Küçük harfle başladınız")
    }

    /*
    burada day1 değişkenin değerini kullanıcıya bırakmak için içine readLine() atadık
    if yani eğer dedik kullanıcı "Pazartesi" derse parantezi açtık bunu derse ne görmesini
    yazdırdık
    eğer yazmadıysa ve salıyı yazıysak şunu yazdır dedik
    daha sonra else dedik çünkü büyük küçük harf hatası veya olmayan birşey yazılırsa
    ne gözükmesini istediğimizi yazdırdık
     */

    //When de Switch gibidir daha kolay ve sade bir şekilde yazılır

    when(day){
        1 -> "Wednesday"
        2 -> "Thusday"
        3 -> "Monday"
        else -> dayString= ""
    }
    println(dayString)
    //burdada sayılara değer atadık day 3 olduğundan daystrig wednesday oldu

    //haftanın 7 günün ne anlamı olduğunu gösteren program yapalım

    println("Herhangi bir gün giriniz:")
    val myDay = readLine()
    when(myDay){
        "Pazartesi" -> println("Çalışma haftasının başı")
        "Salı" -> println("Arapçadan gelir")
        "Çarşamba" -> println("Farsçadaki dört anlamına gelen çardan gelmiştir")
    }
    /*
    burada kullanıcıdan bilgi aldık
    pazartesi denildiğinde ne yazılması gerektiğini belirtik
     */

    //Boolean ifadelerde de kullanabiliriz

    val check = false

    val result = when(check){
        true -> println("Cevap yanlış")
        false -> println("Cevap Doğru")
    }

    //Int
    println("Bir sayı giriniz")
    var resul1 = readLine()!!.toInt()
    when(resul1){
        0 -> println("Çok üşk bir sayı")
        1,2 -> println("Buda çok küçük bir sayı")
        3 -> println("Ortabir sayı")
        in 4..10 -> println("Çok büyük sayı ama kabul edilebilinir")
        !in 11..Int.MIN_VALUE -> println("Aşırı büyük sayı")
        else -> println("Böyle bir sayı yok")

        /*
        readline ilk başta string algıladığından !!.toInt() sayesinde Int değer çevirdik
        when birden fazla değer yazmak için virgül kullanabiliriz 1,2,3 veya "Murat","Caner"
        bir sayı aralığını yazmak için ise in den yararlandık in 4..10

         */
    }

    //kulacının verdiği değerin hangi veri tipinde olup olmadığını kontrol etmek için

    var num:Any = "MuratCan"
    when(num){
        is Int -> println("Bu bir Int ifadedir")
        is String -> println("Bu bir String yapılıdır")
        is Double -> println("Bu bir Doule Yapılıdır")
    }






}