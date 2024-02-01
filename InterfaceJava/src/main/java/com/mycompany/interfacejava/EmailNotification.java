/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacejava;

/**
 *
 * @author user
 */
public class EmailNotification implements InterfaceNotifikasi{
    @Override
    public void sendMessage(String receiver,String content){
        System.out.println("Mengirim email ke " + receiver + "dengan isi : ");
        System.out.println (content);
    }
    
}
