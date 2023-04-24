import java.io.*;

public class onlyOwels {

   public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            char ch[] = new char[7];

            for(int i = 0; i < ch.length; i++){

                    System.out.print("Enter " + (i + 1) + " char : ");
                    ch[i] = br.readLine().charAt(0);

                    
            }
                System.out.print("Vowels are : ");
            for(int i = 0; i < ch.length; i++){

                    // System.out.println(ch[i]);

                    if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){

                        System.out.print(ch[i] + " ");

                    }

            }
            System.out.println();


    
   } 
    
}
