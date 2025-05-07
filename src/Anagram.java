import java.util.Arrays; // Nomor 3

public class Anagram {
    public static boolean isAnagram(String str1, String str2){
        char [] a1 = str1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char [] a2 = str2.replaceAll("\\s+", "").toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    } 
    
    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent"));
    }
}
