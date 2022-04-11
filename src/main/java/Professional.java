/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sayed Haque
 */
public class Professional extends Categories{
    
    public Professional(Clothing c) {
		super(c);
	}
    
    @Override
    public String choose(){
    return "From Professional Selection:\nWe Have "+cloth.pro();
    }
}
