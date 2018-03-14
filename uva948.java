import java.util.*;
public class uva948 {

    public static void  main(String[] args){

        Scanner input = new Scanner(System.in);

        int CaseNum = input.nextInt();

        for(int i = 0;i<CaseNum;i++){

            int data = input.nextInt();
            int program = data;
            int[] F = new int[38];
            F[0] = 1;
            F[1] = 2;

            for(int x = 2;x<38;x++){
                F[x] = F[x-1] + F[x-2];
            }
            String Result = "";
            for(int y = 37;y>=0;y--){
                if((data-F[y])>=0){
                    data = data-F[y];
                    Result = Result + "1";
                    for(int z = y-1;z>=0;z--){
                        if((data-F[z])>=0){
                            data = data-F[z];
                            Result = Result + "1";
                        }else if((data-F[z])<0){
                            Result = Result + "0";
                        }
                    }
                    break;
                }
            }
            System.out.println(program+" "+"="+" "+Result+" (fib)");
        }
    }

}
