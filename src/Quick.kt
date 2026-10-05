fun quickSort(input: List<Int>): List<Int> {

    // Base case
    if (input.size <= 1) {
        return input
    }

    val pivot = input[0]

    val smaller = mutableListOf<Int>()
    val equal = mutableListOf<Int>()
    val larger = mutableListOf<Int>()

    for (number in input) {
        if (number < pivot) {
            smaller.add(number)
        } else if (number > pivot) {
            larger.add(number)
        } else {
            equal.add(number)
        }
    }

    return quickSort(smaller) + equal + quickSort(larger)
}