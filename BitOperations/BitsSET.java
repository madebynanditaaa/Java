package SEM5;

public class BitsSET
{
    public static void main(String args [])
    {
        int n=5;
        //bit mask;
        int pos=1;
        int bitMask=1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
