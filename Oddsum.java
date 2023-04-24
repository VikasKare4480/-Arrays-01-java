import java.io.*;


public class Oddsum {

   public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of Array : ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        int Oddsum = 0;

        for(int i = 0; i < arr.length; i++){

                System.out.print("Enter " + (i+1) + " element : ");
                arr[i] = Integer.parseInt(br.readLine());

                if(arr[i] % 2 != 0){

                    Oddsum += arr[i];
                }
        }
        System.out.println("sum of odd elements : " + Oddsum); // print this and endline 
   } 
    
}
