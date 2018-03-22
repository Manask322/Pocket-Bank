package BasicOP ;

import BANK.DBConnect;


interface bank_op
{
	public abstract void withdraw(int a,int b,int c,int d);
	public abstract void deposit(int x,int y,int z,int w);
}

public class BasicOp extends DBConnect implements bank_op
{
    DBConnect Obj2 = new DBConnect() ;
   
    @Override
    public void withdraw(int Bal,int Amt,int AcNo,int var)
	{
            if( Bal < Amt )
		System.out.println("Insufficient balance in your account");
            else
            {
		Bal = Bal - Amt ;
                if ( var == 1){
                    Obj2.CBIUpdate(Bal,AcNo) ;
                }
                else if ( var ==2 ){
                    Obj2.ISISIUpdate(Bal,AcNo);
                }
                else{
                    Obj2.KANARAUpdate(Bal, AcNo);
                }
		System.out.println("Successful transaction");
		System.out.println("Balance is " + Bal );
		if( Bal < 500 )
			System.out.println("Make sure that your account balance is more than 500INR.");
            }
        }  
    @Override
    public void deposit(int Bal,int Amt,int AcNo,int var)
	{
		Bal = Bal + Amt ;
                if ( var == 1){
                    Obj2.CBIUpdate(Bal,AcNo) ;
                }
                else if ( var ==2 ){
                    Obj2.ISISIUpdate(Bal,AcNo);
                }
                else{
                    Obj2.KANARAUpdate(Bal, AcNo);
                }
		System.out.println("Successful transaction");
		System.out.println("Balance is "+Bal);
	}
}