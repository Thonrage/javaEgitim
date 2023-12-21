package generics;

public class GenericClass<T> {

    private T data;

    private T data2;

    public GenericClass(T data, T data2) {
        this.data = data;
        this.data2 = data2;
    }

    public T getData() {
        return data;
    }

    public T getData2() {
        return data2;
    }
}

