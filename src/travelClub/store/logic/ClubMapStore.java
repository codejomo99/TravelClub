package travelClub.store.logic;

import travelClub.entity.TravelClub;
import travelClub.store.ClubStore;

import java.util.List;

public class ClubMapStore implements ClubStore {
    @Override
    public void create(TravelClub travelClub) {

    }

    @Override
    public TravelClub retrive(String clubId) {
        return null;
    }

    @Override
    public List<TravelClub> retireveAllByName(String clubName) {
        return null;
    }

    @Override
    public List<TravelClub> retrieveAll() {
        return null;
    }

    @Override
    public void update(TravelClub updateClib) {

    }

    @Override
    public void delete(String clubId) {

    }
}
