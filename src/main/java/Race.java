public class Race {
    String raceLeader = "";
    int distance = 0;
    void identifyLeader(Car newCar){
        int newDistance = newCar.speed * 24 ;
        if (newDistance > distance){
            distance = newDistance;
            raceLeader = newCar.name;
        }


    }
}
