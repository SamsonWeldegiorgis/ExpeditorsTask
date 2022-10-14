package ArrayListTaskExpedite;

public class UsingArraylisted {

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
        String lastNameSmith = "";
        int countlastNameSmith = 0;

        for (int i = 0; i < listofAll.length; i++) {
            if (listofAll[i].lastName.equalsIgnoreCase("smith")) {
                lastNameSmith += listofAll[i];
                countlastNameSmith++;
            }
        }
        System.out.println("Last Name : " + lastNameSmith);
        System.out.println("Count Last Name Smith = " + countlastNameSmith);


/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();////spacer
        // get me the names and count for people of > 18 years

        String ageGreaterThan18 = "";
        int countageGreaterThan18 = 0;

        for (int i = 0; i < listofAll.length; i++) {
            if (listofAll[i].age > 18) {
                ageGreaterThan18 += listofAll[i];
                countageGreaterThan18++;
            }
        }
        System.out.println("Age Greater Than 18 = " + ageGreaterThan18);
        System.out.println("Count Age Greater Than 18 = " + countageGreaterThan18);


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();////spacer
        // get me the names and count for people of equal 18 years

        String ageEqualsto18 = "";
        int countageEqualsto18 = 0;

        for (int i = 0; i < listofAll.length; i++) {
            if (listofAll[i].age == 18) {
                ageEqualsto18 += listofAll[i];
                countageEqualsto18++;
            }
        }
        System.out.println("Age Equals to 18 = " + ageEqualsto18);
        System.out.println("Count Age Equals to 18 = " + countageEqualsto18);


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();////spacer
        // get me the names and count for people of equal 18 years

        String firstNameJane = "";
        int countfirstNameJane = 0;

        for (int i = 0; i < listofAll.length; i++) {
            if (listofAll[i].firstName.equalsIgnoreCase("jane")) {
                firstNameJane += listofAll[i];
                countfirstNameJane++;
            }
        }
        System.out.println("First Name Jane = " + firstNameJane);
        System.out.println("Count first Name Jane = " + countfirstNameJane);


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();////spacer
        // Print me all the households and count them

        String allHouseHold = "";
        int countallHouseHold = 0;

        for (int i = 0; i < listofAll.length; i++) {
                 allHouseHold += listofAll[i];
                countallHouseHold++;

        }
        System.out.println("All House Hold = " + allHouseHold);
        System.out.println("Count all HouseHold = " + countallHouseHold);


    }

    }


