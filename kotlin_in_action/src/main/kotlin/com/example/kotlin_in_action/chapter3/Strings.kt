package strings

const val SEPARATOR = ", "

fun <T> Collection<T>.joinToString(
        separator: String = SEPARATOR,
        prefix: String = "",
        postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    return result.append(postfix).toString()
}


fun String.lastChar(): Char = get(length - 1)

val String.lastChar: Char
    get() = get(length - 1)