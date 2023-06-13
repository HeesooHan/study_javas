package polls;

public class printResults {
    public static void printResults(String name, String[] answers) {
        System.out.print("이름: " + name);
        for (int first = 0; first < answers.length; first = first + 1) {
            System.out.print(answers[first] + ", ");
        }
        System.out.println();
    }
}

