
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   06/10/2017
 * @horario   16:18:44
 */
public class Uri_1074 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, numv;
        num = scan.nextInt();
        int nums[] = new int[num];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && nums[i] > 0){
                System.out.println("EVEN POSITIVE");;
            }else if(nums[i] % 2 != 0 && nums[i] < 0){
                System.out.println("ODD NEGATIVE");
            }else if(nums[i] % 2 != 0 && nums[i] > 0){
                System.out.println("ODD POSITIVE");
            }else if(nums[i] % 2 == 0 && nums[i] < 0){
                System.out.println("EVEN NEGATIVE");
            }else if(nums[i] == 0){
                System.out.println("NULL");
            }
        }
    }
}
