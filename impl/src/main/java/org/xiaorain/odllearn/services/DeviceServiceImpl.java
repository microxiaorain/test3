package org.xiaorain.odllearn.services;

import java.util.concurrent.Future;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.DataChangeListener;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataChangeEvent;
import org.opendaylight.controller.md.sal.dom.api.DOMDataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.AddDeviceInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.AddDeviceOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.AddDeviceOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DIdType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.GetDeviceInfoInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.GetDeviceInfoOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.GetDeviceInfoOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.Test3Service;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.DeviceBuilder;
import org.xiaorain.odllearn.dao.DeviceDAO;

public class DeviceServiceImpl implements Test3Service, DataChangeListener {
    
    private DeviceDAO dao = null;
    private Logger logger = LoggerFactory.getLogger(DeviceServiceImpl.class);
    
    public void setDao(DataBroker dataBroker) throws NullPointerException {
        this.dao = DeviceDAO.getInstance();
        this.dao.setDataBroker(dataBroker);
    }    
    
    public void setDomDao(DOMDataBroker domDataBroker) throws NullPointerException {
        this.dao = DeviceDAO.getInstance();
        this.dao.setDomDataBroker(domDataBroker);
    } 
    
    @Override 
    public Future<RpcResult<AddDeviceOutput>> addDevice(AddDeviceInput input) {
        DeviceBuilder builder = new DeviceBuilder(input);
        String reply = this.dao.addDevice(builder.build());
        
        AddDeviceOutputBuilder outBuilder = new AddDeviceOutputBuilder();
        AddDeviceOutput output = outBuilder.setResult(reply).build();
        
        return RpcResultBuilder.success(output).buildFuture();
    }


    @Override
    public Future<RpcResult<GetDeviceInfoOutput>> getDeviceInfo(GetDeviceInfoInput input) {
        
        Device device = this.dao.getDevice(input.getDId().getValue());
        if (device != null) {
            GetDeviceInfoOutputBuilder outBuilder = new GetDeviceInfoOutputBuilder(device);
            return RpcResultBuilder.success(outBuilder.build()).buildFuture();
        }
        
        return RpcResultBuilder.<GetDeviceInfoOutput>failed().buildFuture();
    }

    @Override
    public void onDataChanged(AsyncDataChangeEvent<InstanceIdentifier<?>, DataObject> change) {
        logger.info("data changed");
    }

}
