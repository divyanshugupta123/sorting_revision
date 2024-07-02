package sorting;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,2,6,8,2,1,8,9,0};
		sort(arr,0,arr.length-1);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void sort(int[] arr,int low,int high) {
		if(low<high) {
			int pivotIndex = partition(arr,low,high);
			sort(arr,low,pivotIndex-1);
			sort(arr,pivotIndex+1,high);
		}
		
	}
	private static int partition(int[]arr, int low,int high) {
		int i = low-1;
		int pivot = arr[high];
	
		for(int j = low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
		
		return i;
	}

}
