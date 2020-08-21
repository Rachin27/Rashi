package core;
import java.util.*;
public class Cipher {
		public static StringBuffer encrypt(String text, int s) 
		{ 
			StringBuffer result= new StringBuffer(); 

			for (int i=0; i<text.length(); i++) 
			{
				if (Character.isUpperCase(text.charAt(i))) 
				{ 
					char ch = (char)(((int)text.charAt(i) + 
									s - 65) % 26 + 65); 
					result.append(ch); 
				} 
				else
				{ 
					char ch = (char)(((int)text.charAt(i) + 
									s - 97) % 26 + 97); 
					result.append(ch); 
				} 
			} 
			return result; 
		} 
		public static void main(String[] args) 
		{ 
			Scanner s = new Scanner (System.in);
			String text=s.nextLine();
			int key=s.nextInt();
			s.close();
			//Cipher c=new Cipher();
			Cipher.encrypt(text, key);
			System.out.println("Encrypted Text: " + encrypt(text, key)); 
		} 
	} 



