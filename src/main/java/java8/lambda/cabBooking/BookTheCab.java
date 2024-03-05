package java8.lambda.cabBooking;

@FunctionalInterface
interface Cab{
    public void bookCab();
}

class Ola implements Cab{

    @Override
    public void bookCab() {
        System.out.println("Your cab is Booked");
    }
}

public class BookTheCab {

    public static void main(String[] args){
        // using Ola class to create object
        Ola ola = new Ola();
        ola.bookCab();

        // using Cab interface to create object
        Cab cab = new Ola();
        cab.bookCab();

        Cab lambdaCab = ()-> System.out.println("Your cab is Booked through lambda expression");
        lambdaCab.bookCab();
    }
}
