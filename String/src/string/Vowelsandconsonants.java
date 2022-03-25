package string;

public class Vowelsandconsonants {

	public static void main(String[] args) {
		int vcount=0,ccount=0;
		
		String s="today we will learn about string and array in java";
	
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vcount++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				ccount++;
			}
		}
			
		System.out.println("count of vowels:" +vcount);
		System.out.println("count of consonants: " +ccount);
	}

}
