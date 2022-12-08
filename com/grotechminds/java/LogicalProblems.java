package com.grotechminds.java;

import java.util.Arrays;

public class LogicalProblems {

	public static int peakElement(int[] array, int n){
		if (n == 1){
			return array[0];
		}
		if (array[0]>=array[1]) {
			return array[0];
		}
		if (array[n-1]>= array[n-2]) {
			return array[n-1];
		}
		
		//Check for the remaining cases
		for (int i = 1; i<n-1; i++) {
			if (array[i]>=array[i-1] && array[i]>=array[i+1]) {
				return array[i];
			}
		}
		return -1;
	}
	
	public static void deDuplicateAString() {
		//Convert this into a Char array
		//Compare each element with the next element - two loops. 
		//Wherever matches, move all the further elements by one step back. 
		//Reduce the length of the string
		
		//Sort
		//Compare each element and see if it is the same 
		//Pick unique element and put into an another array.
		//Which becomes your output. 
	}
	
	
	//selective comparison
	public static void selectionSort(int[] array){
		   int length = array.length;
		   for (int i=0; i<length-1; i++){
		       int minimum_index = i;
		       for (int j = i+1; j<length; j++){
		           if(array[j]< array[minimum_index]){
		               minimum_index = j;
		           }
		       }

		       //swap the number at i and minimum index
		       int temp = array[minimum_index];
		       array[minimum_index] = array[i];
		       array[i] = temp;
		   }
		   for (int i=0; i<array.length; i++){
		       System.out.println(array[i]);
		   }
		}

	    //consecutive comparison
		public static void bubbleSort(int arr[]) {
		   int n = arr.length;
		   for (int i = 0; i < n - 1; i++)
		       for (int j = 0; j < n - i - 1; j++)
		           if (arr[j] > arr[j + 1]) {
		               // swap arr[j+1] and arr[j]
		               int temp = arr[j];
		               arr[j] = arr[j + 1];
		               arr[j + 1] = temp;
		           }
		}


        //Split in the middle and search
		public static int binarySearch(int[] array, int x){
		   Arrays.sort(array);
		   int low = 0;
		   int high = array.length;
		   while (low <= high) {
		       int mid = low + (high - low) / 2;
		       if (array[mid] == x)
		           return mid;
		       if (array[mid] < x)
		           low = mid + 1;
		       else
		           high = mid - 1;
		   }
		   return -5;
		}

		
		public static int jumpSearch(int[] arr, int ele) {

		    int prev = 0;
		    int n = arr.length;
		    int step = (int) Math.floor(Math.sqrt(n));// 4.19 -> 4

		    //loop until current element is less than the given search element
		    while (arr[Math.min(step, n) - 1] < ele) {
		      prev = step;
		      step += (int) Math.floor(Math.sqrt(n));
		      if (prev >= n) return -1;
		    }

		    //perform linear search prev index element to given element
		    while (arr[prev] < ele) {
		      prev++;
		      if (prev == Math.min(step, n)) return -1;
		    }

		    // Return index if element is found
		    if (arr[prev] == ele) return prev;

		    return -1;
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Peak element of an Array
		int[] intArray = {5,2,6,7,3,0,6};
		//int peakValue = peakElement(intArray, intArray.length);
		//System.out.print(peakValue);
		
		//deDuplicateAString("abcadgrhftcbea");
	    
		//{17,5,-2,0,1,-3,-8,6,13} = {-2, -3, -8, 0, <>} - Maintaining the order - Sort
		
		//linearSearch();
		//jumpSearch();
		//Selection sort
		//Bubble sort
		
		//binarySearch();
		
		//selectionSort();
		//bubbleSort();
		//quickSort();
	}

}
