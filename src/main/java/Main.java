import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String carName;
        int speed;
        Race Leader = new Race();
        int countCars = 3;
        for (int i = 1; i <= countCars; i++){
            System.out.println("Введите название машины №" + i);
            carName = scanner.next();
            while(true) {
                System.out.println("Введите скорость машины №" + i);
                try {
                    speed = Integer.parseInt(scanner.next()) ;
                    if (speed > 0 && speed <= 250){
                        Car newCar = new Car(carName, speed);
                        Leader.identifyLeader(newCar);
                        break;
                    } else {
                        System.out.println("Неправильная скорость. Правильная - от 0 до 250");
                    }
                } catch (Exception e) {
                    System.out.println("Скорость должна быть целым числом");
                }
            }
        }
        scanner.close();
        System.out.println("Самая быстрая машина: " + Leader.raceLeader);
    }
}

