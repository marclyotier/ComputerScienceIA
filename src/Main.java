import java.util.Scanner;

public class Main {

	static Sort sorting = new Sort();
	static int unit = -1;
	static int pointer;
	static double highestscore = 0;
	
	public static void main(String[] args) throws Exception {
		Scanner ob = new Scanner(System.in);
		System.out.println("would you like to enable automatic data entery (y/n) ");
		String mode = ob.next();
		boolean flag = true;
		String entering = "y";

			
		blobdetection blob = new blobdetection();	
		
		blob.ProcessImage();
		
		int redblobs[][];
		System.out.println(blob.count);
		redblobs = new int [blob.count][2];
		//System.out.println("test 2");
		
		if(mode == "y") {
			
			for (int i = 1; i < blob.count-1; i++) {
			
			//	System.out.println("test array count");

				int[] bob = blob.detect();
				if (bob == null) {
					System.err.println("blob.detect() returned null, I cannot continue");
				
				}
				
				if (bob != null) {

					redblobs[i][0] = bob[0];
					redblobs[i][1] = bob[1];
					System.out.println(bob[0] + "," +bob[1]);
				}

				for(int j = 0; j < blob.count; j++) {
					//		System.out.println("test array print");
					//ystem.out.println(redblobs[j][0] + "," + redblobs[j][1]);
				
				}
			}
		} else {
			while(flag = true)  {
			 
				System.out.println("would you like to enter a new point(y/n)");
				entering = ob.next();
				
				if(entering.equals("y")) {
					
					unit++;
					
					System.out.println("enter the x location of the unit");
					redblobs[unit][0] = Integer.parseInt(ob.next());
					System.out.println("enter the y location of the unit");
					redblobs[unit][1] = Integer.parseInt(ob.next());
				}
				else if(entering.equals("n")) {
					break;
				}
				else {
					System.out.println("invalid response please enter y or n ");
				}
			
			}
			
		}
     score(redblobs);
		for (int i = 0; i < unit; i++) {
			int[][] highscore = new int[unit][2];
		}
	}

	
	public static void score(int[][] redblobs) throws Exception {
		Scanner ob = new Scanner(System.in);
		double score = 0;
		sorting.centerdist(redblobs, 0);
		double distance = sorting.centerdist(redblobs, 0);
		int j=0;
		for(int i = 0; i<= unit; i++) {
		
			String entering;
			score = score + 10/distance;
			System.out.println("is this unit  a specalist y/n");
			entering = ob.next();
			
			if(entering.equals("y")) {
				score=score+ 15;
			}
			
			System.out.println("is this unit  a injured  y/n");
			entering = ob.next();
			if(entering.equals("y")) {
				score=score+ 15;
			}
			if(highestscore < score) { 
				highestscore = score; 
				pointer = i;
			}
			System.out.println("unit" + i + "has a score of" + score);
		}

	}
}

