/*
 36. Find Common Elements in All Rows of a Matrix 
Input: 
mat[][] = {{1, 2, 1},   
{2, 3, 1},   
{3, 1, 2}} 
Output: 1 
Explanation: 1 appears in every row.  */
package gfg;
public class q36 {
    public static void main(String[] args) {
        int mat[][] = {
            {2, 2, 1},
            {2, 3, 1},
            {3, 1, 2}
        };

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < cols; i++) {
            int num = mat[0][i];
            boolean isCommon = true;

            for (int j = 1; j < rows; j++) {
                boolean found = false;
                for (int k = 0; k < cols; k++) {
                    if (mat[j][k] == num) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon) {
                System.out.println("Common element: " + num);
                return; // If you only want one common element, exit here
            }
        }

        System.out.println("No common element found");
    }
}
