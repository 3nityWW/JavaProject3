package com.example;

import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class CollectionTest {

    @Test
    public void testAddPerformance() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long arrayListTime = Collection.testAdd(arrayList, 1000);
        long linkedListTime = Collection.testAdd(linkedList, 1000);

        // Проверка неотрицательности времени
        assertTrue(arrayListTime >= 0);
        assertTrue(linkedListTime >= 0);
    }

    @Test
    public void testGetPerformance() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Добавляем элементы для тестирования get
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long arrayListTime = Collection.testGet(arrayList, 1000);
        long linkedListTime = Collection.testGet(linkedList, 1000);

        // Проверка неотрицательности времени
        assertTrue(arrayListTime >= 0);
        assertTrue(linkedListTime >= 0);
    }

    @Test
    public void testDeletePerformance() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Добавляем элементы для тестирования delete
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long arrayListTime = Collection.testDelete(arrayList, 1000);
        long linkedListTime = Collection.testDelete(linkedList, 1000);

        // Проверка неотрицательности времени
        assertTrue(arrayListTime >= 0);
        assertTrue(linkedListTime >= 0);
    }
}