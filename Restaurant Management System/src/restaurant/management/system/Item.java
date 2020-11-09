/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management.system;

/**
 *
 * @author lenovo
 */
public class Item {
    protected String itemName;
    protected double pricePerUnit;
    protected double qte;
    protected double total;
    
    private void Item(String itemName, double pricePerUnit, double qte, double total){
        this.itemName=itemName;
        this.pricePerUnit=pricePerUnit;
        this.qte=qte;
        this.total=total;
    }
    
    protected double price(){
        this.total = pricePerUnit * qte;
        return total;
    }
}
