
import java.util.Scanner;
import java.lang.Character;

// Example:madam racecar apple kayak song noon
public class Palindrome {
	
	public static void main(String[] args) 
	{
		
			// hardcoding using scanner
			Scanner scanner = new Scanner(System.in);
			//scanner.useDelimiter("\n"); // use LF as the delimiter

			String[] str_mas;
			String str = scanner.nextLine();
			if ((str.charAt(0) == '"')&&(str.charAt(str.length()-1) == '"'))
			{
				str_mas = str.split("\n");
			}
			else
			{
				str_mas = str.split(" ");
					
			}
			
			scanner.close();		
			
			
			// Как в ЛР
			for(int i=0; i<str_mas.length; i++)//numb ==args.length
			{
					System.out.println(str_mas[i]+" является палиндромом? "+isPalindrome(str_mas[i]));
				
			}
			
			
	}
	
	public static String reverseString(String s)
	{
		String s_new = "";
		int pos = s.length() - 1;//Начальное значение всегда на один элемент меньше
		
		while(pos > -1)
		{
			s_new += s.charAt(pos);
			pos--;
		}
		return s_new;
	}
	
	public static boolean isPalindrome(String s) 
	{
		return (reverseString(filteredString(s)).equalsIgnoreCase(filteredString(s)))?true:false;//Игнорируем регистр
		
	}	
	
	public static String filteredString(String s)
	{
		String newStr = "";
		for(int i=0; i<s.length();i++)
		{
			if(Character.isLetterOrDigit(s.charAt(i))) newStr+=s.charAt(i);
			
		}

		return newStr;
	}
	
}
