import java.util.ArrayList;
import java.util.List;

public class pancakeHouseMenu implements Menu{
    List <MenuItem> menuItems;
    public pancakeHouseMenu(){
        menuItems=new ArrayList<>();

        addItem("Pancake 1", 5.99, "Description 1");
        addItem("Pancake 2", 6.99, "Description 2");
    }
    public void addItem(String name,double price, String description){
        MenuItem menuItem=new MenuItem(name,price,description);
        menuItems.add(menuItem);
    }
    @Override
    public Iterator createIterator() {
        return new pancakeMenuIterator(menuItems);
    }
}
