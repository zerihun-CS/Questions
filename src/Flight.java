import java.util.Scanner;

public class Flight {
Scanner scanner = new Scanner(System.in);
   String planeNumber;
   int maxPassenger;
   String destination;
   String origin;
   int passengerCount = 0;
    String[] passengerList;



   void passengerSize(int size ){

      passengerList = new String[size];

   }
   void flightBooking(){

       System.out.println("please insert your name ?");

       String name = scanner.next();

       passengerList[passengerCount] = name;

       passengerCount++;

   }

   // list of passengers
    // stop after the max  size




}
