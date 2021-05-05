import java.util.Scanner;

public class daemons{

    private String warBandName;
    private String legion;
    private String chosenGod;


    public daemons()
    {
       Scanner in = new Scanner(System.in); 
       System.out.print("Enter your warband name: ");
       this.warBandName = in.nextLine();

       System.out.println("-Black Legion\n-Night Lords\n-Iron Warriors \n-Alpha Legion\n Enter Legion here: ");
       this.legion = in.nextLine();
       System.out.println("-Khorne\n-Nurgle\n-Tzeentch \n-Slaanesh\nChoose a god!:");
       this.chosenGod = in.nextLine();
       System.out.println(warBandName + " " + legion + " " + chosenGod + "");
    }

    public String toString(){
        return "Name: " + warBandName + "" +
        "\nlegion: " + legion + "" +
        "\nGod: " + chosenGod;
    }
    
}