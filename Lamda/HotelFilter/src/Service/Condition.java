package Service;

import HotelModel.Hotel;

public interface Condition {
    public boolean matchesCriteria(Hotel hotel);
}
