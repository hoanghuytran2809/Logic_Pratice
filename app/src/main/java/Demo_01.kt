import java.util.Scanner

fun Total(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("Nhập a: ")
    val num1 = sc.nextInt()
    print("Nhập b: ")
    val num2 = sc.nextInt()
    val sum = Total(num1, num2)
    println("Tổng của $num1 và $num2 là $sum")
}