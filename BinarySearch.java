
public class BinarySearch {

	public int searchElementByKey(int[] arr, int start, int end, int key) {
		if (start <= end) {
			int middle = (start + end) / 2;

			if (arr[middle] == key) {
				return middle;
			} else if (arr[middle] > key) {
				return searchElementByKey(arr, start, middle-1, key);
			} else if (arr[middle] < key) {
				return searchElementByKey(arr, middle+1, end, key);
			} else {
				return -1;
			}
		}

		return -1;
	}
}
