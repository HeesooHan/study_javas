package polls;

import java.util.Scanner;

public class inputAnswers {
    public static String[] inputAnswers() {
        Scanner myObj = new Scanner(System.in);
        String[] answers = {"", "", "", ""};

        int count = 0;
        for (int second = 0; second < polls.length; second = second + 2) {
            System.out.println(polls[second][0]);
            for (int third = 0; third < 4; third = third + 1) {
                System.out.print(polls[second + 1][third]);
            }
            System.out.print("\n답하기 : ");
            answers[count] = myObj.nextLine();
            count = count + 1;
            System.out.println();
        }

        return answers;
    }
}

