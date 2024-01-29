package travelClub.service.logic;

import travelClub.entity.TravelClub;
import travelClub.service.ClubService;
import travelClub.store.ClubStore;
import travelClub.store.StoreLifeCycler;

import java.util.Arrays;
import java.util.List;

public class ClubServiceLogic implements ClubService {
//    private TravelClub[] clubs;
//    private int index;
    private ClubStore clubStore;

    public ClubServiceLogic(){
        this.clubStore = StoreLifeCycler.getUniqueInstance().requestClubStore();
    }

//    public ClubServiceLogic(){
//        this.clubs = new TravelClub[10];
//        this.index = 0;
//    }

    @Override
    public void register(TravelClub travelClub) {
//        clubs[index] = travelClub;
//        index++;
        this.clubStore.create(travelClub);
    }

    @Override
    public List<TravelClub> findAll() {
        return this.clubStore.retrieveAll();
    }

    @Override
    public List<TravelClub> findByName(String clubName) {
//        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0, index);
//        TravelClub[] foudClubs = new TravelClub[createdClubs.length];
//        int subIndex = 0;
//        for(TravelClub club : createdClubs){
//            if(club.getClubName().equals(clubName)){
//                foudClubs[subIndex] = club;
//                subIndex++;
//            }
//        }
//        return Arrays.copyOfRange(foudClubs, 0, subIndex);
        return this.clubStore.retireveAllByName(clubName);
    }

    @Override
    public TravelClub findById(String clubId) {
//        TravelClub[] createdClubs = Arrays.copyOfRange(clubs, 0, index);
//        TravelClub foundClub = null;
//        for(TravelClub club : createdClubs){
//            if(club.getId().equals(clubId)){
//                foundClub = club;
//                break;
//            }
//        }
//        return foundClub;
        return this.clubStore.retrive(clubId);
    }

    @Override
    public void modify(TravelClub modifyClub) {
//        int foundIndex = 0;
//        for(int i = 0; i < clubs.length; i++){
//            if(clubs[i].getId().equals(modifyClub.getId())){
//                foundIndex = i;
//                break;
//            }
//        }
//        this.clubs[foundIndex] = modifyClub;
        this.clubStore.update(modifyClub);
    }

    @Override
    public void remove(String clubId) {
//        int foundIndex = 0;
//        for(int i = 0; i < clubs.length; i++){
//            if(clubs[i].getId().equals(clubId)){
//                foundIndex = i;
//                break;
//            }
//        }
//        for(int i = foundIndex; i < this.index + 1; i++){
//            clubs[i] = clubs[i+1];
//        }
//
//        this.index--;
//
//    }
        this.clubStore.delete(clubId);
    }
}
