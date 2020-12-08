package org.cloudfoundry.client.v3.serviceinstances;

import org.cloudfoundry.client.v3.serviceInstances.GetManagedServiceParametersRequest;
import org.junit.Test;

public class GetManagedServiceParametersRequestTest {

    @Test
    public void valid() {
	GetManagedServiceParametersRequest.builder()
		.serviceInstanceId("test-service-instance-id")
		.build();
    }
    
}
