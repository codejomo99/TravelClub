package travelClub.store.logic;
import travelClub.entity.TravelClub;
import travelClub.store.ClubStore;

import java.util.*;
import java.util.stream.Collectors;

public class ClubMapStore implements ClubStore {

    private Map<String, TravelClub> clubMap;
    public ClubMapStore(){
        this.clubMap = new HashMap<>();
    }


    @Override
    public void create(TravelClub travelClub) {
        this.clubMap.put(travelClub.getId(),travelClub);
    }

    @Override
    public TravelClub retrive(String clubId) {

        return this.clubMap.get(clubId);
    }

    @Override
    public List<TravelClub> retireveAllByName(String clubName) {

        return clubMap.values().stream()
                .filter(club -> club.getClubName().equals(clubName))
                .collect(Collectors.toList());
    }

    @Override
    public List<TravelClub> retrieveAll() {
        return new ArrayList<>(this.clubMap.values());
    }

    @Override
    public void update(TravelClub updateClub) {
        this.clubMap.put(updateClub.getId(), updateClub);
    }

    @Override
    public void delete(String clubId) {
        this.clubMap.remove(clubId);
    }
}
