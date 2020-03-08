package KotlinOgren

fun main() {
    //Set

    //Array de aynı elemanı birden fazla yazdırabilirdik

    val myExampleArray = arrayOf(1,2,3,4,4)
    println("Element 4 : ${myExampleArray[3]}") //4
    println("Element 4 : ${myExampleArray[4]}") //4

    //görüldüğü gibi aynı elemanı birden fazla kez yazdırabildik

    //fakat set lerde bunu yapamayız. bir eleman sadece tek bir kere yazılabilir
    //dizinde aynı elemandan bir taneden fazla varsa sadece bir tanesini görür

    val mySet = setOf<Int>(1,1,2,3)

    println(mySet.size) //3
    //4 eleman olduğu halde 1 sayısı tekrarlandığından diğer biri görmezlikten geldi

    /*
    set tede arrayListOf ve ArrayList gibi ayrı yapılar vardır
    bunlar setOf() ve HashSet dir
    ikisi de aynı işlevi görselerde HashSet() e eleman eklemek için sadece .add yolunu kullanmamız gerekiyor
   yani HashSet() de parantez içinde eleman yazılamaz
     */
    val myName = HashSet<String>()
    myName.add("Murat")
    myName.add("Murat")
    println(myName.size)//1

    //For each

    //for each sayesinde bir dizinin içindeki tüm elemanları ekrana yazdırabiliriz

    println(mySet.forEach { println(it) })

    /*
    set te dikkat edilmesi gerekenler :
    eğer elemanlar kalıp olarak aynı fakat harflerinde büyük küçük uyumsuzluğu varsa
    farklı olarak algılanır ve ekrana yazılır örneğin

     */
    val myName1 = HashSet<String>()
    myName1.add("Murat")
    myName1.add("murat")
    println(myName1.size) //2

    val nums = setOf<Int>(11,5,3,8,1,9,6,2)

    val len = nums.count()
    val max = nums.max()
    val min = nums.min()
    val sum = nums.sum()
    val avg = nums.average()

    println(len) //kümedeki eleman sayısını verir .size gibi
    println(max) //en büyük sayı 11
    println(min) // en küçük sayı 1
    println(sum) //tüm elemanların toplamı
    println(avg) //tüm elemanların ortalaması
    println(nums.first()) //kümenin ilk elemanını gösterir
    println(nums.last()) // kümenin son elemanını gösterir

    //Sette index çağırma yöntemi .elementAt()

    val captain = setOf<String>("Murat","Can","Caner")
    println("İkinci index şudur : ${captain.elementAt(2)}") //Caner

    //aradığımız şeyin kümenin içinde olup olmadığını sorgulamak için .contains() methotunu kullanırız

    val nameSet = setOf<Any>(1,2,3,4,"Murat","Beşiktaş","Caner")

    val name = "Murat"
    println("nameSet adlı küme de $name var mıdır?" + " " + nameSet.contains(name)) //True

    //.contains() sadece iki cevap verebilir true ve false dir

    var num = 5
    println("nameSet adlı küme de $num içeriyor mu ?" + " " + nameSet.contains(num)) //False

    println("Bu ögeler nameSet kümesinin içinde var mı" + " " + nameSet.containsAll(setOf(1,3,"Caner"))) //True



}