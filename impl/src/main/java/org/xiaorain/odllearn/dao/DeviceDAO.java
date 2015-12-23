package org.xiaorain.odllearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.opendaylight.controller.md.sal.binding.api.BindingTransactionChain;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.DataTreeIdentifier;
import org.opendaylight.controller.md.sal.dom.api.DOMDataBroker;
import org.opendaylight.controller.md.sal.dom.api.DOMDataWriteTransaction;
import org.opendaylight.controller.md.sal.binding.api.ReadOnlyTransaction;
import org.opendaylight.controller.md.sal.binding.api.WriteTransaction;
import org.opendaylight.controller.md.sal.common.api.data.AsyncConfigurationCommitHandler;
import org.opendaylight.controller.md.sal.common.api.data.AsyncTransaction;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
import org.opendaylight.controller.md.sal.common.api.data.TransactionChain;
import org.opendaylight.controller.md.sal.common.api.data.TransactionChainListener;
import org.opendaylight.controller.md.sal.common.api.data.TransactionCommitFailedException;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DIdType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.Devices;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.TestExec;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.DeviceBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.DeviceKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.OuterList;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.test.exec.outer.list.InnerList;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.data.impl.schema.ImmutableNodes;
import org.opendaylight.yangtools.yang.data.impl.schema.builder.api.CollectionNodeBuilder;
import org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier;
import org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier.NodeIdentifierWithPredicates;
import org.opendaylight.yangtools.yang.data.api.schema.MapEntryNode;
import org.opendaylight.yangtools.yang.data.api.schema.MapNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.base.Optional;

public class DeviceDAO implements TransactionChainListener {
    
    public Logger logger = LoggerFactory.getLogger(DeviceDAO.class);
    private static DeviceDAO instance = new DeviceDAO();
    private DataBroker dataBroker = null;
    private DOMDataBroker domDataBroker = null;
    
    private DeviceDAO() {}
    
    public static DeviceDAO getInstance() {
        return instance;
    }
    
    public void setDomDataBroker(DOMDataBroker domBroker) {
        this.domDataBroker = domBroker;
    }
    
    public void setDataBroker(DataBroker broker) throws NullPointerException {
        if (broker == null) {
            throw new NullPointerException();
        }
        dataBroker = broker;
    }
    
    public Device getDevice(String devId) {
        InstanceIdentifierBuilder<Devices> cfgsInstIdBuilder = InstanceIdentifier.builder(Devices.class);
        InstanceIdentifier<Device> path = cfgsInstIdBuilder.child(Device.class, new DeviceKey(devId)).build();
        ReadOnlyTransaction tx = dataBroker.newReadOnlyTransaction();
        try {
            Optional<Device>  option = tx.read(LogicalDatastoreType.CONFIGURATION, path).get();
            if(option.isPresent()) {
                return option.get();
            } else {
                return null;
            }
            
        } catch (Exception e) {
            tx.close();
            logger.error("get device has error.", e);
            return null;
        }
    }
    
    public String addDevice(Device device) {
        String reply = null;
//        InstanceIdentifierBuilder<Devices> cfgsInstIdBuilder = InstanceIdentifier.builder(Devices.class);
//        InstanceIdentifier<Device> path = cfgsInstIdBuilder.child(Device.class, device.getKey()).build();
//        WriteTransaction tx = dataBroker.newWriteOnlyTransaction();
//        tx.put(LogicalDatastoreType.CONFIGURATION, path, device, true);
//        try {
//            tx.submit().get();
//            reply = "add device ok";
//        } catch (Exception e) {
//            tx.cancel();
//            logger.error("add device has error.", e);
//            reply = "add device fail";
//        }
        testDomDataBroker2();
        reply = "ok";
//        reply = String.valueOf((this.testTxChain(device)));
        
//        int deviceId = Integer.parseInt(device.getDId());
//        if (deviceId % 2 == 0) {
//            reply = String.valueOf(testTxChainV2(device));
//        } else {
//            reply = String.valueOf(testNoTxChainV2(device));
//        }
        
        return reply;
    }
    
    public boolean testTxChain(Device device) {
        BindingTransactionChain txChain = dataBroker.createTransactionChain(this);
        WriteTransaction wTx = null;
        for (int i = 0 ; i < 100 ; i++) {
            final int j = i;
            wTx = txChain.newWriteOnlyTransaction();
            InstanceIdentifier<Device> deviceId = InstanceIdentifier.create(Devices.class).child(Device.class, device.getKey());
            wTx.put(LogicalDatastoreType.CONFIGURATION, deviceId, device, true);
            Futures.addCallback(wTx.submit(), new FutureCallback<Void>() {
                @Override
                public void onSuccess(Void result) {
                    logger.info("device [{}] is saved", j);
                }

                @Override
                public void onFailure(Throwable t) {
                    logger.info("device [{}] is saved", j);
                }
            });
            
            DeviceBuilder deviceBuilder = new DeviceBuilder(device);
            String nextKey = String.valueOf(Integer.parseInt(device.getDId()) + 1);
            deviceBuilder.setKey(new DeviceKey(nextKey));
            deviceBuilder.setDId(nextKey);
            device = deviceBuilder.build();
        }
        
        return true;
    }
//    
//    public boolean testTxChainV2(Device device) {
//        BindingTransactionChain txChain = dataBroker.createTransactionChain(this);
//        
//        
//        WriteTransaction wTx = txChain.newWriteOnlyTransaction();
//        InstanceIdentifier<Device> deviceId = InstanceIdentifier.create(Devices.class).child(Device.class, device.getKey());
//        wTx.put(LogicalDatastoreType.CONFIGURATION, deviceId, device, true);
//       
//        Futures.addCallback(wTx.submit(), new FutureCallback<Void>() {
//            @Override
//            public void onSuccess(Void result) {
//                logger.info("device [{}] is saved", 1);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//                logger.info("device [{}] is saved", 1);
//            }
//        });
//        
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        WriteTransaction wTx2 = txChain.newWriteOnlyTransaction();
//        DeviceBuilder deviceBuilder = new DeviceBuilder(device);
//        String nextKey = String.valueOf(Integer.parseInt(device.getDId()) + 1);
//        deviceBuilder.setKey(new DeviceKey(nextKey));
//        deviceBuilder.setDId(nextKey);
//        device = deviceBuilder.build();
//        deviceId = InstanceIdentifier.create(Devices.class).child(Device.class, device.getKey());
//        wTx2.put(LogicalDatastoreType.CONFIGURATION, deviceId, device, true);
//        
//        WriteTransaction wTx3 = txChain.newWriteOnlyTransaction();
//        deviceBuilder = new DeviceBuilder(device);
//        nextKey = String.valueOf(Integer.parseInt(device.getDId()) + 1);
//        deviceBuilder.setKey(new DeviceKey(nextKey));
//        deviceBuilder.setDId(nextKey);
//        device = deviceBuilder.build();
//        deviceId = InstanceIdentifier.create(Devices.class).child(Device.class, device.getKey());
//        wTx3.put(LogicalDatastoreType.CONFIGURATION, deviceId, device, true);
//        
//        Futures.addCallback(wTx3.submit(), new FutureCallback<Void>() {
//            @Override
//            public void onSuccess(Void result) {
//                logger.info("device [{}] is saved", 3);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//                logger.info("device [{}] is saved", 3);
//            }
//        });
//        
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        Futures.addCallback(wTx2.submit(), new FutureCallback<Void>() {
//            @Override
//            public void onSuccess(Void result) {
//                logger.info("device [{}] is saved", 2);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//                logger.info("device [{}] is saved", 2);
//            }
//        });
//                
//        return true;
//    } 
//    
//    public boolean testNoTxChain(Device device) {
//        WriteTransaction wTx = null;
//        for (int i = 0 ; i < 100 ; i++) {
//            final int j = i;
//            wTx = dataBroker.newWriteOnlyTransaction();
//            InstanceIdentifier<Device> deviceId = InstanceIdentifier.create(Devices.class).child(Device.class, device.getKey());
//            wTx.put(LogicalDatastoreType.CONFIGURATION, deviceId, device, true);
//            Futures.addCallback(wTx.submit(), new FutureCallback<Void>() {
//                @Override
//                public void onSuccess(Void result) {
//                    logger.info("device [{}] is saved", j);
//                }
//
//                @Override
//                public void onFailure(Throwable t) {
//                    logger.info("device [{}] is fail to save ", j);
//                }
//            });
//            
//            DeviceBuilder deviceBuilder = new DeviceBuilder(device);
//            String nextKey = String.valueOf(Integer.parseInt(device.getDId()) + 1);
//            deviceBuilder.setKey(new DeviceKey(nextKey));
//            deviceBuilder.setDId(nextKey);
//            device = deviceBuilder.build();
//        }
//        
//        return true;
//    }
//    
//    public boolean testNoTxChainV2(Device device) {
//        WriteTransaction wTx = dataBroker.newWriteOnlyTransaction();
//        InstanceIdentifier<Device> deviceId = InstanceIdentifier.create(Devices.class).child(Device.class, device.getKey());
//        wTx.put(LogicalDatastoreType.CONFIGURATION, deviceId, device, true);
//        
//        WriteTransaction wTx2 = dataBroker.newWriteOnlyTransaction();
//        DeviceBuilder deviceBuilder = new DeviceBuilder(device);
//        String nextKey = String.valueOf(Integer.parseInt(device.getDId()) + 1);
//        deviceBuilder.setKey(new DeviceKey(nextKey));
//        deviceBuilder.setDId(nextKey);
//        device = deviceBuilder.build();
//        deviceId = InstanceIdentifier.create(Devices.class).child(Device.class, device.getKey());
//        wTx2.put(LogicalDatastoreType.CONFIGURATION, deviceId, device, true);
//        
//        Futures.addCallback(wTx2.submit(), new FutureCallback<Void>() {
//            @Override
//            public void onSuccess(Void result) {
//                logger.info("device [{}] is saved", 2);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//                logger.info("device [{}] is saved", 2);
//            }
//        });
//        
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        Futures.addCallback(wTx.submit(), new FutureCallback<Void>() {
//            @Override
//            public void onSuccess(Void result) {
//                logger.info("device [{}] is saved", 1);
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//                logger.info("device [{}] is saved", 1);
//            }
//        });
//        
//        return true;
//    } 
    
    public void testDomDataBroker(Device device) {
        final org.opendaylight.yangtools.yang.common.QName DEVICE_ID = QName.create(Device.QNAME, "d-id");
        final org.opendaylight.yangtools.yang.common.QName DEVICE_TYPE = QName.create(Device.QNAME, "d-type");
        
        MapEntryNode node = ImmutableNodes.mapEntryBuilder()
                      .withNodeIdentifier(new NodeIdentifierWithPredicates(Device.QNAME, DEVICE_ID, device.getDId()))
                      .withChild(ImmutableNodes.leafNode(DEVICE_ID, device.getDId()))
                      .withChild(ImmutableNodes.leafNode(DEVICE_TYPE, device.getDType()))
                      .build();
        
        YangInstanceIdentifier pId = YangInstanceIdentifier.builder().node(Devices.QNAME).node(Device.QNAME).build();
        YangInstanceIdentifier yId = pId.node(new NodeIdentifierWithPredicates(Device.QNAME, node.getIdentifier().getKeyValues()));
//        YangInstanceIdentifier yid = YangInstanceIdentifier.builder().node(Devices.QNAME).node(Device.QNAME) 
//                                                                      .nodeWithKey(Device.QNAME, node.getIdentifier().getKeyValues()).build();
        DOMDataWriteTransaction tx = domDataBroker.newWriteOnlyTransaction();
        tx.put(LogicalDatastoreType.CONFIGURATION, yId, node);
        try {
            tx.submit().checkedGet();
        } catch (TransactionCommitFailedException e) {
            logger.error("tx failed.", e);
        }
         
    }
    
    public void testDomDataBroker2() {
        DOMDataWriteTransaction tx = domDataBroker.newWriteOnlyTransaction();

        YangInstanceIdentifier pid = YangInstanceIdentifier.builder().node(TestExec.QNAME).node(OuterList.QNAME).build();
        for (MapEntryNode element : buildOuterList(1,1)) {
            YangInstanceIdentifier yid = pid.node(
                    new NodeIdentifierWithPredicates(OuterList.QNAME, element.getIdentifier().getKeyValues()));
            tx.put(LogicalDatastoreType.CONFIGURATION, yid, element);
        }   
        
        try {
            tx.submit().checkedGet();
        } catch (TransactionCommitFailedException e) {
            logger.error("tx failed.", e);
        }
    }
    
    private List<MapEntryNode> buildOuterList(int outerElements, int innerElements) {
        final org.opendaylight.yangtools.yang.common.QName OL_ID = QName.create(OuterList.QNAME, "id");
        List<MapEntryNode> outerList = new ArrayList<MapEntryNode>(outerElements);
        for (int j = 0; j < outerElements; j++) {
            outerList.add(ImmutableNodes.mapEntryBuilder()
                                .withNodeIdentifier(new NodeIdentifierWithPredicates(OuterList.QNAME, OL_ID, j))
                                .withChild(ImmutableNodes.leafNode(OL_ID, j))
                                .withChild(buildInnerList(j, innerElements))
                                .build());
        }

        return outerList;
    }

    private MapNode buildInnerList(int index, int elements ) {
        final org.opendaylight.yangtools.yang.common.QName IL_NAME = QName.create(InnerList.QNAME, "name");
        final org.opendaylight.yangtools.yang.common.QName IL_VALUE = QName.create(InnerList.QNAME, "value");
        
        CollectionNodeBuilder<MapEntryNode, MapNode> innerList = ImmutableNodes.mapNodeBuilder(InnerList.QNAME);

        final String itemStr = "Item-" + String.valueOf(index) + "-";
        for( int i = 0; i < elements; i++ ) {
            innerList.addChild(ImmutableNodes.mapEntryBuilder()
                                .withNodeIdentifier(new NodeIdentifierWithPredicates(InnerList.QNAME, IL_NAME, i))
                                .withChild(ImmutableNodes.leafNode(IL_NAME, i))
                                .withChild(ImmutableNodes.leafNode(IL_VALUE, itemStr + String.valueOf(i)))
                                .build());
        }
        return innerList.build();
    }
    
    @Override
    public void onTransactionChainFailed(TransactionChain<?, ?> chain, AsyncTransaction<?, ?> transaction,
            Throwable cause) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onTransactionChainSuccessful(TransactionChain<?, ?> chain) {
        // TODO Auto-generated method stub
        
    }
}
