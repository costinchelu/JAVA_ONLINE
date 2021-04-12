package problems;

public class Palindrome {

    public boolean isPalindromeReverseTheString(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();

        char[] charArr = clean.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for (int i = charArr.length - 1; i >= 0; i--) {
            reverse.append(charArr[i]);
        }
        return (reverse.toString()).equals(clean);
    }
}
