package Design_Pattern.Observer_pattern;

public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
