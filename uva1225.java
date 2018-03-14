import java.util.*;

public class uva1225 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();

        for(int x = 0;x<Case;x++){
            int num = input.nextInt();
            int[] count = new int[10];
            int[] numArray = new int[num];

            for(int y = 1;y<=num;y++){
                numArray[y-1] = y;
            }

            for(int z = 0;z<numArray.length;z++){
                String tmp = String.valueOf(numArray[z]);
                for(int g = 0;g<tmp.length();g++){
                    count[Integer.valueOf(tmp.substring(g,g+1))]++;
                }
            }
            for(int i = 0;i<count.length;i++){
                System.out.print(count[i]+" ");
            }
            System.out.println("");
        }
    }

}
