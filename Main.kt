//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Введите положительное число")

    var number = readLine()!!.toInt()

    while (number >= 10) {
        var sum = 0
        var temp = number


        while (temp > 0) {
            sum += temp % 10
            temp /= 10
        }
        number = sum
    }

    println("$number")
}



