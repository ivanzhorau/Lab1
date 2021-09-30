package Lab1.ego;

public class QuestFive {
	public static void outResult(int len) {
		int[] arr= QuestFour.createArray(len);
		QuestFour.outArray(arr);
		int count = countOther(arr);
		
		System.out.println("Kolkaść elementaŭ na vydaleńnie: "+count);
	}
	public static int countOther(int[] arr) {
		int count=0;
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i+1]<=arr[i]) {
				count++;
				arr = outElement(arr,i);
				i--;
			}
			
		}
		return count;
	}
	private static int[] outElement(int[] arr, int i) {
		for(int j =i;j<arr.length-1;j++) {
			arr[j] = arr[j+1];
		}
		int[]ar =new int[arr.length-1];
		for(int j=0;j<ar.length;j++) {
			ar[j]=arr[j];
		}
		return ar;
	}
}
