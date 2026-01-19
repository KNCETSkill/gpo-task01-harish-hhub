import java.util.Scanner;
public class BrewSizeAdvisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if(v>350){
            System.out.print("Large");
        }
        else if(v<200){
            System.out.print("Small");
        }
        else{
            System.out.print("Median");
        }
        sc.close();
    }
}

