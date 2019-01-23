package build.builder;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Meal {
     private List<Item> items = new ArrayList<>();

     public void addItems(Item item){
         items.add(item);
     }

     public float getCost(){
         float cost = 0.0f;

         for (Item item:items){
             cost += item.price();
         }
         return cost;
     }

     public void showTtems(){
         for (Item item:items){
             System.out.println("Item:"+item.name());
             System.out.println("Packing"+item.packing().pack());
             System.out.println("Price"+item.price());
         }
     }
}
