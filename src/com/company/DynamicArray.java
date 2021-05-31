package com.company;

import java.util.Arrays;
import java.util.Random;

public class DynamicArray {


    private int lengthArray = 0;

    private int[] dynamicArray = new int[lengthArray];


    public int getLengthArray() {
        return lengthArray;
    }

    public void setLengthArray(int lengthArray) {
        this.lengthArray = lengthArray;
    }

    public int[] getDynamicArray() {
        return dynamicArray;
    }

    public void setDynamicArray(int[] dynamicArray) {
        this.dynamicArray = dynamicArray;
    }

    public DynamicArray() {
    }

    public void createArray (int arrayLength){
        Random random = new Random();
        int [] initializeArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            initializeArray[i] = random.nextInt(8) + 1;
        }
        setDynamicArray(initializeArray);
    }


    @Override
    public String toString() {
        return "DynamicArray{" +
                "dynamicArray=" + Arrays.toString(dynamicArray) +
                '}';
    }

    public void add (int elementValue){

        int [] tempArray = new int[dynamicArray.length + 1];

        for (int i = 0; i < tempArray.length-1; i++) {
            tempArray[i] = dynamicArray[i];
        }
        tempArray[tempArray.length-1] = elementValue;
        setDynamicArray(tempArray);
    }

    public void remove (int index, int value){

        int count = 0;
        for (int i = 0; i < dynamicArray.length; i++) {

            if (dynamicArray[i] == value) {
                count++;
            }
        }

        if(dynamicArray[index] == value){
            count --;
        }

        int filteredArrayLength = dynamicArray.length - count - 1;
        int[] filteredArray = new int[filteredArrayLength];


        int tempArrayCount = 0;
        for (int i = 0; i < dynamicArray.length; i++) {

            if (i != index && dynamicArray[i] != value) {
                filteredArray[tempArrayCount] = dynamicArray[i];
                tempArrayCount++;
            }
        }

        setDynamicArray(filteredArray);
    }


    public void swap (int index1, int index2){
        int [] swappedArray = new int [dynamicArray.length];

        for (int i = 0; i < swappedArray.length; i++) {
            swappedArray[i] = dynamicArray[i];
        }
        swappedArray[index1] = dynamicArray[index2];
        swappedArray[index2] = dynamicArray[index1];

        setDynamicArray(swappedArray);
    }

    public void update(int index, int value){
        int [] updatedArray = new int[dynamicArray.length];

        dynamicArray[index] = value;

    }

    public boolean contains (int value){
        boolean doesContain = false;
        for (int i = 0; i < dynamicArray.length; i++) {
            if(dynamicArray[i] == value){
                doesContain = true;
            }
        }
        return doesContain;
    }

    public void sort (String sortOrder){
        if(sortOrder.equalsIgnoreCase("desc")){
            for (int i = 0; i < dynamicArray.length; i++) {
                int temp = 0;
                for (int j = 0; j < dynamicArray.length; j++) {
                    if(dynamicArray[i] > dynamicArray[j]){
                        temp = dynamicArray[i];
                        dynamicArray[i] = dynamicArray[j];
                        dynamicArray[j] = temp;
                    }
                }
            }
        }else if(sortOrder.equalsIgnoreCase("asc")){
            for (int i = 0; i < dynamicArray.length; i++) {
                int temp = 0;
                for (int j = i + 1; j < dynamicArray.length; j++) {
                    if(dynamicArray[i] > dynamicArray[j]){
                        temp = dynamicArray[i];
                        dynamicArray[i] = dynamicArray[j];
                        dynamicArray[j] = temp;
                    }
                }
            }
        }
    }
    public void length (DynamicArray array){
        System.out.println(dynamicArray.length);
    }

}
