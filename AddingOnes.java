package core;
import java.io.*;
import java.util.*;
import java.lang.*;
public class AddingOnes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n =s.nextInt();
		    int k=s.nextInt();
		    int a[]=new int[n+1];
		    for(int i =0;i<k;i++){
		        int p=s.nextInt();
		        a[p]++;
		    }
		    for(int i=1;i<=n;i++){
		        a[i]+=a[i-1];
		        
		    }
		    for(int i=1;i<=n;i++){
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}
	}

}
