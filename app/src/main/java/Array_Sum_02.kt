import java.util.Scanner


fun simpleArraySum_02(ar: Array<Int>): Int {
    var sum = 0
    for (num in ar) {
        sum += num
    }
    return sum
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    // Nhập số lượng phần tử của mảng
    println("Input number elements: ")
    val numArr = sc.nextInt()
    // Nhập các phần tử của mảng
    println("Input Array: ")
    val ar = Array(numArr) { sc.nextInt() }
    // Tính tổng các phần tử trong mảng
    val result = simpleArraySum_02(ar)
    // In kết quả
    println("Total: $result")
}
