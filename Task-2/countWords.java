import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            int count= getNumberOfWords(str);
            System.out.println(count);
        in.close();
    }

    public static boolean isEndOfWord(char c) {
        return (c == ' ' || c == '!' || c == '.' || c == '?' || c == ',');
    }

    public static int getNumberOfWords(String s) {
        int count = 0;
        for (int i = 1; i < s.length(); i++)
            if (isEndOfWord(s.charAt(i)) && !isEndOfWord(s.charAt(i - 1)))
                count++;

        if (!isEndOfWord(s.charAt(s.length() - 1)))
            count++;

        return count;
    }
}
