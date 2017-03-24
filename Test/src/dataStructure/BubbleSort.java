package dataStructure;

public class BubbleSort {
	public static void bubble(int arr[]){
		int temp;
		for(int i = 0;i < arr.length;i++){
			int count = 0;
			for(int j = i+1;j < arr.length;j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
			if(count == 0)
				break;
		}
	}
	public static void print(int arr[]){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "   ");
		}
	}
	public static void main(String args[]){
		int[] arr = {5,2,7,4,6,9,3,6,11};
		bubble(arr);
		print(arr);
	}
}
