import java.util.*;
public class uva299 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();
        for(int i = 0;i<Case;i++){
            int num = input.nextInt();
            int count = 0;
            int[] result = new int[num];
            for(int x = 0;x<num;x++){
                result[x] = input.nextInt();
            }

            for(int x  = result.length-1;x>=0;x--){
                for(int y = 0;y<x;y++){
                    if(result[y] > result[y+1]){
                        int tmp = result[y];
                        result[y] = result[y+1];
                        result[y+1] = tmp;
                        count++;
                    }
                }
            }

            System.out.println("Optimal train swapping takes "+count+" swaps.");
        }
    }
}
