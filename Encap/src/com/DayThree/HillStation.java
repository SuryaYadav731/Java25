package com.DayThree;

    class HillStations {
        public void location() {
            System.out.println("Location of the hill station.");
        }
        public void famousFor() {
            System.out.println("This hill station is famous for something.");
        }
    }
    class Manali extends HillStations {
        @Override
        public void location() {
            System.out.println("Manali is located in Himachal Pradesh.");
        }

        @Override
        public void famousFor() {
            System.out.println("Manali is famous for snow-capped mountains and adventure sports.");
        }
    }

    class Mussoorie extends HillStations {
        @Override
        public void location() {
            System.out.println("Mussoorie is located in Uttarakhand.");
        }

        @Override
        public void famousFor() {
            System.out.println("Mussoorie is famous for its scenic beauty and 'The Mall Road'.");
        }
    }

    class Gulmarg extends HillStations {
        @Override
        public void location() {
            System.out.println("Gulmarg is located in Jammu and Kashmir.");
        }

        @Override
        public void famousFor() {
            System.out.println("Gulmarg is famous for skiing and its winter sports.");
        }
    }


    public class HillStation{
        public static void main(String[] args) {

            HillStations hill1 = new Manali();
            HillStations hill2 = new Mussoorie();
            HillStations hill3 = new Gulmarg();

            System.out.println("Calling methods by HillStations class reference:");

            hill1.location();
            hill1.famousFor();

            hill2.location();
            hill2.famousFor();

            hill3.location();
            hill3.famousFor();

            System.out.println("\nCalling methods by subclass references:");

            Manali manali = new Manali();
            manali.location();
            manali.famousFor();

            Mussoorie mussoorie = new Mussoorie();
            mussoorie.location();
            mussoorie.famousFor();

            Gulmarg gulmarg = new Gulmarg();
            gulmarg.location();
            gulmarg.famousFor();
        }
    }



