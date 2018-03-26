import java.util.*;
public class uva10170_test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int people = input.nextInt();
            int dayLine = input.nextInt();

            int day = 1;
            int tmp = 0;
             while(dayLine > day){
                 day = day + people ;
                 tmp = people;
                 people = people + 1;
             }
             System.out.println(tmp);
        }
    }
}
