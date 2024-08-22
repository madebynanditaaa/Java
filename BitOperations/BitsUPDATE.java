package SEM5;
import java.util.Scanner;
public class BitsUPDATE
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int n=5;//0101
        int pos=1;
        System.out.println("Enter operation type: 0 or 1");
        int op=sc.nextInt();
        //if operation 'op' = 1;   update bit to 1.i.e.SET
        //else update bit to 0.i.e. CLEAR
        //set operation
        int bitMask=1<<pos;
        int newNumber=0;
        if(op==1)
        {
            //SET
            newNumber=bitMask | n;
        }
        else
        {
            //AND with NOT
            newNumber = (n & (~bitMask));
        }        
        System.out.println(newNumber);
    }
}
