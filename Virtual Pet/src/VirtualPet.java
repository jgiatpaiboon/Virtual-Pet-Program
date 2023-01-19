/*
 *  Description: This program gives the user a pet dog. They can perform certain activities to change attributes of the dog.
 *  Name: James Giatpaiboon
 */

import java.util.Scanner;   //imported scanner

public class VirtualPet {
    public static void main(String[] args) {

        String dogname; // stores dog name
        int happiness = 60; // set happiness as integer of 60
        int energy = 60;    // set energy as integer of 60
        int hygiene = 60;   // set hygiene as integer of 60
        int activity = 0;   // number of activity

        Scanner input = new Scanner(System.in); // created for user input

        System.out.println("Enter the name of your dog: "); // prompts user to enter a dog name
        dogname = input.next(); // stores input for name of the dog

        //gives the user options of what activity they want to perform
        while (activity != 4) { // loop to allow user to perform actions until they choose the fourth option
            System.out.println("What would you like to do with " + dogname + "?");  // statement asking user what they want to perform with the dog
            System.out.println("1. Walk " + dogname + "."); // option to walk dog
            System.out.println("2. Feed " + dogname + "."); // option to feed dog
            System.out.println("3. Clean " + dogname + ".");   // option to clean dog
            System.out.println("4. Exit the program."); // option to exit program
            activity = input.nextInt(); // stores input for which ever option is chosen

            // if-else statements depending on the activity that is chosen along with nested-if statements

            if (activity == 1 ) {   // if-statements if the user chooses activity 1 - walk dog

                System.out.println("Walked " + dogname + ".");  // tells user they walked their dog
                happiness = happiness + 5;  // increases the dog's happiness status by 5
                energy = energy - 20;   // decreases the dog's energy
                hygiene = hygiene - 5;  //  decreases te dog's hygiene

                if (energy <= 30) { // makes sure the user's dog has at least 30 energy
                    System.out.println("Energy must be greater than or equal to 30 to perform this action.");   // tells user energy must be >30
                    happiness = happiness - 5;  // decreases the dog's energy by 5 if the user performs the action
                }   //doesn't allow energy to go below 0
                if (energy < 0) {
                    energy = 0;
                }   // doesn't allow hygiene to below 0
                if (hygiene < 0) {
                    hygiene = 0;
                }
                // doesn't allow happiness status to go above 100 if the action is performed
                if(happiness > 100){
                    happiness = 100;
                }

            } else {
                if (activity == 2) {    //if-statements if the user decides to choose activity 2
                    System.out.println("Fed " + dogname + "."); // tells user they fed the dog
                    happiness = happiness + 5;  // happiness status increases by 5
                    energy = energy + 10;   // energy status is increased by 10
                    if (energy > 95) {  // doesn't know user to perform action if energy is above 95
                        System.out.println("Energy must be less than 95 to perform this action.");  // informs user about having more than 95 energy level
                    }   // energy cannot go above 100
                    if(energy > 100){
                        energy = 100;
                    }   // happiness cannot go above 100
                    if(happiness > 100){
                        happiness = 100;
                    }   // hygiene cannot go above 100
                    if(hygiene > 100){
                        hygiene = 100;
                    }

                } else {
                    if (activity == 3) {    // if-statements if the user chooses activity 3
                        System.out.println("Cleaned " + dogname + "."); // tells user they clean their dog
                        happiness = happiness + 5;  // happiness increases by 5
                        hygiene = hygiene + 30; // hygiene increases by 30
                        if (energy > 80) {  // energy must be less than 80 to perform this action
                            System.out.println("Energy must be less than 80 to perform this action.");
                        }
                        if(energy > 100){   // energy cannot go above 100
                            energy = 100;
                        }
                        if(happiness > 100){    //happiness cannot go above 100
                            happiness = 100;
                        }
                        if(hygiene > 100){  // hygiene cannot go above 100
                            hygiene = 100;
                        }


                    } else {
                        if (activity == 4) {    //if-statements if user chooses activity 4
                            // prints out the users happiness, energy, and hygiene levels
                            System.out.println(dogname + "'s " + "level of happiness is: " + happiness);
                            System.out.println(dogname + "'s " + "level of energy is: " + energy);
                            System.out.println(dogname + "'s " + "hygiene level is: " + hygiene);
                            // if else statements depending on the user's happiness at the end of the program
                            if (happiness >= 90) {
                                System.out.println(dogname + "'s" + " happiness is very high, you did a" +
                                        " great job!");
                            } else {
                                if (happiness >= 70) {
                                    System.out.println(dogname + "'s" + " happiness is decent, you did a " +
                                            "decent job!");
                                } else {
                                    if (happiness >= 50) {
                                        System.out.println(dogname + "'s" +
                                                " happiness is very low, you did a poor job!");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}