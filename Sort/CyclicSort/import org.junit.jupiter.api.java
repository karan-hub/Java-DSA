import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

package Sort.CyclicSort;


class missingNumberTest {

    @Test
    void testMissingNumber() {
        // Test case 1: Missing number in the middle
        int[] arr1 = {3, 0, 1};
        assertEquals(2, missingNumber.sort(arr1, arr1.length));

        // Test case 2: Missing number is the largest number
        int[] arr2 = {0, 1, 2};
        assertEquals(3, missingNumber.sort(arr2, arr2.length));

        // Test case 3: Missing number is the smallest number
        int[] arr3 = {1, 2, 3};
        assertEquals(0, missingNumber.sort(arr3, arr3.length));

        // Test case 4: Single element array
        int[] arr4 = {0};
        assertEquals(1, missingNumber.sort(arr4, arr4.length));

        // Test case 5: Empty array
        int[] arr5 = {};
        assertEquals(0, missingNumber.sort(arr5, arr5.length));
    }
}