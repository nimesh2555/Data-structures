package traingle;


public class triangle {
public int count=1;
public void check(){
	int a[] = { 100, 100, 100, 100, 100,100,100,100,100,100,1,2,100,199,200 };
	int b[] = {  100, 100, 100, 100, 100,1,2,100,199,200 , 100, 100, 100, 100, 100};
	int c[] = { 1, 2, 100, 199, 200,100, 100, 100, 100, 100,100,100,100,100,100, };
for(int i=0;i<15;i++){
    
        checktriangle(a[i],b[i],c[i]);
     
}
}
public void checktriangle(int a,int b, int c){
 int match=0;
 if(a==b || b==c || a==c){
     match=1;
 }
 if(a==c && b==a && c==a){
     match=2;
 }
 if(((a+b)>c)&&((a+c)>b)&&((b+c)>a)){
 if(match==0){
	 System.out.print(count++);
     System.out.print(" ");
         System.out.print(a);
         System.out.print(" ");
         System.out.print(b);
         System.out.print(" ");
         System.out.print(c);
         System.out.print(" ");
         System.out.print("scalen triangle");
         System.out.print(" ");
         System.out.println("");
     
 }
 else
     if(match==1){
    	 System.out.print(count++);
         System.out.print(" ");
         System.out.print(a);
         System.out.print(" ");
         System.out.print(b);
         System.out.print(" ");
         System.out.print(c);
         System.out.print(" ");
         System.out.print("Isoceles Triangle");
         System.out.print(" ");
         System.out.println("");
     }   
else
     if(match==2){
    	 System.out.print(count++);
         System.out.print(" ");
         System.out.print(a);
         System.out.print(" ");
         System.out.print(b);
         System.out.print(" ");
         System.out.print(c);
         System.out.print(" ");
         System.out.print("Equilateral Triangle");
         System.out.print(" ");
         System.out.println("");
     }
 }
     else{
    	 System.out.print(count++);
         System.out.print(" ");
         System.out.print(a);
         System.out.print(" ");
         System.out.print(b);
         System.out.print(" ");
         System.out.print(c);
         System.out.print(" ");
         System.out.print("Not a Triangle");
         System.out.print(" ");
         System.out.println("");   
     }
}


public static void main(String[] args) {
	 System.out.print("Case");
     System.out.print(" ");
    System.out.print("a");
    System.out.print(" ");
    System.out.print("b");
    System.out.print(" ");
    System.out.print("c");
    System.out.println("");
    triangle t=new triangle();
    t.check();
// TODO code application logic here
}
}    
