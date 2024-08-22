package SEM5;

public class BitsCLEAR
{
    public static void main(String args [])
    {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        //operation AND with NOT
        int newNumber=((~bitMask) & n); 
        System.out.println(newNumber);
    }
}
