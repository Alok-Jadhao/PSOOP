package Arrays;

import java.util.Arrays;

class Schedule {
    boolean[][] schedule;

    public Schedule(boolean[][] scheduleData) {
        this.schedule = scheduleData;
    }

    void setBusy(int row, int col) {
        schedule[row][col] = true;
    }

    void setFree(int row, int col) {
        schedule[row][col] = false;
    }

    boolean isFree(int timeSlot, int day) {
        // Check if the element at the given time slot and day is false (meaning free)
        return !schedule[timeSlot][day];
      }

    void display() {
        for (boolean[] row : schedule) {
            System.out.println(Arrays.toString(row));
        }
    }

    
      
}

public class Swimming {
    public static void main(String[] args) {
        System.out.println("In boolean array: True = busy, False = free\nRow : Time (11-3) in 1 hour blocks.\nCol: Days (Monday-Tuesday).");
        boolean[][] Jeff = {
                {true, true, false, false},
                {false, true, true, true},
                {false, true, true, false},
                {true, true, true, false}
        };

        boolean[][] Anna = {
                {true, true, false, true}, // Row 0
                {false, true, false, true}, // Row 1
                {true, true, false, false}, // Row 2
                {true, false, true, false}  // Row 3
        };

        Schedule[] schedules = new Schedule[2];
        schedules[0] = new Schedule(Jeff);
        schedules[1] = new Schedule(Anna);

        schedules[0].display();
        System.out.println();
        findIndividualSlots(schedules);

    }

    public static void findIndividualSlots(Schedule[] schedules) {
        System.out.println("\nTime slots available for individual lessons:");
        for (int timeSlot = 0; timeSlot < schedules[0].schedule.length; timeSlot++) {
          boolean hasPrintedSlot = false; // Flag to prevent multiple prints per time slot
          for (int day = 0; day < schedules[0].schedule[timeSlot].length; day++) {
            if (isAtLeastOneFree(schedules, timeSlot, day)) {
              // Convert day and time slot to a human-readable format (optional)
              String freeTime = getDayName(day) + " at " + getTimeSlotString(timeSlot);
              if (!hasPrintedSlot) {
                System.out.println(freeTime);
                hasPrintedSlot = true;
              }
            }
          }
        }
      }
      
      // Helper method to check if at least one schedule is free
      private static boolean isAtLeastOneFree(Schedule[] schedules, int timeSlot, int day) {
        for (Schedule schedule : schedules) {
          if (schedule.isFree(timeSlot, day)) {
            return true;
          }
        }
        return false;
      }
      

}
