package array;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String args[]) {
		int[] arr = {33,32,4,7,4,34,64,2,44,6};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String[] arr1 = {"apple","orange","pineapple","banana"};
		sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void sort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void sort(String[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j].compareTo(arr[j-1])<0) {
					String temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}

}
