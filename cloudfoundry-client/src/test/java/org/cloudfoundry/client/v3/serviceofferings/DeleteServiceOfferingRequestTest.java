package org.cloudfoundry.client.v3.serviceofferings;

import org.junit.Test;

public class DeleteServiceOfferingRequestTest {

    @Test(expected = IllegalStateException.class)
    public void noServiceOfferingId() {
	DeleteServiceOfferingRequest.builder()
	    .purge(true)
	    .build();
    }
    
    @Test
    public void valid() {
	DeleteServiceOfferingRequest.builder()
	    .serviceOfferingId("test-service-offering-id")
	    .purge(false).build();
    }
    
}
