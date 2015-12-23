package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker
 *
 */
public class DomDataBrokerBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker> {

    private java.lang.Object _name;
    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType> _type;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>> augmentation = Collections.emptyMap();

    public DomDataBrokerBuilder() {
    }
    public DomDataBrokerBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef arg) {
        this._type = arg.getType();
        this._name = arg.getName();
    }

    public DomDataBrokerBuilder(DomDataBroker base) {
        this._name = base.getName();
        this._type = base.getType();
        if (base instanceof DomDataBrokerImpl) {
            DomDataBrokerImpl impl = (DomDataBrokerImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef) {
            this._type = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef)arg).getType();
            this._name = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef)arg).getName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Object getName() {
        return _name;
    }
    
    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType> getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DomDataBrokerBuilder setName(java.lang.Object value) {
        this._name = value;
        return this;
    }
    
    public DomDataBrokerBuilder setType(java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType> value) {
        this._type = value;
        return this;
    }
    
    public DomDataBrokerBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DomDataBrokerBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public DomDataBroker build() {
        return new DomDataBrokerImpl(this);
    }

    private static final class DomDataBrokerImpl implements DomDataBroker {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker.class;
        }

        private final java.lang.Object _name;
        private final java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType> _type;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>> augmentation = Collections.emptyMap();

        private DomDataBrokerImpl(DomDataBrokerBuilder base) {
            this._name = base.getName();
            this._type = base.getType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Object getName() {
            return _name;
        }
        
        @Override
        public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType> getType() {
            return _type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_type == null) ? 0 : _type.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker)obj;
            if (_name == null) {
                if (other.getName() != null) {
                    return false;
                }
            } else if(!_name.equals(other.getName())) {
                return false;
            }
            if (_type == null) {
                if (other.getType() != null) {
                    return false;
                }
            } else if(!_type.equals(other.getType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DomDataBrokerImpl otherImpl = (DomDataBrokerImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DomDataBroker [");
            boolean first = true;
        
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_type=");
                builder.append(_type);
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
