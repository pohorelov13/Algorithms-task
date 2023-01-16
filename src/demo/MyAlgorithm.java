package demo;

public class MyAlgorithm<T extends Comparable<T>> {

    private T[] quickSort(T[] arr, int start, int end) {
        if (start < end) {
            int pilot = partition(arr, start, end);
            quickSort(arr, start, pilot - 1);
            quickSort(arr, pilot + 1, end);
        }
        return arr;
    }

    public T[] shakerSort(T[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            for (int i = start; i < end; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swap(arr, i, i + 1);
                }
            }
            --end;

            for (int i = end; i > start; i--) {
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    swap(arr, i, i - 1);
                }
            }
            ++start;
        }
        return arr;
    }

    public T[] quickSort(T[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private int partition(T[] arr, int start, int end) {
        T pivot = arr[end];
        int index = start - 1;
        for (int i = start; i <= end; i++) {
            if (arr[i].compareTo(pivot) < 1) {
                index++;
                swap(arr, i, index);
            }
        }

        return index;
    }

    private void swap(T[] arr, int first, int second) {
        T temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}