package questions_day_1and2;

import java.util.*;

class Kth {

	public static int kthSmallest(int[] arr, int n, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((number1, number2) -> number2.compareTo(number1));

		for (int i = 0; i < n; ++i) {
			maxHeap.add(arr[i]);
			if (maxHeap.size() > k) {
				maxHeap.poll();
				// maxHeap.remove();
			}
		}

		return maxHeap.peek();
	}

	public static int kthLargest(int[] arr, int n, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((number1, number2) -> number1.compareTo(number2));

		for (int i = 0; i < n; ++i) {
			minHeap.add(arr[i]);
			if (minHeap.size() > k) {
				minHeap.poll();
				// minHeap.remove();
			}
		}

		return minHeap.peek();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 7, 6, 5, 4, 2, 99 };
		int n = arr.length;
		int k = 3;

		System.out.println(k + "th Smallest Element: " + kthSmallest(arr, n, k));
		System.out.println(k + "th Largest Element: " + kthLargest(arr, n, k));
	}
}

// class MaxHeapComparator implements Comparator<Integer> {

// @Override
// public int compare(Integer number1, Integer number2) {
// return number2.compareTo(number1);
// }
// }

// class MinHeapComparator implements Comparator<Integer> {

// @Override
// public int compare(Integer number1, Integer number2) {
// return number1.compareTo(number2);
// }
// }

// 16
public final class ImmutableClass {
	private final int id;
	private final String name;

	public ImmutableClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ImmutableClass that = (ImmutableClass) o;
		return id == that.id && Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}

// 17
// class A {
// private String name;
// private int age;

// public A(String name, int age) {
// this.name = name;
// this.age = age;
// }

// public A(A another) { // copy constructor
// this(another.name, another.age);
// }
// }

// 18
class Outer {
	class Inner {
		public void show() {
			System.out.println("inner");
		}
	}
}

class Test
{
    public static void main(String args[])
    {
      System.out.println(getValue());
    }

    public static int getValue() {
        try {
            return 5;
        }finally {
            return 1;
        }
    }
}