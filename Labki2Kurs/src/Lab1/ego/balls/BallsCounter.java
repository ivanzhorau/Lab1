package Lab1.ego.balls;

public class BallsCounter {
	public static int blueCounter(Basket basket) {
		int count = 0;
		Ball[] b = basket.getBalls();
		for(int i =0;i<b.length;i++) {
			if("Blue".equals(b[i].getColor())){
				count++;
			}
		}

		return count;
	}
	public static int weightCounter(Basket basket) {
		int weight = 0;
		Ball[] b = basket.getBalls();
		for(int i =0;i<b.length;i++) {
			weight+=b[i].getWeight();
		}
		return weight;
	}
}
