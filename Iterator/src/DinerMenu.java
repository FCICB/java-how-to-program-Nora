public class DinerMenu implements Menu{
    static final int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems=new MenuItem[MAX_ITEMS];

        addItem("Item 1", 10.99, "Description 1");
        addItem("Item 2", 8.99, "Description 2");
    }
    public void addItem(String name,double price, String description){
        if(numberOfItems<MAX_ITEMS){
            menuItems[numberOfItems++]=new MenuItem(name, price, description);
        }else {
            System.out.println("menu is full, can't add more item");
        }
    }
    @Override
    public Iterator createIterator() {
        return new DinerMenueIterator(menuItems);
    }
}
