/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sayed Haque
 */
public class Main {
  public static void main(String[] args) {
    Categories Pro = new Professional(new Tops());
    System.out.println(Pro.choose());
    
    Pro = new Casual(new Tops());
    System.out.println(Pro.choose());
    
    Pro = new Party(new Tops());
    System.out.println(Pro.choose());
    
    Pro = new Professional(new Pants());
    System.out.println(Pro.choose());
    
    Pro = new Casual(new Pants());
    System.out.println(Pro.choose());
    
    Pro = new Party(new Shoes());
    System.out.println(Pro.choose());
    
  }
    
}
