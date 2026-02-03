package greedy;

import java.util.*;

public class JobScheduling {

    public static void main(String[] args) {
        Job[] jobs = {
                new Job('a', 2, 150),
                new Job('b', 1, 200),
                new Job('c', 1, 100),
                new Job('d', 2, 250),
        };

        JobScheduling obj = new JobScheduling();
        char[] order = obj.schedule(jobs);

        System.out.println("The order is: " + Arrays.toString(order));
    }

    private char[] schedule(Job[] jobs) {
        PriorityQueue<Job> pq = new PriorityQueue<>((job1, job2) -> job1.profit - job2.profit);

        Arrays.sort(jobs, Comparator.comparingInt((Job j) -> j.deadline));
        for (Job job: jobs) {
            if (job.deadline > pq.size()) {
                pq.offer(job);
            } else {
                if (job.profit > pq.peek().profit) {
                    pq.poll();
                    pq.offer(job);
                }
            }
        }

        List<Job> jobList = new ArrayList<>(pq);
        jobList.sort(Comparator.comparingInt(j -> j.deadline));

        char[] order = new char[pq.size()];
        int ptr = 0;

        for (Job job: jobList) {
            order[ptr++] = job.jobId;
        }

        return order;
    }
}

class Job {
    char jobId;
    int deadline;
    int profit;

    public Job(char jobId, int deadline, int profit) {
        this.jobId = jobId;
        this.deadline = deadline;
        this.profit = profit;
    }
}