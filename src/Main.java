import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        Set<Character> charSet = new HashSet<Character>();
        int counta =0;
        int countb =0;
        int countc =0;
        for (char c : text.toCharArray()) {
            if (charSet.add(c)==false && c=='o'){
                counta++;
            } else if (charSet.add(c)==false && c=='e') {
                countb++;
            } else if (charSet.add(c)==false && c=='c'){
                countc++;
            }
        }
        System.out.println("The number of letter 'o' in the text is: " + counta);
        System.out.println("The number of letter 'e' in the text is: " + countb);
        System.out.println("The number of letter 'c' in the text is: " + countc);
    }
}