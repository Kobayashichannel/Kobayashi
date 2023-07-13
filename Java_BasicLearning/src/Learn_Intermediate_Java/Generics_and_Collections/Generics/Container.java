package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Container<T> {
    private T data;

    public Container(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}
