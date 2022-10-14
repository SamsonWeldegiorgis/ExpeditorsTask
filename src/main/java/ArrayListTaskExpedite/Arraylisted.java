package ArrayListTaskExpedite;

public class Arraylisted {


    String firstName , lastName, address, city, state, idNumber;
    int age , number;

    public Arraylisted (String firstName , String lastName, String address, String city, String state, int age){

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.age = age;
        idGenerator ();

    }

    @Override
    public String toString() {
        return "\nExpeditors : {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", age=" + age +
                ", idNumber='" + idNumber + '\'' +

//                ", number=" + number +
                '}';
    }



    public void idGenerator (){
        switch (lastName) {
            case "Smith":
                number = 1;
                break;
            case "Williams":
                number = 2;
                break;
            case "Johnson":
                number = 3;
                break;
            case "Jones":
                number = 4;
                break;
            case "Brown":
                number = 5;
                break;
            default:
                number = 0;
        }

                idNumber = number +" ~ " + firstName.substring(0,1) +"_" + lastName.substring(0,2);

        }
    }
