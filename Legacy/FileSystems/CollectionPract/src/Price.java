public class Price {
    Double basePrice;
    Double excpPrice;

    public Price(Double basePrice, Double excpPrice) {
        this.basePrice = basePrice;
        this.excpPrice = excpPrice;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getExcpPrice() {
        return excpPrice;
    }

    public void setExcpPrice(Double excpPrice) {
        this.excpPrice = excpPrice;
    }
}
