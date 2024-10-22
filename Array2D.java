import java.util.*;
class Array2D{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) {
                    System.out.print("- - -");
                }
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
