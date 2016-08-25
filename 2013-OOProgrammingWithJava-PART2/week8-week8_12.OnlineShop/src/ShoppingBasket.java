
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duonghaily
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(!basket.containsKey(product)){
            basket.put(product, new Purchase(product,1,price));
        }
        else{
            basket.get(product).increaseAmount();
        }
       
    }
    
    public int price(){
        int price = 0;
        for(Purchase p : basket.values()){
            price += p.price();
        }
        return price;
    }
    
    // printout the shopping baskset
    public void print(){
        for(Purchase p : basket.values()){
            System.out.println(p);
        }
    }
}
