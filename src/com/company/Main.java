package com.company;

public class Main {

    public static void main(String[] args) {

	DynamicArray newArray = new DynamicArray();

	System.out.println(newArray.toString());



	newArray.createArray(4);

	System.out.println(newArray.toString());


	newArray.add(5);

	System.out.println(newArray.toString());

    newArray.add(10);


    System.out.println(newArray.toString());

    newArray.remove(3,5);

    System.out.println(newArray.toString());

    newArray.swap(2,3);

	System.out.println(newArray.toString());

	newArray.update(0,1);


	System.out.println(newArray.toString());

	System.out.println(newArray.contains(10));

	newArray.sort("asc");


	System.out.println(newArray.toString());

	newArray.length(newArray);




	}


}
