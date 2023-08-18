package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {


        Passenger[][] customer = new Passenger[13][4];

        for(int l=1;l< customer.length;l++){
            for (int d=1;d<customer[l].length;d++){
                customer[l][d] = new Passenger();
            }
        }
        Main main = new Main();

        main.initiolise(customer);
        main.menuOption(customer);
    }

    public static void menuOption(Passenger[][]customer) throws IOException{
        int shipCabins = 1;
        Scanner input = new Scanner(System.in);
        while (shipCabins < 13) {

            System.out.println("....Welcome to the Cruise Ship Boarding....!");
            System.out.println("====================Menu===========================");
            System.out.println("A - Add a new customer to a cruise ship cabin ");
            System.out.println("V - View all cabins in cruise ship cabin");
            System.out.println("E - Display empty cabins");
            System.out.println("D - Delete customer from cabins");
            System.out.println("F - Find cabin from customer name");
            System.out.println("S - Store program data into file");
            System.out.println("L - Load program data from file");
            System.out.println("O - View passengers orderd alphabertically by name");
            System.out.println("T - View total expenses");
            System.out.println("X - Enter X to end of  the program");
            System.out.println("==================================================");
            System.out.println("Please enter your option ");

            String option = input.next().toUpperCase(); //to select menu option from the user.


                if (option.equalsIgnoreCase("A")) {
                    cabin.addNewcustomer(customer);

                }
                else if (option.equalsIgnoreCase("V")) {
                    cabin.displayCabins(customer);
                }
                else if (option.equalsIgnoreCase("E")) {
                    cabin.emptyCabins(customer);
                }
                else if (option.equalsIgnoreCase("D")) {
                    cabin.removeCustomer(customer);
                }
                else if (option.equalsIgnoreCase("F")) {
                    cabin.finebyname(customer);
                }
                else if (option.equalsIgnoreCase("S")) {
                    cabin.storeData(customer);
                }
                else if (option.equalsIgnoreCase("L")) {
                    cabin.loadData(customer);
                }
                else if (option.equalsIgnoreCase("O")) {
                    cabin.sortName(customer);
                }
                else if (option.equalsIgnoreCase("T")) {
                    cabin.totalExpenses(customer);
                }
                else if (option.equalsIgnoreCase("x")) {
                    System.out.println("Thank you purchasing our services  ");
                    break;
                }
                else {
                    System.out.println("please enter valid input");
                }
        }

        }


    public static void initiolise(Passenger[][] customer){
        for(int cabin_num=1;cabin_num<customer.length;cabin_num++){
            for(int cabin_data =1;cabin_data<customer[cabin_num].length;cabin_data++){
                customer[cabin_num][cabin_data].setFirst_name("empty");
                customer[cabin_num][cabin_data].setSur_name("empty");
                customer[cabin_num][cabin_data].setExpenses(0.0);
            }
        }
    }
}
