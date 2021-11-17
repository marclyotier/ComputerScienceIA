public class Main {
	public static void main(String[] args) throws Exception {
		blobdetection blob = new blobdetection();

		blob.ProcessImage();

 		int xpoint = blob.runningx;
		int ypoint = blob.runningy;
		
		System.out.println(xpoint + ", " + ypoint);
	}
}
