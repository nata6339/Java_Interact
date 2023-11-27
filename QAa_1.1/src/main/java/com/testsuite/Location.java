package Nataliia_Buchna_HW.travel_HW_11;

public class Location {
    private final String name;
    public Location(String locName){
        name = locName;
    }

    @Override
    public String toString() {
        return name;
    }
}
