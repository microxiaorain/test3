package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;test3&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/test3.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * grouping device-grouping {
 *     leaf d-id {
 *         type string;
 *     }
 *     leaf d-type {
 *         type d-type-type;
 *     }
 *     leaf ip-address {
 *         type string;
 *     }
 *     leaf d-name {
 *         type string;
 *     }
 *     leaf img-id {
 *         type string;
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;test3/device-grouping&lt;/i&gt;
 *
 */
public interface DeviceGrouping
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:test3","2015-01-05","device-grouping"));

    java.lang.String getDId();
    
    DTypeType getDType();
    
    java.lang.String getIpAddress();
    
    java.lang.String getDName();
    
    java.lang.String getImgId();

}

