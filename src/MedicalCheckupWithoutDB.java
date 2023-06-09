import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
        try {
            ArrayList<HashMap> CustomerInfo = new ArrayList<HashMap>();
            HashMap<String, String> item = new HashMap<String, String>();
            item.put("NAME","홍길동");
            item.put("GENDER","남");
            item.put("AGE","30");
            item.put("HEIGHT","175");
            item.put("WEIGHT","75");
            item.put("BLOODPRESSURE","120/80");
            item.put("BLOODSUGAR","90");
            item.put("RESULT","비정상");
            item.put("RECHECK","폐암, 갑상선 질환");
            item.put("MAINTENANCEPLAN","");
            CustomerInfo.add(item);
            
            item = new HashMap<String, String>();
            item.put("NAME","김영희");
            item.put("GENDER","여");
            item.put("AGE","25");
            item.put("HEIGHT","160");
            item.put("WEIGHT","55");
            item.put("BLOODPRESSURE","110/70");
            item.put("BLOODSUGAR","85");
            item.put("RESULT","비정상");
            item.put("RECHECK","간암, 뇌졸중");
            item.put("MAINTENANCEPLAN","");
            CustomerInfo.add(item);

            item = new HashMap<String, String>();
            item.put("NAME","박철수");
            item.put("GENDER","남");
            item.put("AGE","45");
            item.put("HEIGHT","180");
            item.put("WEIGHT","85");
            item.put("BLOODPRESSURE","130/85");
            item.put("BLOODSUGAR","100");
            item.put("RESULT","정상");
            item.put("RECHECK","심장질환");
            item.put("MAINTENANCEPLAN","식습관 개선, 운동 계획");
            CustomerInfo.add(item);

            item = new HashMap<String, String>();
            item.put("NAME","이지은");
            item.put("GENDER","여");
            item.put("AGE","35");
            item.put("HEIGHT","165");
            item.put("WEIGHT","60");
            item.put("BLOODPRESSURE","115/75");
            item.put("BLOODSUGAR","95");
            item.put("RESULT","비정상");
            item.put("RECHECK","간암, 알츠하이머병");
            item.put("MAINTENANCEPLAN","");
            CustomerInfo.add(item);

            item = new HashMap<String, String>();
            item.put("NAME","최민호");
            item.put("GENDER","남");
            item.put("AGE","28");
            item.put("HEIGHT","170");
            item.put("WEIGHT","70");
            item.put("BLOODPRESSURE","125/80");
            item.put("BLOODSUGAR","92");
            item.put("RESULT","정상");
            item.put("RECHECK","간암");
            item.put("MAINTENANCEPLAN","");
            CustomerInfo.add(item);
            
            for (HashMap<String, String> customer : CustomerInfo) {
                System.out.println(customer.get("NAME") + ", " + customer.get("GENDER") + ", " + customer.get("AGE") + ", " +
                    customer.get("HEIGHT") + ", " + customer.get("WEIGHT") + ", " + customer.get("BLOODPRESSURE") + ", " +
                    customer.get("BLOODSUGAR") + ", " + customer.get("RESULT") + ", " + customer.get("RECHECK") + ", " +
                    customer.get("MAINTENANCEPLAN"));
            }
            
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
