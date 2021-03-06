package ru.dreadblade.algorithms.sort;

public interface SortingAlgorithm {
    <T extends Comparable<T>> void sort(T[] array);

    static <T extends Comparable<T>> void bubbleSort(T[] array) {
        new BubbleSortAlgorithm().sort(array);
    }
}
