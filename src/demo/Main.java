package demo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        MyAlgorithm<Integer> algorithm = new MyAlgorithm<>();
        System.out.println(Arrays.toString(algorithm.shakerSort(arr)));
        // System.out.println(Arrays.toString(algorithm.quickSort(arr)));

        TestElements elements1 = new TestElements("xiaomi", 10_000);
        TestElements elements2 = new TestElements("nokia", 1000);
        TestElements elements3 = new TestElements("iphone", 100_000);
        TestElements elements4 = new TestElements("samsung", 50_000);
//
        TestElements[] arrElements = {elements1, elements2, elements3, elements4};
        MyAlgorithm<TestElements> algorithm1 = new MyAlgorithm<>();
        // System.out.println(Arrays.toString(algorithm1.quickSort(arrElements)));
        //  System.out.println(Arrays.toString(algorithm1.shakerSort((arrElements))));

    }
}