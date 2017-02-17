/*
 * @author mebs
 * @version 1.0
 */

import java.util.Objects;

class Airplane {
    private String flightID, origin, destination, company, status;
    private int seats;
    /* The Airplane ID and the Flight ID (passenger) have to be the same*/

    Airplane(String id, String origin, String destination, String status, String company, int seats){

        this.origin = origin;
        this.destination = destination;
        this.company = company;
        this.seats = seats;
        this.flightID = id;
        this.status = status;

        if(Objects.equals(this.origin, this.destination)) System.err.print("Origin and destination can't be the same");
    }

    Airplane(){
    }


    /* Awesome kingdom of sets */

    void setOrigin(String origin){
        this.origin = origin;
    }

    void setDestination(String destination){
        this.destination = destination;
    }

    void setCompany(String company){
        this.company = company;
    }

    void setSeats(int seats){
        if(seats > 0) this.seats = seats;
        else System.err.println("Seats value not valid");
    }

    void setFlightID(String flightID) {
//        String pattern = "[a-zA-Z0-9]{7}";
//        if(Objects.equals(flightID, pattern)) {
//            this.flightID = flightID;
//        }
        this.flightID = flightID;
        System.out.println( "Your flight ID > " + this.flightID);
    }

    void setStatus(String status) {
        switch (status.toLowerCase()){
            case("on-time"):
                this.status = status;
                System.out.println(this.status);
                break;
            case("delayed"):
                this.status = status;
                break;
            case("cancelled"):
                this.status = status;
                break;
            default:
                System.err.println("Status not valid");
        }

    }

    /* Awesome kingdom of gets */

    String getOrigin(){
        return this.origin;
    }
    String getDestination(){
        return this.destination;
    }
    String getCompany(){
        return this.company;
    }
    int getSeats(){
        return this.seats;
    }
    String getFlightID(){
        return this.flightID;
    }
    String getStatus(){
        return this.status;
    }



}
