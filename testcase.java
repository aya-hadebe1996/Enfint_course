import java.util.Scanner;
import java.lang.Math;

class Conversion{
    //Function converts decimal to hexadecimal
    public static String DecToHex(int dec){
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex ="";
        int rem= 0;
        while(dec != 0){
            rem = dec % 16;
            hex = hexDigits[rem] + hex;    
            dec = dec/16;
        }
        return hex;
    }
    //function converts binary to decimal
    public static int BinToDec(int bin){
        int dec = 0;
        int n = 0;
        int temp = 0;
        while (bin != 0)
        {
            temp = bin % 10;
            dec += temp * Math.pow(2,n);
            bin = bin/10;
            n++;
        }
       return dec;
    }
    //function converts decimal to binary
    public static int DecToBin(int dec){
        if (dec == 0){
            return 0;
        }
        else
        {
            return (dec % 2 + 10 * DecToBin(dec / 2));
        }

    }
    public static boolean isBig(int num)
    {
        if(num >= 10000){
            return false;
        }
        else{
            return true;
        }

    }
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int selected;
        int dec = 0;
        int bin = 0;
        
        //convertion selection
        System.out.println("Please select the convertion you want to use:");
        System.out.println("1 - Decimal to hexadecimal (base 10 - 16)");
        System.out.println("2 - Binary to decimal (base 2 - 10)");
        System.out.println("3 - Decimal to binary (base 10 - 2)");
        selected =input.nextInt();
        
        if(selected == 1){
            System.out.println("Enter a decimal number:");
            dec = input.nextInt();
            if (isBig(dec))
            {
            System.out.println(DecToHex(dec));
            }
            else
            {
                System.out.println("Invalid Number is greater than 10000");
            }
        }
        else if (selected == 2){
            System.out.println("Enter a binary number:");
            bin = input.nextInt();
            System.out.println(BinToDec(bin));
        }
        else if (selected == 3){
            System.out.println("Enter a decimal number:");
            dec = input.nextInt();
            if (isBig(dec))
            {
                System.out.println(DecToBin(dec));
            }
            else
            {
                System.out.println("Invalid Number is greater than 10000");
            }     
        }
        else{
            System.out.println("Invalid input"); 
        }
    }
}
