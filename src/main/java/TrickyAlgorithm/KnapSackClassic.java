package TrickyAlgorithm;

public class KnapSackClassic {


    static int  KnapSackClassic(int[] weight,int[] profit,int maxWeight)
    {
        int[][] memTable = new int[weight.length][maxWeight];

        for(int i=0;i<maxWeight;i++){
            memTable[0][i]=0;
        }

        for(int j=0;j<weight.length;j++){
            memTable[j][0]=0;
        }


        for(int i=1;i<weight.length;i++){
            for(int j=1;j<maxWeight;j++){

                System.out.println(i+","+j);
                if(weight[i-1]<=j)
                {
                    memTable[i][j] = Math.max((memTable[i-1][j]), memTable[i-1][j-weight[i-1]]+profit[i-1]);
                }
                else {
                    memTable[i][j] =  memTable[i-1][j];
                }
            }
        }

        return  memTable[weight.length-1][maxWeight] ;
    }

    public static void main(String args[]){

        int[] weight = {10, 20, 30};
        int[] profit = {60, 100, 120};
        int maxWeight = 50;
        System.out.println(KnapSackClassic(weight,profit,maxWeight));

    }
}
