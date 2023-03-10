import java.util.*;

public class SelectionSort{
	public static void main(String[] args){
		int[] arr = {13, 46, 24, 52, 20, 9};
		int n = arr.length;

		selection_sort(arr, n);

		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}

	static void selection_sort(int[] arr, int n){
		for(int i=0; i<n; i++){
			int minEleIndex = i;

			for(int j=i; j<n; j++){
				if(arr[j] < arr[minEleIndex]){
					minEleIndex = j;
				}
			}
			swap(arr, i, minEleIndex);
		}
	}

	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}