import java.util.*;
class Strings{
	public static void countFreq(char ch[],int n){
		boolean visited[]=new boolean[n];
		Arrays.fill(visited,false);
		for(int i=0;i<n;i++){
			if(visited[i]==true){
				continue;
			}
			int count=1;
			for(int j=i+1;j<n;j++){
				if(ch[i]==ch[j]){
					visited[j]=true;
					count++;
				}
			}
			System.out.println(ch[i]+" "+count);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		countFreq(ch,ch.length);
	}
}
