package org.cloudfoundry.client.v3.serviceinstances;

import org.cloudfoundry.client.v3.serviceInstances.GetUserProvidedCredentialsRequest;
import org.junit.Test;

public class GetUserProvidedCredentialsRequestTest {

    @Test
    public void valid() {
	GetUserProvidedCredentialsRequest.builder()
	    .serviceInstanceId("test-service-instance-id")
	    .build();
    }
}
