package moni;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * @author Administrator
 * 从文件中随机读取网址极其分类
 */
public class Com {
	private static BufferedReader br;

	public static String getCom() {
		Random rand = new Random();
		int temp = rand.nextInt(8);
		String str = new String();

		try {
			br = new BufferedReader(new FileReader("D://1.txt"));
			for (int i=0; i<=temp; i++) {
				str = br.readLine();
			}
			//System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
}
