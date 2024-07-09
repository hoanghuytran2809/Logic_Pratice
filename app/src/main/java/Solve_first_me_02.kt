import java.util.Scanner

class Solve_first_me {
    fun Total(a: Int, b: Int): Int {
        return a + b
    }
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Nhập a: ")
    val num1 = sc.nextInt()
    println("Nhập b: ")
    val num2 = sc.nextInt()
    val demo = Solve_first_me()
    val sum = demo.Total(num1, num2)
    println("Tổng của $num1 và $num2 là $sum")
}

