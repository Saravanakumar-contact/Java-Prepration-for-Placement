public static void main(String args[]) {
    int a = 128;
    int original = a;
    int reversed = 0;

    while(a != 0) {
        int digit = a % 10;
        reversed = reversed * 10 + digit;
        a /= 10;
    }

    if(original == reversed) {
        System.out.println(original + " is palindrome");
    } else {
        System.out.println(original + " is not palindrome");
    }
}