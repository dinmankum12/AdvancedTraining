package Question5;

public class SplitPerser {
    public static void main(String args[])
    {
        String str = "23 + 34 - ( 343 / 7 )";
        String[] arrOfStr = str.split(" ");
 
        for (String a : arrOfStr)
            System.out.println(a);
    }
}
