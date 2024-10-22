import java.util.*;
class Shift{
	public static String func(String str){
		StringBuilder sb=new StringBuilder();
		for(char ch:str.toCharArray()){
			if(ch=='z'){
				sb.append('a');
			}
			else if(ch=='Z'){
				sb.append('A');
			}
			else{
				sb.append((char)(ch+1));
			}
		}
		return sb.toString();
	}
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String shifted=func(str);
		System.out.println(shifted);
	}
}