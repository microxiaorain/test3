package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 *
 */
public enum DTypeType {
    ROUTER(0),
    
    SWITCH(1)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, DTypeType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DTypeType> b = com.google.common.collect.ImmutableMap.builder();
        for (DTypeType enumItem : DTypeType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private DTypeType(int value) {
        this.value = value;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding DTypeType item
     */
    public static DTypeType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
