import java.util.Arrays;

public class Main {
        public static int Cand(int[]nums){
            int cand=0;
            int points=0;
            for(int i=0;i<nums.length;i++){
                if(points==0){
                    cand=nums[i];
                }
                if(cand==nums[i]){
                    points++;
                }
                else{
                    points--;
                }
            }
            return cand;
        }
    public static void main(String[] args) {
        int [] nums={2,3,2,2,2,3};
        System.out.println("majority ELement :"+Cand(nums));

}
}