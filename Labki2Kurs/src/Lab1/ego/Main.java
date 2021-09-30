package Lab1.ego;

import java.util.Scanner;
import Lab1.ego.balls.*;
public class Main {

	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Uviadzicie numar zadańnia:\n");
		int quest = getInt();
		if(quest==1) {questOne();}
		if(quest==2) {questSecond();}
		if(quest==3) {questThree();}
		if(quest==4) {questFour();}
		if(quest==5) {questFive();};
		if(quest==6) {questSix();}
		if(quest==7) {questSeven();}
		if(quest==8) {questEight();}
		if(quest==9) {questNine();}
	}

	public static String getLine() {
		return scanner.nextLine();
	}
	public static int getInt() {
		int i = Integer.parseInt(scanner.nextLine());
		return i;
	}
	public static double getDouble() {
		double i = Double.parseDouble(scanner.nextLine());
		return i;
	}
	public static void questOne() {
		System.out.print("Uvod X:\n");
		double x = getDouble();
		System.out.print("Uvod Y:\n");
		double y = getDouble();
		double res = QuestOne.getResValue(x, y);
		System.out.print("Vynik dziejańnia:\n");
		System.out.println(res);
	}
	public static void questSecond() {
		System.out.print("Uvod X:\n");
		int x = getInt();
		System.out.print("Uvod Y:\n");
		int y = getInt();
		boolean res = QuestSecond.getResValue(x, y);
		System.out.print("Vynik dziejańnia:\n");
		System.out.println(res);
	}
	public static void questThree() {
		System.out.print("Uvod A:\n");
		double a = getDouble();
		System.out.print("Uvod B:\n");
		double b = getDouble();
		System.out.print("Uvod H:\n");
		double h = getDouble();
		QuestThree.outTable(a, b, h);
	}
	private static void questFour() {
		System.out.print("Uvod kolkaści elementaŭ masiva:\n");
		int len = getInt();
		QuestFour.outResult(len);
		
	}
	private static void questFive() {
		System.out.print("Uvod kolkaści elementaŭ masiva:\n");
		int len = getInt();
		QuestFive.outResult(len);
	}
	private static void questSix() {
		System.out.print("Uvod kolkaści elementaŭ masiva:\n");
		int len = getInt();
		int[][] array = QuestSix.outResult(len);
		for(int i = 0; i<len;i++) {
			for(int j =0; j<len;j++) {
					System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	
	}
	private static void questSeven() {
		System.out.print("Uvod kolkaści elementaŭ masiva:\n");
		int len = getInt();
		QuestSeven.outResult(len);
		
		
	}
	private static void questEight() {//ci varta tut zrabić pravierku na durnia?
		System.out.println("Uviadzicie pamier masiva A:");
		int n= getInt();
		System.out.println("Uviadzicie masiŭ A:");
		int[] a = QuestEight.inputArray(n);
		System.out.println("Uviadzicie pamier masiva B:");
		int m = getInt();
		System.out.println("Uviadzicie masiŭ B:");
		int[] b = QuestEight.inputArray(m);
		QuestEight.outResult(a, b);
	}
	private static void questNine() {
		System.out.println("Uviadzicie pamier karziny:");
		int n= getInt();
		Ball[] balls = new Ball[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Uviadzicie koler:");
			String color = getLine();
			System.out.println("Uviadzicie vahu:");
			int weight = getInt();
			balls[i] = new Ball(color,weight);
		}
		Basket basket = new Basket(balls);
		System.out.println("Sumarnaja vaha:");
		System.out.println(BallsCounter.weightCounter(basket));

		System.out.println("Kolkaść sinich miačykaŭ:");
		System.out.println(BallsCounter.blueCounter(basket));
	}
}
