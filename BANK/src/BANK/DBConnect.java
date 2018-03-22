
package BANK;
import java.util.Random ;
import UI.Frame ;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect extends Frame {

    /**
     * @param args the command line arguments
     */
    
        //SQL CLASSES INITIALISATION
        Connection con ;
        Statement stmt ;
        PreparedStatement Pstmt ;
        ResultSet rs ;
        int Account_Number_Default ;
        
        // Constructor of the class ; 
        public DBConnect(){
        try{
        
	        String Url="jdbc:mysql://localhost:3306/BANK?autoReconnect=true&useSSL=false";
			String user = "root";
			String password= "123Manas@" ;
        
        
        	//Starting a Connection to SQL server   
        	con = DriverManager.getConnection(Url,user,password) ; 
        }
        catch(Exception e){
			System.out.println(e.getMessage());
		}
        }
        
        
        //passing Object as argument in CBI;
        public int  CBIInsert(Frame Ob){
            int AccountNo ;
            int CIF ;
            int Pin_No ;
            int Debit_No ;
            int Age = 19 ;
            Random rand ;
            rand = new Random();
            AccountNo = 10000000 + rand.nextInt(99999999) ;
            int a = AccountNo ;
            CIF = rand.nextInt(99999) ;
            Ob.Account_Balance = 1000 ;
            Pin_No = 1000 + rand.nextInt(8999) ;
            Debit_No = rand.nextInt(999999999) ;
            try {
            String Address = Ob.L1 + "," + Ob.Dis +" " + Ob.state + "," + Ob.city + "," + Ob.PIN ; 
            String query= "INSERT INTO CBI(First_Name,Last_Name,Middle_Name,Pin_No,Address,Debit_No,CIF,DOB,Age,Email_ID,Account_Balance,Account_No,Mobile,ADHAR_No)" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Pstmt=con.prepareStatement(query);
            Pstmt.setString (1,Ob.FName );
            Pstmt.setString (3,Ob.MName );
            Pstmt.setString (2,Ob.LName );
            Pstmt.setInt(4,Pin_No);
            Pstmt.setString (5,Address );
            Pstmt.setLong (6,Debit_No);
            Pstmt.setInt (7,CIF);
            Pstmt.setString (8,Ob.Dob1) ;
            Pstmt.setInt (9, Age) ;
            Pstmt.setString (10,Ob.MID) ;
            Pstmt.setInt (11,Ob.Account_Balance) ;
            Pstmt.setInt (12,AccountNo) ;
            Pstmt.setLong (13,Ob.Number) ;
            Pstmt.setLong (14,Debit_No) ;
            Pstmt.executeUpdate() ;
            System.out.println("Here");
            
            con.close();
            }
            catch(Exception ae){
                        System.out.println(ae.getMessage()) ;
            }
            return AccountNo ;
        }
        
        //passing Object as argument in KANARA;
        public int KANARAInsert(Frame Ob){
            int AccountNo ;
            int CIF ;
            int Pin_No ;
            int Debit_No ;
            int Age = 19 ;
            
            Random rand ;
            rand = new Random();
            AccountNo = 10000000 + rand.nextInt(9999999) ;
            Ob.Account_Balance = 1000 ;
            CIF = rand.nextInt(99999) ;
            Pin_No = 1000 + rand.nextInt(9999) ;
            Debit_No = rand.nextInt(999999999) ;
            try {
            String Address = Ob.L1 + " " + Ob.Dis +" " + Ob.state + " " + Ob.city + " " + Ob.PIN ; 
            String query= "INSERT INTO KANARA(First_Name,Last_Name,Middle_Name,Pin_No,Address,Debit_No,CIF,DOB,Age,Email_ID,Account_Balance,Account_No,Mobile,ADHAR_No)" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Pstmt=con.prepareStatement(query);
            Pstmt.setString (1,Ob.FName );
            Pstmt.setString (3,Ob.MName );
            Pstmt.setString (2,Ob.LName );
            Pstmt.setInt(4,Pin_No);
            Pstmt.setString (5,Address );
            Pstmt.setLong (6,Debit_No);
            Pstmt.setInt (7,CIF);
            Pstmt.setString (8,Ob.Dob1) ;
            Pstmt.setInt (9, Age) ;
            Pstmt.setString (10,Ob.MID) ;
            Pstmt.setInt (11,Ob.Account_Balance) ;
            Pstmt.setInt (12,AccountNo) ;
            Pstmt.setLong (13,Ob.Number) ;
            Pstmt.setLong (14,Debit_No) ;
            Pstmt.executeUpdate() ;
            System.out.println("Here");
            con.close();
            }
            catch(Exception ae){
                        System.out.println(ae.getMessage()) ;
            }
            return AccountNo ;
        }
        
        //passing Object as argument in KANARA;
        public int ISISIInsert(Frame Ob){
            int AccountNo ;
            int CIF ;
            int Pin_No ;
            int Debit_No ;
            int Age = 19 ;
            Random rand ;
            rand = new Random();
            AccountNo = 10000000 + rand.nextInt(9999999) ;
            CIF = rand.nextInt(99999) ;
            Ob.Account_Balance = 1000 ;
            Pin_No = 1000 + rand.nextInt(9999) ;
            Debit_No = rand.nextInt(999999999) ;
            try {
            String Address = Ob.L1 + " " + Ob.Dis +" " + Ob.state + " " + Ob.city + " " + Ob.PIN ; 
            String query= "INSERT INTO ISISI(First_Name,Last_Name,Middle_Name,Pin_No,Address,Debit_No,CIF,DOB,Age,Email_ID,Account_Balance,Account_No,Mobile,ADHAR_No)" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Pstmt=con.prepareStatement(query);
            Pstmt.setString (1,Ob.FName );
            Pstmt.setString (3,Ob.MName );
            Pstmt.setString (2,Ob.LName );
            Pstmt.setInt(4,Pin_No);
            Pstmt.setString (5,Address );
            Pstmt.setLong (6,Debit_No);
            Pstmt.setInt (7,CIF);
            Pstmt.setString (8,Ob.Dob1) ;
            Pstmt.setInt (9, Age) ;
            Pstmt.setString (10,Ob.MID) ;
            Pstmt.setInt (11,Ob.Account_Balance) ;
            Pstmt.setInt (12,AccountNo) ;
            Pstmt.setLong (13,Ob.Number) ;
            Pstmt.setLong (14,Debit_No) ;
            Pstmt.executeUpdate() ;
            System.out.println("Here");
            con.close();
            }
            catch(Exception ae){
                        System.out.println(ae.getMessage()) ;
            }
            return AccountNo ;
        }
        
        //get Account Number
        public boolean CBIAccount_No(int K,int P){
            Frame Oj = new Frame() ;
            try {
                Pstmt = con.prepareStatement("SELECT * from CBI") ;
                rs = Pstmt.executeQuery() ;
                while(rs.next()){
                    if(rs.getInt(12) == K){
                        return rs.getInt(4) == P;                        
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
          return false ;  
        }
        
        //
        public boolean KANARAccount_No(int K,int P){
            Frame Oj = new Frame() ;
            System.out.println("Here");
            try {
                Pstmt = con.prepareStatement("SELECT * from KANARA ") ;
                rs = Pstmt.executeQuery() ;
                while(rs.next()){
                    if(rs.getInt(12) == K){
                        System.out.println("Here1") ;
                        return rs.getInt(4) == P;
                    }
                  
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Here 2") ;
          return false ;  
        }
        
        //
        public boolean ISISIAccount_No(int K,int P){
            Frame Oj = new Frame() ;
            try {
                Pstmt = con.prepareStatement("SELECT * from ISISI") ;
                rs = Pstmt.executeQuery() ;
                while(rs.next()){
                    if((rs.getInt(12) == K) && (rs.getInt(4) == P) ){
                        return true;
                        
                    }
                 
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
          return false ;  
        }
        
        //
        public Frame CBIReturn_Details(int F){
            Frame obj = new Frame() ;
            try {
//                Frame obj = new Frame() ;
                Pstmt = con.prepareStatement("SELECT * from CBI") ;
                rs = Pstmt.executeQuery() ;
                 while(rs.next()){
                     if( rs.getInt(12) == F ){
                         obj.FName = rs.getString(1) ;
                         obj.MName = rs.getString(2) ;
                         obj.LName = rs.getString(3) ;
                         obj.Number = rs.getLong(13) ;
                         obj.Debit_No = rs.getLong(6);
                         obj.Address1 = rs.getString(5);
                         obj.Account_Balance = rs.getInt(11) ;
                         con.close() ;
                         break ;
                     }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
           return obj ;
        }
        //
        public Frame KANARAReturn_Details(int F){
            Frame obj = new Frame() ;
            try {
                Pstmt = con.prepareStatement("SELECT * from KANARA") ;
                rs = Pstmt.executeQuery() ;
                 while(rs.next()){
                     if( rs.getInt(12) == F ){
                         obj.FName = rs.getString(1) ;
                         obj.MName = rs.getString(2) ;
                         obj.LName = rs.getString(3) ;
                         obj.Number = rs.getLong(13) ;
                         obj.Debit_No = rs.getLong(6);
                         obj.Address1 = rs.getString(5);
                         obj.Account_Balance = rs.getInt(11) ;
                         con.close();
                         break ;
                     }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
           return obj ;
        }
        
        //
        public Frame ISISIReturn_Details(int F){
            Frame obj = new Frame() ;
            try {
                Pstmt = con.prepareStatement("SELECT * from ISISI") ;
                rs = Pstmt.executeQuery() ;
                 while(rs.next()){
                     if( rs.getInt(12) == F ){
                         obj.FName = rs.getString(1) ;
                         obj.MName = rs.getString(2) ;
                         obj.LName = rs.getString(3) ;
                         obj.Number = rs.getLong(13) ;
                         obj.Debit_No = rs.getLong(6);
                         obj.Address1 = rs.getString(5);
                         obj.Account_Balance = rs.getInt(11) ;
                         con.close();
                         break ;
                     }
                }
                 return obj ;
            } catch (SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
           return obj ;
        }
        
        //
        public int CBIReturnPin(int K) {
            int pin ;
            try {
//                Frame obj = new Frame() ;
                Pstmt = con.prepareStatement("SELECT * from  CBI") ;
                rs=Pstmt.executeQuery();
                 while(rs.next()){
                     if( K == rs.getInt(12) ){
                         pin = rs.getInt(4) ;
                         con.close(); 
                         return pin ;
                     }
                }
            }
             catch (SQLException ex) {
                
            } 
            return 0; 
        }
        
        //
        public int ISISIReturnPin(int K) {
            int pin ;
            try {
//                Frame obj = new Frame() ;
                Pstmt = con.prepareStatement("SELECT * from ISISI") ;
                rs=Pstmt.executeQuery();
                 while(rs.next()){
                     if( K == rs.getInt(12) ){
                         pin = rs.getInt(4) ;
                         con.close();
                         return pin ;
                     }
                }
            }
             catch (SQLException ex) {
                
            } 
            return 0; 
        }
        
        //
        public int KANARAReturnPin(int K) {
            int pin ;
            try {
//                Frame obj = new Frame() ;
                Pstmt = con.prepareStatement("SELECT * from KANARA") ;
                rs=Pstmt.executeQuery();
                 while(rs.next()){
                     if( K == rs.getInt(12) ){
                         pin = rs.getInt(4) ;
                         con.close();
                         return pin ;
                     }
                }
            }
             catch (SQLException ex) {
                
            } 
            return 0; 
        }
        
        //
        public void CBIUpdate(int bal,int no ){
	try{
		String query = "UPDATE CBI SET Account_Balance = ? where Account_No = ? ";
		Pstmt=con.prepareStatement(query);
		Pstmt.setInt(1,bal) ;
		Pstmt.setInt(2,no);
		Pstmt.executeUpdate() ;
	}
	catch(Exception ae){
		System.out.println("Exception" + ae);
	}
    }
        
        //
        public void KANARAUpdate(int bal,int no ){
            try{
                    String query = "UPDATE KANARA SET Account_Balance = ? where Account_No = ?";
                    Pstmt=con.prepareStatement(query);
                    Pstmt.setInt(1,bal) ;
                    Pstmt.setInt(2 ,no) ;
                    Pstmt.executeUpdate() ;
                    con.close();
            }
            catch(Exception ae){
                    System.out.println("Exception" + ae);
            }
        }
        
        //
        public void ISISIUpdate(int bal,int no ){
            try{
                    String query = "UPDATE ISISI SET Account_Balance = ? where Account_No = ? ";
                    Pstmt=con.prepareStatement(query);
                    Pstmt.setInt(1,bal) ;
                    Pstmt.setInt(2,no);
                    Pstmt.executeUpdate() ;
                    con.close() ;
            }
            catch(Exception ae){
                    System.out.println("Exception" + ae);
            }
        }
        
        //
        public int CBIgetBalance(int no ){
	try{
		Pstmt = con.prepareStatement("select * from CBI") ;
		rs = Pstmt.executeQuery() ;
		while(rs.next()){
			if (rs.getInt(12) == no ){
				return rs.getInt(11) ;
			}
		}
	}
	catch(Exception ae){
		System.out.println("Exception" + ae);
            }
        
            return 0 ;
        }
        
        //
        public int KANARAgetBalance(int no ){
	try{
		Pstmt = con.prepareStatement("select * from KANARA") ;
		rs = Pstmt.executeQuery() ;
		while(rs.next()){
			if (rs.getInt(12) == no ){
				return rs.getInt(11) ;
			}
		}
                
	}
	catch(Exception ae){
		System.out.println("Exception" + ae);
	}
        
        return 0 ;
    }
        
        //
        public int ISISIgetBalance(int no ){
	try{
		Pstmt = con.prepareStatement("select * from ISISI") ;
		rs = Pstmt.executeQuery() ;
		while(rs.next()){
			if (rs.getInt(12) == no ){
				return rs.getInt(11) ;
			}
		}
	}
	catch(Exception ae){
		System.out.println("Exception" + ae);
	}
        return 0 ;

        } 
}
        
        
       
     

