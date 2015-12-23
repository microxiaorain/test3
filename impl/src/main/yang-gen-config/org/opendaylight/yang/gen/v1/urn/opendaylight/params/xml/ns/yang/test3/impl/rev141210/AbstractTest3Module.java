/*
* Generated file
*
* Generated from: yang module name: test3-impl yang module local name: test3
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Dec 23 16:38:02 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2014-12-10", name = "test3-impl", namespace = "urn:opendaylight:params:xml:ns:yang:test3:impl")

public abstract class AbstractTest3Module extends org.opendaylight.controller.config.spi.AbstractModule<AbstractTest3Module> implements org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.Test3ModuleMXBean {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.impl.rev141210.AbstractTest3Module.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute domDataBrokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DomDataBroker");
    private javax.management.ObjectName domDataBroker; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute brokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Broker");
    private javax.management.ObjectName broker; // mandatory

    //attributes end

    public AbstractTest3Module(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AbstractTest3Module(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractTest3Module oldModule,java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.dom.DOMDataBrokerServiceInterface.class, domDataBroker, domDataBrokerJmxAttribute);
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.BindingAwareBrokerServiceInterface.class, broker, brokerJmxAttribute);

        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.md.sal.dom.api.DOMDataBroker domDataBrokerDependency;
    protected final org.opendaylight.controller.md.sal.dom.api.DOMDataBroker getDomDataBrokerDependency(){
        return domDataBrokerDependency;
    }private org.opendaylight.controller.sal.binding.api.BindingAwareBroker brokerDependency;
    protected final org.opendaylight.controller.sal.binding.api.BindingAwareBroker getBrokerDependency(){
        return brokerDependency;
    }

    protected final void resolveDependencies() {
        domDataBrokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.md.sal.dom.api.DOMDataBroker.class, domDataBroker, domDataBrokerJmxAttribute);
        brokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.binding.api.BindingAwareBroker.class, broker, brokerJmxAttribute);
    }

    public boolean canReuseInstance(AbstractTest3Module oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractTest3Module other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(domDataBroker, other.domDataBroker) == false) {
            return false;
        }
        if(domDataBroker!= null) {
            if (!dependencyResolver.canReuseDependency(domDataBroker, domDataBrokerJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }
        if (java.util.Objects.deepEquals(broker, other.broker) == false) {
            return false;
        }
        if(broker!= null) {
            if (!dependencyResolver.canReuseDependency(broker, brokerJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractTest3Module that = (AbstractTest3Module) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getDomDataBroker() {
        return domDataBroker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.dom.DOMDataBrokerServiceInterface.class)
    public void setDomDataBroker(javax.management.ObjectName domDataBroker) {
        this.domDataBroker = domDataBroker;
    }

    @Override
    public javax.management.ObjectName getBroker() {
        return broker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.BindingAwareBrokerServiceInterface.class)
    public void setBroker(javax.management.ObjectName broker) {
        this.broker = broker;
    }

    public org.slf4j.Logger getLogger() {
        return LOGGER;
    }

}