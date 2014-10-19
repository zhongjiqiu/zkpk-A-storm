package moni;

import java.util.Random;

/**
 * @author Administrator
 * 随机生成时间戳
 */
public class Stamp {
	public static String getStamp() {
		String stamp = "141327";
		Random rand = new Random();
		for (int i=0; i<4; i++) {
			int s = rand.nextInt(9);
			stamp += s;
		}
		//System.out.println(stamp);
		return stamp;
	}
}
