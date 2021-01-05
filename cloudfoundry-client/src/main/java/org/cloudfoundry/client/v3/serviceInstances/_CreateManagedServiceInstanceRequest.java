package org.cloudfoundry.client.v3.serviceInstances;

import java.util.List;
import java.util.Map;

import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v3.Metadata;
import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@Value.Immutable
abstract class _CreateManagedServiceInstanceRequest {

    @JsonProperty("type")
    @Value.Derived
    ServiceInstanceType getServiceInstanceType() {
	return ServiceInstanceType.MANAGED;
    }
    
    @JsonProperty("name")
    abstract String getName();
    
    @JsonProperty("relationships")
    abstract ServiceInstanceRelationships getServiceInstanceRelationships();
    
    @JsonProperty("tags")
    @Nullable
    abstract List<String> getTags();
    
    @JsonProperty("parameters")
    @Nullable
    abstract Map<String, Object> getParameters();
    
    @JsonProperty("metadata")
    @Nullable
    abstract Metadata getMetadata();
    
}
