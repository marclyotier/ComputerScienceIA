 
public class Main {
	public static void main(String[] args) throws Exception {
		blobdetection blob = new blobdetection();
 int[][] blobs; {
		blob.ProcessImage();
//	    blob.ProcessImageblue();
 		//int xpoint = blob.x;
		//int ypoint = blob.y;
		 int redblobs[][];
		 System.out.println(blob.count);
		redblobs = new int [blob.count][2];
		System.out.println("test 2");
		for(int i = 1; i < blob.count-1; i++) {
			System.out.println("test array count");
		int[] bob = blob.detect();
		redblobs [i][0] = bob[0];
		redblobs [i][1] = bob[1];
		System.out.println(bob[0] + "," +bob[1]);
		

		  for(i = 0; i < blob.count; i++); {
		  	System.out.println("test array print");
		  	System.out.println(redblobs[i][0]);
		  	System.out.println(redblobs[i][1]);
		  }
		  }
		}
//		blueblobs = new int [blob.count][2];
//		System.out.println(xpoint + ", " + ypoint);
	}
	}

	

