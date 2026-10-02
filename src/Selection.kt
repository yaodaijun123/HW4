
    fun selectionSort(input: MutableList<Int>): MutableList<Int> {

        for (i in 0 until input.size - 1) {

            var minIndex = i

            // Find the smallest value in the unsorted portion
            for (j in i + 1 until input.size) {
                if (input[j] < input[minIndex]) {
                    minIndex = j
                }
            }

            // Swap the smallest value with the current position
            val temp = input[i]
            input[i] = input[minIndex]
            input[minIndex] = temp
        }

        return input
    }
