
Brute force -
public int canCompleteCircuit(int[] gas, int[] cost){
    int n = gas.length;
    for(int i = 0; i < n; i++){
        int totalFuel = 0;
        int stopCount = 0, j = i;
        while(stopCount < n){
            totalFuel += gas[j % n] - cost[j % n];
            if(totalFuel < 0) break; // whenever we reach -ve
            stopCount++;
            j++;
        }
        if(stopCount == n && totalFuel >= 0) return i; // cover all the stops & our fuel left is 0 or more than that
    }
    return -1;
}


Optimzed

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalFuel = 0;
        int currentFuel = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            totalFuel += gas[i] - cost[i];
            currentFuel += gas[i] - cost[i];

            // If we run out of fuel at this point, reset and try starting from the next station
            if (currentFuel < 0) {
                start = i + 1;
                currentFuel = 0;
            }
        }

        // If the total fuel is negative, it means there is no way to complete the circular tour
        return totalFuel >= 0 ? start : -1;
    }
}

Observation -
The concept of using two pointers, often referred to as "current" and "total" or "start" and "end," can be a useful strategy to optimize algorithms that involve nested loops. By maintaining additional variables to keep track of the current state or progress, you can often reduce the time complexity from O(n^2) to O(n) or improve the overall efficiency of the algorithm.

This technique is particularly common in scenarios where the nested loops are used to explore or iterate over the elements of an array or a sequence. Instead of relying on two separate loops, you can combine their logic into a single loop by carefully updating and managing the state with the help of additional variables.

The specific implementation details may vary based on the problem, but the general idea is to explore the possibility of using a single loop and smartly updating the state to achieve better time complexity.

The examples you provided for the gas station problems demonstrate this concept well, showcasing how the use of two pointers (currentFuel and totalFuel) can lead to more efficient algorithms.
