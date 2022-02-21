fun main(){
    takeName("Ada")

    var result = modulus(8,3)
    println(result)

   var total= sum(456, 432,1,1)
    println(total)
    printFact("Meditation")


}



fun takeName(name:String){
    println("Hello $name")
}

fun modulus(numb1:Int, numb2:Int):Int{
    var modulus = numb1%numb2
    return modulus

}

fun sum(num1: Int, num2: Int, num3:Int, num4:Int):Int{
    var sum = num1 + num2 + num3 + num4
    return sum
}

fun printFact(fact:String){
    println("I love $fact")
}


