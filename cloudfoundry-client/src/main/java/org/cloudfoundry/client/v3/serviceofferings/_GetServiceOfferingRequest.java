package org.cloudfoundry.client.v3.serviceofferings;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Value.Immutable
abstract class _GetServiceOfferingRequest {

    @JsonIgnore
    abstract String getServiceOfferingId();
    
}
