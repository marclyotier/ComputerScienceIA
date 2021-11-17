import java.lang.Math;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class blobdetection {
	public static int count = 0;
	public static int x = 0;
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
	public static int y = 0;
	public static int runningy = 0;
	public static int runningx = 0;
	public static char[][] colours;


	public static int ProcessImage(String filepath) throws Exception { 
		String photo;
		Scanner ob = new Scanner(System.in);
		System.out.println("please enter the file name");
		filepath=ob.next();
		File file = new File("photo.ff");
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
		int xcount = 0;
		int ycount = 0; 
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
					y++; x=0;
				} else {
					x++;
				}
			}
		}
		return runningx & runningy;
	} 
	 	

	public static void touches(int s) {

		boolean touches = false;
		//	if(colours[x-1][y] == 'R') {
		//colours[x-1][y] = 'O';
		//	runningx = runningx + x-1;
		//	runningy = runningy + y;  
		//		count++;

			//}
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



