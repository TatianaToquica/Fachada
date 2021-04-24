package co.unicauca.ProyectFachada.domain;

import java.time.LocalDate;
import java.util.ArrayList;



/**
 *
 * @author HP
 */
public class Order {
    public int despatch;//envio
    private Customer customer;
    private LocalDate date;
    private EnumState state;
    private ArrayList<Item> details;

   
    public Order(Customer customer) {
        this.despatch = 1500;
        this.customer = customer;
        this.details = new ArrayList<>();
    }

    public Order() {
        this.despatch = 1500;
        this.customer = new Customer();
        this.details = new ArrayList<>();
    }
    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public EnumState getState() {
        return state;
    }

    public void setState(EnumState state) {
        this.state = state;
    }

    public ArrayList<Item> getDetails() {
        return details;
    }

    public void setDetails(Item detail) {
        this.details.add(detail);
    }
    public void addDish(Dish dish,int amount){
        this.details.add(new Item(dish, amount));
    }
    public int calculateTotal(){
         int total = 0;
        for (Item details : this.details) {
            total += details.getDish().getPrice()*details.getAmount();
        }
        return total+despatch;        
    } 
}
