package travelClub.ui.console;

import travelClub.entity.TravelClub;
import travelClub.util.ConsoleUtil;

public class ClubConsole {

    private ConsoleUtil consoleUtil;

    public ClubConsole(){
        this.consoleUtil = new ConsoleUtil();
    }
    public void register(){

        while (true){
            String clubName = consoleUtil.getValueOf("Club Name(0.Club Menu)");
            if(clubName.equals("0")){
                return;
            }

            String intro = consoleUtil.getValueOf("Club Intro(0.Club Menu)");
            if(intro.equals("0")){
                return;
            }

            TravelClub newClub = new TravelClub(clubName,intro);
            System.out.println("Registered Club : " + newClub);
        }

    }
    public void findAll(){
        System.out.println("Find All");
    }

    public void findById(){

    }
}
