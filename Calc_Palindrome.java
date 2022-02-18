import java.util.Scanner;
class Calc_Palindrome
{
    public static void main(String args[])
    {
        String str, a = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        str = sc.nextLine();
        int n = str.length();
        for(int i = n - 1; i >= 0; i--)
        {
            a = a + str.charAt(i);
        }
        if(str.equalsIgnoreCase(a))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}