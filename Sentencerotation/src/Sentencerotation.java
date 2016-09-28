
public class Sentencerotation {
	public static void main(String[] args){
		
		String s1= "waterbottle";
		String s2= "bottlewater";
		int flag=0;
		s1=s1.concat(s1);
		System.out.println("string  "+s1.contains(s2));
		for (int p=0;p<s1.length();p++){
		System.out.println("substring  "+s1.substring(p, s1.length()));
		System.out.println("substring  "+s2.substring(p, s2.length()));
		}
		
		
		System.out.println("length"+s1.length());
		StringBuffer m1 =new StringBuffer(s1);
		StringBuffer m2 =new StringBuffer(s2);
		int j=0;
		for (int i=0; i<s1.length();i++)
		{
			System.out.println("i "+i+" j"+j);
			if(m1.charAt(i)==m2.charAt(j))
			{
				System.out.println("i "+i+" j "+j);
				System.out.println(m2.charAt(j));
				j++;
				flag=1;
			}
			else{
			j=0;
			}
		}
		int cc=s1.length()-j;
		System.out.println("c"+cc);
		if(flag==1){
			for (int i=0; i<cc;i++)
			{
				System.out.println("i "+i+" j"+j);
				if(m1.charAt(i)==m2.charAt(j))
				{
					System.out.println("i "+i+" k "+j);
					System.out.println(m2.charAt(j));
					j++;
					flag=1;
				}
				else{
					flag=0;
				j=0;
				}
			}
		}
		
		if(j==11){
			System.out.println("roation");
		}
		
       
	}

}
