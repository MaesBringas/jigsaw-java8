/*
 * @author mebs
 * @version 1.0
 */

import java.util.Arrays;
import java.util.Scanner;

public class Flights {
    public static void main(String[] args) {

        /* Some kind of test */
        float[][] coordinates1 = {{62.00F},{6.47F}};
        float[][] coordinates2 = {{51.42F},{57.71F}};
        Island feroe = new Island("Feroe", "Denmark", coordinates1, true);
        Island malvinas = new Island("Malvinas", "Britain", coordinates2, true);
        Airplane russianAirline = new Airplane("AFL3434", "Feroe", "Malvinas", "On-time", "Russian Airlines", 77);

        Passenger passenger1 = new Passenger("Perry", "El Ornitorrinco", "AFL3434", "ITQ9FX");
        Passenger passenger2 = new Passenger("Gumersindo", "Perez", "AFL3434", "ITQ8FX");
        Passenger passenger3 = new Passenger("Algebraico", "Notaza", "AFL3434", "ITQ7FX");

        System.out.println("Data checker");
        System.out.println(feroe.getAppropriate() + "\n" + feroe.getCoordinates() +"\n" +
                "\n" + feroe.getCountry() + "\n"+ feroe.getName());


        System.out.println(feroe.getAppropriate() + "\n" + feroe.getCoordinates() +"\n" +
                "\n" + feroe.getCountry() + "\n"+ feroe.getName());

        if(passenger1.ticketID.equals(russianAirline.getFlightID())){
            System.out.println( passenger1.name + " verified *");
        }
        if(passenger2.ticketID.equals(russianAirline.getFlightID())){
            System.out.println( passenger2.name + " verified *");
        }
        if(passenger3.ticketID.equals(russianAirline.getFlightID())){
            System.out.println( passenger3.name + " verified *");
        }

        Scanner sc = new Scanner(System.in);

        Island trollIsland = new Island();
        System.out.println("Enter a name of your island > ");
        String name = sc.next();
        while(name.length()<2){
            System.out.println("Say something! > ");
            name = sc.next();
        }
        trollIsland.setName(name);
//        System.out.println(name);

        System.out.println("In which country is your island? > ");
        String country = sc.next();
        while(country.length()<2){
            System.out.println("Say something! > ");
            country = sc.next();
        }
        trollIsland.setCountry(country);
        System.out.println("Where is located? (X) > ");
        float x = sc.nextFloat();
        System.out.println("Where is located? (Y) > ");
        float y = sc.nextFloat();
        float[][] coord = {{x}, {y}};
        trollIsland.setCoordinates(coord);
        System.out.println("Hope that the places will be ok for landing and departing > Y/n ");
        char confirmation = sc.next().charAt(0);
        if (confirmation =='y') {
            trollIsland.setAppropriate(true);
        }
        else if (confirmation =='n') {
            trollIsland.setAppropriate(false);
        }
        else{
            System.err.println("No valid confirmation");
        }

        System.out.println(" ----- Your island: "+ trollIsland.getName() + " in " + trollIsland.getCountry() +" ----- \n" +
                "Coordinates > " + Arrays.deepToString(trollIsland.getCoordinates()) + "\n" +
                "Is appropriated for establish a route? > " + trollIsland.getAppropriate());

        Airplane fakeAirplane = new Airplane();

        System.out.println("Flight creator ");
        System.out.println("Enter the origin");
        String origin =  sc.next();
        while(origin.length()<2){
            System.out.println("Say something! > ");
            origin = sc.next();
        }
        fakeAirplane.setOrigin(origin);
        System.out.println("Enter the destination");
        String destination =  sc.next();
        while(destination.length()<2){
            System.out.println("Say something! > ");
            destination = sc.next();
        }
        fakeAirplane.setDestination(destination);
        System.out.println("Enter a valid company");
        String company =  sc.next();
        while(company.length()<2){
            System.out.println("Say something! > ");
            company = sc.next();
        }
        fakeAirplane.setCompany(company);
        System.out.println("How many seats? > ");
        int seats = sc.nextInt();
        while(seats <= 1 ){
            System.out.println("Value not valid > " + seats);
            seats = sc.nextInt();
        }
        fakeAirplane.setSeats(seats);
        System.out.println("Now set an ID for your flight > ");
        String flightID =  sc.next();
        while(flightID.length()<2){
            System.out.println("Not valid, enter again > ");
            flightID = sc.next();
        }
        fakeAirplane.setFlightID(flightID);

        System.out.println("Enter status > On-time / Cancelled / Delayed ");
        String status = sc.next();
        while(status.length()<2){
            System.out.println("Not valid, enter again > ");
            status = sc.next();
        }
        fakeAirplane.setStatus(status);

        Passenger trollPassenger = new Passenger();

        System.out.println("Identify your passenger");
        System.out.println("Enter a name > ");
        String passenger = sc.next();
        while(passenger.length()<2){
            System.out.println("Not valid, enter again > ");
            passenger = sc.next();
        }
        trollPassenger.setName(passenger);

        System.out.println("Enter a surname > ");
        String surname = sc.next();
        while(surname.length()<2){
            System.out.println("Not valid, enter again > ");
            surname = sc.next();
        }
        trollPassenger.setSurname(surname);

        System.out.println("Enter an ID > ");
        String id = sc.next();
        while(id.length()<2){
            System.out.println("Not valid, enter again > ");
            id = sc.next();
        }
        trollPassenger.setId(id);

        System.out.println("Enter your ticket ID > (7 characters)");
        trollPassenger.setTicketID(sc.next());

        while(!fakeAirplane.getFlightID().equals(trollPassenger.getTicketID())){
            System.out.println("Your flight ID > " + trollPassenger.getTicketID() + " doesn't correspond to programmed flights, try again > ");
            trollPassenger.setTicketID(sc.next());
        }

        System.out.println(" ----- Passenger details: "+ trollPassenger.getName() + " " + trollPassenger.getSurname() +" ----- \n" +
                "ID > " + trollPassenger.getId() + "\n" +
                "Flight ID > " + trollPassenger.getTicketID());

    }


}
