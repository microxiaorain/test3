/*
 * xiaorain (c) and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.xiaorain.odllearn.impl;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.Devices;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.Test3Service;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.controller.md.sal.dom.api.DOMDataBroker;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataBroker.DataChangeScope;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xiaorain.odllearn.services.DeviceServiceImpl;

public class Test3Provider implements BindingAwareProvider, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(Test3Provider.class);
    private DOMDataBroker domDataBroker = null;
       
    @Override
    public void onSessionInitiated(ProviderContext session) {
        
        DataBroker dataBroker = session.getSALService(DataBroker.class);
        
        DeviceServiceImpl impl = new DeviceServiceImpl(); 
        impl.setDao(dataBroker);
        impl.setDomDao(domDataBroker);
        
        session.addRpcImplementation(Test3Service.class, impl);
        
        dataBroker.registerDataChangeListener(
               LogicalDatastoreType.CONFIGURATION, 
               InstanceIdentifier.builder(Devices.class).build(), 
               impl, DataChangeScope.SUBTREE);
        
        
        LOG.info("Test3Provider Session Initiated");
    }

    @Override
    public void close() throws Exception {
        LOG.info("Test3Provider Closed");
    }

    public DOMDataBroker getDomDataBroker() {
        return domDataBroker;
    }

    public void setDomDataBroker(DOMDataBroker domDataBroker) {
        LOG.info("xiaorain-------domDataBroker :" + domDataBroker);
        this.domDataBroker = domDataBroker;
    }
    
    
}
