import java.util.Scanner;
public class uva10487 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int num = input.nextInt();
            int[] alldata = new int[num];


            for(int i = 0;i<num;i++){
                alldata[i] = input.nextInt();
            }

            int Case = input.nextInt();
            int[] Ques = new int[Case];
            for(int j = 0;j<Case;j++){
                Ques[j] = input.nextInt();
            }

            int count = 0;
            int store = 0;

            for(int x = 0;x<Case;x++){ //有幾題
                int compare = 0;
                for(int y = 0;y<num;y++){
                    for(int z = 0;z<num;z++){
                        int sum = 0;
                        if(alldata[y] != alldata[z]){
                            sum = alldata[y] + alldata[z];
                            if(compare == 0 || compare>Math.abs(Ques[x]-sum)){
                                compare = Math.abs(Ques[x]-sum);
                                store = sum;
                            }

                        }
                    }
                }
                System.out.println("Closest sum to "+Ques[x]+" is "+store+".");
            }

        }


    }

}
