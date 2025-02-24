package HotelModel;

public class Hotel {
    int id;
    double rating;
    String city;
    String state;
    String country;
    double pricePerNight;
    boolean chaufer;

    public Hotel(int id, double rating, String city, String state, String country, double pricePerNight, boolean chaufer) {
        this.id = id;
        this.rating = rating;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pricePerNight = pricePerNight;
        this.chaufer = chaufer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isChaufer() {
        return chaufer;
    }

    public void setChaufer(boolean chaufer) {
        this.chaufer = chaufer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", rating=" + rating +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", chaufer=" + chaufer +
                '}';
    }
}
