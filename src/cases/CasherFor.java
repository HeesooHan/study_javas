package cases;
import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try {
            int sum = 0;
            int[] bucket = new int[5]; //숫자가 들어가는 5개 공간 배열
            Scanner myObj = new Scanner(System.in);
                System.out.println("--- 계산 시작 ---");

            for (int first=0; first < bucket.length; first=first+1) {
                    System.out.print((first+1)+"번째 가격 : ");
                    bucket[first] = myObj.nextInt();
                        
                    if (bucket[first]==0) {  //
                        break;
                    } else if (bucket[first] > 100) {
                        bucket[first] = 0;
                        System.out.println("100 초과 0원 적용");
                    }
                    
                    sum = sum + bucket[first];
                }

                System.out.println("--- 담은 총합 ---");
                System.out.println("합계 : " + sum);

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
    
}
