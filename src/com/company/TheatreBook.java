package com.company;

public class TheatreBook extends Main{

    int total_Seats = 10;

    synchronized void BookingSystem(int seats, String name){

        if(total_Seats>=seats)
        {
            if(seats>1)
            {
                System.out.println("Congratulation! Your seats are booked successfully for " + name);
            }
            else
            {
                System.out.println("Congratulation! Your seat is booked successfully for " + name);

            }
            total_Seats = total_Seats - seats;
            System.out.println("Seats still left for booking : " + total_Seats);
            if (total_Seats <= 0)
            {
                System.out.println("Housefull" );
                System.exit(1);

            }
        }
        else
        {
            System.out.println("Sorry! That many seats are not available, please try again for " + name);
        }
    }

}
