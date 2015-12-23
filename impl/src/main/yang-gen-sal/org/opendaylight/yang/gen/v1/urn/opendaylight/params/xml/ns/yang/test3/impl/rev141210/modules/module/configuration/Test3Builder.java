package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.Broker;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3
 *
 */
public class Test3Builder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3> {

    private Broker _broker;
    private DomDataBroker _domDataBroker;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>> augmentation = Collections.emptyMap();

    public Test3Builder() {
    }

    public Test3Builder(Test3 base) {
        this._broker = base.getBroker();
        this._domDataBroker = base.getDomDataBroker();
        if (base instanceof Test3Impl) {
            Test3Impl impl = (Test3Impl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Broker getBroker() {
        return _broker;
    }
    
    public DomDataBroker getDomDataBroker() {
        return _domDataBroker;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Test3Builder setBroker(Broker value) {
        this._broker = value;
        return this;
    }
    
    public Test3Builder setDomDataBroker(DomDataBroker value) {
        this._domDataBroker = value;
        return this;
    }
    
    public Test3Builder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public Test3Builder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Test3 build() {
        return new Test3Impl(this);
    }

    private static final class Test3Impl implements Test3 {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3.class;
        }

        private final Broker _broker;
        private final DomDataBroker _domDataBroker;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>> augmentation = Collections.emptyMap();

        private Test3Impl(Test3Builder base) {
            this._broker = base.getBroker();
            this._domDataBroker = base.getDomDataBroker();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Broker getBroker() {
            return _broker;
        }
        
        @Override
        public DomDataBroker getDomDataBroker() {
            return _domDataBroker;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_broker == null) ? 0 : _broker.hashCode());
            result = prime * result + ((_domDataBroker == null) ? 0 : _domDataBroker.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3 other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3)obj;
            if (_broker == null) {
                if (other.getBroker() != null) {
                    return false;
                }
            } else if(!_broker.equals(other.getBroker())) {
                return false;
            }
            if (_domDataBroker == null) {
                if (other.getDomDataBroker() != null) {
                    return false;
                }
            } else if(!_domDataBroker.equals(other.getDomDataBroker())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Test3Impl otherImpl = (Test3Impl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Test3 [");
            boolean first = true;
        
            if (_broker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_broker=");
                builder.append(_broker);
             }
            if (_domDataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domDataBroker=");
                builder.append(_domDataBroker);
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
