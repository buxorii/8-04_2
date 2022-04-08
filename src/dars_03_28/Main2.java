package dars_03_28;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Dasturchi[] gitHubTeam = new Dasturchi[10];
        Dasturchi d = new Dasturchi();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            gitHubTeam[i]=d;
            gitHubTeam[i].ismi=in.next();
            gitHubTeam[i].dasturlashTillari = in.next();
            gitHubTeam[i].level = in.next();
            count++;
        }


        for (int i = 0; i < count; i++) {
            System.out.print(gitHubTeam[i].ismi+" ");
            System.out.print(gitHubTeam[i].level+" ");
            System.out.println(gitHubTeam[i].familiyasi);
        }


    }
}
