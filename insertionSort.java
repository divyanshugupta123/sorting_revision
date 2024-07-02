package sorting;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,8,3,1,2};
		sort(arr);
	}
	private static void sort(int[] arr) {
		for(int i = 1;i<arr.length;i++) {
			int element = arr[i];
			int j = i - 1;
			while(j>=0 && arr[j]>element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
