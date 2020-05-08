/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneyönelimli;

/**
 *
 * @author ASUS
 */
public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver();
}
