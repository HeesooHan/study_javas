import java.util.Scanner;

public class g {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String[] answers = new String[4];

        String[][] polls = {
            {"1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?"},
            {"(1) 전혀 아니다.", "(2) 아니다.", "(3) 그렇다.", "(4) 매우그렇다."},
            {"2. 강의의 내용은 체계적이고 성의있게 구성되었는가?"},
            {"(1) 전혀 아니다.", "(2) 아니다.", "(3) 그렇다.", "(4) 매우그렇다."},
            {"3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?"},
            {"(1) 전혀 아니다.", "(2) 아니다.", "(3) 그렇다.", "(4) 매우그렇다."},
            {"4. 강의 진행 속도는 적절하였는가?"},
            {"(1) 전혀 아니다.", "(2) 아니다.", "(3) 그렇다.", "(4) 매우그렇다."},
        };

        String name = "";
        System.out.println("이름을 입력하세요");
        System.out.print("이름 : ");
        name = myObj.nextLine();

        getPollAnswers(myObj, polls, answers);

        System.out.println("통계 결과:");
        printNameAndAnswers(name, answers);
    }

    public static void getPollAnswers(Scanner myObj, String[][] polls, String[] answers) {
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
    }

    public static void printNameAndAnswers(String name, String[] answers) {
        System.out.print("이름: " + name);
        for (int first = 0; first < answers.length; first = first + 1) {
            System.out.print(answers[first] + ", ");
        }
        System.out.println();
    }
}
