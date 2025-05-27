/* ALGORITHM :
Sort activities by their finish times in ascending order.
(If activities are already sorted by finish time, skip this step.)
Initialize:
Select the first activity (index 0) and add it to the result list.
Set count = 1 (since the first activity is selected).
Set currFinish = finish[0] (finish time of last selected activity).
Iterate through the remaining activities from index 1 to n-1:
For activity i, check if start[i] >= currFinish (the start time is after or equal to the finish time of last selected activity).
If yes, select this activity:
Add i to the result list.
Increment count by 1.
Update currFinish = finish[i].
After all iterations, output the total count and the list of selected activity indices.
 */
import java.util.ArrayList;

public class q6ActivitySelectionProblemGreedyAlgo {

    public static void main(String[] args) {
        int start[] = {10, 12, 20};
        int finish[] = {20, 25, 30};
        ArrayList<Integer> selectedActivities = new ArrayList<>();
        int count = 1;
        selectedActivities.add(0);
        int currFinish = finish[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= currFinish) {
                selectedActivities.add(i);
                count++;
                currFinish = finish[i];
            }
        }
        System.out.println("Maximum number of activities = " + count);
        System.out.print("Activities that can be performed are (indices): ");
        for (int index : selectedActivities) {
            System.out.print(index + " ");
        }
    }
}
