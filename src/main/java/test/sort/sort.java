package test.sort;

public class sort {

    public static void main(String[] args){

        int[] arr = {2,4,1,5,3,8,3};

        for (int i = 0; i < arr.length; i++){
          for (int j = i + 1; j < arr.length; j++){
              if(arr[i] > arr[j]){
                  int num = arr[i];
                  arr[i] = arr[j];
                  arr[j] = num;
              }
          }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
