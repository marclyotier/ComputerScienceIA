import java.lang.Math;
import java.io.*;
import java.util.Scanner;

public class Sort {
	static float centery;
	static float centerx;
	int x;
	int y;
	
	public static void sorting() throws Exception {
		Scanner ob = new Scanner(System.in);
		System.out.println("please reenter the file name");
		char[] header = new char[8];
		String filepath = ob.next();
		File file = new File(filepath);
		DataInputStream in = new DataInputStream(new FileInputStream(file));
		
		for (int i = 0; i < header.length; i++)
			header[i] = (char) in.readByte();
			int width =  in.readByte();
			int height =  in.readByte();
			int points;
			double ydif;
			double xdif;



			centerx = height/2;
			centery = width/2;
		}

	public double centerdist(int[][] redblobs, int flag) throws Exception {
		double centerdistance;
		Math.abs(x-centerx);
		Math.abs(y-centery);
			
		redblobs[0][flag]= redblobs[0][flag]*redblobs[0][flag];
		redblobs[1][flag]= redblobs[1][flag]*redblobs[1][flag];

		centerdistance = Math.sqrt(redblobs[1][flag] + redblobs[0][flag]);

		return centerdistance;
	}
}
