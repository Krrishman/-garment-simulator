/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sayed Haque
 */
public class Pants extends Clothing {
    private String fabric;

    public Pants(String s, String c, String f)
    {
        super(s,c);
        this.fabric=f;
    }

    public String getFabric()
    {
        return this.fabric;
    }
    @Override
    public void Select(){
        System.out.println( "you selected");
        }
}
