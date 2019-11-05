package core.java.string;

public class SortString {
	
public static void main(String [] u89) {
	
	
	System.out.println("sort string");
	
	String input ="hello bharat";
	
	SortString s =new SortString();
	System.out.println("Real order "+input);
	
/*	input= s.sortInAscendingOrder(input);
	System.out.println("Ascending order "+input);
	
	input= s.sortInDescendingOrder(input);
	System.out.println("Descending order "+input);*/
	
	input= s.sortSubString(input);
	System.out.println("Descending order "+input);
	
	
	s.getClassName();
	
}
	
public void getClassName() {
    String className = this.getClass().getSimpleName(); 
    System.out.println("Name:" + className);
}


public String sortInAscendingOrder(String input)
	{
		char [] chArr = input.toCharArray();
			
			for(int i=0; i<chArr.length ;i++)
			{
				char temp=chArr[i];
				for(int j=i+1;j< chArr.length; j++)
				{					
					if(temp >chArr[j])
					{
						temp=chArr[j];
						chArr[j]=chArr[i];
						chArr[i]=temp;
					}
					
				}
			
			}
			
	 return String.valueOf(chArr);
		
	}
	
public String sortInDescendingOrder(String input)
{
	char [] chArr = input.toCharArray();
		
		for(int i=0; i<chArr.length ;i++)
		{
			char temp=chArr[i];
			for(int j=i+1;j< chArr.length; j++)
			{					
				if(temp <chArr[j])
				{
					temp=chArr[j];
					chArr[j]=chArr[i];
					chArr[i]=temp;
				}
				
			}
		
		}
		
 return String.valueOf(chArr);
	
}


public String sortSubString(String input)
{
	String[] subString = input.split(" ");
	input ="";	
	for(String s:subString)
	{
	char [] chArr = s.toCharArray();
		
		for(int i=0; i<chArr.length ;i++)
		{
			char temp=chArr[i];
			for(int j=i+1;j< chArr.length; j++)
			{					
				if(temp <chArr[j])
				{
					temp=chArr[j];
					chArr[j]=chArr[i];
					chArr[i]=temp;
				}
				
			}
		
		}
	input = input+String.valueOf(chArr)+" ";
	}
	
	
	return input;	
	}


}
