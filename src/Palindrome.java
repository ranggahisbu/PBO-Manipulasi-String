public class Palindrome { // Nomor 1
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("rangga"));
    }
}
