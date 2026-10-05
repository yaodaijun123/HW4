import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeSortTest {

    @Test
    fun testNormalList() {
        val input = listOf(5, 2, 8, 1)
        val expected = listOf(1, 2, 5, 8)

        assertEquals(expected, mergeSort(input))
    }

    @Test
    fun testAlreadySorted() {
        val input = listOf(1, 2, 3, 4)
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, mergeSort(input))
    }

    @Test
    fun testReverseOrder() {
        val input = listOf(5, 4, 3, 2, 1)
        val expected = listOf(1, 2, 3, 4, 5)

        assertEquals(expected, mergeSort(input))
    }

    @Test
    fun testDuplicates() {
        val input = listOf(4, 2, 4, 1, 2)
        val expected = listOf(1, 2, 2, 4, 4)

        assertEquals(expected, mergeSort(input))
    }

    @Test
    fun testEmptyList() {
        val input = emptyList<Int>()
        val expected = emptyList<Int>()

        assertEquals(expected, mergeSort(input))
    }

    @Test
    fun testSingleElement() {
        val input = listOf(7)
        val expected = listOf(7)

        assertEquals(expected, mergeSort(input))
    }
}