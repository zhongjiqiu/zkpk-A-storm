package moni;

import java.util.Random;

/**
 * @author Administrator
 * 随机生成手机号
 */
public class Phone {
	public static String getPhone() {
		String[] number = {"15", "13", "18"};
		Random rand = new Random();
		
		Random r = new Random();
		int temp = r.nextInt(3);
		
		String mobile = number[temp];
		for (int i=0; i<9; i++) {
			int s = rand.nextInt(9);
			mobile += s;
		}
		//System.out.println(mobile);
		return mobile;
	}
}
