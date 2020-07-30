
package demo;

import java.util.logging.Logger;

/**
 * Of course you know what this does!
 */
public class StandardMetaObjectReflectorFactoryImpl implements AbstractMetaObjectReflectorFactory {

    private static final Logger LOGGER = Logger.getLogger(StandardMetaObjectReflectorFactoryImpl.class.getName());

    public StandardMetaObjectReflectorFactoryImpl() {
        LOGGER.info("constructing a standard implementation of the blah blah blah");
    }

    @Override
    public Object provide() {
        return null;
    }

}
