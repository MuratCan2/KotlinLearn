package KotlinOgren

    fun main() {
    /* fonksiyonlar büyük programları parça parça ayırmamızı sağlayarak
    daha düzenli kodlar yazmamızı sağlar
    ayrıca kodları içinde sakladıkları için başka bir yerde kolayca tüm kodları çağırabiliriz
    fonksiyonlar fun ile oluşturulur

     */
        test()
        mySum(10,20)
        
}

fun test(){
    // test() adında yeni bir fonskiyon oluşturduk
    // {} arasında yazdıklarımız test fonskiyonun altında çalıştırılır
    //oluşturduğumuz her fonskiyonu kessinlikle çağrımamız gerekir
    println("Hello Test")
}
fun mySum(a: Int, b: Int){
    println(a+b)
}
