package KotlinOgren

fun main() {
    //List- ArrayList

    /*
    arrayOf() ile yaptıklarımızı ArrayList() ile de yapabiliriz
    fakat ArrayList() daha çok özellik olduğu için çoğunlukla ArrayList() kullanıyoruz
     */

    val myMusician = arrayListOf<String>("Murat","Caner")
    myMusician.add("Ahmet")
    println(myMusician[2]) //Ahmet

    //arraylist te hangi veri türünde yazdığımızı belirtmek zorundayız
    // arrayListOf<String>
    // ArrayList<Any>

    //diziye eleman eklemek için .add yöntemini kullanırız
    myMusician.add("Can")

    //dizideki elemanı değişirmek için
    //değişkenAdı.add(ındexSayi,Yeni değer)

    myMusician.add(0,"Kaan")
    println(myMusician[0]) //Kaan

    /*
    array List te iki yöntem vardır :
    arrayListOf()
    ArrayList()
    ikisi aynı işlevi görürken ArrayList()'in parantez içine değer yazamıyorken
    arrayListOf()'da yazabiliyoruz
     */
    val meArrayList = ArrayList<String>()
    //boş bir ArrayList oluşturduk

    val myArrayList = ArrayList<Int>()
    myArrayList.add(1)
    myArrayList.add(200)

    //arrayOf() daki gibi any ile işlem yapabiliyoruz

    val myMixedArrayList = ArrayList<Any>()
    myMixedArrayList.add(true)
    myMixedArrayList.add("String")
    myMixedArrayList.add(5)

    println(myMixedArrayList[0])
    println(myMixedArrayList[1])
    println(myMixedArrayList[2])

    //Methotlar

    //.clear() = dizindeki tüm elemanları siler

    myMixedArrayList.clear()
    println(myMixedArrayList)//0 eleman yok






}




