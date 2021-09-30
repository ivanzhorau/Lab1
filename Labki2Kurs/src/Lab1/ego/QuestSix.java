package Lab1.ego;

public class QuestSix {
	public static int[][] outResult(int len) {
			int[] array = QuestFour.createArray(len);
			int[][] dArray = setDoubleArray(array);
			return dArray;
	}

	private static int[][] setDoubleArray(int[] array) {
		int[][] dArr = new int[array.length][array.length];
		for(int i = 0; i<array.length;i++) {
			for(int j =0; j<array.length;j++) {
				int jj = (j+i)<array.length?(j+i):(j+i)%array.length;	
				dArr[i][j] = array[jj];
			}
		}
		return dArr;
	} 
}
