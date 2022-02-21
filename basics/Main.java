import java.time.LocalDateTime;


public class Main {

    public static void main(String[] args) {
//        int dogCount = 1;
//        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
//
//        int catCount = 2;
//        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
//
//        int turtleCount = 0;
//        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
//        flipNHeads(1);
//       clock();
        clockChange();
    }
    public static String pluralize(String a, int b)
    {
        if(b<=0)
        {
            return a+"s" ;
        }

        return  a ;
    }
    public static void flipNHeads( int b)
    {
        int totalFlips=0;
        int consecutiveFlips=0;

        while(consecutiveFlips!=b){

            double n = Math.random();
            if(n > .5){
                System.out.println("heads");
                consecutiveFlips++;
                totalFlips++;
            }
            else{
                System.out.println("tails");
                consecutiveFlips = 0;
                totalFlips++;
            }
        }
        System.out.println("It took " + totalFlips + " to flip " + b + " heads in a row.");
    }
    public static void clock( )
    {

        LocalDateTime now = LocalDateTime.now();
        int currentSecond = now.getSecond();
        while(true){
            now = LocalDateTime.now();
            int newSecond = now.getSecond();
            if(currentSecond !=  newSecond){
                System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
                currentSecond=now.getSecond();
            }
        }

    }
    public static  void clockChange() {
        LocalDateTime now = LocalDateTime.now();
        int currentSecond = now.getSecond();
        int million =  1000000000;
        while(true){
            now = LocalDateTime.now();
            int newSecond = now.getSecond();
            if(currentSecond !=  newSecond){
                million++;
                System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond()+" "+million+"GHz");
                currentSecond=now.getSecond();

            }
        }
    }
}
