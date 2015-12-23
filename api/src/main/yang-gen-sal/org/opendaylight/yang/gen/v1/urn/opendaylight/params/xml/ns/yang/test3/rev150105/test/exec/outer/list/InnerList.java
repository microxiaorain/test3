package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.OuterList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;test3&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/test3.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * list inner-list {
 *     key "name"
 *     leaf name {
 *         type int32;
 *     }
 *     leaf value {
 *         type string;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;test3/test-exec/outer-list/inner-list&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerListBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerListKey
 *
 */
public interface InnerList
    extends
    ChildOf<OuterList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList>,
    Identifiable<InnerListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:test3","2015-01-05","inner-list"));

    java.lang.Integer getName();
    
    java.lang.String getValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    InnerListKey getKey();

}

