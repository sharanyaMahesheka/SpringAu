package Generics;

import java.util.Arrays;

public class GenericSort {

	public <E>void swap(E[] array, int index1, int index2){
		if(index1==index2) {
			return;
		}
		
		E temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	 public <E extends Comparable<E>> void selectionSort(E[] a) {
	        for (int i = 0; i < a.length - 1; i++) {
	            // find index of smallest element
	            int smallest = i;
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[j].compareTo(a[smallest])<=0) {
	                    smallest = j;
	                }
	            }

	            swap(a, i, smallest);  // swap smallest to front
	        }
	    }
	 public static void  main(String args[]) {
		 GenericSort intSort = new GenericSort();
		 Integer arr[] = {4,33,99,2,19};
		 System.out.println("before sorting int: "+ Arrays.toString(arr));
	     intSort.selectionSort(arr);
	     System.out.println("After sorting int : "+Arrays.toString(arr));
	     
	     GenericSort charSort = new GenericSort();
		 Character arr1[] = {'g','t','e','a','u'};
		 System.out.println("before sorting character: "+ Arrays.toString(arr1));
	     intSort.selectionSort(arr1);
	     System.out.println("After sorting character : "+Arrays.toString(arr1));
	}
}
