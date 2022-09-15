package com.company;
import java.util.ArrayList;
import java.util.Scanner;

    public class Uc3 {
        public static void addNewHotel(ArrayList<Hotel> hotelsList){

            Hotel hotel = new Hotel();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter HotelName");
            String hotelName = scanner.next();
            hotel.setHotelName(hotelName);

            System.out.println("Enter Rating of the Hotel");
            int rate = scanner.nextInt();
            hotel.setRating(rate);

            System.out.println("Enter Rate in WeekDays");
            int weekDays = scanner.nextInt();
            hotel.setWeekDayRate(weekDays);

            System.out.println("Enter Rate in WeekEnds");
            int weekEnds = scanner.nextInt();
            hotel.setWeekEndRate(weekEnds);

            hotelsList.add(hotel);
        }
    }
}
