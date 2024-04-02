package Homework6;

interface Driveable {
    void drive();
}

interface Flyable {
    void fly();
}

class Car implements Driveable {
    @Override
    public void drive() {
        // ехать на машине
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
       // летать на самолете
    }
}