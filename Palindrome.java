import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check for Palindrome, enter a number: ");
        int number = scan.nextInt();
        Palindrome p = new Palindrome();

        if(p.isPalindrome(number)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    public boolean isPalindrome(int x) {
        // int x = 45;
        int temp = x;
        int r = 0;
        int sum = 0;
        while(x > 0){
            r = x % 10;
            sum = (sum * 10) + r;       
            
            x /= 10;
        }
        return temp == sum;
        }
        
    }