import kotlin.random.Random
import kotlin.time.DurationUnit
import kotlin.time.measureTime

fun main() {

    val sizes = listOf(10, 100, 1000, 10000)
    val trials = 5

    println("Size,Selection,Insertion,Merge,Quick")

    for (size in sizes) {

        var selectionTotal = 0.0
        var insertionTotal = 0.0
        var mergeTotal = 0.0
        var quickTotal = 0.0

        repeat(trials) {

            // Generate one random list
            val original = List(size) {
                Random.nextInt(100000)
            }

            // Give every algorithm the same data
            val selectionInput = original.toMutableList()
            val insertionInput = original.toMutableList()
            val mergeInput = original.toList()
            val quickInput = original.toList()

            val selectionTime = measureTime {
                selectionSort(selectionInput)
            }

            val insertionTime = measureTime {
                insertionSort(insertionInput)
            }

            val mergeTime = measureTime {
                mergeSort(mergeInput)
            }

            val quickTime = measureTime {
                quickSort(quickInput)
            }

            selectionTotal += selectionTime.toDouble(DurationUnit.MILLISECONDS)
            insertionTotal += insertionTime.toDouble(DurationUnit.MILLISECONDS)
            mergeTotal += mergeTime.toDouble(DurationUnit.MILLISECONDS)
            quickTotal += quickTime.toDouble(DurationUnit.MILLISECONDS)
        }

        val selectionAverage = selectionTotal / trials
        val insertionAverage = insertionTotal / trials
        val mergeAverage = mergeTotal / trials
        val quickAverage = quickTotal / trials

        println(
            "$size," +
                    String.format("%.5f", selectionAverage) + "," +
                    String.format("%.5f", insertionAverage) + "," +
                    String.format("%.5f", mergeAverage) + "," +
                    String.format("%.5f", quickAverage)
        )
    }
}