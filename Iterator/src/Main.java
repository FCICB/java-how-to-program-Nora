
public class Main {
    public static void main(String[] args) {
        pancakeHouseMenu pancakeHouseMenu=new pancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}