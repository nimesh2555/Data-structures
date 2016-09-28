package bubblesort;

import java.util.Scanner;

public class Bubblesort {

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
		 bubblesort(a, l);
		 printarray(a,l);
		 
		 
	}

	public static void printarray(int[] a,int l){
		System.out.println("Elements ");
		 for (int i=0; i<l;i++){
			 System.out.println(""+a[i]); 
		 }
	}
	
	public static void swapnos(int[] a,int i,int j){
		
		System.out.println("Swap ");
		int m;
		m=a[i];
		a[i]=a[j];
		a[j]=m;
		
		
	}
	
	public static void bubblesort(int[] a,int l)
	{
		for (int i=0;i<l-1;i++)
		{
			Boolean swap=false;
			for (int j=0; j<l-i-1;j++){
				if(a[j+1]<a[j]){
					System.out.println("Swap "+a[j]+"  "+a[j+1]);
					swapnos(a, j+1, j);
					System.out.println("Swap "+a[j]+" "+a[j+1]);
					swap=true;
				}
				
			}
			if(!swap)
			{
				System.out.println("break ");
				break;
			}

		}
	}
	

	
	
}
