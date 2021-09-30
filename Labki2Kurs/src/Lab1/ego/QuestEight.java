package Lab1.ego;
/*
 * mahčyma ja nia tak zrazumieŭ zadańnie, tamu budu rabić jaho tak jak zrazumieŭ
 * ale adrazu treba apisać jak ja jaho zrazumieŭ
 * A = {1,1,3,8,5,5};
 * B = {2,4,6};
 * Vyvad: 1,3,5 (pry adliku ad nula)
 * Što-ž, i jak heta rabić...
 * (13.09.21)
 * A usio zrabiŭ)
 * (taksama 13.09.21, ale praz 20 chvilin)
 * */
public class QuestEight {
	public static int[] inputArray(int len) {
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = Main.getInt();
		}
		return arr;
	}
	public static void outResult(int[] a, int[] b) {
		int j=0;
		for(int i = 1; i<a.length;i++) {
			if(a[i]<=a[i-1]) {
				System.out.print(i+" ");
				a[i] = b[j];
				j++;
			}
			
		}
		
	}

}
