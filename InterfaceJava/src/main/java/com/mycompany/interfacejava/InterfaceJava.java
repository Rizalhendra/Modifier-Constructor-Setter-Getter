/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacejava;

/**
 *
 * @author user
 */
public class InterfaceJava {

    public static void main(String[] args) {
          String emailPenerima = "dian@petanikode.com";
        String nomerHp = "+628111111111";
        String mobileId = "android-123456";

        EmailNotification emailNotif = new EmailNotification();
        SmsNotification smsNotif = new SmsNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "Tutorial Polimorfisme sudah terbit di Petani Kode, cek sekarang di https://www.petanikode.com/java-oop-polimorfisme";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
