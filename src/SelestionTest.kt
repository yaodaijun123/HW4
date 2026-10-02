import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SelectionSortTest {

    @Test
    fun testNormalList() {
        val input = mutableListOf(5, 2, 8, 1)
        val expected = mutableListOf(1, 2, 5, 8)

        assertEquals(expected, selectionSort(input))
    }

    @Test
    fun testAlreadySorted() {
        val input = mutableListOf(1, 2, 3, 4)
        val expected = mutableListOf(1, 2, 3, 4)

        assertEquals(expected, selectionSort(input))
    }

    @Test
    fun testReverseOrder() {
        val input = mutableListOf(4, 3, 2, 1)
        val expected = mutableListOf(1, 2, 3, 4)

        assertEquals(expected, selectionSort(input))
    }

    @Test
    fun testDuplicates() {
        val input = mutableListOf(3, 1, 3, 2, 1)
        val expected = mutableListOf(1, 1, 2, 3, 3)

        assertEquals(expected, selectionSort(input))
    }

    @Test
    fun testEmptyList() {
        val input = mutableListOf<Int>()
        val expected = mutableListOf<Int>()

        assertEquals(expected, selectionSort(input))
    }
}