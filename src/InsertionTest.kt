import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SortingTest {

    @Test
    fun testSelectionSort() {
        val input = mutableListOf(5, 2, 8, 1)
        val expected = mutableListOf(1, 2, 5, 8)

        assertEquals(expected, selectionSort(input))
    }

    @Test
    fun testInsertionSort() {
        val input = mutableListOf(5, 2, 8, 1)
        val expected = mutableListOf(1, 2, 5, 8)

        assertEquals(expected, insertionSort(input))
    }
}