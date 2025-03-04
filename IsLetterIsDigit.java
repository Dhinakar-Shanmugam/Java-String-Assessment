import java.util.Scanner;

public class IsLetterIsDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");  //"a3b2c5d"
        String str = scan.nextLine();
        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int charVal = Character.getNumericValue(str.charAt(i));
                for (int j = 0; j < charVal - 1; j++) {
                    res.append(str.charAt(i-1));
                }
            } else if (Character.isLetter(str.charAt(i))) {
                res.append(str.charAt(i));
            }
        }
        System.out.println(res);
    }
}
