package org.cloudfoundry.client.v3.serviceofferings;

import org.junit.Test;

public class GetServiceOfferingRequestTest {

    @Test
    public void valid() {
	GetServiceOfferingRequest.builder()
	    .serviceOfferingId("test-service-offering-id")
	    .build();
    }
    
}
