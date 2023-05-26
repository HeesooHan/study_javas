import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            String answer = "";
            boolean loops = true;
            while (loops) {
                System.out.println("선택에 따라 안내글을 보여드립니다.");
                System.out.println("------ 작동 key ------");
                System.out.println("(E)xit : 종료, (P)oll : 설문 시작, (S)tatistic : 설문 통계");
                System.out.print("입력 하세요 : ");
                answer = myObj.nextLine();
                if (answer.equals("P")||answer.equals("Poll")) { // or:||
                    System.out.println("----- 설문 시작 -----"); 
                } else if (answer.equals("S")||answer.equals("Statistic")) {
                    System.out.println("----- 설문 통계 -----");
                } else if (answer.equals("E") || answer.equals("Exit")) {
                    System.out.println("----- 설문 종료 -----");
                    break;
                } else {
                    System.out.println("잘못된 입력입니다\n"); // \n:줄바꿈
                }
            } 
        }   catch (Exception e) {
                System.out.println();
            // TODO: handle exception
        } finally {
                System.out.println();
        }
        System.out.println();
        // return 0;
    }
}

// * Quest
// 선택에 따라 안내글을 보여드립니다.
// ------ 작동 key ------
// (E)xit : 종료
// (P)oll : 설문 시작
// (S)tatistic : 설문 통계

// 선택 입력 : P
// ----- 설문 시작 ------

// 선택 입력 : S	 --> or Statistic
// ----- 설문 통계 ------

// 선택 입력 : Poll
// ----- 설문 시작 ------

// 선택 입력 : E	--> or Exit
// ----- 설문 종료 ------
