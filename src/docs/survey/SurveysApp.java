package docs.survey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import commons.Commons;
import surveys.Statistics;

/**
 * SurveysApp
 */
public class SurveysApp {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            System.out.println("--- 설문자 가능 명단 ---");
            // -- 설문자 가능 명단(가입 완료)
            // -- 1. 홍길동, 2.장길산, 3.신사임당, ...
            String queryB = "SELECT *\n" + //
                    "FROM respondents";
            ResultSet resultSet = statement.executeQuery(queryB);
            int number = 1;
            Scanner scanner = new Scanner(System.in);

            HashMap<String, String> respondentsInfo = new HashMap<>();
            while (resultSet.next()) {
                System.out.print(number + "." +
                        resultSet.getString("respondents") + ",");
                respondentsInfo.put(String.valueOf(number), resultSet.getString("RESPONDENTS_ID"));
                number = number + 1;
            }
            System.out.println();
            // 설문자 선택
            System.out.print("설문자 선택 : ");
            String respondent = scanner.nextLine();

            // -- 설문 시작
            // -------- 참조 : poll contents example -------------
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
            // -- 문항
            System.out.println("-- 설문 시작");
            queryB = "SELECT * \n" + //
                    "FROM questions";
            resultSet = statement.executeQuery(queryB);
            number = 1;
            Statement statement_second = connection.createStatement();

            Commons commons = new Commons();
            while (resultSet.next()) {
                System.out.println(number + "." +
                        resultSet.getString("questions") + ",");
                // 답항 출력
                String questionId = resultSet.getString("QUESTIONS_ID");
                queryB = "SELECT T_CHO.CHOICE_ID, T_CHO.CHOICE\n" + //
                        "FROM question_choice AS T_QUES\n" + //
                        "\tINNER JOIN choice AS T_CHO\n" + //
                        "    ON T_QUES.CHOICE_ID = T_CHO.CHOICE_ID\n" + //
                        "\tAND QUESTIONS_ID = '" + questionId + "'";
                ResultSet resultSet_second = statement_second.executeQuery(queryB);
                int number_second = 1;
                HashMap<String, String> choiceInfo = new HashMap<>();
                while (resultSet_second.next()) {
                    System.out.print(" (" + number_second + ")" +
                            resultSet_second.getString("CHOICE") + ",");
                    choiceInfo.put(String.valueOf(number_second), resultSet_second.getString("CHOICE_ID"));
                    number_second = number_second + 1;
                }
                resultSet_second.close();
                System.out.println();
                // insert 문 작성
                System.out.print("답항 선택 : ");
                String choiceKey = scanner.nextLine();     // 1, 2, 3으로 답변
                String choiceId = choiceInfo.get(choiceKey);
                queryB = "INSERT INTO statistics (STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID) " +
                        "VALUES ('" + commons.generateUUID() + "', '" + respondentsInfo.get(respondent) + "', '"
                        + questionId + "', '" + choiceId + "')";
                int result = statement_second.executeUpdate(queryB);

                number = number + 1;
            }
            System.out.println();

            // 통계 - 총 설문자 표시
            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

