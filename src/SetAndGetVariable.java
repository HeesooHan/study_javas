public class SetAndGetVariable {
    public static void main(String[] args) {
        
        int A = 1 ;
        int B = 3 ;
        int C = 5 ; 
        int D = 7 ;

        int first = 200 ; 
        int second = 30 ; 
        int third = 50 ;
        int fourth = 10 ; 

        if (B==3) {
            System.out.println(A=fourth);
        } else {
            System.out.println(C=5) ;
        }

        if (D!=9) {
            System.out.println(B=5);
        } else {
            B = first ;
        }

        if (A==10) {
            System.out.println(C=third);
        } else {
            System.out.println(D=second);
        }
            System.out.println(A+" "+B+" "+C+" "+D);
    }
}
