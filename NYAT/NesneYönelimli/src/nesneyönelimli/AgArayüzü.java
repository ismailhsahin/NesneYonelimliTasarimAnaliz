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
public class AgArayüzü {
    private Eyleyici islemler = new Eyleyici();
    private SicaklikAlgilayici Gösterge = new SicaklikAlgilayici();
    private NoticeObservable noticeObservable = new NoticeObservable();
    
    public void sogutucuAc(){
        islemler.setObservable(noticeObservable);
        noticeObservable.addObserver(islemler);
        noticeObservable.notifyObserver();
    }
    public String sogutucuKapat(){
       return islemler.sogutucuKapat();
    }
    public int SicaklikOkuyucu(){
        return Gösterge.sicaklikOku();
    }

}
