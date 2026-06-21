public class vowels {
    public static void main(String[] args) {
        String s = "Saravanakumar";
        String vowels = "aeiou";
        int count = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}