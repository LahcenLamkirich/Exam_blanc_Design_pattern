package Design_Pattern.Observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable {

    List<Observer> ListObservers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        ListObservers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        ListObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {

    }
}
