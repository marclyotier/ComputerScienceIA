/*
import java.lang.Math;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class BlobDetection {
	public int count = 0;
	public int x = 0;
	public int xup = 0;
	public int xdown = 0;
	public int xleft = 0;
	public int xright = 0;
	public int yup = 0;
	public int ydown = 0;
	public int yleft = 0;
	public int yright = 0;

	public int width;
	public int height;
	public int y = 0;
	public int runningy = 0;
	public int runningx = 0;
	public char[][] colours;


	public int ProcessImage() throws Exception {
		Scanner ob = new Scanner(System.in);
		System.out.println("please enter the file name");
		String filepath = ob.next();
		File file = new File(filepath);
		DataInputStream in = new DataInputStream(new FileInputStream(file));
		char strongcolor;
		int	largestvalue;
		int R= 0;
		int l=1;
		int j=1;
		int G=0;
		int B=0;
		int xchord = 0;
		int ychord = 0;

		 
		char[] header = new char[8];
		
		for (int i = 0; i < header.length; i++)
			header[i] = (char) in.readByte();
		
		System.out.println(header);
		int width = in.readInt();
		int height = in.readInt();
		ArrayList<Integer> pixelsx = new ArrayList<Integer>();
		ArrayList<Integer> pixelsy = new ArrayList<Integer>();
		colours = new char[width][height];  

		//colours[0][0] = Colour.RED;

		while(in.available() > 0) {

			in.readUnsignedByte();
			R=(in.readUnsignedByte());
			System.out.print("R "+ R);
			in.readUnsignedByte();
			G=(in.readUnsignedByte());
			System.out.print(" G "+ G);
			in.readUnsignedByte();
			B=(in.readUnsignedByte());
			System.out.println(" B "+ B);

			in.readUnsignedByte();
			in.readUnsignedByte();


			largestvalue=Math.max(R,G);
			largestvalue=Math.max(largestvalue,B);
			System.out.println(largestvalue);

			if(largestvalue==R) {

				strongcolor = 'R';
			}
			else if(largestvalue==B) {
				strongcolor = 'B';
			}
			else {
				strongcolor = 'G';
			}
			
			System.out.println(strongcolor);

			colours[l-1][j-1] = strongcolor;
			
			System.out.println(l);
 			System.out.println(j);
	 	
			if(l==width-1) {
				if(j==height-1) {
					break;
				}
			}
	 		if(l<(width)) {
	 			l++;
	 		}
	 		
			if(l==width) {
				j++;
				l=1;
			}

			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
			
					if (colours[x][y] == 'R') {
						count++;
					}
				}
			}
		}
		return count;
	}

	public int[] detect() throws Exception {
		System.out.println("test");

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				
				if (colours[x][y] == 'R') {
					
					colours[x][y] = 'O';
					runningx += x;
					runningy += y;
					y = height;
					x = height;	
					
					return new int[]{x, y};
				}
			}
		}

		return null;
	}

	public void touches(int s) {

		boolean touches = false;

		if(colours [x][1+y] == 'R') {
			colours[x][y+1] = 'O';

			runningx = runningx + x; 
			runningy = runningy + y-1; 
			count++;
		}

		if(colours [x+1][y] == 'R') {
			colours[x+1][y] = 'O';

			runningx = runningx + x+1; 
			runningy = runningy + y; 
			count++;	
		}
	}

}
*/
