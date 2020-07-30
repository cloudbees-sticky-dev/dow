
package demo;

import java.util.logging.Logger;

/**
 * Of course you know what this does!
 */
public class StandardMetaObjectReflectorFactoryImpl implements AbstractMetaObjectReflectorFactory {

    private static final Logger LOGGER = Logger.getLogger(StandardMetaObjectReflectorFactoryImpl.class.getName());

    public StandardMetaObjectReflectorFactoryImpl() {
        LOGGER.info("Constructing a standard implementation of the thing that constructs other stuff!");
    }

    @Override
    public Object produce() {
        return null;
    }

}
