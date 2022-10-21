public class Megaphone {
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println("* LOUD AND UNBEARABLE FEEDBACK NOISE *");
        else
            toUpper(args);
    }
    private static void toUpper(String[] args) {
        for (String word : args){
            System.out.println(word.toUpperCase());
        }
    }
}
