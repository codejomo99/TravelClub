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
        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0, index);
        TravelClub[] foudClubs = new TravelClub[createdClubs.length];
        int subIndex = 0;
        for(TravelClub club : createdClubs){
            if(club.getClubName().equals(clubName)){
                foudClubs[subIndex] = club;
                subIndex++;
            }
        }
        return Arrays.copyOfRange(foudClubs, 0, subIndex);
    }

    @Override
    public TravelClub findById(String clubId) {
        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0, index);
        TravelClub foundClub = null;
        for(TravelClub club : createdClubs){
            if(club.getId().equals(clubId)){
                foundClub = club;
                break;
            }
        }
        return foundClub;
    }

    @Override
    public void modify(TravelClub modifyClub) {

    }

    @Override
    public void remove(String clubId) {

    }
}
