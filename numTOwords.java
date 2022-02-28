import java.util.Scanner;
class numTOwords { 
     static String func1(int n, String s) { 
        String[] one = { "", "One ", "Two ", "Three ", "Four ", 
                            "Five ", "Six ", "Seven ", "Eight ", 
                            "Nine ", "Ten ", "Eleven ", "Twelve ", 
                            "Thirteen ", "Fourteen ", "Fifteen ", 
                            "Sixteen ", "Seventeen ", "Eighteen ", 
                            "Nineteen " }; 
        String[] ten = { "", "", "Twenty ", "Thirty ", "Forty ", 
                            "Fifty ", "Sixty ", "Seventy ", "Eighty ", 
                            "Ninety " };                     
        String str = ""; 
        if (n > 19) { 
            str += ten[n / 10] + one[n % 10]; 
        } 
        else { 
            str += one[n]; 
        } 
        if (n != 0) { 
            str += s; 
        } 
        return str; 
    } 
    static String func2(long n) { 
        String out = ""; 
        out += func1((int)(n / 10000000), "Crore ");
        out += func1((int)((n / 100000) % 100), "Lakh "); 
        out += func1((int)((n / 1000) % 100), "Thousand ");
        out += func1((int)((n / 100) % 10), "Hundred ");
        if (n > 100 && (n % 100) > 0) { 
            out += "and "; 
        } 
        out += func1((int)(n % 100), "");
        return out+ "Rupees Only";
    } 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        if(n>999999999)
        System.out.println("Error!!!");
        else if(n == 0)
        System.out.println("Zero Rupees Only");
        else if(n < 0)
        {
            n = Math.abs(n);
            System.out.println("Negative " + func2(n));
        }
        else
        System.out.println(func2(n)); 
    } 
} 
