import java.util.*;
public class uva10190 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n = input.nextInt();
            int m = input.nextInt();
            ArrayList<Integer> divStore = new ArrayList<Integer>();
            boolean control = true;
            while(n > 0){
                divStore.add(n);
                n = n/m;
            }
            for(int x = 0;x<divStore.size();x++){
                if(divStore.get(x) == 1){
                    break;
                }
                if(divStore.get(x)%m != 0){
                    System.out.println("Boring!");
                    control = false;
                    break;
                }
            }

            for(int x = 0;x<divStore.size()-1;x++){
                if(divStore.get(x) <= divStore.get(x+1)){
                    System.out.println("Boring!");
                    control = false;
                    break;
                }
            }
            if(control){
                for(int key : divStore){
                    System.out.print(key+ " ");
                }
            }
            System.out.println();
        }
    }
}
