package demo;

/**
 * A factory for things that reflect objects on the meta level, but…more abstractly than that.
 */
public interface AbstractMetaObjectReflectorFactory {

    /**
     * Produces an object.
     * @return a new object or null
     */
    Object produce();

}
