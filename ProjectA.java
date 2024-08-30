import java.util.Scanner;

public class ProjectA 
{

    /*
     * the main method will call the souls method and also display a welcome message
     */
    public static void main(String[] args)
    {
        System.out.print("Welcome to the souls game recommender! Answer with a number to the following questions\n"
                            + "but first...");
        String skill = souls();
    }

    /*
     * this method will recommend which souls game to start off with
     */
    public static String souls()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your skill level: Beginner, Intermediate, Advanced");
        String skill = sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Now considering your skill level...\n"
                            + "1. Do you enjoy games with kingdoms and dragons?\n"
                            + "2. Or games with a horror element?\n"
                            + "3. Open World Exploration with cooperation?\n"
                            + "4. World design and interconnectivity?\n");
        String gameRec = sc2.nextLine();
        String recommendation;
        /*
         * this first if statement with its cases is in case the user is a beginner at games
         */
        if (skill.equalsIgnoreCase("Beginner")) 
        {
            switch (gameRec) 
            {
                case "1":
                    recommendation = "Elden Ring";
                    break;
                case "2":
                    recommendation = "Bloodborne";
                    break;
                case "3":
                    recommendation = "Elden Ring";
                    break;
                case "4":
                    recommendation = "Dark Souls Remastered";
                    break;
                default:
                    recommendation = "Elden Ring";
            }
        } 
        /*
         * this first if statement with its cases is in case the user is intermediate at games
         */
        else if (skill.equalsIgnoreCase("Intermediate")) 
        {
            switch (gameRec) 
            {
                case "1":
                    recommendation = "Demon's Souls";
                    break;
                case "2":
                    recommendation = "Bloodborne";
                    break;
                case "3":
                    recommendation = "Dark Souls II";
                    break;
                case "4":
                    recommendation = "Dark Souls Remastered";
                    break;
                default:
                    recommendation = "Elden Ring";
            }
        }
        /*
         * this first if statement with its cases is in case the user is advanced at games
         */ 
        else if (skill.equalsIgnoreCase("Advanced")) 
        {
            switch (gameRec) 
            {
                case "1":
                    recommendation = "Dark Souls II";
                    break;
                case "2":
                    recommendation = "Bloodborne";
                    break;
                case "3":
                    recommendation = "Elden Ring";
                    break;
                case "4":
                    recommendation = "Demon's Souls";
                    break;
                default:
                    recommendation = "Sekiro: Shadows Die Twice";
            }
        } 
        else 
        {
            recommendation = "Dark Souls III";
        }
        System.out.println("Based on the responses to above choices, we recommend: " + recommendation);
        sc.close();
        sc2.close();
        return recommendation;
    }
}
