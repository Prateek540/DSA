public class InfiniteArray {
    // Simulate infinite array with a normal array for demo
    static int[] arr = {2, 3, 4, 10, 40, 55, 70, 100, 150, 200, 300, 400, 500};

    // Simulate get method (in real infinite array, this would be an API)
    static int get(int index) {
        if (index >= arr.length) return Integer.MAX_VALUE; // Simulate infinity
        return arr[index];
    }

    public static int findPosition(int target) {
        int start = 0, end = 1;

        // Find the range
        while (get(end) < target) {
            int newStart = end + 1;
            // Double the box size
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Binary search in the found range
        return binarySearch(target, start, end);
    }

    private static int binarySearch(int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = get(mid);
            if (value == target) return mid;
            else if (value < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int target = 55;
        int pos = findPosition(target);
        if (pos != -1)
            System.out.println("Element found at index: " + pos);
        else
            System.out.println("Element not found");
    }
}