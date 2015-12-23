package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.test3.rev150105;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;test3&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/test3.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module test3 {
 *     yang-version 1;
 *     namespace "urn:opendaylight:params:xml:ns:yang:test3";
 *     prefix "test3";
 *
 *     revision 2015-01-05 {
 *         description "";
 *     }
 *
 *     container imgs {
 *         list img {
 *             key "id"
 *             leaf id {
 *                 type string;
 *             }
 *             leaf path {
 *                 type string;
 *             }
 *             uses img-grouping;
 *         }
 *     }
 *     container devices {
 *         list device {
 *             key "d-id"
 *             leaf d-id {
 *                 type string;
 *             }
 *             leaf d-type {
 *                 type d-type-type;
 *             }
 *             leaf ip-address {
 *                 type string;
 *             }
 *             leaf d-name {
 *                 type string;
 *             }
 *             leaf img-id {
 *                 type string;
 *             }
 *             uses device-grouping;
 *         }
 *     }
 *     container list-test {
 *         list a-list {
 *             key "a-id"
 *             leaf a-id {
 *                 type string;
 *             }
 *             list b-list {
 *                 key "value"
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *         }
 *     }
 *     container test-exec {
 *         list outer-list {
 *             key "id"
 *             leaf id {
 *                 type int32;
 *             }
 *             list inner-list {
 *                 key "name"
 *                 leaf name {
 *                     type int32;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *         }
 *     }
 *
 *     grouping device-grouping {
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
 *     grouping img-grouping {
 *         leaf id {
 *             type string;
 *         }
 *         leaf path {
 *             type string;
 *         }
 *     }
 *
 *     rpc add-device {
 *         input {
 *             leaf d-id {
 *                 type string;
 *             }
 *             leaf d-type {
 *                 type d-type-type;
 *             }
 *             leaf ip-address {
 *                 type string;
 *             }
 *             leaf d-name {
 *                 type string;
 *             }
 *             leaf img-id {
 *                 type string;
 *             }
 *         }
 *         
 *         output {
 *             leaf result {
 *                 type string;
 *             }
 *         }
 *         status CURRENT;
 *     }
 *     rpc get-device-info {
 *         input {
 *             leaf d-id {
 *                 type d-id-type;
 *             }
 *         }
 *         
 *         output {
 *             leaf d-id {
 *                 type string;
 *             }
 *             leaf d-type {
 *                 type d-type-type;
 *             }
 *             leaf ip-address {
 *                 type string;
 *             }
 *             leaf d-name {
 *                 type string;
 *             }
 *             leaf img-id {
 *                 type string;
 *             }
 *         }
 *         status CURRENT;
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface Test3Data
    extends
    DataRoot
{




    Imgs getImgs();
    
    Devices getDevices();
    
    ListTest getListTest();
    
    TestExec getTestExec();

}

