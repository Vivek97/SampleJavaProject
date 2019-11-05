package core.java.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindException {

	
	ArrayList<String> appExceptionList = new ArrayList<>();
	ArrayList<String> scriptExceptionList = new ArrayList<>();
	
	public FindException() {
		// TODO Auto-generated constructor stub
	
	appExceptionList.add("openqa.selenium.InvalidSessionIdException");	
	appExceptionList.add("openqa.selenium.SessionNotCreatedException");
	appExceptionList.add("openqa.selenium.TimeoutException");
	appExceptionList.add("openqa.selenium.WebDriverException");
	appExceptionList.add("openqa.selenium.NoSuchElementException");
	
	scriptExceptionList.add("openqa.selenium.FileNotFoundException");
	scriptExceptionList.add("ArrayIndexoutOfBoundException");
	scriptExceptionList.add("openqa.selenium.OutOfMemoryError");
	scriptExceptionList.add("openqa.selenium.StaleElementReferenceException");
	scriptExceptionList.add("NullPointerException");
	}
	List<String> exception = null;
	
	
	
	public static void main(String args[])
	{
		
		FindException fe = new FindException();
		
		fe.findExceptionType();
		
	}
	
	public void findExceptionType(){
		
		try {
			boolean expFound=false;
		
			BufferedReader br = new BufferedReader(new FileReader("consoleLog.txt"));
			try {
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();

			    while (line != null) {
			        sb.append(line);
			        sb.append(System.lineSeparator());
			        line = br.readLine();
			     for(String appExp :appExceptionList )
			     {
			        if(line.contains(appExp))
					{
						System.out.println(" App exception ocured -----------------------------"+line.toString());
					}
			        
			    }
			     if(!expFound)
			     {
			    
			    	  for(String scriptExp :scriptExceptionList )
					     {
					        if(line.contains(scriptExp))
							{
								System.out.println(" Script exception ocured >>>>>>>>>>>>>>>>>>>> "+line.toString());
							}
					        
					    }
			    	 
			     }
			     else {
			    	 
			    	 System.out.println(" unknown exception ocured ");
			     }
			     
			     if(line.contains("testStepFail"))
			     {
			    	 System.out.println(" failed logger "+line);
			     } 
			     
			     
			     
			}
			  }finally {
			    br.close();
			}				
				
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
}
