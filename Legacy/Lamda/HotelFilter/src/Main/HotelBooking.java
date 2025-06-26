package Main;

import HotelModel.Hotel;
import Service.FilterService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HotelBooking {
    public static void main(String[] args) {
        FilterService filter=new FilterService();
        System.out.println("Available Hotels ->" );
        filter.famousHotels.forEach(System.out::println);
        List<Hotel> qualityHotels;
        System.out.println("---Highest Rated Hotels---");
        qualityHotels=filter.filterHotel((hotel)->hotel.getRating()>4);
        Comparator<Hotel> rankSort=Comparator.comparing(Hotel::getRating).thenComparing(Hotel::getCity);
        qualityHotels.sort(rankSort);
        qualityHotels.forEach(System.out::println);
        System.out.println("---chaufer Hotels----");
        qualityHotels.clear();
        qualityHotels=filter.filterHotel(Hotel::isChaufer);

        qualityHotels.forEach(System.out::println);
    }
}
