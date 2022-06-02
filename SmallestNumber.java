package com.company2;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] array = {56,524,68251,6385536,65,6};
        int smallest = array[0]; ;
        for (int i = 1; i<array.length;i++){
            if (array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println("Smallest number in array is "+smallest);
    }
}
