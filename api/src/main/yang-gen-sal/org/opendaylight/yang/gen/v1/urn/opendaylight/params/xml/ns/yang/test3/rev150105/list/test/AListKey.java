package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.list.test;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class AListKey
 implements Identifier<AList> {
    private static final long serialVersionUID = -6398010340349113024L;
    private final java.lang.String _aId;


    public AListKey(java.lang.String _aId) {
    
    
        this._aId = _aId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AListKey(AListKey source) {
        this._aId = source._aId;
    }


    public java.lang.String getAId() {
        return _aId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_aId == null) ? 0 : _aId.hashCode());
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
        AListKey other = (AListKey) obj;
        if (_aId == null) {
            if (other._aId != null) {
                return false;
            }
        } else if(!_aId.equals(other._aId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.list.test.AListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_aId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_aId=");
            builder.append(_aId);
         }
        return builder.append(']').toString();
    }



}

