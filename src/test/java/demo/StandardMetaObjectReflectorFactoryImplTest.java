package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardMetaObjectReflectorFactoryImplTest {

    @Test
    public void produce_is_valid() {
        assertNull(new StandardMetaObjectReflectorFactoryImpl().produce());
    }

}
