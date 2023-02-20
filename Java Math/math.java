public class math {
    public static void main(String[] args) {
        
    int num1 =12;
    int num2 = 23;
    // The Math.max(x,y) method can be used to find the highest value of x and y:
    System.out.println(Math.max(num1, num2));
    // The Math.min(x,y) method can be used to find the lowest value of x and y:
    System.out.println(Math.min(num1, num2));
    // The Math.sqrt(x) method returns the square root of x:
    System.out.println(Math.sqrt(64));
    // The Math.abs(x) method returns the absolute (positive) value of x:
    System.out.println(Math.abs(-4.585));
    // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
    System.out.println(Math.random());
    // To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:
    System.out.println(Math.random()*100);

}

}
