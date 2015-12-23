package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.list.test.AList;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;test3&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/test3.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container list-test {
 *     list a-list {
 *         key "a-id"
 *         leaf a-id {
 *             type string;
 *         }
 *         list b-list {
 *             key "value"
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;test3/list-test&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ListTestBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ListTestBuilder
 *
 */
public interface ListTest
    extends
    ChildOf<Test3Data>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.ListTest>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:test3","2015-01-05","list-test"));

    List<AList> getAList();

}

