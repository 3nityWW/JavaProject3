package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс для тестирования ArrayList и LinkedList.
 */
public class Main {
    public static void main(String[] args) {
        int iterations = 50_000; // Количество итераций

        // Создаем списки
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Тестируем добавление
        long arrayListAddTime = Collection.testAdd(arrayList, iterations);
        long linkedListAddTime = Collection.testAdd(linkedList, iterations);
        Collection.printResults(arrayListAddTime, linkedListAddTime, "Add", iterations);

        // Тестируем получение
        long arrayListGetTime = Collection.testGet(arrayList, iterations);
        long linkedListGetTime = Collection.testGet(linkedList, iterations);
        Collection.printResults(arrayListGetTime, linkedListGetTime, "Get", iterations);

        // Тестируем удаление
        long arrayListDeleteTime = Collection.testDelete(arrayList, iterations);
        long linkedListDeleteTime = Collection.testDelete(linkedList, iterations);
        Collection.printResults(arrayListDeleteTime, linkedListDeleteTime, "Delete", iterations);
    }
}