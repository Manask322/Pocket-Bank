package BasicOP;

/**
 *
 * @author manas
 */
public class CBI extends loan_op
{
	double r;
	public double decide(int x,int y,int bn)
	{	
		//System.out.println("Here we decide the rate of interest on the amount "+am1);
//		System.out.println("What loan do you want:");
//		System.out.println("1.Vehicle\n2.Home\n3.Education");
//		int bn=in.nextInt();
		switch(bn)
		{
			case 1: loan_op ob1=new loan_op();
					int am1=x;
					if((am1>500000)&&(am1<=1000000))
					{
						r=9.20;
						System.out.println("As your amount is in the range of 30-75lakhs the rate of interest applicable is "+r);
					}
					else if(am1>1000000)
					{
						r=9.35;
						System.out.println("The rate of interest is 9.35 for the entered amount");
					}
					else
					{
						r=9.00;
						System.out.println("The rate of interest is 9.00 for the entered amount");
					}
					double ram1=ob1.calculate(am1,r,y);
//					System.out.println("The total amount to be paid is "+ram1);
                                        return ram1;
			case 2: loan_op ob2=new loan_op();
					int am2=x;
					if((am2>3000000)&&(am2<=7500000))
					{
						r=8.70;
						System.out.println("As your amount is in the range of 30-75lakhs the rate of interest applicable is "+r);
					}
					else if(am2>7500000)
					{
						r=8.80;
						System.out.println("The rate of interest is 8.80 for the entered amount");
					}
					else
					{
						r=8.00;
						System.out.println("The rate of interest is 8.00 for the entered amount");
					}
					double ram2=ob2.calculate(am2,r,y);
//					System.out.println("The total amount to be paid is "+ram2);
					return ram2;
                    
			case 3: loan_op ob3=new loan_op();
					int am3=x;
					if((am3>500000)&&(am3<=1000000))
					{
						r=8.70;
						System.out.println("As your amount is in the range of 30-75lakhs the rate of interest applicable is "+r);
					}
					else if(am3>1500000)
					{
						r=8.80;
						System.out.println("The rate of interest is 8.80 for the entered amount");
					}
					else
					{
						r=8.00;
						System.out.println("The rate of interest is 8.00 for the entered amount");
					}	
					double ram3=ob3.calculate(am3,r,y);
//					System.out.println("The total amount to be paid is "+ram3);
					return ram3;
			default: System.out.println("Enter proper choice");
		}
	return 0.0;
        }
	
}