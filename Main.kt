//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nums = arrayOf(1, 6, 7, 3, 0)
    val  a =nums.min()
    val  b =  nums.max()

    var maxValue = nums[0]
    var maxIndex = 0
    var minValue = nums[0]
    var minIndex = 0

    for (i in nums.indices) {
        if (nums[i] > maxValue) {
            maxIndex = i - 1
        }
        if (nums[i] < minValue) {
            minIndex = i
        }
    }
    println("Минимальное значение " + a + " Индекс элемента " + minIndex)
    println ("Максимальное значение " + b + " Индекс элемента " + maxIndex)


    }
