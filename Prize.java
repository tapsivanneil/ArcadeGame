package Arcade;

public class Prize {
    private String name;
    private int price;
    private int quantity;

    public void setName (String name){
        this.name = name;
    }

    public void setPrice (int price){
        this.price = price;
    }

    public void setQuantity (int quantity){
        this.quantity = quantity;
    }

    public String getName (){
        return name;
    }

    public int getPrice (){
        return price;
    }

    public int getQuantity (){
        return quantity;
    }


}
