import java.util.List;
public class pancakeMenuIterator implements Iterator{
    List<MenuItem> items;
    int position = 0;

    public pancakeMenuIterator(List<MenuItem> items) {
        this.items = items;
    }
    @Override
    public boolean hasnext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
