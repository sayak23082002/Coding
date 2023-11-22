import java.util.ArrayList;
import java.util.Collections;
public class JobSequencing {
    static class Job {
        int deadLine;
        int profit;
        int id;
        Job(int i, int p, int d){
            deadLine = d;
            profit = p;
            id = i;
        }
    }
    public static void main(String[] args) {   
        int a[] [] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            jobs.add(new Job(i + 1, a[i][1], a[i][0]));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); //descending order // Collections.sort(jobs, (obj1, obj2) -> obj1.profit - obj2.profit); //ascending order
        int time = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int k = 0; k < jobs.size(); k++){
            int d = jobs.get(k).deadLine;
            if(d > time){
                time = d;
                list.add(k + 1);
            }
        }
        System.out.print(list);
    }
}