import java.util.*;
class Array{
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
        //for (int i:arr) {
            //if (i%2!=0 && i>0) { 
            //    System.out.print(i+" ");
          //  }
        //}
		//System.out.println();
		//for(int i:arr){
		//	if(i%2==0 && i>0){
		//		System.out.println(i);
		//	}
		//}
		//int sum=0;
		//for(int i:arr){
		//	if(i<=0){
		//		sum+=i;
		//	}
		//}
		//System.out.print(sum);
		int arr1[]=arr; //soft copy or shallow copy
		arr[0]=4;
		for(int i:arr1){
			System.out.print(i+" ");
		}
	}
}