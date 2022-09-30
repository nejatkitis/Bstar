import java.util.Arrays;

public class Bstar {
    public static void main(String[] args) {
        String[][] b = new String[7][4];
        for (String[] row: b){
            for (String col : row){
                Arrays.fill(row,"  ");
            }
            System.out.println();
        }
        for (int i=0;i<b.length;i++){
            if (i==0 || i==6 || i==3){
                b[i][0] = " * ";
                b[i][1] = " * ";
                b[i][2] = " * ";
            } else {
                b[i][0] = " * ";
                b[i][3] = " * ";
            }
        }

        for (String[] row: b){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
