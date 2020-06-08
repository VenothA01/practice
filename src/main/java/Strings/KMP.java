package Strings;

public class KMP {


    void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    int[] computeLPSArray(String pat,int[] lps){
        int M = pat.length();

        int length = 0;
        int i = 1;

        while (i<M){
            if(pat.charAt(i)==pat.charAt(length)){
                length++;
                lps[i]=length;
                i++;
            }
            else
            {
                if(length!=0){
                    length = lps[length-1];
                }
                else
                {
                    lps[i]=length;
                    i++;
                }
            }
        }


        return lps;
    }



    void KMPSearch(String txt,String pat){



        int M = pat.length();
        int N = txt.length();

        int[] lps = new int[M];
        computeLPSArray(pat,lps);
        int j=0;
        int i=0;

        while (i<N){
            System.out.println("i::"+i+"N::"+N);
            if(pat.charAt(j)==txt.charAt(j)){
                System.out.println("Matches");
                i++;
                j++;
            }
            if(j==M){
                System.out.println("Pattern found at index "+(j-i));
                j = lps[j-1];
            }
            else if(i<N && pat.charAt(j)!=txt.charAt(i)){
                System.out.println("NOT MATCHES");
                if(j!=0)
                {
                    System.out.println("J!=0");
                    j = lps[j-1];
                }
                else
                {
                    System.out.println("J==0");
                    i++;
                }
            }
        }




    }
    public static void main(String argsp[]){
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        new KMP().KMPSearch(txt,pat);

    }
}
