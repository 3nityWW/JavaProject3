package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс для тестирования ArrayList и LinkedList.
 */
public class Collection {

    /**
     * Тестирует операции добавления элементов в список.
     *
     * @param list список для тестирования
     * @param iterations количество итераций
     * @return время выполнения в миллисекундах
     */
    public static long testAdd(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // Преобразуем в миллисекунды
    }

    /**
     * Тестирует операции удаления элементов из списка.
     *
     * @param list список для тестирования
     * @param iterations количество итераций
     * @return время выполнения в миллисекундах
     */
    public static long testDelete(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.remove(0); // Удаляем первый элемент
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // Преобразуем в миллисекунды
    }

    /**
     * Тестирует операции получения элементов из списка.
     *
     * @param list список для тестирования
     * @param iterations количество итераций
     * @return время выполнения в миллисекундах
     */
    public static long testGet(List<Integer> list, int iterations) {
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            list.get(i % list.size()); // Получаем элемент по индексу
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // Преобразуем в миллисекунды
    }

    /**
     * Выводит результаты тестирования в виде таблицы.
     *
     * @param arrayListTime время выполнения для ArrayList
     * @param linkedListTime время выполнения для LinkedList
     * @param operation название операции
     * @param iterations количество итераций
     */
    public static void printResults(long arrayListTime, long linkedListTime, String operation, int iterations) {
        System.out.println("|------------------|------------------|------------------|");
        System.out.printf("| %-16s | %-16s | %-16s |\n", "Operation", "ArrayList (ms)", "LinkedList (ms)");
        System.out.println("|------------------|------------------|------------------|");
        System.out.printf("| %-16s | %-16d | %-16d |\n", operation, arrayListTime, linkedListTime);
        System.out.println("|------------------|------------------|------------------|");
        System.out.println("Итерации: " + iterations);
        System.out.println();
    }
}