package moni;

import java.util.Random;

/**
 * @author Administrator
 * 随机生成经纬度
 */
public class ApMac {
	public static String getMac() {
		Random rand1 = new Random();	
		Random rand2 = new Random();	

		String mac = "";
		for (int i=0; i<6; i++) {
			String temp = Integer.toHexString(rand1.nextInt(255));
			mac += temp + "-";
		}

		mac = mac.substring(0, mac.length() - 1);

		int find = rand2.nextInt(3);
		switch (find) {
		case 0: mac += ":CMCC"; break;
		case 1: mac += ":CMCC-EASY"; break;
		case 2: mac += ":7Daysinn"; break;
		}

		//System.out.println(mac);
		return mac;
	}
}

