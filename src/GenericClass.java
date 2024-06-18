import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
    public List<T> list = new ArrayList<>();

    public GenericClass() {
    }

    public GenericClass(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void addElement(T element){
        this.list.add(element);
    }

    public void deleteElement(T element){
        this.list.remove(element);
    }

    public T showElement(T element){
        if(this.list.contains(element)){
            return element;
        }
        return null;
    }
}
