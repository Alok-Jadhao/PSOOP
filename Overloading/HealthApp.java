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

// i kg = 2.2062

import java.util.Scanner;

class Calorie{
    String name;
    int body_weight, intensity, min_exercise, favorite_cal; 
    double total;

    double calorieCounter(int body_weight){
        return 70 * (body_weight / 2.2)*0.756;
    }

    //0.0385 * Intensity * P * Minutes
    double calorieCounter(int body_weight, int intensity, int min_exercise){
        return 0.0385 * intensity * body_weight * min_exercise;
    }

    double totalCalRequired() {
        total =  calorieCounter(body_weight) + calorieCounter(body_weight, intensity, min_exercise);
        total += total * 0.1;
        return total;
    }

    int serving(){
        return (int)total/favorite_cal;
    }

}

public class HealthApp{
    public static void main(String[] args) {
        String name;
        int body_weight, intensity, min_exercise, favorite_cal; 
        double total;
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, Welcome to our Health-App");

        Calorie cal = new Calorie();

        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.print("Enter your Body Weight (in pounds): ");
        body_weight = in.nextInt();
        System.out.print("Enter the calories for your favourite food: ");
        favorite_cal = in.nextInt();
        System.out.print("Enter your duration of exercise: ");
        min_exercise = in.nextInt();

        System.out.println("For your reference: ");
        System.out.println("_A_c_t_iv_i_t_y____________________In_t_e_n_s_i_ty_\n" + //
                        "Running 10 mph: \t\t\t\t\t17\n" + //
                        "Running 6 mph: \t\t\t\t\t10\n" + //
                        "Basketball: \t\t\t\t\t\t8\n" + //
                        "Walking 1 mph: \t\t\t\t\t1");
        System.out.println("Now, enter your intensity (in numbers): ");
        intensity = in.nextInt();
        
    }
}

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
