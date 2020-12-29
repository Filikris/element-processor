package ua.pp.kris.processor;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3};
        ElementProcessor<Integer> elemProcessor = new PrintIntElementProcessor();
        ArrayProcessor<Integer> processor = new ArrayProcessor<>(arr);
        processor.process(elemProcessor);

    }
}
