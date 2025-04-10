public class BuildMaxHeap {
    public static void buildMaxHeap(int[] A) {
        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            MaxHeapify.maxHeapify(A, n, i);
        }
    }
}
