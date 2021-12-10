 
public class Main {
	public static void main(String[] args) throws Exception {
		BlobDetection blob = new BlobDetection();		
		blob.ProcessImage();
		
		int redblobs[][];
		System.out.println(blob.count);
		redblobs = new int [blob.count][2];
		System.out.println("test 2");
		
		for (int i = 1; i < blob.count-1; i++) {
			
			System.out.println("test array count");

			int[] bob = blob.detect();
			if (bob == null) {
				System.err.println("blob.detect() returned null, I cannot continue");
				return;
			}

			redblobs[i][0] = bob[0];
			redblobs[i][1] = bob[1];
			System.out.println(bob[0] + "," +bob[1]);
		

			for(int j = 0; j < blob.count; j++) {
				System.out.println("test array print");
		  		System.out.println(redblobs[j][0]);
		  		System.out.println(redblobs[j][1]);
			}
		}
	}
}