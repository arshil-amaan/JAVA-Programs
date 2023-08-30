import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
  static class Job {
    int id;
    int deadline, profit;

    Job(int id, int deadline, int profit) {
      this.id = id;
      this.deadline = deadline;
      this.profit = profit;
    }
  }

  public static ArrayList<Character> sequenceJob(int[][] jobs) {

    ArrayList<Job> jobs2 = new ArrayList<>();

    for (int i = 0; i < jobs.length; i++) {
      jobs2.add(new Job(i, jobs[i][0], jobs[i][1]));
    }

    // object sorting
    Collections.sort(jobs2, (obj1, obj2) -> obj2.profit - obj1.profit);

    ArrayList<Character> seq = new ArrayList<>();

    int time = 0;
    for (int i = 0; i < jobs2.size(); i++) {
      Job curr = jobs2.get(i);
      if (time < curr.deadline) {
        seq.add((char)(curr.id+65));
        time++;
      }
    }

    for (int i = 0; i < seq.size(); i++) {
      System.out.print("Job" + seq.get(i) + " ");
    }
    System.out.println();
    return seq;
  }

  public static void main(String[] args) {
    int[][] jobs = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
    System.out.println(sequenceJob(jobs));
  }
}
