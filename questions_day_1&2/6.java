package questions;

import java.util.*;

class Kth {

	public static int kthSmallest(int[] arr, int n, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((number1, number2) -> number2.compareTo(number1));

		for (int i = 0; i < n; ++i) {
			minHeap.add(arr[i]);
			if (minHeap.size() > k) {
				minHeap.poll();
                // minHeap.remove();
			}
		}

		return minHeap.peek();
	}

    public static int kthLargest(int[] arr, int n, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((number1, number2) -> number1.compareTo(number2));

		for (int i = 0; i < n; ++i) {
			maxHeap.add(arr[i]);
			if (maxHeap.size() > k) {
				maxHeap.poll();
                // maxHeap.remove();
			}
		}

		return maxHeap.peek();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 7, 6, 5, 4, 2, 99 };
		int n = arr.length;
		int k = 4;

		System.out.println("kth Smallest Element: " + kthSmallest(arr, n, k));
        System.out.println("kth Largest Element: " + kthLargest(arr, n, k));
	}
}

// class MinHeapComparator implements Comparator<Integer> {

// 	@Override
// 	public int compare(Integer number1, Integer number2) {
// 		return number2.compareTo(number1);
// 	}
// }

// class MaxHeapComparator implements Comparator<Integer> {

// 	@Override
// 	public int compare(Integer number1, Integer number2) {
// 		return number1.compareTo(number2);
// 	}
// }


