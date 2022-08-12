public class Main {
    public static void main(String[] args) {
        int[] array = {30, 90, 140, 139};
        int size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Max Number: "+array[size-1]);
    }
}