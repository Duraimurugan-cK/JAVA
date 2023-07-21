import java.util.Scanner;

public class sa {
    public static boolean isPolydrome(String s) {
        if (s.length() < 9) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) != s.charAt(i + 3) || s.charAt(i) != s.charAt(i + 6)) {
                return false;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i + 3) != s.charAt(8 - i)) {
                return false;
            }
        }
        
        // Check if the sequence continues
        for (int i = 9; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 9)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        if (isPolydrome(inputString)) {
            System.out.println("It's a polydrome!");
        } else {
            System.out.println("It's not a polydrome.");
        }
        
        scanner.close();
    }
}