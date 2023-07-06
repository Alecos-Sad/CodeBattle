package by.sadovnick;

public class КолСловВСтроке {
    public static void main(String[] args) {
        String str = "The quick brown fox";
        if (str.isEmpty()){
            System.out.println("0");
        }
        int length = str.split(" ").length;
        System.out.println(length);
    }
}

