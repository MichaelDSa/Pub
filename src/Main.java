import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // from Linux:
        System.out.println("From Linux: Hello world!");
        //from Mac
        System.out.println("From MacOS: Hello world!");
        //from Windows:
        System.out.println("from Windows 11: Hello world!");

        // merged from FeatureUI branch:
        Scanner sc = new Scanner(System.in);

        System.out.print("What would you like to say? ");
        String input = sc.nextLine();
        System.out.println();

        for(char i : input.toCharArray()){
            System.out.print(i + " ");
        }
    }
}