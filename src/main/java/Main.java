/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sayed Haque
 */
public class Main {
    int x = 5;

  public static void main(String[] args) {
    Categories Pro = new Professional(new Tops());
    //String x=Pro.choose();
    Pro.choose();
    System.out.println(Pro.choose());
    
    Pro = new Casual(new Tops());
    System.out.println(Pro.choose());
    
  }
    
}
