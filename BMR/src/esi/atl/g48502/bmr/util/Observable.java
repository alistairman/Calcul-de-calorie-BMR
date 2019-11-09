
package esi.atl.g48502.bmr.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alistairclerebaut
 */
public class Observable {
    
    private List<Observer> observers = new ArrayList<>();
    
    
     public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    
}
