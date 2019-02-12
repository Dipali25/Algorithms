/**
 * 
 */

/**
 * @author e075269
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 8, 69, 78, 88, 100 };

		/*BinarySearch b = new BinarySearch();
		int index = b.searchElementByKey(arr, 0, arr.length-1, 708);
		System.out.println(index);*/
		
		/*QuickSort q = new QuickSort();
		q.partition(arr, 0, arr.length-1);
		q.printArr(arr);*/
		
		BubbleSort b = new BubbleSort();
		b.sort(arr);
		b.printArr(arr);
	}

}
