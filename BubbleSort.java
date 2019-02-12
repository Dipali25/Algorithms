/**
 * 
 */

/**
 * @author e075269
 *
 */
public class BubbleSort {

	public void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
