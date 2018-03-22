import java.util.*;
public class uva11417 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true) {
            int num = input.nextInt();
            if (num == 0) break;

            int G = 0;
            for (int i = 1; i < num; i++){
                for (int j = i + 1; j <= num; j++) {
                    G += GCD(i, j);
                }
            }
            System.out.println(G);
        }
    }

    public static int GCD(int i,int j){
        int max = 0;
        for(int x = 1;x<=i;x++){

            if((i % x) ==0 && (j % x) ==0){
                if(x > max){
                    max = x;
                }
            }
        }
        return max;
    }
}
