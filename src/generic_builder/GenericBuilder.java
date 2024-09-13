package generic_builder;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class GenericBuilder<T>{
    private T instance;

    public GenericBuilder(Supplier<T> supplier){
        this.instance = supplier.get();
    }

    public <U> GenericBuilder<T> with(BiConsumer<T, U> setter, U value) {
        setter.accept(instance, value);
        return this;
    }

    public T build() {
        return instance;
    }
}
