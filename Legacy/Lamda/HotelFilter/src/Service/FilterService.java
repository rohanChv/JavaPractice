package Service;
import java.util.ArrayList;
import java.util.List;

import HotelModel.Hotel;

public class FilterService {
    public List<Hotel> famousHotels=new ArrayList<>();
    public FilterService(){
        famousHotels.add(new Hotel(1,4.5,"Pune","Maharashtra","India",3500,true));
        famousHotels.add(new Hotel(2,3.9,"Pune","Maharashtra","India",4500,false));
        famousHotels.add(new Hotel(3,4.9,"Mumbai","Maharashtra","India",6500,true));
        famousHotels.add(new Hotel(4,4.0,"Banglore","Karnataka","India",3500,false));
        famousHotels.add(new Hotel(5,2.9,"Pune","Maharashtra","India",1500,false));
        famousHotels.add(new Hotel(6,1.5,"Patna","Bihar","India",500,true));
        famousHotels.add(new Hotel(7,4.5,"Chambal","Madhya Pradesh","India",50,true));
        famousHotels.add(new Hotel(8,4.9,"New Delhi","Delhi","India",15000,true));

    }
    public List<Hotel> filterHotel(Condition c){
        List<Hotel> filteredHotels=new ArrayList<>();
        for(Hotel hotel:famousHotels){
            if(c.matchesCriteria(hotel)){
                filteredHotels.add(hotel);
            }
        }
        return filteredHotels;
    }
}
