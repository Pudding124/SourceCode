import java.util.*;
public class uva10190 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n = input.nextInt();
            int m = input.nextInt();
            ArrayList<Integer> divStore = new ArrayList<Integer>();
            boolean control = true;
            if(m == 1){   //注意當 除數 == 1 時 會有specail case
                System.out.print("Boring!");
                control = false;
            }else{
                while(n > 0){
                    divStore.add(n);
                    n = n/m;
                }
            }
            for(int x = 0;x<divStore.size();x++){
                if(divStore.get(x) == 1){
                    break;
                }
                if(divStore.get(x)%m != 0){
                    System.out.print("Boring!");
                    control = false;
                    break;
                }
            }

            for(int x = 0;x<divStore.size()-1;x++){
                if(divStore.get(x) <= divStore.get(x+1)){
                    System.out.print("Boring!");
                    control = false;
                    break;
                }
            }
            if(control){
                for(int key : divStore){
                    if(key == 1){
                        System.out.print(key);
                    }else{
                        System.out.print(key+ " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
