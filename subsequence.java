import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public static void main(String[] args) {
        String s = "sreeja";
        List<String> l = new ArrayList<>();

        printsubsequence(s, 0, "", l);

        System.out.println(l);
    }

    static void printsubsequence(String s, int ind, String result, List<String> l) {
        if (ind == s.length()) {
            l.add(result);
            return;
        }

        // Include the current character
        printsubsequence(s, ind + 1, result + s.charAt(ind), l);

        // Exclude the current character
        printsubsequence(s, ind + 1, result, l);
    }
}
