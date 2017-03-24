package dataStructure;

public class ShellSort {
	public static void shell(int arr[]){
		for(int i = arr.length/2;i >= 1;i=i/2){
			for(int j = i;j < arr.length;j = j + i){
				int temp = arr[j];
				int k;
				for(k = j - i ;k >= 0 && temp < arr[k];k = k - i){
					arr[k+i] = arr[k];
				}
				arr[k+i] = temp;
			}
		}
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}

	public static void main(String args[]) {
		int[] arr = { 5, 2, 7, 4, 6, 9, 3, 6, 11 };
		shell(arr);
		print(arr);
	}
}
