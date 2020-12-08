package org.cloudfoundry.client.v3.serviceofferings;

import org.junit.Test;

public class UpdateServiceOfferingRequestTest {

    @Test(expected = IllegalStateException.class)
    public void noServiceOfferingId() {
	UpdateServiceOfferingRequest.builder()
	    .build();
    }
    
    @Test
    public void valid() {
	UpdateServiceOfferingRequest.builder()
	    .serviceOfferingId("test-serivce-offering-id")
	    .build();
    }
    
}
