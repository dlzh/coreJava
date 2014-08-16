public class StringTest{
	public static void main(String [] args){
		StringBuilder sb = new StringBuilder();
		sb.append("hello!");
		String s = "hello!";
		if ( sb.toString() == s){
			System.out.println("== true");
		}else if (sb.toString().equals(s)){
			System.out.println("equals() ");
		}else
			System.out.println("Nothing similar");
		
		StringTest st = new StringTest();
		System.out.println(st.removeChar(s, 'l'));
	}
	
	public String removeChar(String str, char c){
		char [] carr = str.toCharArray();
		System.out.println("Convert char array to string: " + new String(carr));
		StringBuilder sb = new StringBuilder();
		for( char ch : carr ){
			if( ch !=  c)
				sb.append(ch);
		}
		return sb.toString();
	}
}
