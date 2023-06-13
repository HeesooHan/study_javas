package polls;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String[][] polls = inputPolls.inputPolls();
        
        String name = "";
        System.out.println("이름을 입력하세요");
        System.out.print("이름: ");
        name = myObj.nextLine();

        String[] answers = inputAnswers.inputAnswers();

        printResults.printResults(name, answers);
    }
}

