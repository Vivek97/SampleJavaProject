package core.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DuplicateCount {

	public static void main(String[] args) {
	
	String input="Hello mister how do yo don";
	
	System.out.println("input  "+input);
	
	findCharCount(input);
	
	findCharCount("Java J2EE Java JSP J2EE");
	 
	findCharCount("All Is Well");

	findCharCount("Done And Gone");
	}
	
	
	
	public static void findCharCount(String input)
	{
		input= input.toLowerCase();
		char [] ch = input.toCharArray();
		
		HashMap<Character, Integer> charCountMap =new HashMap<Character, Integer>();

		for(char c: ch)
		{
			if(charCountMap.containsKey(c))
				charCountMap.put(c, charCountMap.get(c)+1);
			else
				charCountMap.put(c, 1);
		}
		
		System.out.println(charCountMap);
		}
	
}
