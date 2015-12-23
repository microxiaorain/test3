package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img
 *
 */
public class ImgBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img> {

    private java.lang.String _id;
    private ImgKey _key;
    private java.lang.String _path;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>> augmentation = Collections.emptyMap();

    public ImgBuilder() {
    }
    public ImgBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ImgGrouping arg) {
        this._id = arg.getId();
        this._path = arg.getPath();
    }

    public ImgBuilder(Img base) {
        if (base.getKey() == null) {
            this._key = new ImgKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._path = base.getPath();
        if (base instanceof ImgImpl) {
            ImgImpl impl = (ImgImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ImgGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ImgGrouping) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ImgGrouping)arg).getId();
            this._path = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ImgGrouping)arg).getPath();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ImgGrouping] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getId() {
        return _id;
    }
    
    public ImgKey getKey() {
        return _key;
    }
    
    public java.lang.String getPath() {
        return _path;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ImgBuilder setId(java.lang.String value) {
        this._id = value;
        return this;
    }
    
    public ImgBuilder setKey(ImgKey value) {
        this._key = value;
        return this;
    }
    
    public ImgBuilder setPath(java.lang.String value) {
        this._path = value;
        return this;
    }
    
    public ImgBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ImgBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Img build() {
        return new ImgImpl(this);
    }

    private static final class ImgImpl implements Img {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img.class;
        }

        private final java.lang.String _id;
        private final ImgKey _key;
        private final java.lang.String _path;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>> augmentation = Collections.emptyMap();

        private ImgImpl(ImgBuilder base) {
            if (base.getKey() == null) {
                this._key = new ImgKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._path = base.getPath();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public ImgKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getPath() {
            return _path;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_id == null) ? 0 : _id.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_path == null) ? 0 : _path.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img)obj;
            if (_id == null) {
                if (other.getId() != null) {
                    return false;
                }
            } else if(!_id.equals(other.getId())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_path == null) {
                if (other.getPath() != null) {
                    return false;
                }
            } else if(!_path.equals(other.getPath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ImgImpl otherImpl = (ImgImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.imgs.Img>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Img [");
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
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_path != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_path=");
                builder.append(_path);
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
