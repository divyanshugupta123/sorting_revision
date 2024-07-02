package sorting;
import java.util.*;
public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,3,1,5,8,0,5,2,1};
		sort(arr,0,arr.length-1);
		for(int i = 0;i<arr.length;i++)	System.out.println(arr[i]+" ");
	}
	private static void sort(int[] arr,int low,int high) {
		if(low>=high)	return;
		int mid = (low+high)/2;
		sort(arr,low,mid);
		sort(arr,mid+1,high);
		merge(arr,low,mid,high);
		
		
	}
	private static void merge(int[] arr,int low,int mid,int high) {
		List<Integer> ll = new ArrayList<>();
		
		int left = low;
		int right = mid+1;
		while(left<mid+1 && right<=high) {
			if(arr[left]<=arr[right]) {
				ll.add(arr[left]);
				left++;
			}
			else {
				ll.add(arr[right]);
				right++;
				
			}
		}
		while(left<mid+1) {
			ll.add(arr[left]);
			left++;
		}
		while(right<=high) {
			ll.add(arr[right]);
			right++;
		}
		for(int i = low;i<=high;i++) {
			arr[i] = ll.get(i-low);
		}
	}
	

}
