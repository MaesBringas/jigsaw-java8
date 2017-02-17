/*
 * @author mebs
 * @version 1.0
 */

class Passenger {
    String name, surname, ticketID, id;

    Passenger(String name, String surname, String flightID, String id){

        this.name = name;
        this.surname = surname;
        this.ticketID = flightID;
        this.id = id;
    }

    /* Awesome kingdom of sets */

    void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    void setName(String name){
        this.name = name;
    }
    void setSurname(String surname){
        this.surname = surname;
    }
    void setId(String id){
        this.id = id;
    }

    /* Awesome kingdom of gets */

    String getTicketID(){
        return this.ticketID;
    }
    String getName(){
        return this.name;
    }
    String getSurname(){
        return this.surname;
    }
    String getId(){
        return this.id;
    }

    Passenger(){}

}
