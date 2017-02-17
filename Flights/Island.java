/*
 * @author mebs
 * @version 1.0
 */

class Island {
    String name, country;
    float[][] coordinates;
    boolean appropriate;

    Island(String name, String country, float[][] coordinates, boolean appropriate) {
        this.name = name;
        this.country = country;
        this.coordinates = coordinates;
        this.appropriate = appropriate;
    }

    Island(){}

    /* Awesome kingdom of sets */

    void setName(String name){
        this.name = name;
    }
    void setCountry(String country){
        this.country = country;
    }
    void  setCoordinates(float[][] coordinates){
        this.coordinates = coordinates;
    }
    void setAppropriate(boolean appropriate){
        this.appropriate = appropriate;
    }

    /* Awesome kingdom of gets */

    String getName(){
        return this.name;
    }
    String getCountry(){
        return this.country;
    }
    float[][] getCoordinates(){
        return this.coordinates;
    }
    boolean getAppropriate(){
        return this.appropriate;
    }


}
