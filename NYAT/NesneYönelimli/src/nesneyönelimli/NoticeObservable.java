/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneyönelimli;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class NoticeObservable implements IObservable {

    private List<IObserver> observerList = new ArrayList<>();
    private SicaklikAlgilayici alg = new SicaklikAlgilayici();
    private int message = alg.sicaklikOku();

    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer); // Kullanıcıları duyuruya eklemek için.
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer); // Kullanıcıları duyurudan silmek için.
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observerList) {
            observer.notify(message); // Duyuru ya kayıtlı kullanıcılara mesaj göndermek için.
        }
    }

}
