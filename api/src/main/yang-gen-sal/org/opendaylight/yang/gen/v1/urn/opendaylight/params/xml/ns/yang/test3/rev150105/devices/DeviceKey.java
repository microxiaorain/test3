package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class DeviceKey
 implements Identifier<Device> {
    private static final long serialVersionUID = 6251492285734294462L;
    private final java.lang.String _dId;


    public DeviceKey(java.lang.String _dId) {
    
    
        this._dId = _dId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DeviceKey(DeviceKey source) {
        this._dId = source._dId;
    }


    public java.lang.String getDId() {
        return _dId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_dId == null) ? 0 : _dId.hashCode());
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
        DeviceKey other = (DeviceKey) obj;
        if (_dId == null) {
            if (other._dId != null) {
                return false;
            }
        } else if(!_dId.equals(other._dId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.DeviceKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_dId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_dId=");
            builder.append(_dId);
         }
        return builder.append(']').toString();
    }



}

