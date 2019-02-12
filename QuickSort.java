/**
 * 
 */

/**
 * @author e075269
 *
 */
public class QuickSort {

	public int sort(int[] a, int start, int end) {
		int i = -1, j = 0, p = end;
		for (; j < end; j++) {
			if (a[j] <= a[p]) {
				i++;
				// swap i, j
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i + 1];
		a[i + 1] = a[p];
		a[p] = temp;

		return i + 1;

	}

	public void partition(int[] a, int start, int end) {

		if (start < end) {
			int pivot = sort(a, start, end);
			partition(a, start, pivot - 1);
			partition(a, pivot + 1, end);
		}
	}

	public void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
