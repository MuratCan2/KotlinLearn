package KotlinOgren

fun main() {

    /*
    visibility nelerin erişelebileceğini nelerin eşilemeyeceğini belirlememizi sağlar
   en çok private ve public kullanılır
   private sadece o file de veya class ta kullanılır ve başka yerde kullanılamaz
   public ise halka açıktır herkes görebilir fakat çoğunlukla belirtmemize gerek yoktur
   başka anahtar kelimeler ise protected ve internal dır
   protected de private gibidir sdee kalıtım aldığımız bir sınıf varsa orada da kullanılmasına izin verir
   internal da public gibidir bütün projelerde ulaşılabilir fakat farklı modüllerde ulaşılamaz
     */
    /*
    val classTime = className
    classTime.hairColor = "Green"
    println(classTime.hairColor)

    //hairColor public olduğu için kullanabildik (*)

    classTime.hairColor = "Green" //hata!

    println(classTime.hairColor)

    //burada da hata aldık çünkü hairColor private olarak belirlenmiş(**)



     */






    //Class bölümü

    /*
      class TestClass() {

       fun testing(){
       var referans : Ulus = Ulus()
       referans.c
       referans.d
       referans.a
       referans.b //protected alt sınıf üst sınıf ilişkisi vardır fakat burada öyle bir şey olmadığı için kullanamadık

       //diğer sınıftaki yapıları kullanmak için nesne oluşturmamız lazım
       //





      class ClassName{
     * var hairColor = ""

   //burada hairColor objesi publicttir bu yüzden başına public yazmamıza gerek yoktur
   örnek: public var hairColor

    ** private var hairColor = ""
    //burada hairColor objesini sadece bu sınıfa özel yaptık yani bu sınıf ortamı hariç başka yerde kullanılmayacak
    //bunu yapmamızın nedeni projemizde başkasının görmesini istemediğimiz şeyleri özel olarak saklamaktır


   open class Murat {
    private var a = 2
    //private ilgili sınıfta geçerlidir sadece burada kullanılır
     protected var b = 3
     // protected sınıfımız içinde oluşturduğumuz başka sınıflarda kullanılabilir fakat bunun haricinde private gibidir
     internal var c = 4
     //internal ilgili modüllerde kullanılır sadece modülün dışında çıkıldığında kullanılamaz
     public var d = 5 veya var d = 5
     //public zaten default olarak gelir belirtmemeize gerek yoktur herkese açıktır
   open fun test(){
    println(a) //hata almadık kullanabildik çünkü a değişkenin kullanıldığı class veya file içindeyiz


örnek:

class Turk : Murat () {
//burada hata aldık çünkü bütün sınıflar otomatik olarak public veya final dır
 bunu çözmek için ise ana classın başına open eklenir
 open eklediğimizde artık o sınıftan yeni bir sınıf üretebiliriz

 ovveride fun test(){
 burada da hata aldık çünkü ilgili sınıfta aynı adlı bir fonskiyon var zaten fonskiyonu kullanmak için
 ana sınıftaki fonksiyonun başına open ekleriz
 yeni ürettiğimiz fonskiyonun başına ise override ekleriz
 override farklı bir sınıftaki fonksiyonu yeni olan sınıfta değiştirmek ve düzenlemeyi sağlar

println(a) //burada hata aldık çünkü private sadece ilgili sınıfta veya file çalışır
println(b)  //burada hata almadık çünkü ilgili sınıflarda kullanabiliriz Turk sınıfı alt sınıf olduğu için kullanabilirz
println(c) //aynı modülün içinde yaptığımız için bir şey olmadı
println(d) //zaten public her yerde kullanabileceğimiz için hata almadık


   }

     */
}