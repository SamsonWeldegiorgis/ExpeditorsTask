package ExpeditorsTask.ArrayedTaskExpedite;


public class ArrayTask {
    public static void main(String[] args) {


        String[][] list = {
                {"Dave", "Smith", "123 main st.", "seattle", "wa", "43"},
                {"Alice", "Smith", "123 Main St.", "Seattle", "WA", "45"},
                {"Bob", "Williams", "234 2nd Ave.", "Tacoma", "WA", "26"},
                {"Carol", "Johnson", "234 2nd Ave", "Seattle", "WA", "67"},
                {"Eve", "Smith", "234 2nd Ave.", "Tacoma", "WA", "25"},
                {"Frank", "Jones", "234 2nd Ave.", "Tacoma", "FL", "23"},
                {"George", "Brown", "345 3rd Blvd., Apt. 200", "Seattle", "WA", "18"},
                {"Helen", "Brown", "345 3rd Blvd. Apt. 200", "Seattle", "WA", "18"},
                {"Ian", "Smith", "123 main st ", "Seattle", "Wa", "18"},
                {"Jane", "Smith", "123 Main St.", "Seattle", "WA", "13"}};


        /////////////////////////////////////////////////////////
        // get me smith and its count size

        System.out.println("Last Name with Smith : ");
        int countlastNameSmith = 0;
        int countNUm1 = 1;

        for (String  [] each : list) { // array
            String lastNameSmith = "";

            for (int i = 0; i < each.length; i++) { // string
                if (each[i].equalsIgnoreCase("smith")) {
                    lastNameSmith += each[i] + ",";
                    countlastNameSmith++;
                }
            }

            System.out.println(countNUm1 + " ~" + lastNameSmith);
            countNUm1++;
        }
            System.out.println("countlastNameSmith = " + countlastNameSmith);


            System.out.println(); // ------spacer
            /////////////////////////////////////////////////////
            // get me all and its count size

            System.out.println("All Names : ");
            int countallNames = 0;
            int countNUm = 1;
            for (int i = 0; i < 10; i++) {  // count the rows
                String allNames = "";
                for (int j = 0; j < 6; j++) {  // cuont the columns

                    allNames += list[i][j] + ",";
                    countallNames++;

                }
                System.out.println(countNUm + "~" + allNames);
                countNUm++;
            }
            countNUm = countNUm - 1;
            System.out.println("countallNames Arraay Value = " + countNUm);
            System.out.println("counting all  = " + countallNames);

            System.out.println(); // ------spacer
            /////////////////////////////////////////////////////
            // get me all ages of = 18 and its count size

            String allageEqualTo18 = "";
            int countallageEqualTo18 = 0;

            for (String[] each : list) {

                for (int i = 0; i < each.length; i++) { // int ,,,,string
                    if (each.equals("18") ){
                        allageEqualTo18 += each[i] + ",";
                        countallageEqualTo18++;
                    }

            }}
            System.out.println("allageEqualTo18 = " + allageEqualTo18);
            System.out.println("countallageEqualTo18 = " + countallageEqualTo18);

            System.out.println(); // ------spacer
            /////////////////////////////////////////////////////
            // first Row first column

            System.out.println("FirstRowFirstColumn : " + list[0][0]);
            System.out.println(); // ------spacer
            /////////////////////////////////////////////////////

        // get me all ages of > 18 and its count size

        String allageGreaterthan18 = "";
        int countallageGreaterthan18 = 0;

        for (String[] each : list) {

            for (int i = 0; i < each.length; i++) {
                if (each[i].contains("18")) {
                    allageGreaterthan18 += each[i] + ",";
                    countallageGreaterthan18++;
                }
            }
        }
        System.out.println("allageGreaterthan18 = " + allageGreaterthan18);
        System.out.println("countallageGreaterthan18 = " + countallageGreaterthan18);

        }
    }




