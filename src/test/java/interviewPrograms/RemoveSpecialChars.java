package interviewPrograms;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hell@o$w w%or&ld";
		
		//ASCI value a-z 97-122 A-Z 65-90
		
		char[] chr=str.toCharArray();
		String temp="";
		for(char c:chr) {
			int m=c;
			if((m>=97 && m<=122) || (m>=65 && m<=90)){
				char c1=(char)m;
				temp=temp+c1;
				
			}
		}
		System.out.println(temp);
			

	}

}
