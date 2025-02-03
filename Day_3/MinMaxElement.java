public class MinMaxElement {
    public static void main(String[] args) {
        int array[]={1,3,45,90,12,100};
        int min=array[0];
        int max=array[0];
        
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];            
            }
            else if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Minimum Element: "+min);
        System.out.println("Maximum Element: "+max);
        
    }
}
