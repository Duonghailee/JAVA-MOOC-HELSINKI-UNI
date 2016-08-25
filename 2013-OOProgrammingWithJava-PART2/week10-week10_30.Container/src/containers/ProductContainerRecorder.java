/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author duonghaily
 */
public class ProductContainerRecorder extends ProductContainer{
    //private ProductContainer product;
    private ContainerHistory history;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.history = new ContainerHistory();
        this.addToTheContainer(initialVolume);
                
    }
    
    public String history(){
        return this.history.toString();
    }
    
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.history.add(this.getVolume());
        
    }
    
    public double takeFromTheContainer(double amount){
        double value = super.takeFromTheContainer(amount);
        this.history.add(this.getVolume());
        return value;

        
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history.toString());
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
}
