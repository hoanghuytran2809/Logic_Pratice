fun simpleArraySum(ar: Array<Int>): Int {
    var tong = 0
    for (num in ar) {
        tong += num
    }
    return tong
}

fun main(args: Array<String>) {
    print("Input element number: ")
    val count = readLine()!!.trim().toInt()
    print("Input Array: ")
    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val result = simpleArraySum(ar)
    println("Total in Arr: $result")
}