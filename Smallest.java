import java.util.*;
class Smallest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.print(min);
	}
}