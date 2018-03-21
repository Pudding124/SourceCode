import java.util.*;
public class uva11005 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int Case = input.nextInt();
        for(int i = 1;i<=Case;i++){
            System.out.println("Case "+i+":");
            int[] price = new int[36];
            for(int x = 0;x<36;x++){
                price[x] = input.nextInt();
            }
            int dataNum = input.nextInt();
            for(int x = 0;x<dataNum;x++){
                int dex = input.nextInt();
                int[] devResult = new int[35];
                int min = 10000;
                for(int dev = 2;dev<=36;dev++){
                    int n = dex;
                    while(n > 0){
                        devResult[dev-2] = devResult[dev-2] + price[n%dev];
                        n = n / dev;
                    }
                    if(devResult[dev-2]<min){
                        min = devResult[dev-2];
                    }
                }
                System.out.print("Cheapest base(s) for number "+dex+":");
                boolean control = false;
                for(int y = 0;y<35;y++){

                    if(min == devResult[y] && control){
                        System.out.print(" "+(y+2));
                    }else if(min == devResult[y]){
                        control = true;
                        System.out.print(y+2);
                    }
                }
                System.out.println();
            }
        }
    }
}
