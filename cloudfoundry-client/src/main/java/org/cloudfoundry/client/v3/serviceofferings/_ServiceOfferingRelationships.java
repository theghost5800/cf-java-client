package org.cloudfoundry.client.v3.serviceofferings;

import org.cloudfoundry.client.v3.ToOneRelationship;
import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
@Value.Immutable
abstract class _ServiceOfferingRelationships {

    @JsonProperty("service_broker")
    abstract ToOneRelationship getServiceBroker();
    
}
