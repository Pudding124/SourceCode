import java.util.*;
public class uva10812 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();

        for(int i = 0;i<Case;i++){

            int sum = input.nextInt();
            int diff = input.nextInt();
            int x = 0;
            int y = 0;
            if((sum - diff)%2 != 0){
                System.out.println("impossible");
            }else if(sum >= diff){
                y = (sum - diff)/2;
                x = sum - y;
                System.out.print(x+" ");
                System.out.print(y);
                System.out.println("");
            }else if(sum < diff){
                System.out.println("impossible");
            }

        }

    }
}
