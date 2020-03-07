package KotlinOgren

fun main() {
    //Collections
    //Array

    /*
    Array birden fazla değer taşıyabilen değişkendir.
     */

    val myArray = arrayOf("John","Kirk","Rob","Lears")

    //arrayin içinde birden fazla değer olduğu için index yöntemiyle çalışır
    //yani direk println(myArray) yazıp hepsini yazdıramıyoruz ve hata alıyoruz
    //indeksler 0 dan başlar

    println(myArray[0])
    //değeri değiştirmek için ise değişkenadı[indeks numara] = "yeni değer"

    myArray[0] = "James Hitcock"
    //yeni değer -> james Hitcock
    println(myArray[0])

    //bir diğer yöntem ne ise .set yoluyla yapılır
    //çok fazla tercih edilmez

    myArray.set(1, "kirk Hamlet")
    println(myArray[1])

    // dizinin içidenki değerleri getirmek için ise 2 yöntem var
    // 1. yol []
    println(myArray[2])
    // 2.yol .get()
    println(myArray.get(2))

    //arrayOf() içine yeni bir değer eklemek için ise:
    var array4 = arrayOf(1,2,3,5,6)
    array4 = array4.plus(7)
    println(array4[5])

    // size dizinin uzunluğunu (ne kadar değerin olduğunu)gösterir
    println(myArray.size) //4
/*
diziye bu şekilde ekleme yapamayız
    myArray[4] = "Murat Can Hasbet"
    println(myArray[4])
    -> Hata aldık
 */
    //istersekte dizimizin ne olduğunu belirtebiliriz

    val num = arrayOf<Int>(5,8,10,9)

    //array dizilerinde farklı veri tipine sahip değerleri bulundurabiliriz
    // buna Any denir

    val arrayNumber = arrayOf(true, 5,"String")
    println(arrayNumber[0])
    println(arrayNumber[1])

    //sadece veri tipine özel dizi de oluşturabiliriz
    //burada önemli olan belirlediğimiz veri tipinde değer atamamamız
    //double bir dizinin içinde ınt tipli değer atayamayız

    //val myNewArray = doubleArrayOf(1,2,3,4) -> Hata

    val myNewArray = doubleArrayOf(1.0,2.0,3.0,4.0)
    /*
    charArrayOf()
    booleanArrayOf()
    longArrayOf()
    shortArrayOf()
    byteArrayOf()
    doubleArrayOf()
    intArrayOf()
    stringArrayOf()
     */

    //bir diziyi tersine çevirmek

    var array1 = arrayOf(1,2,3,4,5)
    array1 = array1.reversedArray()
    for (element in array1){
        println(element) //5,4,3,2,1
    }

    //aynı yöntem ama bir değişiği:

    var array2 = arrayOf(1,2,3,4)
    array2.reverse()
    for (element1 in array2){
        println(element1)
    } //4,3,2,1

    //aynı işlemi yaptılar

    //dizide bulunan tüm öğelerin toplamını bulmak için .sum() kullanırız

    var array3 = arrayOf(3,5,10)
    println(array3.sum()) //18

}