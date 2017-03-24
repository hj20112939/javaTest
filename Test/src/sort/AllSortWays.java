package sort;

public class AllSortWays {
	public static void main(String args[]){
		int[] a = {23,6,98,0,2,5,1,3,4,2,8,2,7,6,9,10,11,12,7};
		//BubbleSort(a);
		//insertSort(a);
		//selectSort(a);
		quickSort(a);
		printArray(a);
	}
	
	public static void printArray(int[] arr){
		for(int i : arr){
			System.out.print(i + "  ");
		}
	}
	
	public static void insertSort(int[] arr){
		int count = 0;
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j;
			for(j = i - 1 ; j >= 0; j--){
				if(temp < arr[j]){
					arr[j + 1 ] = arr[j];
					count ++;
				}else{
					break;
				}
			}
			arr[j + 1] = temp;
		}
		System.out.println("insertSort比较次数" + count);
	}
	
	public static void selectSort(int[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			int flag = i;
			int temp;
			for(int j = i; j < arr.length; j++){
				if(arr[flag] > arr[j]){
					flag = j;
					count ++;
				}
			}
			temp = arr[i];
			arr[i] = arr[flag];
			arr[flag] = temp;
		}
		System.out.println("selectSort比较次数" + count);
	}
	
	public static void BubbleSort(int[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			count ++;
			int temp;
			int flag = 0;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp;
				  flag = 1;
				}
			}
			if(flag ==0)
				break;
		}
		System.out.println("BubbleSort比较次数" + count);
	}
	
	public static void quickSort(int[] arr){
		int left = 0,right = arr.length - 1;
		quick(left,right,arr);
	}
	public static void quick(int left,int right,int[] arr){
		int temp = arr[left];
		int i = left,j = right;
		while(i < j){
			while(arr[j] >= temp && i < j){
				j--;
			}
			arr[i] = arr[j];
			while(arr[i] <= temp && i < j){
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i] = temp;
		if(left < i - 1){
			quick(left,i - 1,arr);
		}
		if(i + 1 < right){
			quick(i + 1,right,arr);
		}
	}
}
