package launch;
import java.util.*;
public  class erase {
	
		public static int binarySearchRecursive(int[] arr, int low, int high, int key) {
		    if (low > high) {
		        return -1;
		    }
		    int mid = low + (high - low) / 2;
		    if (arr[mid] == key) {
		        return mid;
		    } else if (arr[mid] < key) {
		        return binarySearchRecursive(arr, mid + 1, high, key);
		    } else {
		        return binarySearchRecursive(arr, low, mid - 1, key);
		    }
		
	
}
		public static void main (String[] args) {
			Scanner sc=new Scanner (System.in);
			int arr[] = {22,32,43,54,76,98,90};
			int low=arr[0];
			int len=arr.length;
			int high=arr[len-1];
		}
}
