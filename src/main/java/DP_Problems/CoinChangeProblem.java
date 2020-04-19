package DP_Problems;

public class CoinChangeProblem {

    public static int dynamic(int[] v, int amount) {
        int[][] solution = new int[v.length + 1][amount + 1];

        // if amount=0 then just return empty set to make the change
        for (int i = 0; i <= v.length; i++) {
            solution[i][0] = 1;
        }

        // if no coins given, 0 ways to change the amount
        for (int i = 1; i <= amount; i++) {
            solution[0][i] = 0;
        }

        // now fill rest of the matrix.

        for (int i = 1; i <= v.length; i++) {
            for (int j = 1; j <= amount; j++) {
                // check if the coin value is less than the amount needed
                if (v[i - 1] <= j) {
                    // reduce the amount by coin value and
                    // use the subproblem solution (amount-v[i]) and
                    // add the solution from the top to it
                    solution[i][j] = solution[i - 1][j]
                            + solution[i][j - v[i - 1]];
                } else {
                    // just copy the value from the top
                    solution[i][j] = solution[i - 1][j];
                }
            }
        }
        return solution[v.length][amount];
    }

    public static int solveByDp(int[] v,int amount)
    {

        int[][] table = new int[v.length+1][amount+1];

        //if amount = 0 ; just return empty set;
        for(int i=0;i<=amount;i++)
        {
            table[0][i]=0;
        }
        for(int i=0;i<=v.length;i++)
        {
            table[i][0]=1;
        }

        for (int i=1;i<=v.length;i++)
        {
            for(int j=1;j<=amount;j++)
            {
                if(v[i-1]<=j)
                {
                    table[i][j] = table[i-1][j]+table[i][j-v[i-1]];
                }
                else
                {
                    table[i][j] = table[i-1][j];
                }
            }
        }
                return table[v.length][amount];
    }

    public static void main(String args[])
    {
        int amount = 5;
        int[] v = { 1, 2, 3 };

        System.out.println("DP solution1 is "+solveByDp(v,amount));
        System.out.println("DP solution2 is "+dynamic(v,amount));
    }
}
