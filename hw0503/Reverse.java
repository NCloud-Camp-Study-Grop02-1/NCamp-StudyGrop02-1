package homework.hw0503;

public class Reverse {
	public String reverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {            
			str = str + str.charAt(i);        
		 }
		return str;
	}

}
