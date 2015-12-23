package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList
 *
 */
public class InnerListBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList> {

    private InnerListKey _key;
    private java.lang.Integer _name;
    private java.lang.String _value;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>> augmentation = Collections.emptyMap();

    public InnerListBuilder() {
    }

    public InnerListBuilder(InnerList base) {
        if (base.getKey() == null) {
            this._key = new InnerListKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._value = base.getValue();
        if (base instanceof InnerListImpl) {
            InnerListImpl impl = (InnerListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InnerListKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getName() {
        return _name;
    }
    
    public java.lang.String getValue() {
        return _value;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InnerListBuilder setKey(InnerListKey value) {
        this._key = value;
        return this;
    }
    
    public InnerListBuilder setName(java.lang.Integer value) {
        this._name = value;
        return this;
    }
    
    public InnerListBuilder setValue(java.lang.String value) {
        this._value = value;
        return this;
    }
    
    public InnerListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public InnerListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public InnerList build() {
        return new InnerListImpl(this);
    }

    private static final class InnerListImpl implements InnerList {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList.class;
        }

        private final InnerListKey _key;
        private final java.lang.Integer _name;
        private final java.lang.String _value;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>> augmentation = Collections.emptyMap();

        private InnerListImpl(InnerListBuilder base) {
            if (base.getKey() == null) {
                this._key = new InnerListKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._value = base.getValue();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public InnerListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getValue() {
            return _value;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_value == null) ? 0 : _value.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList)obj;
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_name == null) {
                if (other.getName() != null) {
                    return false;
                }
            } else if(!_name.equals(other.getName())) {
                return false;
            }
            if (_value == null) {
                if (other.getValue() != null) {
                    return false;
                }
            } else if(!_value.equals(other.getValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InnerListImpl otherImpl = (InnerListImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("InnerList [");
            boolean first = true;
        
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_value != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_value=");
                builder.append(_value);
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
