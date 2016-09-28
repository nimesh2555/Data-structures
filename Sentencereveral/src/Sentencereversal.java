
public class Sentencereversal {

	public static void main(String[] args){
		
		String sentence="hey how are u";
		char[] c=sentence.toCharArray();
		char[] r= new char [sentence.length()+2];
	int p=0,counter =sentence.length()-1;
	int j=0;
		for(int i =c.length-1;i>=0;i--)
		{
			
			if((c[i]==' ')){
			System.out.println(""+i+"    "+counter);
			 for( j=i+1;j<=counter;j++){
				 System.out.println("i="+i+"  j"+j+"   p"+p);
				r[p]=c[j];
			   p++;	
			 }
			 
			 r[p]=' ';
			 p++;
			 counter=i-1;
			 
			}
			
			if((i==0)){
				System.out.println(""+i+"    "+counter);
				 for( j=i;j<=counter;j++){
					 System.out.println("i="+i+"  j"+j+"   p"+p);
					r[p]=c[j];
				   p++;	
				 }
				 counter=i-1;
				}
			
			
		}

		
		for (int i = 0;i<sentence.length();i++)
		{
	System.out.print(""+r[i]);
		}
	
	}

}
