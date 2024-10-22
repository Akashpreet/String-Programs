import java.util.*;
class Substring{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();
		//if(str.contains(str2)){
		//	System.out.print("Substring is present");
		//}
		//else{
		//	System.out.print("Substring is not present");
		//}
		boolean isSubstr=false;
		for(int i=0;i<=str.length()-str2.length();i++){
			int j;
			for(j=i+1;j<str2.length();j++){
				if(str.charAt(i+j)!=str2.charAt(j)){
					break;
				}
			}
			if(j==str2.length()){
				isSubstr=true;
				break;
			}
		}
		if(isSubstr){
			System.out.print("Substring is present");
		}
		else{
			System.out.print("Substring is not present");
		}
	}
}