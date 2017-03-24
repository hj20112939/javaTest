package dataStructure;

import java.math.BigDecimal;

public class HeapSort {
	public static void heap(int arr[]){
		int temp;
		creatHeap(arr);
		for(int i = arr.length - 1;i > 0;i--){
			temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			adjustHeap(arr,0,i-1);
		}
	}
	public static void creatHeap(int arr[]){
		for(int i = (arr.length-1)/2; i >= 0;i--){
			adjustHeap(arr,i,arr.length - 1);
		}
	}
	public static void adjustHeap(int arr[],int s,int m){
		int temp = arr[s];
		for(int i = 2*s;i <= m;i *= 2){
			if(i < m && arr[i] < arr[i+1])
				i++;
			if(temp >= arr[i])
				break;
			arr[s] = arr[i];
			s = i;
		}
		arr[s] = temp;
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}

	public static void main(String args[]) {
		int[] arr = { 5, 2, 7, 4, 6, 9, 3, 6, 11 };
		heap(arr);
		print(arr);
		BigDecimal b1 = new BigDecimal("0.1");
		BigDecimal b2 = new BigDecimal(3);
		System.out.println(3*0.1);
		System.out.println(b1.multiply(b2));
	}
}
