package SEM5;

public class BitsGET
{
    public static void main(String args [])
    {
        int n=5; //binary 5=0100
        int pos=2;//position; shift left by 2
        int bitMask=1<<pos;//left shift by 2
        
        if((bitMask & n)==0)
        {
            System.out.println("bit was zero");
        }
        else
        {
            System.out.println("bit was one");
        }
    }
}
