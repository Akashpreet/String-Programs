import java.util.*;
class Scope{
	static int i=1;
	public static void m1(){
		int j=2;
		System.out.print("j");
	}
	public static void main(String[] agrs){
		Scope s=new Scope();
		
		System.out.println(s.m1());
		//System.out.println(j);
	}
}