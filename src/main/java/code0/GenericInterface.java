package code0;

/**
 * Created by Knight_JXNU on 2016/12/1.
 */
public class GenericInterface {
    private interface Generator<T>{
        public T next();
    }
    //这个 T 泛型可以被替换成各种不同的 class
    private class GeneratorClass implements Generator<String>{
        public String next() {
            return null;
        }
    }
}
