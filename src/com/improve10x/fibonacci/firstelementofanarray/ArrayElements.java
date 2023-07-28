package com.improve10x.fibonacci.firstelementofanarray;

public class ArrayElements {
    public int findArrayElement(int[] elements) {
        if (elements.length < 1) {
            return 0;
        }
        return elements[0];
    }
}
