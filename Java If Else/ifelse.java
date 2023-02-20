

public class ifelse {
    public static void main(String[] args){
        /*
        int x = 90;
        if (x >= 18) {
            System.out.println("You are eligible for voting");
            
        } else {
            System.out.println("You are not eligible for Voting");
        }
        */
        int time = 23;
        if (time >= 4 && time < 12) {
            System.out.println("Good Morning");
        }
        else if (time >= 12 && time < 16) {
            System.out.println("Good Afternoon");
        }
        else if (time >=16 && time < 19) {
            System.out.println("Good Morning");
        }
        else{
            System.out.println("Good Night");
        }
    }
}


