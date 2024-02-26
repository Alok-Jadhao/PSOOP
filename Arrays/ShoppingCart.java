public class ShoppingCart {
    private Item[][][] conveyorBelts;

    public ShoppingCart(Item[][][] conveyorBelts) {
        this.conveyorBelts = conveyorBelts;
    }

    public int[] totalCostOfEachCart() {
        int[] cartTotals = new int[conveyorBelts.length];
        for (int i = 0; i < conveyorBelts.length; i++) {
            int totalCost = 0;
            for (Item[][] items : conveyorBelts[i]) {
                for (Item[] innerItems : items) {
                    for (Item item : innerItems) {
                        totalCost += item.getCost();
                    }
                }
            }
            cartTotals[i] = totalCost;
        }
        return cartTotals;
    }

    public Item[][] allPerishableItemsSold() {
        int totalPerishableItems = 0;
        for (Item[][] cart : conveyorBelts) {
            for (Item[][] items : cart) {
                for (Item[] innerItems : items) {
                    for (Item item : innerItems) {
                        if (item.getType().equals("Perishable")) {
                            totalPerishableItems++;
                        }
                    }
                }
            }
        }
        Item[][] perishableItems = new Item[totalPerishableItems][];
        int index = 0;
        for (Item[][] cart : conveyorBelts) {
            for (Item[][] items : cart) {
                for (Item[] innerItems : items) {
                    for (Item item : innerItems) {
                        if (item.getType().equals("Perishable")) {
                            perishableItems[index++] = innerItems;
                        }
                    }
                }
            }
        }
        return perishableItems;
    }

    public Item costliestNonPerishableItemSold() {
        int maxCost = 0;
        Item costliestItem = null;
        for (Item[][] cart : conveyorBelts) {
            for (Item[][] items : cart) {
                for (Item[] innerItems : items) {
                    for (Item item : innerItems) {
                        if (item.getType().equals("Non-perishable") && item.getCost() > maxCost) {
                            maxCost = item.getCost();
                            costliestItem = item;
                        }
                    }
                }
            }
        }
        return costliestItem;
    }

    public static void main(String[] args) {
        Item[][][] carts = {
            {
                {{new Item("Perishable", 10)}, {new Item("Non-perishable", 20)}},
                {{new Item("Perishable", 15)}}
            },
            {
                {{new Item("Non-perishable", 25)}, {new Item("Perishable", 12), new Item("Non-perishable", 30)}}
            },
            {
                {{new Item("Perishable", 18)}, {new Item("Non-perishable", 22), new Item("Non-perishable", 28)}}
            }
        };

        ShoppingCart shoppingCart = new ShoppingCart(carts);

        int[] cartTotals = shoppingCart.totalCostOfEachCart();
        System.out.println("Total cost of each cart:");
        for (int i = 0; i < cartTotals.length; i++) {
            System.out.println("Cart " + (i + 1) + ": " + cartTotals[i]);
        }

        Item[][] perishableItems = shoppingCart.allPerishableItemsSold();
        System.out.println("\nAll perishable items sold:");
        for (Item[] items : perishableItems) {
            for (Item item : items) {
                System.out.println(item.getType() + " - $" + item.getCost());
            }
        }

        Item costliestNonPerishableItem = shoppingCart.costliestNonPerishableItemSold();
        System.out.println("\nCostliest non-perishable item sold:");
        if (costliestNonPerishableItem != null) {
            System.out.println(costliestNonPerishableItem.getType() + " - $" + costliestNonPerishableItem.getCost());
        } else {
            System.out.println("No non-perishable items sold.");
        }
    }
}

class Item {
    private String type;
    private int cost;

    public Item(String type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }
}

