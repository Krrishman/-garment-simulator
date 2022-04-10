/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sayed Haque
 */
public class Clothing {
    private String size;
    private String color;
    
     public Clothing(String size, String color)
    {
        this.size=size;
        this.color=color;
    }
    public String getSize(){return this.size;}
    public String getColor(){return this.color;}
    public void Select(){
        System.out.println( "you selected");
        }
}
