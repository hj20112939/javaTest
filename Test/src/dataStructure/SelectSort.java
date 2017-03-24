package dataStructure;

public class SelectSort {
	public static void select(int arr[]) {
		int flag,temp;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			flag = i;
			for(int j = i + 1;j < arr.length; j++){
				if (temp > arr[j]){					
					temp = arr[j];
					flag = j;
				}
			}
			arr[flag] = arr[i];
			arr[i] = temp;
		}
	}

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}

	public static void main(String args[]) {
		int[] arr = { 5, 2, 7, 4, 6, 9, 3, 6, 11 };
		select(arr);
		print(arr);
	}
}
