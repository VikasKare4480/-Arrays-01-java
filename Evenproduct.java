import java.io.*;


public class Evenproduct {

   public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter size of Array : ");
            int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                if(size == 0){

                    System.out.println("No elements in the array ");

                }

                int product = 1;

                    for(int i = 0; i < arr.length; i++){



                            System.out.print("Enter " + (i + 1) + " element : ");

                            arr[i] = Integer.parseInt(br.readLine());
                            
                            if(arr[i] % 2 == 0){

                                product *= arr[i];

                            }

                    }

                    if(size > 0){

                        System.out.println("Product of all the even elements : "+ product);

                    }else{

                        // System.out.println("size is zero : ");
                    }
   } 
    
}
