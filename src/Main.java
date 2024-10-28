import java.util.ArrayList;
import java.util.Arrays;


class Test{
    private int _x;
    public Test(){ _x = 0;}
    public Test(int _x) {
        this._x = _x;
    }
    public int getX() {
        return _x;
    }
    public void setX(int _x) {
        this._x = _x;
    }
}

class Test2{
    private int _y;
    public Test2(){ _y = 0;}
    public Test2(int _y) {
        this._y = _y;
    }
    public int getY() {
        return _y;
    }
    public void setY(int _y) {
        this._y = _y;
    }
}

class Stuff<T> {
    private ArrayList<T>  _thing;
    public Stuff(){ _thing = new ArrayList<>();}
    public Stuff(int size) { _thing = new ArrayList<>(size); }
    public T getThing(int i) { return _thing.get(i); }
    public void setThing(int i, T t) { _thing.set(i, t); }

    public void addItem(T t) { _thing.add(t); }
    public T removeItem(int idx) {
        if ( idx >= 0 && idx < _thing.size() )
            return _thing.remove(idx);
        return null;
    }
    public boolean findItem(T item){
        boolean found = false;
        int idx = 0;
        while (!found && idx++ < _thing.size() ) {
            if (_thing.get(idx).equals(item))
                found = true;
        }
        return found;
    }
    public void printItems() {
        for (T t : _thing) {
            int item = 1;
            System.out.printf("Item %d: %s\n", item++, t);
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Stuff<Test> s = new Stuff<>();
    }

}