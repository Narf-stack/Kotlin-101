abstract  class Animal(
    val name: String,
    val legCount: Int = 4
        ){
    init {
        println("Hello, my name is $name")
    }

    abstract fun makeSound()
}

// inheritance
// open: One of the needed word to ensure an inheritance. It also means that we will be able to create an instance of the clas
// abstract: The other needed word to ensure an inheritance. With this one we won't be able to create an instance of the clas

// Function
// abstract : since the function is abstract we don't implement the body here, instead it will be in the child classes