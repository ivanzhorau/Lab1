package Lab1.ego;

import java.util.Random;

public class QuestFour {
	public static void outResult(int len) {
		int[] array = createArray(len);
		outArray(array);
		int count = checkOutSimpleVal(array);
		System.out.println(count);
	}

	private static int checkOutSimpleVal(int[] array) {
		int count = 0;
		for(int i=0;i<array.length;i++) {
			if(isSimple(array[i])) {
				System.out.print(array[i]+" ");
				count++;
			}
		}
		System.out.println();
		return count;
	}

	private static boolean isSimple(int val) {
		for(int i=2; i<=val/2;i++) {
			if(val%i==0) return false;
		}
		return true;
	}

	public static void outArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public static int[] createArray(int len) {
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = new Random().nextInt(100000);
		}
		return arr;
	} 
}
