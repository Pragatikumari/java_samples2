package permutation2;

import java.util.Scanner;

public class day101 {
	
	public static void main(String args[])
	{   	char[] s= new char[10];
		String s1=new String();
		
		System.out.println("enter any word");
		Scanner imp = new Scanner(System.in);
		s1=imp.next();
		int c= s1.length(),i=0;
		
		while(i!=c)
		{
		s[i]=s1.charAt(i);
			i++;
		}
		
		int flag =-1;	
	int x=1,y=1;
	int count3=0;
//for(i=1;i<=c;i++)
	 
//	{
		for(int j=c;j>=1;j--)
	{
	y = y * j;
	// y=y+x;
	} 
			int lp=0; int pr;
	
	int k=0;
	int m1=c-2,count=0,m2=c-1;
	  int count2=0;
	while(k!=y)     // for deciding number of words
	{
       count3++;
		System.out.print("k="+k+"and yis ="+y);
		pr=0;
		
	/*	while(count<=lp)
	{

		char tmp=s[m];
		s[m]=s[m+1];
		s[m+1]=tmp;
		count++;
       m--;		
	
	
	}*/
	//brea	
	
   
if((flag==0)||(flag==-1))
{      
     if(count3==1)
     {
 		while((lp+pr)!=(c))  //for deciding where to give new lone
 		{
 		 System.out.print(s[pr]);
 		 pr++;
 			
 	    }
 		System.out.print("\n");
 	k++;
        count2++;
     }
       char temp=s[m1];
        s[m1]=s[m1+1];
        s[m1+1]=temp;
        m1--;
        if(m1<0)
        	m1=c-2;
	     count2++;
	 System.out.println("count="+count2);
	     if(count2==c-1)
	     {	    	 flag=1;
	       
                     count2=0;	     
	     
              }                     
	     }

else 
{
	//int m2=c-1;
   System.out.println("m2="+m2);
	 count2++;
	char temp=s[m2];
	s[m2]=s[m2-1];
	s[m2-1]=temp;
	m2--;
	if(m2==1)
		m2=c-1;
	if(count2==c-1)
	{	flag=0;
	    count2=0;
	}
}
pr=0;
while((lp+pr)!=(c))  //for deciding where to give new lone
{
 System.out.print(s[pr]);
 pr++;
	
}
System.out.print("\n");
k++;
	
	
  
	}
}
}
