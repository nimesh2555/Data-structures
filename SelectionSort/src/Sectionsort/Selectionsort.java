package Sectionsort;

import java.util.Scanner;

public class Selectionsort {
	
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter length");
		 int l = sc.nextInt();
		 System.out.println("Enter Elements");
		 
		 
		 int[] a=new int[10];
		 for(int i=0;i<l;i++)
		 {
			 int v = sc.nextInt();
			 a[i]=v;
		 }
		 
		 printarray(a,l);
		 selectionsort(a, l);
		 printarray(a,l);
		 
		 
	}

	public static void printarray(int[] s,int l){
		System.out.println("Elements ");
		 for (int i=0; i<l;i++){
			 System.out.println(""+s[i]); 
		 }
	}
	
	public static void swapnos(int[] s,int i,int j){
		System.out.println("Swap ");
		int m;
		m=s[i];
		s[i]=s[j];
		s[j]=m;
		
		
	}
	
	public static void selectionsort(int[] a,int l)
	{
		for (int i=0;i<l;i++)
		{
			for (int j=i+1; j<l;j++){
				if(a[j]<a[i]){
					swapnos(a, i, j);
				}
			}
		}
	}
	
}
