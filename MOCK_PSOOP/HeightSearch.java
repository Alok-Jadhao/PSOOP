/*
Write a java program to keep a record of heights and weight of 10 different
people, and find out the number of people whose weight is less than 50kg and
height is more than 170cms.
*/

class HandW {
    int height;
    int weight;
    
    HandW(int h, int w) {
        height = h;
        weight = w;
    }
}

class HeightSearch {
    public static void main(String[] args) {
        HandW[] hw = new HandW[5];
        hw[0] = new HandW(180, 60);
        hw[1] = new HandW(175, 40);
        hw[2] = new HandW(170, 50);
        hw[3] = new HandW(175, 55);
        hw[4] = new HandW(195, 45);


        System.out.println("People with weight less than 50kg and height more than 170cm are: " + search(hw));

    }

    public static int search(HandW[] hw) {
        int count = 0;

        for (int i = 0; i < hw.length; i++) {
            if(hw[i].weight < 50 && hw[i].height > 170) {
                count++;
            }
        }
        
        return count;
    }
}
