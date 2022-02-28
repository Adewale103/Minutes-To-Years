import java.util.Scanner;
public class NumberOfYearsInMinute{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the number of minutes: ");
     double Minutes = input.nextDouble();
     double Year = Minutes/(365 * 24 * 60);
     double Days = Minutes%(365 * 24 * 60)/(60 * 24);

     System.out.printf("%.0f minutes is approximately %.0f years and %.0f days %n", Minutes, Year, Days);

}
}
