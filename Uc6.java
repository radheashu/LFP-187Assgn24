package com.company;
 import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

    public class Uc6 {

        public static void cheapHotelBestRate(ArrayList<Hotel> hotelsList){

            ArrayList<Hotel> hotels = new ArrayList<>();

            Map<Integer,String> days = new HashMap<>();
            String[] day = {"Sun","Mon","Tues","Wed","Thurs","Fri","Sat"};

            LocalDate localDate = LocalDate.of(2021, 8, 10);
            java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            int a = dayOfWeek.getValue();

            LocalDate dateBefore = LocalDate.of(2021, Month.SEPTEMBER, 10);
            LocalDate dateAfter = LocalDate.of(2021, Month.SEPTEMBER, 11);
            long noOfDays = ChronoUnit.DAYS.between(dateBefore, dateAfter);

            // Store date With its day
            int i = 10;
            int Total = (int) (noOfDays + i + 1);
            while ( i != Total){
                int j = a;
                days.put(i, day[j]);
                i++;
                if(j == 6)
                    a = 0;
                a++;
            }

            // Store WeekDays and WeekEnds in separately
            int count1 = 0;
            int count2 = 0;

            for (Map.Entry<Integer, String> entry : days.entrySet()) {
                String day1 = entry.getValue();
                if(day1.equals(day[0]) || day1.equals(day[1]) || day1.equals(day[2]) || day1.equals(day[3]) || day1.equals(day[4]))
                    count1++;
                else
                    count2++;
            }

            System.out.println("Enter");

            // getHotel of Minimum Per Day for WeekEnds and WeekDays
            Hotel hotelcheap1 = hotelsList.stream().min(Comparator.comparingInt(Hotel::getWeekDayRate)).get();
            Hotel hotelcheap2 = hotelsList.stream().min(Comparator.comparingInt(Hotel::getWeekEndRate)).get();

            hotels.add(hotelcheap1);
            hotels.add(hotelcheap2);

            // Finding the BestRated hotel with cheapRate
            Hotel hotelbestRate = hotels.stream().max(Comparator.comparingInt(Hotel::getRating)).get();

            System.out.println("\nCheapest Hotel = " +hotelbestRate.getHotelName());
            System.out.println("Total Rate     = " + ((hotelbestRate.getWeekDayRate() * count1) + (hotelbestRate.getWeekEndRate() * count2)));

        }
    }
}
