package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.list.test.a.list;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class BListKey
 implements Identifier<BList> {
    private static final long serialVersionUID = 4688647855073241991L;
    private final java.lang.String _value;


    public BListKey(java.lang.String _value) {
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public BListKey(BListKey source) {
        this._value = source._value;
    }


    public java.lang.String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_value == null) ? 0 : _value.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BListKey other = (BListKey) obj;
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!_value.equals(other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.list.test.a.list.BListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }



}

