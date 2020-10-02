package by.epam.task4.data;

import java.util.Arrays;

public class Array {
    private int[] intArray;

    public Array() {
        intArray = new int[0];
    }
    public Array(int length) {
        intArray = new int[length];
    }
    public Array(int[] intArray){
        this.intArray = intArray;
    }

    public void add(int number){
        int[] newArray = new int[intArray.length + 1];
        for (int i = 0; i < intArray.length; i++) {
            newArray[i] = intArray[i];
        }
        newArray[intArray.length] = number;
        intArray = newArray;
    }
    public void add(int index, int number){
        intArray[index] = number;
    }
    public int get(int index){
        return intArray[index];
    }
    public int length(){
        return intArray.length;
    }

    public int[] getIntArray() {
        return intArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(intArray, array.intArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(intArray);
    }

    @Override
    public String toString() {
        return "Array{" +
                "intArray=" + Arrays.toString(intArray) +
                '}';
    }
}
