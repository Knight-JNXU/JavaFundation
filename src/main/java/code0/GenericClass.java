package code0;

/**
 * Created by Knight_JXNU on 2016/12/1.
 * 泛型类
 */
public class GenericClass {
    /**
     * 非泛型类
     */
    private class NoGeneric{
        private String key;
        private String value;

        public NoGeneric(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
     * 泛型类
     * <K, V>不一定非得是 K 和 V，这个是自己定的
     */
    private class Generic<K, V>{
        private K key;
        private V value;

        public Generic(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
