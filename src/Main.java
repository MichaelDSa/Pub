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

        for(char c : input.toCharArray()){
            System.out.print(c + " ");
        }
        // Staging area enabled:
        System.out.println("""


                To set up Staging in IntelliJ, go to Files>Settings>version Control>Git,\s
                or press ctrl+alt+s. Under 'Commit' section, check the box, "Enable staging area"
                """);

        // To stage or not stage generated module files?
        System.out.println(
                """
                            Stack Overflow says it's best not to store files generated by the IDE\s
                        in order to make projects as IDE-agonsitc as possible. But what if the\s
                        participants of the project all use IntelliJ?\s
                           \s
                            Here, I am committing only the changed file in /src, Main.java.
                           \s
                            It's worth noting that when the Staging area is not enabled, IntelliJ\s
                        categorizes generated files in 'unversioned'. This suggests not to include\s
                        these files, but I can choose to commit them if necessary.""");

        System.out.println("""
              \n     On Mac, I realized I'm sharing the source files on OneDrive,\s
                so it's not necessary to pull. Everything worked without a hitch. Whether the\s
                .iml file is saved or not is not an issue.\s
                     On the other hand, It's probably a good idea to version these files rather\s
                than have the IDE generate them every time.\s
                     If other people participate in the project, then it's probably a good idea\s
                not to include these .iml files.
              """);
    }
}