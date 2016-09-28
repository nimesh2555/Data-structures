import java.util.Scanner;

public class Shellsort {
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
		 shellsort(a, l);
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
	
	public static void shellsort(int[] a, int l)
	{
		int increment=l/2;
		while(increment>=1){
			for(int i=0;i<increment;i++){
				insertionsort(a,l,i,increment);
			}
			increment=increment/2;
		}
		
	}
	
	
	
	
	public static void insertionsort(int[] a,int l,int startindex,int increment)
	{
		for (int i=startindex;i<l;i=i+increment)
		{
			Boolean swap=false;
			for (int j=Math.min(l-1, i+increment); j-increment>=0;j=j-increment){
				if(a[j-increment]>a[j]){
					
					swapnos(a, j-increment, j);
					
					swap=true;
				}
				else{
					System.out.println("break ");
					break;
				
				}
				
			}
			

		}
	}
	

}
