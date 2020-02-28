import java.util.Scanner;
class SeatChechInfo1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your birth number to know birth Name:");
		int bn=sc.nextInt();
		String bname="";
		int m=bn%8;
		if(bn>=1 && bn<=72)
		{
			if(m==1 || m==4)
			{
				bname="Lower birth";
			}
			else if(m==2 || m==5)
			{
				bname="Middle birth";
			}
			else if(m==3 || m==6)
			{
				bname="upper birth";
			}
			else if(m==0)
			{
				bname="Side upper birth";
			}
			else if(m==7) 
			{
				bname="Side lower birth";
			}
				
				
			System.out.println(bname);
			
		}
		else
		{
			System.out.println("Invalid birth number...");
		}
		
	}
}