fun main() {
    var greetMe = greeting("Maria")
    println(greetMe)
    var modulus = division(50,7)
    println(modulus)
    var addsFourNums = add(22,23,25,12)
    println(addsFourNums)
    var fuctAboutme = fact("I Love learning new things.")
    println(fuctAboutme)
    var AreaOfCircle = area(4)
    println(AreaOfCircle)


}
//area of a circle
fun area(radiusNum: Int): Double{
    var areaOfCirle = (radiusNum * radiusNum) * 3.242
    return areaOfCirle

}

fun greeting(name: String): String {
    var name = ("Hello "+name)
    return name

}
fun division(num1:Int, num2: Int): Int{
    var modulo= num1 % num2
    return modulo


}
fun add(num3: Int,num4: Int,num5: Int,num6: Int): Int{
    var adds = num3 + num4 + num5 + num6
    return adds

}
fun fact(funfact: String): String{
    var factAboutMe = funfact
    return factAboutMe


}