fun main(args: Array<String>) {
    println("Enter the numbers separated by comma, then press enter.")
    var input = readlnOrNull()
    println("The numbers you entered are: $input")
    println("Their sum is ${add(input)}")
}