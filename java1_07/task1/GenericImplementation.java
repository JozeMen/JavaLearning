package java1_07.task1;

public class GenericImplementation<T> implements SomeInterface<T> {
    protected T data;

    @Override
    public T getData() {
        return data;
    }

    @Override
    public boolean validate(T data) {
        return true;
    }

}
