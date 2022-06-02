package com.company2;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {5, 56, 78, 85, 36, 254};
        int max = array[0];
        for (int i = 1; i < array.length; i++){
           if (array[i]>max){
               max = array[i];
           }
        }
         System.out.println("Max number in array is "+max);
    }
}
