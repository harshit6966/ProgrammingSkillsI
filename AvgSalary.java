public class AvgSalary { 
    public static double average(int[] salary) {
        int n = salary.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < n; i++){
            sum += salary[i];
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        double ans = (sum-min-max)/((n-2)*1.0);
        if(n > 2){
            return ans;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int [] arr = {50, 1000, 15000, 1, 10, 45};
        double ans = average(arr);
        System.out.println(ans);
    }
}