public class FormatStudent { // Nomor 8
    public static void main(String[] args) {
        String[] students = {

            "Mohamed Ahmed",
            
            "Mohamed Ali",
            
            "Mohamed Salah",
            
            "Mohamed Hassan",
            
            "Mohamed Ibrahim",
            
            "Mohamed Noor",
            
            "Mohamed Farah",
            
            "Mohamed Yusuf",
            
            "Mohamed Ismail",
            
            "Mohamed Kamal"
            
            };

            for (String name : students ){
                String[] part = name.split(" ");
                String format = part[1] + ", Muhammad";
                System.out.println(format);
            }
    }
}