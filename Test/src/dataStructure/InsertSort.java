package dataStructure;

public class InsertSort {
	public static void insert(int arr[]){
		int temp;
		for(int i = 1;i < arr.length; i++){
			temp = arr[i];
			int j;
			for(j = i - 1;j >=0 ; j--){
				if(temp < arr[j]){					
					arr[j+1] = arr[j];
				}else{
					break;
				}
			}
			arr[j+1] = temp;
		}
	}
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}

	public static void main(String args[]) {
		int[] arr = { 5, 2, 7, 4, 6, 9, 3, 6, 11 };
		insert(arr);
		print(arr);
	}
}
