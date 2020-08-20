package Address;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(73123);
        address.setApartment(77);
        address.setCity("Kyiv");
        address.setCountry("Ukraine");
        address.setStreet("Symyrenko");
        address.setHouse(12);

        System.out.println("Index: " + address.getIndex()
                        +  ", Country: " + address.getCountry()
                        + ", City: " + address.getCity()
                        + ", Street: " + address.getStreet()
                        + ", House: " + address.getHouse()
                        + ", Apartment: " + address.getApartment());
    }
}
