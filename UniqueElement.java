package core;
import java.util.*;
import java.lang.*;
import java.io.*;
public class UniqueElement {
	public static void main (String[] args) {
		//code
		Scanner s =new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int n= s.nextInt();
		    int k = s.nextInt();
		    int a[]= new int[n];
		    for(int i=0;i<n;i++){
		       a[i]=s.nextInt();
		    }
		    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		        for(int i=0;i<n;i++){
		            if(hm.containsKey(a[i]))
		            hm.put(a[i],hm.get(a[i])+1);
		            else
		            hm.put(a[i],1);
		        }
		        for(Map.Entry entry:hm.entrySet()){
		            if((int)entry.getValue()!=k){
		                System.out.println((int)entry.getKey());
		                break;
		            }
		        }
		}
	}
}
