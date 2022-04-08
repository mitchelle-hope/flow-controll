fun main (){
    oddnum()
   var z= arrayname(arrayOf("Grace","Mitchelle","Chastity","Emerald","Hope","Joy"))
    println (z)
    serve(9,)
    serve(4)
    serve(15)
    numbers()



}
    //create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun oddnum(){
    for (num in 1..100) {
      if (num%2 !=0)  {
          println(num)

      }
    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts")
fun arrayname(names: Array<String>): Int{
    var num = 0
    for (name in names){
        if (name.length>5){
            num++
        }
    }
    return num
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these decisions,
//printing out the name of the drink each person gets according to their age.
//(2pts)
fun serve(age:Int){
    if (age <6){
        println("milk")
    }
    else if (age < 15 && age>6){
        println("fanta orange")
    }
    else{
        println("cocacola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun numbers(){
    for (num in 1..100)
        if (num%3==0 && num%5==0){

    }
    else if(num%3==0){
        println("fizz")
        }
    else if(num%5==0){
        println("buzz")

        }
    else{
        println(num)
        }
}
