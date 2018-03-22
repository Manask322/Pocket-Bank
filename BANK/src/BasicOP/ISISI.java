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
public class ISISI extends loan_op
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
			case 1: loan_op ob4=new loan_op();
					int am4=x;
					if((am4>500000)&&(am4<=1000000))
					{
						r=9.15;
						System.out.println("As your amount is in the range of 30-75lakhs the rate of interest applicable is "+r);
					}
					else if(am4>1000000)
					{
						r=9.10;
						System.out.println("The rate of interest is 9.10 for the entered amount");
					}
					else
					{
						r=9.25;
						System.out.println("The rate of interest is 9.25 for the entered amount");
					}
					double ram4=ob4.calculate(am4,r,y);
					//System.out.println("The total amount to be paid is "+ram4);
					return ram4;
			case 2: loan_op ob5=new loan_op();
					int am5=x;
					if((am5>3000000)&&(am5<=7500000))
					{
						r=8.75;
						System.out.println("As your amount is in the range of 30-75lakhs the rate of interest applicable is "+r);
					}
					else if(am5>7500000)
					{
						r=8.90;
						System.out.println("The rate of interest is 8.80 for the entered amount");
					}
					else
					{
						r=8.20;
						System.out.println("The rate of interest is 8.00 for the entered amount");
					}
					double ram5=ob5.calculate(am5,r,y);
					//System.out.println("The total amount to be paid is "+ram5);
					return ram5;
			case 3: loan_op ob6=new loan_op();
					int am6=x;
					if((am6>500000)&&(am6<=2000000))
					{
						r=8.75;
						System.out.println("As your amount is in the range of 5-20lakhs the rate of interest applicable is "+r);
					}
					else if(am6>2000000)
					{
						r=8.90;
						System.out.println("The rate of interest is 8.90 for the entered amount");
					}
					else
					{
						r=8.20;
						System.out.println("The rate of interest is 8.20 for the entered amount");
					}
					double ram6=ob6.calculate(am6,r,y);
					//System.out.println("The total amount to be paid is "+ram6);
					return ram6;
			default: System.out.println("Enter proper choice");					
		}
	return 0.0;
        }	
}
