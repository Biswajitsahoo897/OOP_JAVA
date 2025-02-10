package Experiment_03;

public class FreqCount {
    public static void main(String[] args) {
        int freq=0;
        int arr[]={2,5,1,5,9,1,10,23,13,89};
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i])continue;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    freq++;
                }
            }
            System.out.printf("Fequency of %d -> %d",arr[i],freq);
            System.out.println();
        }

    }
}
