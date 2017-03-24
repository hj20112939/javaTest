package dataStructure;

import org.junit.Test;

public class QuickSort {
	public static void quick(int arr[],int low,int high){
		if(low < high){
			int middle = quickSort(low,high,arr);
			quick(arr,low,middle - 1);
			quick(arr,middle + 1,high);
		}
	}
	public static int quickSort(int low,int high,int arr[]){
		int temp = arr[low];
		while(low < high){
			while(low < high && temp <= arr[high])
				high--;
			arr[low] = arr[high];
			while(low < high && temp >= arr[low])
				low++;
			arr[high] = arr[low];
		}
		arr[low] = temp;
		return low;
	}
	public static void print(int arr[]){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "   ");
		}
	}
	@Test
	public void test(){
		int[] arr = {5,2,7,4,6,9,3,6,11};
		quick(arr,0,arr.length - 1);
		print(arr);
	}
	public static void main(String args[]){
		int[] arr = {5,2,7,4,6,9,3,6,11};
		quick(arr,0,arr.length - 1);
		print(arr);
	}
}
