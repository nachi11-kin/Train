package com.example.set.project.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SetTest {

    MySet set;

    @BeforeEach
    void setUp() {
        set = new MySet();
    }

    @Test
    void createEmptySet() {
        assertEquals(true, set.isEmpty());
        assertEquals(0, set.size());
    }

    @Test
    void addElementsToSet() {
        set.add(1);
        set.add(2);
        assertEquals(false, set.isEmpty());
        assertEquals(2, set.size());
        assertArrayEquals(new int[]{1, 2, 0, 0, 0}, set.arr);
    }

    @Test
    void addElementsToSetExceedArraySize() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        assertEquals(false, set.isEmpty());
        assertEquals(6, set.size());
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 0, 0, 0, 0}, set.arr);
    }

    @Test
    void addElementsToSetUnique() {
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        assertEquals(false, set.isEmpty());
        assertEquals(2, set.size());
        assertArrayEquals(new int[]{1, 2, 0, 0, 0}, set.arr);
    }

    @Test
    void removeElementFromSet() {
        set.add(10);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(2);
        assertEquals(false, set.isEmpty());
        assertEquals(3, set.size());
        assertArrayEquals(new int[]{10, 3, 4, 0, 0}, set.arr);
    }

    @Test
    void removeNonElementFromSet() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(6);
        assertEquals(false, set.isEmpty());
        assertEquals(4, set.size());
        assertArrayEquals(new int[]{1, 2, 3, 4, 0}, set.arr);
    }
}
