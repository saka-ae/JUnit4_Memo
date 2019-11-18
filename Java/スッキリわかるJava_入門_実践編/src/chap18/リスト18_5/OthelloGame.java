package chap18.リスト18_5;

import java.util.Scanner;

import chap18.リスト18_4.OthelloAI;
import chap18.リスト18_4.StrongOthelloAI;
import chap18.リスト18_4.WeakOthelloAI;

public class OthelloGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ゲーム開始");

		OthelloAI ai = null;
		System.out.print("AIレベルを選択(1=弱い, 2=強い, 3=その他: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			ai = new WeakOthelloAI();
			break;
		case 2:
			ai = new StrongOthelloAI();
			break;
		case 3:
			System.out.print("人工知能クラスのFQCNを入力: ");
			String fqcn = sc.next();

			try {
				Class<?> classObj = Class.forName(fqcn);
				ai = (OthelloAI) classObj.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

			break;
		}

		String decide = ai.decide();
		System.out.println(decide);
	}

}
