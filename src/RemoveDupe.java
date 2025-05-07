import java.util.HashSet; // Nomor 5

public class RemoveDupe {
    public static String removeDuplicate(String str){
        HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()){
            if (!seen.contains(c)){
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("papaya"));
    }
}
