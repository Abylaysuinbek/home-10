public interface Vehicle {
    void start();
    void stop();
    public class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car started");
        }

        @Override
        public void stop() {
            System.out.println("Car stopped");
        }
    }

    class Bike implements Vehicle {
        @Override
        public void start() {
            System.out.println("Bike started");
        }

        @Override
        public void stop() {
            System.out.println("Bike stopped");
        }
    }

     class Main {
        public static void main(String[] args) {
            Vehicle car = new Car();
            car.start();
            car.stop();

            Vehicle bike = new Bike();
            bike.start();
            bike.stop();
        }
    }
}





