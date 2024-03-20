fun main() {
temperature(24.4)
char("Akirachix")
    println(extract("Cynthia"))
}
fun isEven(num:Int):Boolean {
    var number = num % 2
    if (number == 0) {
        println(true)
    } else {
        println(false)
    }
}
fun temperature(num:Double){
    println("The temperarure is $num degree Celcius")

}
fun char (word:String){
    println(word[0])
    println(word[1])
    println(word[2])
    println(word[3])
    println(word[4])
}
fun extract(myname:String):String{
    return myname.slice(0..3)
}