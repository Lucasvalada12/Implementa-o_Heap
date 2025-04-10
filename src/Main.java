public class Main {
    public static void main(String[] args) {
        int[] A = {5, 3, 17, 10, 84, 19, 6, 22, 9};
        System.out.print("Original: ");
        HeapSort.printArray(A);

        HeapSort.heapSort(A);
        System.out.print("Sorted: ");
        HeapSort.printArray(A);
    }
}
