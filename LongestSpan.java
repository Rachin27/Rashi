package core;
import java.util.*;
import java.lang.*;
import java.io.*;
public class LongestSpan {
	static int longestSpan(int[] arr1,int[] arr2,int n){
        int sum1=0,sum2=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            sum1=0;
            sum2=0;
            for(int j=i;j<n;j++){
                sum1+=arr1[j];
                sum2+=arr2[j];
                if(sum1==sum2){
                    
                    if((j-i+1)>maxlen){
                        maxlen=j-i+1;
                    }
                }
            }
        }
        return maxlen;
    }
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
	
		for(int j=0;j<t;j++){
		    int n = s.nextInt();
		    int arr1[]=new int[n];
		    int arr2[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr1[i]=s.nextInt();
		    }
		    for(int i=0;i<n;i++)
		     arr2[i]=s.nextInt();
		    System.out.println(longestSpan(arr1,arr2,n));
		}
		
		
	}

}
