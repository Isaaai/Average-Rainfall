import java.util.Scanner;

public class a4main {

    public static void main (String[] args){
    
    int years;
    int months;
    double rainFall = 0; 
    double averageRainfall = 0;
    double totalRainFall = 0;
    int iYears;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please provide the numbers of years\n" 
            + "for which you would calculate average rain fall:");
    years = keyboard.nextInt();
while (years < 1){
    System.out.println("The number of years can't be less than 1\n" 
            + "Please re-enter the number of years");
    years = keyboard.nextInt();
}    
for (iYears = 1; iYears <= years; iYears++)
{    
    totalRainFall = 0;
    for (months = 1; months <= 12; months++)
    {
        System.out.println("Please enter the inches of rain for each month");
        rainFall = keyboard.nextDouble();
    
        while (rainFall < .001){
        System.out.println("The inches in rain can't be less than .001\n" 
            + "Please re-enter the inches of rain for this month");
        rainFall = keyboard.nextInt();
        }
        
        totalRainFall += rainFall;
        averageRainfall = totalRainFall/months;
    }
    System.out.println("Out of " + (months -1) + " months");
    System.out.println("There was a total of " + totalRainFall + " inches of Rain");
    System.out.println("With an averge rainfall of: " + averageRainfall + " inches per month");
    }
}
}

