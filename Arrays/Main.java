package Arrays;

class Shopping {
    Item[][][] conveyorBelts;

    public Shopping(Item[][][] conveyorBelts) {
        this.conveyorBelts = conveyorBelts;
    }


}

class Item {
    String name;
    private boolean type;
    private int cost;

    public Item(String name,boolean type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public boolean getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }
}

public class Main {
    public static void main(String[] args) {
        Item[][][] carts = {
            {
                {{new Item("milk",true, 10)}, {new Item("oil",false, 20)},
                  {{new Item("bread",true, 15)}}
            }
         
         
         
         
         
         
         
        };
            // {
            // {  {{new Item("milk",true, 10)}, {new Item("oil",false, 20)},
            //     {{new Item("bread",true, 15)}}
            // },
            // {
            //     {{new Item("watch",false, 25)}, {new Item(true, 12), new Item(true, 30)}}
            // },
            // {
            //     {{new Item(true, 18)}, {new Item(true, 22), new Item(true, 28)}}`
            // }
            // };
    
    }
        
    
}
