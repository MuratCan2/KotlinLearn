package KotlinOgren

fun main() {
    //sınıf değişkenleri, fonkisyonları, özellikleri bulunduran büyük bir yapıdır
    //sınıflar her zaman büyük harfle başlar

    /*
    sınıf oluşturmak için sağ tıklıyoruz new diyoruz kotlin file/class seçenğine tıklıyoruz
    daha sonra class ı seçip sınıfımızın adını belirliyoruz

     */
    // kabaca class yapısı
    class ClassName{

    }
    //3 yol vardır
//biraz daha kolay yol
    val homer = KotlinClass("Murat",19,"Software")
    //nesneyi oluşturduk

    //object & Instance
//zor gösterimi
    homer.age = 50
    homer.name = "Murat"
    homer.job = "Android Developer"

    //oluşturudğumuz nesnenin içinde attığımız sınıf vardır
    //bu nesnenin içindeki objeyi homer.age şekilnde çağırdık

    println(homer.job)

    //objeyi yazdırdık


    //class bölümü

    /*
    //istersek tüm işlemi tek satırda yapabiliriz
    class KotlinClass(var name: String, var age: Int, var job: String) {

    var age = 0
    var name = ""
    var job = ""
//bir diğer yol
    constructor(ageInput: Int, nameInput: String, jobInput: String){
        this.age = ageInput
        this.name = nameInput
        this.job = jobInput
        

     */

    /*
    sınıfların yazılışını öğrendik
    construcator() methodu KotlinClass sınıfında herhangi bir obje oluşturulduğunda çağrılacak yapıdır

     */


}