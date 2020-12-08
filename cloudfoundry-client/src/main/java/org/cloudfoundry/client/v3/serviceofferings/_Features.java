package org.cloudfoundry.client.v3.serviceofferings;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
@Value.Immutable
abstract class _Features {

    /**
     * Whether context updates are allowed/forbidden 
     */
    @JsonProperty("allow_context_updates")
    abstract Boolean getAllowContextUpdates();
    
    /**
     * Whether service instances of the service can be bound to applications
     */
    @JsonProperty("bindable")
    abstract Boolean getBindable();

    /**
     * Whether bindings are retrievable
     */
    @JsonProperty("bindings_retrievable")
    abstract Boolean getBindingsRetrievable();

    /**
     * Whether the service plan supports upgrade/downgrade for service plans
     */
    @JsonProperty("plan_updateable")
    abstract Boolean getPlanUpdateable();
    
    /**
     * Whether the service instances are retrievable
     */
    @JsonProperty("instances_retrievable")
    abstract Boolean getInstancesRetrievable();
    
}
