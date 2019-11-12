
package esi.atl.g48502.bmr.util;

import java.util.ArrayList;
import java.util.List;

/**
 *the class that represent the observable model
 * @author alistairclerebaut
 */
public class Observable {
    
    private List<Observer> observers = new ArrayList<>();
    
    /**
     * method that add Observer in the list of observer
     * @param observer 
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    /**
     * method that update all observer of the list 
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
