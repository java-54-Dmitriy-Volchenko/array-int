package telran.util;

import java.util.Arrays;

public class ArraysInt {
	
	public static int[] addNumber(int[] array, int number) {
		int[]newArray = Arrays.copyOf(array, array.length+1); //repeating 1
		newArray[newArray.length-1]=number;
		return newArray;
	}
	public static int[] insertNumber(int[] array,int index,  int number) {		
		int[]newArray = Arrays.copyOf(array, array.length+1); //repeating 1		
		System.arraycopy(newArray, index, newArray, index+1, newArray.length - index - 1);
		newArray[index] = number;
		
		return newArray;
	}
	
	 public static int[] removeNumber(int[] array, int index) {
	        int[] newArray = Arrays.copyOf(array, array.length - 1);
	        System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
	        return newArray;
	 }
	public static int[] insertSorted(int[] sortedArray,int number) {
		//TODO insert number into sorted array with keeping the sorted order
//apply method binerySearch of the class Arrays
		return null;
	}
}
