import java.util.Scanner;
/*Write the method displayBox that has two in parameters, width and height. The
method will print out a box made of '$' characters to the terminal that is 
as wide and high as
the arguments passed to it. For example, displayBox(6,3) would print this 
output to the
terminal:
$$$$$$
$$$$$$
$$$$$$
 */

class Question6{
    
    public static void displayBox(int width, int height){
        Scanner sc = new Scanner(System.in);
        for(int roll = 0;roll<height;roll++){
            
            for (int column =0; column < width; column++){
            System.out.print("$");
        }
        System.out.println("");
        }
        
        
    }

 
}
