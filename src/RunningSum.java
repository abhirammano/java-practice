import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args){
        //take user number input
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers?");
        int inputSize=scanner.nextInt();
        int[] num=new int[inputSize];

        //take each entry
        for(int i=0;i<inputSize;i++){
            System.out.println("Enter number "+(i+1)+" -");
            num[i]=scanner.nextInt();
        }
        //call convertArray method and show the output to user
        RunningSum newArray=new RunningSum();
        int[] output=newArray.convertArray(num);
        /*for(int out:output){
            System.out.println();
        }*/
        System.out.println("Running sum Array :"+ Arrays.toString(output));
    }
    public int[] convertArray(int[] nums) {
        int[] out=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                out[i]=nums[i];
            }
            else{
                out[i]=nums[i]+out[i-1];
            }
        }
        return out;
    }
}
