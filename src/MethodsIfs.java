public class MethodsIfs {
    public String whattime (int time) {
        String str = "";
        try {
            if (time < 12) {
                str = "오전입니다.";
            } else if (time < 18) {
                str = "오후입니다.";
            } else {
                str = "밤입니다.";
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        try {
            int time = 15;
            String str = "";

            MethodsIfs methodIfs = new MethodsIfs();
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    // return 0;
}
