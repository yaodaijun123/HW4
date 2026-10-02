fun insertionSort(input: MutableList<Int>): MutableList<Int> {

    for (i in 1 until input.size) {

        val current = input[i]
        var j = i - 1

        // Move larger elements one position to the right
        while (j >= 0 && input[j] > current) {
            input[j + 1] = input[j]
            j--
        }

        // Insert current into the correct position
        input[j + 1] = current
    }

    return input
}