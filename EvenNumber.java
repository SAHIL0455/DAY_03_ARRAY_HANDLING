package com.company2;

public class EvenNumber {
    public static void main(String[] args) {
        int[] array = {56,524,68251,6385536,65,6};
        for (int number : array){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
