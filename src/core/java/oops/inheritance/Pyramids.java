package core.java.oops.inheritance;

public class Pyramids {

	public static void main(String[] args) {
		
		System.out.println("1. Half Pyramid ");
		for(int i= 0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j<=i)
				{
					System.out.print("*");
		
				}
			}
			System.out.println("");
		}

		///////////////////////////////////////////
		
		System.out.println("2. Half Pyramid ");
		for(int i= 0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j>=i)
				{
					System.out.print("*");
		
				}
			}
			System.out.println("");
		}
		
	///////////////////////////////////////////
		int rows= 5;
		  System.out.println("\n2. Full Pyramid\n");
	        for (int i = 0; i < rows; i++) {

	            for (int j = 0; j < rows - i; j++) {
	                System.out.print(" ");
	            }

	            for (int k = 0; k <= i; k++) {
	                System.out.print("* ");
	            }

	            System.out.println("");
	        }
		
		
}

}
