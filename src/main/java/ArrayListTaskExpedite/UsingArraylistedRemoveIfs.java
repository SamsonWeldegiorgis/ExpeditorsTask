package ArrayListTaskExpedite;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingArraylistedRemoveIfs {

    public static void main(String[] args) {

        Arraylisted[] listofAll = {
                (new Arraylisted("Dave", "Smith", "123 main st.", "seattle", "wa", 43)),
                (new Arraylisted("Alice", "Smith", "123 Main St.", "Seattle", "WA", 45)),
                (new Arraylisted("Bob", "Williams", "234 2nd Ave.", "Tacoma", "WA", 26)),
                (new Arraylisted("Carol", "Johnson", "234 2nd Ave", "Seattle", "WA", 67)),
                (new Arraylisted("Eve", "Smith", "234 2nd Ave.", "Tacoma", "WA", 25)),
                (new Arraylisted("Frank", "Jones", "234 2nd Ave.", "Tacoma", "FL", 23)),
                (new Arraylisted("George", "Brown", "345 3rd Blvd., Apt. 200", "Seattle", "WA", 18)),
                (new Arraylisted("Helen", "Brown", "345 3rd Blvd. Apt. 200", "Seattle", "WA", 18)),
                (new Arraylisted("Ian", "Smith", "123 main st ", "Seattle", "Wa", 18)),
                (new Arraylisted("Jane", "Smith", "123 Main St.", "Seattle", "WA", 13))};


        // get me last name smith and give me the count size
        ArrayList <Arraylisted> lastNameSmith = new ArrayList<>(Arrays.asList(listofAll));
        lastNameSmith.removeIf(each -> !each.lastName.equalsIgnoreCase("smith"));
        System.out.println("Last Name Smith : " + lastNameSmith);
        System.out.println("Count Last Name Smith = " + lastNameSmith.size());


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();////spacer
        // get me the names and count for people of > 18 years

        ArrayList<Arraylisted> ageGreaterThan18 = new ArrayList<>(Arrays.asList(listofAll));
        ageGreaterThan18.removeIf (each -> each.age < 18);
        System.out.println("Age Greater Than 18 = " + ageGreaterThan18);
        System.out.println("Count Age Greater Than 18 = " + ageGreaterThan18.size());

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();////spacer
        // get me the names and count for people of equal 18 years

        ArrayList<Arraylisted> ageEqualsto18 = new ArrayList<>(Arrays.asList(listofAll));
        ageEqualsto18.removeIf (each -> each.age != 18);
        System.out.println("Age Equals to 18 = " + ageEqualsto18);
        System.out.println("Count Age Equals to 18 = " + ageEqualsto18.size());


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();////spacer
        // get me the name for Jane and count it

        ArrayList<Arraylisted> firstNameJane = new ArrayList<>(Arrays.asList(listofAll));
        firstNameJane.removeIf (each -> !each.firstName.equalsIgnoreCase("jane"));
        System.out.println("First Name Jane = " + firstNameJane);
        System.out.println("Count first Name Jane = " + firstNameJane.size());


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();////spacer
        // Print me all the households and count them

        ArrayList<Arraylisted> allHouseHold = new ArrayList<>(Arrays.asList(listofAll));
        System.out.println("All House Hold = " + allHouseHold);
        System.out.println("Count all HouseHold = " + allHouseHold.size());


    }

    }


