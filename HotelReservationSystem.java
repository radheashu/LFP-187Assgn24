package com.company;
 import java.util.ArrayList;
import java.util.Scanner;

    public class HotelReservationSystem {

        static ArrayList<Hotel> HotelsList = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        // MainMenu of Hotel Reservation System
        public static void MainMenu() throws Exception, InvalidEntryException {

            System.out.println("========================================================");
            System.out.println("Hotel Reservation System\n");
            System.out.println("1 . Add a New Hotel With customer Details");
            System.out.println("2 . Find cheapest Hotel ");
            System.out.println("3 . Find cheapest Hotel based on weekDays and WeekEnds");
            System.out.println("4 . Find cheapest Hotel with Best Ratings");
            System.out.println("5 . Find cheapest Hotel with Best Ratings for Reward Customers");
            System.out.println("6 . Find cheapest Hotel with Best Ratings for Regular Customers");
            System.out.println("7 . FInd Best Rated Hotels Only ");
            System.out.println("8 . View Hotel List");
            System.out.println("9 . Exit ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    Uc9.addNewHotel(HotelsList);
                    MainMenu();
                }
                case 2 -> {
                    Uc2.findCheapHotel(HotelsList);
                    MainMenu();
                }
                case 3 -> {
                    Uc4.FindCheapestHotel(HotelsList);
                    MainMenu();
                }
                case 4 -> {
                    Uc6.cheapHotelBestRate(HotelsList);
                    MainMenu();
                }
                case 5 -> {
                    Uc11.RewordCustomerType(HotelsList);
                    MainMenu();
                }
                case 6 -> {
                    Uc12.RegularCustomerType(HotelsList);
                    MainMenu();
                }
                case 7 -> {
                    Uc7.bestRatedHotelOnly(HotelsList);
                    MainMenu();
                }
                case 8 -> {
                    view();
                    MainMenu();
                }

                case 9 -> System.out.println("Thank You");
                default -> System.out.println("Enter proper Input");
            }
        }

        // To view total HotelList
        public static void view() {
            for (Hotel i : HotelsList) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) throws Exception, InvalidEntryException {

            Hotel LakeWood = new Hotel();
            LakeWood.setCustomerType(Hotel.Customer.REGULAR);
            LakeWood.setHotelName("LakeWood");
            LakeWood.setWeekDayRate(110);
            LakeWood.setWeekEndRate(90);
            LakeWood.setRating(3);
            HotelsList.add(LakeWood);

            Hotel BridgeWood = new Hotel();
            BridgeWood.setCustomerType(Hotel.Customer.REGULAR);
            BridgeWood.setHotelName("BridgeWood");
            BridgeWood.setWeekDayRate(150);
            BridgeWood.setWeekEndRate(50);
            BridgeWood.setRating(4);
            HotelsList.add(BridgeWood);

            Hotel RidgeWood = new Hotel();
            RidgeWood.setCustomerType(Hotel.Customer.REGULAR);
            RidgeWood.setHotelName("RidgeWood");
            RidgeWood.setWeekDayRate(220);
            RidgeWood.setWeekEndRate(150);
            RidgeWood.setRating(5);
            HotelsList.add(RidgeWood);


            Hotel LakeWood1 = new Hotel();
            LakeWood1.setCustomerType(Hotel.Customer.REWORD);
            LakeWood1.setHotelName("LakeWood");
            LakeWood1.setWeekDayRate(80);
            LakeWood1.setWeekEndRate(80);
            LakeWood1.setRating(3);
            HotelsList.add(LakeWood1);

            Hotel BridgeWood1 = new Hotel();
            BridgeWood1.setCustomerType(Hotel.Customer.REWORD);
            BridgeWood1.setHotelName("BridgeWood");
            BridgeWood1.setWeekDayRate(110);
            BridgeWood1.setWeekEndRate(50);
            BridgeWood1.setRating(4);
            HotelsList.add(BridgeWood1);

            Hotel RidgeWood1 = new Hotel();
            RidgeWood1.setCustomerType(Hotel.Customer.REWORD);
            RidgeWood1.setHotelName("RidgeWood");
            RidgeWood1.setWeekDayRate(100);
            RidgeWood1.setWeekEndRate(40);
            RidgeWood1.setRating(5);
            HotelsList.add(RidgeWood1);

            MainMenu();
        }
    }
}
