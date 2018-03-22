/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicOP;

/**
 *
 * @author manas
 */
public class KANARA extends loan_op
{
	double r;
	public double decide(int x,int y,int bn)
	{
		//System.out.println("Here we decide the rate of interest on the amount "+am1);
		//System.out.println("What loan do you want:");
		//System.out.println("1.Vehicle\n2.Home\n3.Education");
		//int bn=in.nextInt();
		switch(bn)
		{
			case 1: loan_op ob7=new loan_op();
					int am7=x;
					if((am7>500000)&&(am7<=1000000))
					{
						r=9.30;
						System.out.println("As your amount is in the range of 30-75lakhs the rate of interest applicable is "+r);
					}
					else if(am7>1000000)
					{
						r=9.40;
						System.out.println("The rate of interest is 9.40 for the entered amount");
					}
					else
					{
						r=9.20;
						System.out.println("The rate of interest is 9.20 for the entered amount");
					}
					double ram7=ob7.calculate(am7,r,y);
					//System.out.println("The total amount to be paid is "+ram7);
                                        return ram7 ;  
			case 2: loan_op ob8=new loan_op();
					int am8=x;
					if((am8>3000000)&&(am8<=7500000))
					{
						r=8.60;
						System.out.println("As your amount is in the range of 30-75lakhs the rate of interest applicable is "+r);
					}
					else if(am8>7500000)
					{
						r=8.80;
						System.out.println("The rate of interest is 8.80 for the entered amount");
					}
					else
					{
						r=8.30;
						System.out.println("The rate of interest is 8.00 for the entered amount");
					}
					double ram8=ob8.calculate(am8,r,y);
					//System.out.println("The total amount to be paid is "+ram8);
					return ram8;
			case 3: loan_op ob9=new loan_op();
					int am9=x;
					if((am9>500000)&&(am9<=2000000))
					{
						r=8.60;
						System.out.println("As your amount is in the range of 30-75lakhs the rate of interest applicable is "+r);
					}
					else if(am9>2000000)
					{
						r=8.80;
						System.out.println("The rate of interest is 8.80 for the entered amount");
					}
					else
					{
						r=8.30;
						System.out.println("The rate of interest is 8.30 for the entered amount");
					}
					double ram9=ob9.calculate(am9,r,y);
					//System.out.println("The total amount to be paid is "+ram9);
					return ram9;
			default: System.out.println("Enter proper choice");					
		}
	return 0.0;
        }
}