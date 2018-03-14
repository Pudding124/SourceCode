import java.util.*;

public class uva10222 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String keyboard[] = {"q","w","e","r","t","y","u","i","o","p","[","]","\\","a","s","d","f","g","h","j","k","l",";","'","z","x","c","v","b","n","m",",",".","/"};
        while(input.hasNext()){
            String data = input.next();
            data = data.toLowerCase();
            for(int j = 0;j<data.length();j++){
                String tmp = data.substring(j,j+1);
                for(int i = 0;i<keyboard.length;i++){
                    if(tmp.equals(keyboard[i])){
                        System.out.print(keyboard[i-2]);
                    }
                }

            }
            System.out.print(" ");

        }
    }

}
