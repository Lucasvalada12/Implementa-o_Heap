public class HeapSort {
        public static void heapSort(int[] A) {
            int n = A.length;

            BuildMaxHeap.buildMaxHeap(A);

            for (int i = n - 1; i > 0; i--) {
                int temp = A[0];
                A[0] = A[i];
                A[i] = temp;

                MaxHeapify.maxHeapify(A, i, 0);
            }
        }

        public static void printArray(int[] A) {
            for (int num : A) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

