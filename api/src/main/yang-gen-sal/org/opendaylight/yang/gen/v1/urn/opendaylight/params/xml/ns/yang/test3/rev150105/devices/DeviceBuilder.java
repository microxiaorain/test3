package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DTypeType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device
 *
 */
public class DeviceBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device> {

    private java.lang.String _dId;
    private java.lang.String _dName;
    private DTypeType _dType;
    private java.lang.String _imgId;
    private java.lang.String _ipAddress;
    private DeviceKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>> augmentation = Collections.emptyMap();

    public DeviceBuilder() {
    }
    public DeviceBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping arg) {
        this._dId = arg.getDId();
        this._dType = arg.getDType();
        this._ipAddress = arg.getIpAddress();
        this._dName = arg.getDName();
        this._imgId = arg.getImgId();
    }

    public DeviceBuilder(Device base) {
        if (base.getKey() == null) {
            this._key = new DeviceKey(
                base.getDId()
            );
            this._dId = base.getDId();
        } else {
            this._key = base.getKey();
            this._dId = _key.getDId();
        }
        this._dName = base.getDName();
        this._dType = base.getDType();
        this._imgId = base.getImgId();
        this._ipAddress = base.getIpAddress();
        if (base instanceof DeviceImpl) {
            DeviceImpl impl = (DeviceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping) {
            this._dId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping)arg).getDId();
            this._dType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping)arg).getDType();
            this._ipAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping)arg).getIpAddress();
            this._dName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping)arg).getDName();
            this._imgId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping)arg).getImgId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DeviceGrouping] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDId() {
        return _dId;
    }
    
    public java.lang.String getDName() {
        return _dName;
    }
    
    public DTypeType getDType() {
        return _dType;
    }
    
    public java.lang.String getImgId() {
        return _imgId;
    }
    
    public java.lang.String getIpAddress() {
        return _ipAddress;
    }
    
    public DeviceKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DeviceBuilder setDId(java.lang.String value) {
        this._dId = value;
        return this;
    }
    
    public DeviceBuilder setDName(java.lang.String value) {
        this._dName = value;
        return this;
    }
    
    public DeviceBuilder setDType(DTypeType value) {
        this._dType = value;
        return this;
    }
    
    public DeviceBuilder setImgId(java.lang.String value) {
        this._imgId = value;
        return this;
    }
    
    public DeviceBuilder setIpAddress(java.lang.String value) {
        this._ipAddress = value;
        return this;
    }
    
    public DeviceBuilder setKey(DeviceKey value) {
        this._key = value;
        return this;
    }
    
    public DeviceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DeviceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Device build() {
        return new DeviceImpl(this);
    }

    private static final class DeviceImpl implements Device {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device.class;
        }

        private final java.lang.String _dId;
        private final java.lang.String _dName;
        private final DTypeType _dType;
        private final java.lang.String _imgId;
        private final java.lang.String _ipAddress;
        private final DeviceKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>> augmentation = Collections.emptyMap();

        private DeviceImpl(DeviceBuilder base) {
            if (base.getKey() == null) {
                this._key = new DeviceKey(
                    base.getDId()
                );
                this._dId = base.getDId();
            } else {
                this._key = base.getKey();
                this._dId = _key.getDId();
            }
            this._dName = base.getDName();
            this._dType = base.getDType();
            this._imgId = base.getImgId();
            this._ipAddress = base.getIpAddress();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDId() {
            return _dId;
        }
        
        @Override
        public java.lang.String getDName() {
            return _dName;
        }
        
        @Override
        public DTypeType getDType() {
            return _dType;
        }
        
        @Override
        public java.lang.String getImgId() {
            return _imgId;
        }
        
        @Override
        public java.lang.String getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public DeviceKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dId == null) ? 0 : _dId.hashCode());
            result = prime * result + ((_dName == null) ? 0 : _dName.hashCode());
            result = prime * result + ((_dType == null) ? 0 : _dType.hashCode());
            result = prime * result + ((_imgId == null) ? 0 : _imgId.hashCode());
            result = prime * result + ((_ipAddress == null) ? 0 : _ipAddress.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device)obj;
            if (_dId == null) {
                if (other.getDId() != null) {
                    return false;
                }
            } else if(!_dId.equals(other.getDId())) {
                return false;
            }
            if (_dName == null) {
                if (other.getDName() != null) {
                    return false;
                }
            } else if(!_dName.equals(other.getDName())) {
                return false;
            }
            if (_dType == null) {
                if (other.getDType() != null) {
                    return false;
                }
            } else if(!_dType.equals(other.getDType())) {
                return false;
            }
            if (_imgId == null) {
                if (other.getImgId() != null) {
                    return false;
                }
            } else if(!_imgId.equals(other.getImgId())) {
                return false;
            }
            if (_ipAddress == null) {
                if (other.getIpAddress() != null) {
                    return false;
                }
            } else if(!_ipAddress.equals(other.getIpAddress())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DeviceImpl otherImpl = (DeviceImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Device [");
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
            if (_dName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dName=");
                builder.append(_dName);
             }
            if (_dType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dType=");
                builder.append(_dType);
             }
            if (_imgId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_imgId=");
                builder.append(_imgId);
             }
            if (_ipAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipAddress=");
                builder.append(_ipAddress);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
