package com.company;

public class Bicycle {
    private String name;
    private double weight;
    private BicycleRul rul;

    void doMove() {
        BicycleRul br = new BicycleRul();
        br.turnRight();
        // nested inner
        class DDD {
            private String title;
        }
        DDD ddd = new DDD();

        System.out.println("Moving...");
    }

    // inner класс - внутренний
    public class BicycleRul {
        private String material;
        void turnLeft() {
            String parent = Bicycle.this.name;
            Bicycle.this.doMove();
            System.out.println("Turn left...");
        }

        void turnRight() {
            System.out.println("Turn left...");
        }
    }

}
