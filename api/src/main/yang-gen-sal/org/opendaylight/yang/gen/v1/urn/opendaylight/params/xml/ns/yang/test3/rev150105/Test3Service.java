package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;


/**
 * Interface for implementing the following YANG RPCs defined in module &lt;b&gt;test3&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/test3.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * rpc add-device {
 *     input {
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
 *     }
 *     
 *     output {
 *         leaf result {
 *             type string;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc get-device-info {
 *     input {
 *         leaf d-id {
 *             type d-id-type;
 *         }
 *     }
 *     
 *     output {
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
 *     }
 *     status CURRENT;
 * }
 * &lt;/pre&gt;
 *
 */
public interface Test3Service
    extends
    RpcService
{




    Future<RpcResult<AddDeviceOutput>> addDevice(AddDeviceInput input);
    
    Future<RpcResult<GetDeviceInfoOutput>> getDeviceInfo(GetDeviceInfoInput input);

}

