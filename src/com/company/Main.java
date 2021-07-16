package com.company;

import java.util.Scanner;

public class Main extends Thread{

    Scanner scanner = new Scanner(System.in);
    static TheatreBook sb;

    public void run()
    {
        System.out.println("Please enter your name : ");
        String name = scanner.next();

        System.out.println("How many seats you want to book : ");
        int seats = scanner.nextInt();
        sb.BookingSystem(seats, name);
    }

    public static void main(String[] args) throws InterruptedException
    {
        sb = new TheatreBook();

        Main mb = new Main();
	    mb.start();
	    mb.join();

	    Main mb2 = new Main();
	    mb2.start();
	    mb2.join();

	    Main mb3 = new Main();
	    mb3.start();
    }
}
