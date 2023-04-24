import java.io.*;

public class divisibleby5 {


   public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];
        

        for(int i  = 0; i < arr.length; i++){

                System.out.print("Enter " + (i + 1) + " element : ");
                
                arr[i] = Integer.parseInt(br.readLine());

                
        }

        System.out.println("Divisible by 5 : ");

        for(int i = 0; i < arr.length; i++){

                if(arr[i] % 5 == 0){

                    System.out.print(arr[i] + " ");

                }

        }

        System.out.println();
   }
}
