package travelClub.store;

import travelClub.entity.TravelClub;
import java.util.List;
public interface ClubStore {
    void create(TravelClub travelClub);
    TravelClub retrive(String clubId);
    List<TravelClub> retireveAllByName(String clubName);
    List<TravelClub> retrieveAll();

    void update(TravelClub updateClib);
    void delete(String clubId);
}
