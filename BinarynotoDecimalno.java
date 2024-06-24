//This program converts a Binary number to a Decimal number in Java

import java.util.Scanner;
public class BinarynotoDecimalno {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number = ");
        String s = sc.nextLine();
        sc.close();
        int m = 0;
        int k = 1;
        for(int i=s.length()-1;i>=0;i--)
        {
            m = m + (s.charAt(i)-'0') * k;
            k = k * 2;
        }
        System.out.print("Decimal Number = "+m);
    }
}