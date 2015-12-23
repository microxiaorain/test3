package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;test3-impl&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/test3-impl.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * container dom-data-broker {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:test3:impl?revision=2014-12-10)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;test3-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:test3:impl?revision=2014-12-10)test3/dom-data-broker&lt;/i&gt;
 *
 * &lt;p&gt;To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBrokerBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBrokerBuilder
 *
 */
public interface DomDataBroker
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.modules.module.configuration.test3.DomDataBroker>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:test3:impl","2014-12-10","dom-data-broker"));


}

