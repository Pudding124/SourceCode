import java.util.*;
public class uva11233 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int ill = input.nextInt();
        int Case = input.nextInt();
        String[][] illWord = new String[ill][2];
        String one[] = {"o", "s", "x"};
        String two[] = {"ch", "sh"};
        String mom[] ={"a","e","i","o","u"};

        for(int x = 0;x<ill;x++){
            String before = input.next();
            String after = input.next();
            illWord[x][0] = before;
            illWord[x][1] = after;
        }

        for(int x = 0;x<Case;x++){
            String data = input.next();
            boolean control = false;

            for(int y = 0;y<ill;y++){
                if(data.equals(illWord[y][0])){
                    System.out.println(illWord[y][1]);
                    control = true;
                    break;
                }
            }

            if(control){
                continue;
            }

            if(data.substring(data.length()-1,data.length()).equals("y")){
                for(int y = 0;y<mom.length;y++){
                    if(data.substring(data.length()-2,data.length()-1).equals(mom[y])){
                        System.out.println(data+"s");
                        control = true;
                        break;
                    }
                }
                if(!control){
                    String Result = "";
                    for(int z = 0;z<data.length()-1;z++){
                        Result = Result + data.substring(z,z+1);
                    }
                    System.out.println(Result+"ies");
                    control = true;
                }
            }


            if(control){
                continue;
            }

            for(int y = 0;y<one.length;y++){
                if(data.substring(data.length()-1,data.length()).equals(one[y])){
                    System.out.println(data+"es");
                    control = true;
                    break;
                }
            }

            if(control){
                continue;
            }

            for(int y = 0;y<two.length;y++){
                if(data.substring(data.length()-2,data.length()).equals(two[y])){
                    System.out.println(data+"es");
                    control = true;
                    break;
                }
            }

            if(control){
                continue;
            }

            System.out.println(data+"s");
        }
    }

}
