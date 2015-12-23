package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.util.List;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;test3&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/test3.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container devices {
 *     list device {
 *         key "d-id"
 *         leaf d-id {
 *             type string;
 *         }
 *         leaf d-type {
 *             type d-type-type;
 *         }
 *         leaf ip-address {
 *             type string;
 *         }
 *         leaf d-name {
 *             type string;
 *         }
 *         leaf img-id {
 *             type string;
 *         }
 *         uses device-grouping;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;test3/devices&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DevicesBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DevicesBuilder
 *
 */
public interface Devices
    extends
    ChildOf<Test3Data>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.Devices>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:test3","2015-01-05","devices"));

    List<Device> getDevice();

}

