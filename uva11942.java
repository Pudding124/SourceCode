import java.util.*;
public class uva11942 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();
        System.out.println("Lumberjacks: ");
        for(int i = 0;i<Case;i++){

            int[] unSort = new int[10];
            boolean order = true;

            for(int j = 0;j<10;j++){
                unSort[j] = input.nextInt();
            }

            if(unSort[0] > unSort[1]){
                for(int x = 0;x<9;x++){
                    if(unSort[x] < unSort[x+1]){
                        order = false;
                        break;
                    }
                }
            }else if(unSort[0] < unSort[1]){
                for(int x = 0;x<9;x++){
                    if(unSort[x] > unSort[x+1]){
                        order = false;
                        break;
                    }
                }
            }

            if(order == true){
                System.out.println("Ordered");
            }else if(order == false){
                System.out.println("Unordered");
            }
        }

    }

}
