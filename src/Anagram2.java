import java.util.Arrays; // Nomor 7

public class Anagram2 {
        public static boolean isAnagram(String s1, String s2) {
            s1 = s1.replaceAll("\\s+", "").toLowerCase();
            s2 = s2.replaceAll("\\s+", "").toLowerCase();
    
            if (s1.length() != s2.length()) return false;
    
            char[] a1 = new char[s1.length()];
            char[] a2 = new char[s2.length()];
    
            for (int i = 0; i < s1.length(); i++) {
                a1[i] = s1.charAt(i);
                a2[i] = s2.charAt(i);
            }
    
            Arrays.sort(a1);
            Arrays.sort(a2);
    
            return Arrays.equals(a1, a2);
        }
    
        public static void main(String[] args) {
            System.out.println(isAnagram("malam", "lamam")); // true
        }
    }