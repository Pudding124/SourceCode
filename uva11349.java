import java.util.*;
public class uva11349 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int Case = input.nextInt();
        for(int i = 1;i<=Case;i++){
            input.next();
            input.next();
            int num = input.nextInt();
            int[] matrix = new int[num*num];
            for(int j = 0;j<num*num;j++){
                matrix[j] = input.nextInt();
            }
            boolean control = true;
            for(int x = 0;x<num*num;x++){
                int tmp = (num*num-1)-x;
                if(matrix[x] != matrix[tmp]){
                    control = false;
                    break;
                }
            }

            if(control){
                System.out.println("Test #"+i+": Symmetric.");
            }else{
                System.out.println("Test #"+i+": Non-symmetric.");
            }

        }

    }
}
