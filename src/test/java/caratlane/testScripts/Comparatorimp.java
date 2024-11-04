package caratlane.testScripts;

import java.util.Comparator;

public class Comparatorimp implements Comparator{

	

	@Override
	public int compare(Object o1, Object o2) {
		String str1=(String)o1;
		String str2=(String)o2;
		if(str1.length()>str2.length())
			return -1;
		else if(str1.length()<str2.length())
			return +1;
		else
			return 0;
		
	}

}
