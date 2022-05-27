


public fun main() {
    val dog = Dog()
    dog.makeSound()

    val cat = Cat()
    cat.makeSound()

    // anonymous class
    // we are creating a temporary object/version that inherit from Animal , we will not have to create the class in its own file
    val bear = object : Animal(name="bear"){
        override fun makeSound() {
            println("roar")
        }
    }
    bear.makeSound()


    // Exception

    println("Type a number")
    val number = readLine()?: "0"
    val parsedNumber = try{
        number.toInt()
    } catch(e: Exception){
        0
    }
    println(parsedNumber)


    // Lambda function
    // function that we pass as parameter to other function

    val list = listOf<String>("Kotlin", "is", "fun")
    val count = list.count{currentString ->
        currentString.length == 3
    }
    println(count)


    fun List<String>.customCount(function:(String) -> Boolean): Int{
        var counter:Int = 0
        for(string in this){
            if(function(string)){
                counter++
            }
        }
        return counter
    }

    val count2 = list.customCount{currentString ->
        currentString.length >= 3
    }
    println(count2)
}

//https://www.youtube.com/watch?v=5flXf8nuq60