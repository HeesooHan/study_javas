package polls;

import java.util.Scanner;

public class PollScanners {
    public static String getName() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        System.out.print("이름 : ");
        String name = myObj.nextLine();
        return name;
    }

    public static String[] getAnswers(String[][] polls) {
        Scanner myObj = new Scanner(System.in);
        String[] answers = new String[4];
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

    public static Scanner createScanner() {
        return null;
    }

    public static String readInput(Scanner myObj) {
        return null;
    }

    public void scanners() {
    }
}

