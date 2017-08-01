package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] reverseStr = new char[str.length()]; 
				
		for (int i = 0; i < reverseStr.length; i++) {
			reverseStr[i] = str.charAt((str.length() - 1) - i);
		}
			
		return reverseStr;
	}

	public static void printCharArray(char[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
