public class MakingGamebyOneHand {
    public static void main(String[] args) {

        String first = "1";
        String second = " ";
        String third = "2";
       
        second = third ;
        third = first ;
        first = second ;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        // return 0;
    }
}
