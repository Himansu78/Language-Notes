package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {
    public static void main(String[] args) {

        int n = 5;
        Job[] jobs = new Job[n];
        jobs[0] = new Job(1,2,100);
        jobs[1] = new Job(2,1,19);
        jobs[2] = new Job(3,1,27);
        jobs[3] = new Job(4,1,25);
        jobs[4] = new Job(5,1,25);
        // {(1,2,100),(2,1,19),(3,2,27),
        //        (4,1,25),(5,1,15)}
        //System.out.println(jobs);

        System.out.println("The output is: \n   ");
        int[] ans = jobSequencing(jobs,jobs.length);
        System.out.println(ans[0] +"  "+ ans[1]);
    }
    public static int[] jobSequencing(Job[] jobs, int n){
        Arrays.sort(jobs, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2)
            {
                return o2.profit- o1.profit;
            }
        });

        int slot[] = new int[n];
        Arrays.fill(slot,0);
        int profit=0,task=0;

        for (int i=0;i<n;i++){
            for (int j=jobs[i].deadline-1; j>=0;j--){
                if(slot[j] == 0){
                    slot[j] = 1;
                    profit += jobs[i].profit;
                    task++;
                    break;
                }
            }
        }

        int[] result = {task,profit};
        return result;
    }
}

class Job{
    int jobNo, deadline, profit;

    public Job(int jobNo, int deadline, int profit) {
        this.jobNo = jobNo;
        this.deadline = deadline;
        this.profit = profit;
    }
}