package ua.pp.kris.processor;

public class ArrayProcessor<T> {
    private T [] arr;

    public ArrayProcessor(T[] arr) {
        this.arr = arr;
    }

    public void process(ElementProcessor<T> processor) {
        for (T t : arr) {
            processor.run(t);
        }
    }

}

