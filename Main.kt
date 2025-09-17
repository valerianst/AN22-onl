//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    val reversedWords = reverseWordsWithPunctuation(input)
    println("Результат: $reversedWords")
}

fun reverseWordsWithPunctuation(input: String): String {
    val words = input.trim().split("\\s+".toRegex())

    val result = StringBuilder()

    for (i in words.size - 1 downTo 0) {
        result.append(words[i])
        if (i > 0) {
            result.append(" ")
        }
    }

    return result.toString()
}