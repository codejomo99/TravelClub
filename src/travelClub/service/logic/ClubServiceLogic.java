package travelClub.service.logic;

import travelClub.entity.TravelClub;
import travelClub.service.ClubService;
import java.util.Arrays;

public class ClubServiceLogic implements ClubService {
    private TravelClub[] clubs;
    private int index;

    public ClubServiceLogic(){
        this.clubs = new TravelClub[10];
        this.index = 0;
    }

    @Override
    public void register(TravelClub travelClub) {
        clubs[index] = travelClub;
        index++;
    }

    @Override
    public TravelClub[] findAll() {
        return Arrays.copyOfRange(clubs, 0, index);
    }

    @Override
    public TravelClub[] findByName(String clubName) {
        return new TravelClub[0];
    }

    @Override
    public TravelClub findById(String clubId) {
        return null;
    }

    @Override
    public void modify(TravelClub modifyClub) {

    }

    @Override
    public void remove(String clubId) {

    }
}
