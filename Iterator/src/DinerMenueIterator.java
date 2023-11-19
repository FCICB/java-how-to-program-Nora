public class DinerMenueIterator implements Iterator {
    MenuItem[] items;
    int position=0;

    public DinerMenueIterator(MenuItem[] items){
        this.items=items;
    }

    @Override
    public boolean hasnext() {
        return position<items.length&& items[position] !=null;
    }

    @Override
    public Object next() {
        MenuItem menuItem=items[position];
        position=position+1;
        return menuItem;
    }
}
