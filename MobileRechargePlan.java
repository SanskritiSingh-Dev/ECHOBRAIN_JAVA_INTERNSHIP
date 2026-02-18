/*mobile recharge

rs. 149 for 1GB/day
rs. 199 for 1.5GB/day
rs. 249 for 2GB/day
*/

import java.util.Scanner;

public class MobileRechargePlan {
    public static void main(String[] agrgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data  you want to recharge:");
        double plan = sc.nextDouble();
        if(plan ==1){
            System.out.println("you have selected 1GB/day plan for rs.149");
        }
        else if(plan == 1.5){
            System.out.println("you have selected 1.5GB/day plan for rs.199");
        }
        else if(plan == 2){
            System.out.println("you have selected 2GB/day plan for rs.249");
        }
        else{
            System.out.println("we don't have this plan, please select a valid plan");
        }
        sc.close();
    }
    
}
