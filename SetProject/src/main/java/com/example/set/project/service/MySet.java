package com.example.set.project.service;

public class MySet {

    int size = 0;
    int LIMIT = 5;
    int arr[] = new int[LIMIT];

    public boolean isEmpty() {
        return (size == 0);
    }

    public void add(int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return ;
            }
        }
        if (size == LIMIT) {
            LIMIT = size * 2;
            int newArr[] = new int[LIMIT];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }

        arr[size] = val;
        size++;

    }

    public int size() {
        return size;
    }

    public void remove(int val) {
        int index = 0;
        while (index < arr.length && arr[index] != val) {
            index++;
        }
        if (index == arr.length){
            return ;
        }
        for (int i = index; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }
}
