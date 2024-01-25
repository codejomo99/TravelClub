package travelClub.ui.console;

import travelClub.service.ClubService;
import travelClub.service.ServiceLogicLifeCycler;

public class ClubSubConsole {
    private ClubService clubService;
    public ClubSubConsole(){
        this.clubService = ServiceLogicLifeCycler.getUniqueInstance().getClubService();
    }
}
