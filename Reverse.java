import java.util.*;
class Reverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rstr="";
		char ch;
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		System.out.println(rstr);
	}
}