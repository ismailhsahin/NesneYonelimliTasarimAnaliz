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
public class Eyleyici implements IObserver {

    private IObservable observable;
    
    public Eyleyici(){ 
    }
    
    public String sogutucuAc(){
        return "Sogutucu Aktif Edildi." ;
    }
    public String sogutucuKapat(){
        return "Sogutucu Kapatildi.";
    }

    @Override
    public void notify(int message) {
        System.out.println("Sıcaklık "+message+" iken "+sogutucuAc());
    }
    
    public void setObservable(IObservable observable) {
        this.observable = observable;
    }
}
