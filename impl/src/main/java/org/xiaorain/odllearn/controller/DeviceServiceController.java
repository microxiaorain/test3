package org.xiaorain.odllearn.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.DIdType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.Device;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105.devices.DeviceBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.xiaorain.odllearn.dao.DeviceDAO;

@Controller
public class DeviceServiceController {
    
    private DeviceDAO deviceDao;
    
    public DeviceDAO getDeviceDao() {
        return deviceDao;
    }

    public void setDeviceDao(DeviceDAO deviceDao) {
        this.deviceDao = deviceDao;
    }

//    @RequestMapping(value = "/add.device.do", method = RequestMethod.POST)
//    public String addDevice(@RequestParam("d-id") String dId, @RequestParam("d-name") String dName) throws IOException {
//        
//        DeviceBuilder builder = new DeviceBuilder();
//        Device device = builder.setDId(dId).setDName(dName).build();
//        String reply = deviceDao.addDevice(device);
//        
//        return "test";
//    }
    
    @RequestMapping(value = "/add.device.do", method = RequestMethod.POST)
    public void  addDevice(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String dId = request.getParameter("d-id");
        String dName = request.getParameter("d-name");
        
        DeviceBuilder builder = new DeviceBuilder();
        Device device = builder.setDId(dId).setDName(dName).build();
        String reply = deviceDao.addDevice(device);
        
        response.getWriter().print(reply);
        response.getWriter().flush();
        response.getWriter().close();
        
    }
    
    @RequestMapping(value="/get.device.do", method= RequestMethod.GET)
    public String test() {
        return "test";
    }
}
