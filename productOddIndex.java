import java.io.*;


public class productOddIndex {

   public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter size of Array : ");
            int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                int productOddIndex = 1;

                for(int i = 0; i < arr.length; i++){

                    System.out.print("Enter " + (i + 1) + " element : ");

                    arr[i] = Integer.parseInt(br.readLine());
                    
                    if(i % 2 != 0){

                        productOddIndex *= arr[i];

                    }
                }

                System.out.println("Product of odd Index is : " + productOddIndex);
   }
}