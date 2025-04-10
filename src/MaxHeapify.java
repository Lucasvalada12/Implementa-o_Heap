public class MaxHeapify {
    public static void maxHeapify(int[] A, int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < n && A[left] > A[largest]) {
            largest = left;
        }

        if (right < n && A[right] > A[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A, n, largest);
        }
    }
}
