fun mergeSort(input: List<Int>): List<Int> {

    // Base case
    if (input.size <= 1) {
        return input
    }

    val middle = input.size / 2

    val left = mergeSort(input.subList(0, middle))
    val right = mergeSort(input.subList(middle, input.size))

    return merge(left, right)
}


fun merge(left: List<Int>, right: List<Int>): List<Int> {

    val result = mutableListOf<Int>()

    var i = 0
    var j = 0

    while (i < left.size && j < right.size) {

        if (left[i] <= right[j]) {
            result.add(left[i])
            i++
        } else {
            result.add(right[j])
            j++
        }
    }

    // Add remaining elements
    while (i < left.size) {
        result.add(left[i])
        i++
    }

    while (j < right.size) {
        result.add(right[j])
        j++
    }

    return result
}