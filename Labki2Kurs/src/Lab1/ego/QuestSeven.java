package Lab1.ego;

import java.util.Random;

public class QuestSeven {
	public static void outResult(int len) {
		double[] arr = createRealArray(len);
		System.out.println("Pieršapačatkovy masiŭ:");
		outArray(arr);
		shellSort(len,arr);
		System.out.println("Adsartavany masiŭ:");
		outArray(arr);
		
	}
	private static void outArray(double[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	public static double[] createRealArray(int len) {
		double[] arr = new double[len];
		for(int i=0;i<len;i++) {
			arr[i] = new Random().nextDouble()*100;
		}
		return arr;
	}
	public static void shellSort(int len, double[] array) {
		int i,j,step;
		double tmp;
		for(step = len/2;step>0;step /= 2) {
			for(i = step;i<len;i++) {
				tmp =  array[i];
				for(j=i;j>=step;j-=step) {
					if(tmp<array[j-step]) {
						array[j]= array[j-step];
					}else{
						break;
					}
					
				}
				array[j] = tmp;
			}
		}
	}
}
