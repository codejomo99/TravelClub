package travelClub;

import travelClub.entity.TravelClub;
import travelClub.ui.menu.ClubMenu;
import travelClub.util.DateUtil;

 public class StoryAssistant {
    private void startStroy(){
        ClubMenu clubMenu = new ClubMenu();
        clubMenu.show();
    }

    public static void main(String[] args) {
        StoryAssistant assistant = new StoryAssistant();
        assistant.startStroy();
    }

}
