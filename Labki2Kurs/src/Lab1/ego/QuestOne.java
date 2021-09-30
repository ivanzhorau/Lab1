package Lab1.ego;

public class QuestOne {
	private static double sinS(double x) {
		return Math.sin(x)*Math.sin(x);
	}
	private static double sqr(double x) {
		return x*x;
	}
	public static double getResValue(double x, double y) {
			double res = 1+sinS(x+y)/(2+Math.abs(x-(2*x)/(1+sqr(x*y))))+x;
			return res;
		
	} 
}
