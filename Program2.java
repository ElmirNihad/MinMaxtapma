import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int counter = 0;
        String number;
        while (true){
            System.out.print("Enter number, or enter letter for exit :  ");
            number = input.nextLine();
            if(number.matches("-?\\d+(\\.\\d+)?")){
                double numberDouble = Double.parseDouble(number);
                if (counter == 0 || numberDouble < min) {
                    min = numberDouble;
                }
                if (counter == 0 || numberDouble > max) {
                    max = numberDouble;
                }
                counter++;
            }else {
                System.out.println("Program is over !");
                break;
            }
        }
        System.out.println("The minimum number is " + min);
        System.out.println("The maximum number is " + max);
    }
}


