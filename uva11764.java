import java.util.*;
public class uva11764 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();

        for(int i = 0;i<Case;i++){ //幾個Case

            int walls = input.nextInt(); //幾座牆
            int[] allWall = new int[walls];

            for(int j = 0;j<walls;j++){
                int wall = input.nextInt();
                allWall[j] = wall; //將每座牆高度放入陣列
            }
            int high = 0;
            int low = 0;

            for(int z = 0;z < walls-1;z++){
                if(allWall[z]>allWall[z+1]){
                    low++;
                }else if(allWall[z]<allWall[z+1]){
                    high++;
                }
            }

            System.out.println("Case "+(i+1)+": "+high+" "+low);
        }

    }

}
