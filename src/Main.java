
public class Main {
	public static void main(String[] args) throws Exception {
		blobdetection blob = new blobdetection();
  
		blob.ProcessImage();
//	    blob.ProcessImageblue();
 		int xpoint = blob.x;
		int ypoint = blob.y;
		 int redblobs[][];
		 System.out.println(blob.count);
		redblobs = new int [blob.count][2];
		for(int i = 1; i > blob.count; i++) {
		blob.detect();
		redblobs [i][0] = blob.x;
		redblobs [i][1] = blob.y;
		System.out.println(blob.x + "," + blob.y);
		
		}
//		blueblobs = new int [blob.count][2];
//		System.out.println(xpoint + ", " + ypoint);
	}

	
}
