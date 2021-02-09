package sort1;

import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class sort {
	private static int[] anArray;
	
	public static void main (String[] args)
	{
		
		// new commit
		
		anArray = new int[50];
	    Random rand = new Random();
	    
	    int count = 0;
	    
	    for (int i = 0; i < 50; i++) {
	      anArray[i] = rand.nextInt(100); 
	      count++;
	    }
	    
	    System.out.println(Arrays.toString(anArray));	    
	    System.out.println(count);
	    System.out.println();
	    System.out.println();

	    
	    
//insertion-----------------------------------------------------------------------------------------------
		System.out.println("Insertion Sort:");
	    long start = System.nanoTime();
	    insertionsSort(anArray);
	    long end = System.nanoTime();
	    long time = (end - start);
	    System.out.println("Time spend in ns: " + time);
	    System.out.println(Arrays.toString(anArray));
	    
	    
	    // sorted
	    long start1 = System.nanoTime();
	    insertionsSort(anArray);
	    long end1 = System.nanoTime();
	    long time1 = (end1 - start1);
	    System.out.println("Time spend in ms: " + time1);
	    System.out.println(Arrays.toString(anArray));
	    
	    
	    // reverse to sort
	    long start2 = System.nanoTime();
	    reverse(anArray, anArray.length);
	    System.out.println(Arrays.toString(anArray));
	    insertionsSort(anArray);
	    long end2 = System.nanoTime();
	    long time2 = (end2 - start2);
	    System.out.println("Time spend in ms: " + time2);
	    
	    
//	    insertion----------------------------------------------------------------------------------------------------------*/
	    
	    System.out.println();
	    System.out.println();
	    	    
	    
	   // selection~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    System.out.println("Selection Sort:");
	    long start3 = System.nanoTime();
	    selectionSort(anArray);
	    long end3 = System.nanoTime();
	    long time3 = (end3 - start3);
	    System.out.println("Time spend in ns: " + time3);
	    System.out.println(Arrays.toString(anArray));
	    
	    
	    // sorted
	    long start4 = System.nanoTime();
	    selectionSort(anArray);
	    long end4 = System.nanoTime();
	    long time4 = (end4 - start4);
	    System.out.println("Time spend in ms: " + time4);
	    System.out.println(Arrays.toString(anArray));
	    
	    // reverse to sort
	    long start5 = System.nanoTime();
	    reverse(anArray, anArray.length);
	    System.out.println(Arrays.toString(anArray));
	    selectionSort(anArray);
	    long end5 = System.nanoTime();
	    long time5 = (end5 - start5);
	    System.out.println("Time spend in ms: " + time5);
	    
//	    selection~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	    
	    System.out.println();
	    System.out.println();
	    
	    
	    
    //quick===============================================================================================================
	    System.out.println("QuickSort:");
	    long start6 = System.nanoTime();
	    quickSort(anArray, 0, anArray.length -1);
	    long end6 = System.nanoTime();
	    long time6 = (end6 - start6);
	    System.out.println("Time spend in ns: " + time6);
	    System.out.println(Arrays.toString(anArray));
	    
	    
	 // sorted
	    long start7 = System.nanoTime();
	    quickSort(anArray, 0, anArray.length -1);
	    long end7 = System.nanoTime();
	    long time7 = (end7 - start7);
	    System.out.println("Time spend in ms: " + time7);
	    System.out.println(Arrays.toString(anArray));
	    
	 // reverse to sort
	    long start8 = System.nanoTime();
	    reverse(anArray, anArray.length);
	    System.out.println(Arrays.toString(anArray));
	    quickSort(anArray, 0, anArray.length -1);
	    long end8 = System.nanoTime();
	    long time8 = (end8 - start8);
	    System.out.println("Time spend in ms: " + time8);
	    
//	    quick==================================================================================================================*/
	    
	    
	    System.out.println();
	    System.out.println();
	    
	    
	    // merge ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	    System.out.println("Merge sort:");
	    long start9 = System.nanoTime();
	    mergeSorter(anArray, 0, anArray.length -1);
	    long end9 = System.nanoTime();
	    long time9 = (end9 - start9);
	    System.out.println("Time spend in ns: " + time9);
	    System.out.println(Arrays.toString(anArray));
	    
	 // sorted
	    long start10 = System.nanoTime();
	    mergeSorter(anArray, 0, anArray.length -1);
	    long end10 = System.nanoTime();
	    long time10 = (end10 - start10);
	    System.out.println("Time spend in ms: " + time10);
	    System.out.println(Arrays.toString(anArray));
	    
	 // reverse to sort
	    long start11 = System.nanoTime();
	    reverse(anArray, anArray.length);
	    System.out.println(Arrays.toString(anArray));
	    mergeSorter(anArray, 0, anArray.length -1);
	    long end11 = System.nanoTime();
	    long time11 = (end11 - start11);
	    System.out.println("Time spend in ms: " + time11);
	    
//	   merge+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	    
	    System.out.println();
	    System.out.println();
	    
    //radix <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	    System.out.println("Radix sort:");
	    long start12 = System.nanoTime();
	    radixsort(anArray, anArray.length);
	    long end12 = System.nanoTime();
	    long time12 = (end12 - start12);
	    System.out.println("Time spend in ns: " + time12);
	    System.out.println(Arrays.toString(anArray));
	    
	 // sorted
	    long start13 = System.nanoTime();
	    radixsort(anArray, anArray.length);
	    long end13 = System.nanoTime();
	    long time13 = (end13 - start13);
	    System.out.println("Time spend in ms: " + time13);
	    System.out.println(Arrays.toString(anArray));
	    
	 // reverse to sort
	    long start14 = System.nanoTime();
	    reverse(anArray, anArray.length);
	    System.out.println(Arrays.toString(anArray));
	    radixsort(anArray,anArray.length);
	    long end14 = System.nanoTime();
	    long time14 = (end14 - start14);
	    System.out.println("Time spend in ms: " + time14);
	    
//		radix<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< */
	    
	  }
	
	
	static void reverse(int a[], int n) 
    { 
        int i, t; 
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
  
    } 

	
public static void insertionsSort(int[] list) {
		int c = 0;
		int m = 0;
		for (int i = 1;  i < list.length; i++) {
			int currentElement = list[i];
			m++;
			int k;
			for (k = i -1; k >= 0 && list[k] > currentElement; k--) {
				list [k+1] = list[k];
				c++;
			}

			list[k+1] = currentElement;
		}
		System.out.println("c:" + c + "  " + "m:" + m);
	}

public static void selectionSort(int[] arr) 
{ 
	int c = 0;
	int m = 0;
    int n = arr.length; 

    for (int i = 0; i < n-1; i++) 
    { 
        
        int min_idx = i; 
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[min_idx]) {
                min_idx = j; 
        		c++;
            }
        }
        m++; 
        int temp = arr[min_idx]; 
        arr[min_idx] = arr[i]; 
        arr[i] = temp; 
    } 
    System.out.println("c:" + c + "  " + "m:" + m);
    
} 

public static int partition(int[] arr, int low, int high) 
{ 
	
    int pivot = arr[high];  
    int i = (low-1);
    for (int j=low; j<high; j++) 
    { 

        if (arr[j] < pivot) 
        { 
            i++; 
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
    } 


    int temp = arr[i+1]; 
    arr[i+1] = arr[high]; 
    arr[high] = temp; 

    return i+1; 
} 


public static void quickSort(int arr[], int low, int high) 
{ 
    if (low < high) 
    { 

        int pi = partition(arr, low, high); 


        quickSort(arr, low, pi-1); 
        quickSort(arr, pi+1, high); 
    } 
}

public static void merge(int arr[], int l, int m, int r) 
{ 
    int n1 = m - l + 1; 
    int n2 = r - m; 

    int L[] = new int [n1]; 
    int R[] = new int [n2]; 

    for (int i=0; i<n1; ++i) 
        L[i] = arr[l + i]; 
    for (int j=0; j<n2; ++j) 
        R[j] = arr[m + 1+ j]; 

    int i = 0, j = 0; 
    int k = l; 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 

    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 

    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 


public static void mergeSorter(int arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        
        int m = (l+r)/2; 
        mergeSorter(arr, l, m); 
        mergeSorter(arr , m+1, r); 
        merge(arr, l, m, r); 
    } 
} 

static int getMax(int arr[], int n) 
{ 
    int mx = arr[0]; 
    for (int i = 1; i < n; i++) 
        if (arr[i] > mx) 
            mx = arr[i]; 
    return mx; 
} 

static void countSort(int arr[], int n, int exp) 
{ 
    int output[] = new int[n];
    int i; 
    int count[] = new int[10]; 
    Arrays.fill(count,0); 


    for (i = 0; i < n; i++) 
        count[ (arr[i]/exp)%10 ]++; 


    for (i = 1; i < 10; i++) 
        count[i] += count[i - 1]; 


    for (i = n - 1; i >= 0; i--) 
    { 
        output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
        count[ (arr[i]/exp)%10 ]--; 
    } 


    for (i = 0; i < n; i++) 
        arr[i] = output[i]; 
} 


static void radixsort(int arr[], int n) 
{ 

    int m = getMax(arr, n); 

    for (int exp = 1; m/exp > 0; exp *= 10) 
        countSort(arr, n, exp); 
}
}

