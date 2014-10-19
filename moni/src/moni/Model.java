package moni;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * @author Administrator
 * 调用所有的类方法
 */
public class Model {

	public static void main(String args[]) {
		Random rand = new Random();
		FileOutputStream out = null;


		try {
			out = new FileOutputStream("D:\\m.txt");
			for (int i=0; i<1000; i++) {
				String end = Stamp.getStamp() + "\t" + Phone.getPhone() + "\t" + ApMac.getMac() + "\t" + IP.getIp() + "\t" + Com.getCom() + "\t"
						+ rand.nextInt(20) + "\t" + rand.nextInt(20) + "\t" + rand.nextInt(9999) + "\t" + rand.nextInt(9999) + "\t" + 200 + "\n";
				out.write(end.getBytes());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		//System.out.println(end);
	}
}

