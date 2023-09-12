import java.util.Scanner;

public class Beker {
    public static int[] scanIn(){
        
    int[] ketSzam = {0,0};
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 2; i++) {
            
            int scData = sc.nextInt();
            ketSzam[i] = scData;
    }
        sc.close();
        return ketSzam;
    }
}
