import java.util.*;
class Main2{
	Main2()
	{
		System.out.println("Default is called");
	}
	Main2(int i){
		System.out.println("Value Entered is "+i);
	}
	public static void m1(){
		System.out.println("This is a method");
	}
	public static void main(String[] args){
		Main2 m=new Main2(2);
		Main2 n=new Main2(3);
		//m.m1();
		n.m1();
		
	}
}