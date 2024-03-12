package telran.util;

import java.util.Arrays;

public class ArraysInt {

	public static int[]newArray(int[]array, int one){
		int[]newArray=Arrays.copyOf(array, array.length+one);
		return newArray;
	}
	
	public static int[] addNumber(int[] array, int number) {
		int[]newArray = newArray(array,1);
		newArray[newArray.length-1]=number;
		return newArray;
	}
	public static int[] insertNumber(int[] array,int index,  int number) {		
		int[]newArray = newArray(array,1);	
		System.arraycopy(newArray, index, newArray, index+1, newArray.length - index - 1);
		newArray[index] = number;
		
		return newArray;
	}
	
	 public static int[] removeNumber(int[] array, int index) {
		 int[]newArray = newArray(array,-1);
	        System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
	        return newArray;
	 }
	 
	public static int[] insertSorted(int[] sortedArray,int number) {
		int[]newArray = newArray(sortedArray,1);
		int res = Arrays.binarySearch(sortedArray, number);			
		if (res>=0) {
			newArray = insertNumber(sortedArray, res, number);
		}
		else {
			newArray = insertNumber(sortedArray,-(res + 1), number);
		}

		return newArray;
	}
}
