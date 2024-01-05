package travelClub;

import travelClub.entity.TravelClub;
import travelClub.util.DateUtil;

public class StoryAssistant {
    public static void main(String[] args) {
        TravelClub newClub = new TravelClub("Jeju Club","Jeju TravelClub");
        System.out.println(newClub.toString());

        System.out.println(TravelClub.getSample().toString());

    }
}
