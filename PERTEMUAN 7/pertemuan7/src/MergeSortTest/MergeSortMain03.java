package MergeSortTest;

public class MergeSortMain03 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting03 mSort = new MergeSorting03();
        System.out.println("Data Awal");
        mSort.printArray(data);
        System.out.println("setelah diurutkan");
        mSort.mergeSort(data);

    }
}
