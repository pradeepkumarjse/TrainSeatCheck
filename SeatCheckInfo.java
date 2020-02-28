import java.util.Scanner;
class SeatCheckInfo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter birth number:");
		int bn=sc.nextInt();
		int opn=0;
		String bname="";
		int m=bn%12;
		
		if(bn>=1 && bn<=96)
		{
			//Window seat checking logic
		  if(m==1)
		  {
			  bname="Window Seat "; opn=bn+11;
		  }
	      else if(m==0)
		  {
			  bname="Window Seat "; opn=bn-11;
		  }
	      else if(m==6)
		  {
			  bname="Window Seat "; opn=bn+1;
			  
		  }
		  else if(m==7)
		  {
			  bname="Window Seat "; opn=bn-1;
			  
		  }
		  
		  //middle seat checking logic
		  
		  if(m==2)
		  {
			  bname="middle seat "; opn=bn+9;
		  }
		  else if(m==11)
		  {
			  bname="middle seat "; opn=bn-9;
			  
		  }
		  else if(m==5)
		  {
			  bname="middle seat "; opn=bn+3;
		  }
		  else if(m==8)
		  {
			  bname="middle seat "; opn=bn-3;
		  }
		  
		  //Aisle seat
		  if(m==3)
		  {
			  bname="Aisle seat "; opn=bn+7;
		  }
		  else if(m==10)
		  {
			  bname="Aisle seat "; opn=bn-7;
		  }
		  else if(m==4)
		  {
			  bname="Aisle seat "; opn=bn+5;
		  }
		  else if(m==9)
		  {
			  bname="Aisle seat "; opn=bn-5;
			  
		  }
		  
			System.out.println("seat=" + bname + " Opposite Seat Number=: " + opn);
		 
		 
		}
		else
		{
			System.out.println("Invalid birth number ");
		}	
		
	}	
}