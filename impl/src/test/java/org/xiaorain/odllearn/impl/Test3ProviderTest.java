/*
 * xiaorain (c) and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.xiaorain.odllearn.impl;

import org.junit.Test;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;

import static org.mockito.Mockito.mock;

public class Test3ProviderTest {
    @Test
    public void testOnSessionInitiated() {
        Test3Provider provider = new Test3Provider();

        // ensure no exceptions
        // currently this method is empty
        provider.onSessionInitiated(mock(BindingAwareBroker.ProviderContext.class));
    }

    @Test
    public void testClose() throws Exception {
        Test3Provider provider = new Test3Provider();

        // ensure no exceptions
        // currently this method is empty
        provider.close();
    }
}
