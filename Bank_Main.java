import java.util.*;
import java.io.*;
import java.lang.*;
class Bank_Main 
{
    static Calendar cl = Calendar.getInstance();
    static Scanner sc = new Scanner(System.in);
    static InputStreamReader is = new InputStreamReader(System.in);
    static BufferedReader buf = new BufferedReader(is);
    int prescnt = 0 ;
    static String tmpnm = null;
    static long tmpacc = 0L;
    static short tmpin = 0;
    static long tmphon = 0L;
    static String Name[] = new String[500];
    static long accnum[] = new long[500];
    static short pin[] = new short[500];
    static String type[] = new String[500]; 
    static long phone[] = new long[500];
    static double balancec[] = new double[500];
    static double balances[] = new double[500];
    static double interest[] = new double[500];
    static Bank_Main Bank = new Bank_Main();
    public Bank_Main(){
        Name = Bank.Initnm(Name);
        accnum = Bank.Initacc(accnum);
        pin = Bank.Initpin(pin);
        balancec = Bank.Initbal(balancec);
        balances = Bank.Initbal(balances);
        interest = Bank.Initirst(interest,'s');
    }
    private void newAcc()throws Exception{
        String tmpnm = null;
        long tmpacc = 0L;
        short tmpin = 0;
        long tmphon = 0L;
        System.out.println("Enter your name :");
        tmpnm = buf.readLine();
        System.out.println("Enter your active phone number");
        tmphon = sc.nextLong();
        System.out.println("Enter your UIC displayed on the screen (Unique Identification Code)\" The entered pin \"");
        System.out.println("                     ________________________________________ ");
        System.out.println("                    |                                        |");
        System.out.println("                    |                                        |");
        System.out.println("                    |                                        |");
        System.out.println("                    |                  "+tmpin+"                  |");
        System.out.println("                    |                                        |");
        System.out.println("                    |                                        |");
        System.out.println("                    |                                        |");
        System.out.println("                     ________________________________________");
        if(sc.nextShort() == tmpin){
            Name[prescnt] = tmpnm;
            accnum[prescnt] = tmpacc;
            pin[prescnt] = tmpin;
            phone[prescnt] = tmphon;
            System.out.println("You have successfully created an account for " + Name[prescnt] + "With the pin as " + pin[prescnt]);
            System.out.println("You have been credited \u20B9\b 200 as a compliment with our  2017 Entrance Programme");
            prescnt++;
        }else{
            tmpnm = null;
            tmpacc = 0L;
            tmpin = 0;
            tmphon = 0L;
            System.out.println("you will have to Re-enter your credentials due to wrong pin");
            Bank.newAcc();
        }
    }
    public void Entrance()
    {
        System.out.println("");
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String[] Initnm(String x[]){
       for(int i = 0,j = 0;i < x.length;i++,j++){
           char ch = (char)j;
           x[i] = Character.toString(ch);;
        }
       return x;
    }
   public long[] Initacc(long x[]){
       String str;// = "500105175407".concat(Integer.toString(i))
       for(long i = 0;i < x.length ; i++){
           if(((int) Math.log10(i) + 1) == 1)
           x[(int)i] = Long.parseLong("500105175407".concat("00".concat(Long.toString(i))));
           else if(((int) Math.log10(i) + 1) == 2)
           x[(int)i] = Long.parseLong("500105175407".concat("0".concat(Long.toString(i))));
           else if(((int) Math.log10(i) + 1) == 3)
           x[(int)i] = Long.parseLong("500105175407".concat(Long.toString(i)));
        }
        return x;
    }   
    public short[] Initpin(short x[]){
        for(short i = 0;i < x.length;i++){
            x[i] = 0000;
        }
        return x;
    }
    public double[] Initbal(double x[]){
        for(int i = 0;i < x.length;i++){
            x[i] = 200.00d;
        }
        return x;
    }
    public double[] Initirst(double x[],char ch){
        for(int i = 0;i < x.length;i++){
            if(ch == 's')
            x[i] = 3.50d ;
            else if(ch == 'c')
            x[i] = 0.0d;
        }
        return x;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void main(String args[]){
        
        
    }
}





