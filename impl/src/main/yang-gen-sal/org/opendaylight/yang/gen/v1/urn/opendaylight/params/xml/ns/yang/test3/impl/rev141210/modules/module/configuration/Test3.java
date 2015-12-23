package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.Broker;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;test3-impl&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/test3-impl.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * case test3 {
 *     container broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:test3:impl?revision=2014-12-10)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container dom-data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:test3:impl?revision=2014-12-10)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;test3-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:test3:impl?revision=2014-12-10)test3&lt;/i&gt;
 *
 */
public interface Test3
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.Test3>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:test3:impl","2014-12-10","test3"));

    Broker getBroker();
    
    DomDataBroker getDomDataBroker();

}

