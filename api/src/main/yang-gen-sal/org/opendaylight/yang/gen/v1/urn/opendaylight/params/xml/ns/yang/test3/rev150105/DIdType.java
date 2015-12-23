package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105;
import com.google.common.collect.Range;
import com.google.common.base.Preconditions;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.math.BigInteger;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.beans.ConstructorProperties;


public class DIdType
 implements Serializable {
    private static final long serialVersionUID = 6554984824571083098L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^dev-[A-Za-z]{1,4}[\\d]*$");
    
    static {
        final Pattern a[] = new Pattern[PATTERN_CONSTANTS.size()];
        int i = 0;
        for (String regEx : PATTERN_CONSTANTS) {
            a[i++] = Pattern.compile(regEx);
        }
    
        patterns = a;
    }
    private final java.lang.String _value;

    private static void check_valueLength(final String value) {
        final int length = value.length();
        if (length >= 10 && length <= 10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[10‥10]].", value));
    }

    @ConstructorProperties("value")
    public DIdType(java.lang.String _value) {
        if (_value != null) {
            check_valueLength(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
            for (Pattern p : patterns) {
                Preconditions.checkArgument(p.matcher(_value).matches(), "Supplied value \"%s\" does not match required pattern \"%s\"", _value, p);
            }
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DIdType(DIdType source) {
        this._value = source._value;
    }

    public static DIdType getDefaultInstance(String defaultValue) {
        return new DIdType(defaultValue);
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
        DIdType other = (DIdType) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DIdType.class.getSimpleName()).append(" [");
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

    /**
     * @deprecated This method is slated for removal in a future release. See BUG-1485 for details.
     */
    @Deprecated
    public static List<Range<BigInteger>> length() {
        List<Range<BigInteger>> ret = new java.util.ArrayList<>(1);
        ret.add(Range.closed(BigInteger.TEN, BigInteger.TEN));
        return ret;
    }


}

