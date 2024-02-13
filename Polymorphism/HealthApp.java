/*
To maintain one’s body weight, an adult human needs to consume enough calories daily to
 (1) meet the basal metabolic rate (energy required to breath, maintain body temperature, etc.), 
(2) account for physical activity such as exercise, and 
(3) account for the energy required to digest the food that is being eaten. 

For an adult that weighs P pounds we can estimate these caloric requirements using the following formulas:
1. Basal metabolic rate: Calories required = 70 * (P / 2.2)0.756
2. Physical activity: Calories required = 0.0385 * Intensity * P * Minutes

Here, Minutes is the number of minutes spent during the physical activity, and Intensity is a number that estimates the intensity of the activity. 
Here are some sample numbers for the range of values:
_A_c_t_iv_i_t_y____________________In_t_e_n_s_i_ty_
Running 10 mph: 					17
Running 6 mph: 					10
Basketball: 						8
Walking 1 mph: 					1

3. Energy to digest food: calories required = TotalCaloriesConsumed * 0.1

In other words, 10% of the calories we consume goes towards digestion.

Write a function that computes the calories required for the basal metabolic rate, taking as input a parameter for the person’s weight. 
Write another function that computes the calories required for physical activity, taking as input parameters for the intensity, weight, and minutes spent exercising.

Use these functions in a program that inputs a person’s weight, an estimate for the intensity of physical activity, the number of minutes spent performing the physical activity, and the number of calories in one serving of your favorite food. 

The program should then calculate and output how many servings of that food should be eaten per day to maintain the person’s current weight at the specified activity level. 

The computation should include the energy that is required to digest food.
You can find estimates of the caloric content of many foods on the web.
For example, a double cheeseburger has approximately 1000 calories.
*/


/*
 * Flow:
 * Input: All inputs.
 * Calorie count:2 function:
 * 1) Basal
 * 2) Physical
 * 
 * Physical would require many functions.
 * Intensity.
 * Activity and speed.
 * 
 * function to calculate calorie for different intensity, speed, activity.
 */


 
import java.util.Scanner;

class Calorie{
    String name;
    int body_weight, intensity, min_exercise, favorite_cal;

    public Calorie(String name, int body_weight, int intensity, int min_exercise, int favorite_cal) {
        this.name = name;
        this.body_weight = body_weight;
        this.intensity = intensity;
        this.min_exercise = min_exercise;
        this.favorite_cal = favorite_cal;
    }

    double calorieCounter(int body_weight){
        return 70 * (body_weight / 2.2)*0.756;
    }

    //0.0385 * Intensity * P * Minutes
    double calorieCounter(int body_weight, int intensity, int min_exercise){
        return 0.0385 * intensity * body_weight * min_exercise;
    }

    double totalCalRequired() {
        return calorieCounter(body_weight) + calorieCounter(body_weight, intensity, min_exercise);
        
    }
    double calorieCounter(double total){
        return totalCalRequired() * 0.1;
    }

    double serving(){
        double serve = totalCalRequired()/favorite_cal;
        return Math.floor(serve);

    }

}

public class HealthApp{
    public static void main(String[] args) {
        String name;
        int body_weight, intensity, min_exercise, favorite_cal; 
        double total = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, Welcome to our Health-App");


        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.print("Enter your Body Weight: ");
        body_weight = in.nextInt();
        System.out.print("Enter your duration of exercise: ");
        min_exercise = in.nextInt();


        System.out.println("For your reference: ");
        System.out.println("A_c_t_iv_i_t_y____________________In_t_e_n_s_i_ty_\n" + //
                        "Running 10 mph: \t\t\t17\n" + //
                        "Running 6 mph: \t\t\t\t10\n" + //
                        "Basketball: \t\t\t\t8\n" + //
                        "Walking 1 mph: \t\t\t\t1");
        System.out.print("Now, enter your intensity (in numbers): ");
        intensity = in.nextInt();

        System.out.println("Food Item____________________Calorie Count (per 100 grams)\n" + //
                        "Double cheese burger: \t\t\t295\n" + //
                        "Pizza:  \t\t\t\t266\n" + //
                        "Gulab Jamun: \t\t\t\t323\n" + //
                        "Rasgulla: \t\t\t\t186");


        System.out.print("Enter the calories for your favourite food: ");
        favorite_cal = in.nextInt();

        Calorie cal = new Calorie(name, body_weight, intensity, min_exercise, favorite_cal);
        total = cal.totalCalRequired();
        
	System.out.println("Select your choice for the type of calorie: \n1. Basal Calories  2. Calories burned due to Physical Activity  3. Calories Required for Digestion.");

    int choice = in.nextInt();
    switch (choice) {
        case 1:
            double basal = cal.calorieCounter(body_weight);
            System.out.println("Your basal calories is: " + basal);
            break;
        
        case 2:
            double physical = cal.calorieCounter(body_weight, intensity, min_exercise);
            System.out.println("Your Calories burned due to Physical Activity: " + physical);
            break;

        case 3:
            double digest = cal.calorieCounter(total);
            System.out.println("Calories requried for digestion: " + digest);
            break;
        default:
            System.out.println("Invalid choice.");
            break;   
    }
    
    double serving = cal.serving();
    System.out.println("You can eat " + serving + " servings of your favourite food.");

    System.out.println();
    System.out.println("Thank you for you using our app.");
    }

}


