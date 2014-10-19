package moni;

import java.util.Random;

/**
 * @author Administrator
 * 随机生成IP地址
 */
public class IP {
	
	public static String getIp() {
		Random rand = new Random();
		int ip[] = new int[4];
		for (int i=0; i<4; i++) {
			ip[i] = rand.nextInt(255);
		}
		if (ip[0]==0 || ip[0]==255 || ip[1]==0 || ip[2]==0 || ip[3]==0 
				|| ip[1]==255 || ip[2]==255 || ip[3]==255 ) {
			ip = get();
		}
		return ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
	}
	
	public static int[] get() {
		Random rand = new Random();
		int ip[] = new int[4];
		for (int i=0; i<4; i++) {
			ip[i] = rand.nextInt(255);
		}
		return ip;
	}
}
