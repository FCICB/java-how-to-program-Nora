public class Waitress {
pancakeHouseMenu pancakeHouseMenu;
DinerMenu dinerMenu;

public Waitress(pancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu){
    this.pancakeHouseMenu=pancakeHouseMenu;
    this.dinerMenu=dinerMenu;
}
public void printMenu(){
    Iterator pancakeIterator=pancakeHouseMenu.createIterator();
    Iterator dinerIterator=dinerMenu.createIterator();
    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeIterator);

    System.out.println("\nLUNCH");
    printMenu(dinerIterator);
}
private void printMenu(Iterator iterator){
while (iterator.hasnext()){
    MenuItem menuItem=(MenuItem) iterator.next();
    System.out.println(menuItem.getName()+",");
    System.out.println(menuItem.getPrice()+"--");
    System.out.println(menuItem.getDescription());
}
}
}
