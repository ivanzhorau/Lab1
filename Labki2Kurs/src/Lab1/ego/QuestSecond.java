package Lab1.ego;

public class QuestSecond {
	private static boolean upRect(int x,int y) {
		return x>=-4 && x<=4 && y<=5 && y>=0;
	}
	private static boolean downRect(int x,int y) {
		return x>=-6 && x<=6 && y<=0 && y>=-3;		
	}
	public static boolean getResValue(int x, int y) {
		boolean res = upRect(x,y)||downRect(x,y);
		return res;
	} 
}
