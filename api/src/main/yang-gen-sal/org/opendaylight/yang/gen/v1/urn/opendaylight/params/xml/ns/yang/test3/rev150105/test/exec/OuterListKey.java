package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class OuterListKey
 implements Identifier<OuterList> {
    private static final long serialVersionUID = -8946581655134353462L;
    private final java.lang.Integer _id;


    public OuterListKey(java.lang.Integer _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public OuterListKey(OuterListKey source) {
        this._id = source._id;
    }


    public java.lang.Integer getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_id == null) ? 0 : _id.hashCode());
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
        OuterListKey other = (OuterListKey) obj;
        if (_id == null) {
            if (other._id != null) {
                return false;
            }
        } else if(!_id.equals(other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.OuterListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_id != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_id=");
            builder.append(_id);
         }
        return builder.append(']').toString();
    }



}

