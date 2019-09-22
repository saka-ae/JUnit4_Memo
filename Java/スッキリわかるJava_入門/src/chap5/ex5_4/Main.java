package chap5.ex5_4;

import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		double bottom	= 10.0;
		double height	= 5.0;

		double triangleArea = calcTriangleArea(bottom, height);
		System.out.format("底辺%f 高さ%fの三角形の面積: %f\n", bottom, height, triangleArea);

		
		double radius = 5.0;
		
		double circleArea = calcCircleArea(radius);
		System.out.format("半径%fの円の面積: %f\n", radius, circleArea);
	}


	private static double calcTriangleArea(double bottom_cm, double height_cm) {
		return bottom_cm * height_cm / 2;
	}

	private static double calcCircleArea(double radius_cm) {
		return PI * pow(radius_cm, 2);
	}

}
