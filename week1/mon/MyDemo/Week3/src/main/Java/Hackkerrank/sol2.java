package Hackkerrank;

import java.util.Collections;
import java.util.List;

public class sol2 {
    public static String angryProfessor(int k, List<Integer> a) {
        // Sorting the array. If people arrive negative minutes late, they're early. If they arrive 0 minutes late, they're on time. positive minutes are late.
        Collections.sort(a);

// Counting how many students are on time.
        int studentsOnTime = 0;
//Check each student's arrival time
        for (int i : a) {
//If this student is early or on time, add one to the students on time counter.
            if (i < 1) {
                studentsOnTime += 1;
//If we have at least enough students early or on time, we will not cancel class.
                if (studentsOnTime >= k)
                    return "NO";
            }
//Because every student after this student is late, no more students could be on time. To save processing more late students, then we just return
//class is cancelled.
            else {
                return "YES";
            }


        }
    }
}




