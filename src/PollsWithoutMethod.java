// > 이름을 입력하세요
// 이름) FANTASTIC4

// 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
// (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다. -답 한가지만 선택가능.

// 답) (1)

// 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
// (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다. -답은 한가지만 선택가능.

// 답) (2)

// 3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?
// (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다. -답은 한가지만 선택가능.

// 답) (4)

// 4. 강의 진행 속도는 적절하였는가?
// (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다. -답은 한가지만 선택가능.

// 답) (3)

// ---------------------설문 종료--------------------------

// -------------------- 설문 결과 ---------------------------
// 1. (1), 2. (2), 3. (4), 4. (3)

import java.util.Scanner;

public class PollsWithoutMethod {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String answer = "";
        String[] answers = {"","","",""};
        String[][] polls = {
            {"1. 문항"}, 
            {"(1) 답항", "(2) 답항", "(3) 답항", "(4) 답항"},
            {"2. 문항"},
            {"(1) 답항", "(2) 답항", "(3) 답항", "(4) 답항"},
            {"3. 문항"}, 
            {"(1) 답항", "(2) 답항", "(3) 답항", "(4) 답항"},
            {"4. 문항"},
            {"(1) 답항", "(2) 답항", "(3) 답항", "(4) 답항"},
        };

        int count = 0;
        for (int second=0; second < polls.length; second=second+2){
            System.out.println(polls[second][0]);
            // 답항 출력
            System.out.print("답하기 : ");
            answers[count] = myObj.nextLine();
            count = count + 1;
            System.out.println();
        }

        for (int first=0; first < answers.length; first=first+1) {
            System.out.print(answers[first]+", ");
        }
        System.out.println();
        // return 0;
    }
}
