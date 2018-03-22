//package loans;
package BasicOP ;

import java.util.Scanner;
interface mainloan
{
	abstract void check();
	abstract double calculate(int x,double y,int z);
	long get();
}
public class loan_op implements mainloan
{
	Scanner in= new Scanner(System.in);
	public void check()
	{
		System.out.println("Enter your base salary");
		long bs=in.nextLong();
	}
	public double calculate(int a,double b,int c)
	{
		double cal=(a*b*c)/100;
		cal=a+cal;
		return cal;
	}
	public long get()
	{
		System.out.println("Enter the amount of loan you want");
		long am=in.nextLong();
		return am;	
	}
}

/**
 *
 * @author manas
 */



//

//public class loanmain extends loan_op{
//}
//	public static void main(String args[])
//	{
//		Scanner in= new Scanner(System.in);
//		System.out.println("Welcome to the Loan Section");
//		System.out.println("Which bank loan would you like to have:");
//		System.out.println("1.CBI\n2.ISISI\n3.KANARA");
//		System.out.println("Enter your choice");
//		int c=in.nextInt();
//		//loan_op ob1=new loan_op();
//		switch(c)
//		{
//			case 1: //long a=ob1.get(); 
//					CBI b1=new CBI();
//					//System.out.println(b1.am1);
//				public static void main(String args[])	b1.decide();
//					//b1.getre();
//					break;
//			case 2: ISISI s1=new ISISI();
//					//e1.get();
//					s1.decide1();
//					//s1.getre();
//					break;
//			case 3: KANARA k1=new KANARA();
//					//v1.get();
//					k1.decide2();
//					//k1.getre();
//					break;
//			default: System.out.println("Enter proper choice");
//		}
//	}
//}