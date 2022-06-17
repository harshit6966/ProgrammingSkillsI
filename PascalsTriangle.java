import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if(numRows == 0) {
            return res;
        }

        for(int i=0; i<numRows; i++) {
            ArrayList<Integer> thisRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    thisRow.add(1);
                else if (j < i) {
                    int thisNum = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    thisRow.add(thisNum);
                } else if (j == i)
                    thisRow.add(1);
            }
            res.add(thisRow);
        }
        return res;
    }

    public static void main(String[] args) {
        int numRows = 5;
        PascalsTriangle pt = new PascalsTriangle();
        System.out.println(pt.generate(numRows));
    }
}