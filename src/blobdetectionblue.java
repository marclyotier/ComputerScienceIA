import java.lang.Math;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class blobdetectionblue {
	public static int count = 0;
	public static int x2 = 0;
	public static int xup = 0;
	public static int xdown = 0;
	public static int xleft = 0;
	public static int xright = 0;
	public static int yup = 0;
	public static int ydown = 0;
	public static int yleft = 0;
	public static int yright = 0;

	public static int width;
	public static int height;
	public static int y2 = 0;
	public static int runningy2 = 0;
	public static int runningx2 = 0;
	public static char[][] colours;


	public void ProcessImageblue() throws Exception {
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
		int count = 0;
		 
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
		}

		in.close();
}
	public int detectblue() throws Exception {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				
				if (colours[x][y] == 'R') {
					count++;
					colours[x][y] = 'O';
					runningx2 += x;
					runningy2 += y;	
					y = height;
					x = width; 
					
				}
				}

			}
					return x2 & y2 & count;
		}
		//	runningx2 = 	runningx2 / count;
		//			runningy2 =	runningy2 / count;
				
					


		// this doesn't work, see above
		/*	
		while(true){
			if(x == width-1 && y == height-1) { 
				break;
			}
			
			if(colours[x][y] == 'R') {
				// list contains blacklist
				colours[x][y] = 'O';
				runningx = runningx + x;
				runningy = runningy + y;
			
				if(x == width-1) { 
					if( y==height-1) { 
						break;
					} 
					y++; 
					x=0;
				} else {
					x++;
				}
			}
		}
		*/

	
	 	


	public static void touches(int s) {

		boolean touches = false;
		//	if(colours[x-1][y] == 'R') {
		//colours[x-1][y] = 'O';
		//	runningx = runningx + x-1;
		//	runningy = runningy + y;  
		//		count++;

			//}
		if(colours [x2][1+y2] == 'R') {
			colours[x2][y2+1] = 'O';

			runningx2 = runningx2 + x2; 
			runningy2 = runningy2 + y2-1; 
			count++;
		}

		if(colours [x2+1][y2] == 'R') {
			colours[x2+1][y2] = 'O';

			runningx2 = runningx2 + x2+1; 
			runningy2 = runningy2 + y2; 
			count++;	
		}
	}
}
	
			
		
//
//			if(colours[x][y+1] == 'R') {
//colours[x][y+1] = 'o';
			
//		runningx = runningx + x; 
//				runningy = runningy + y; 
//	count++;

//			}
 

			// take avrage location

			
	 		/*ublic static boolean contains(final int[] array) {
			 int v= 0
				boolean results = false; 
				for(int i = 0; i < width; i++) {
			
					if(i==v) {
			results = true;
			break;
						
					}
					
				}
		}
	 	*/
	 //	return results;



