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
abstract class _CreateUserProvidedServiceInstanceRequest {

    @JsonProperty("type")
    @Value.Derived
    ServiceInstanceType getServiceInstanceType() {
	return ServiceInstanceType.USER_PROVIDED;
    }
    
    @JsonProperty("name")
    abstract String getName();
    
    @JsonProperty("relationships")
    abstract ServiceInstanceRelationships getServiceInstanceRelationships();
    
    @JsonProperty("tags")
    @Nullable
    abstract List<String> getTags();
    
    @JsonProperty("credentials")
    @Nullable
    abstract Map<String, Object> getCredentials();
    
    @JsonProperty("syslog_drain_url")
    @Nullable
    abstract String getSyslogDrainUrl();
    
    @JsonProperty("route_service_url")
    @Nullable
    abstract String getRouteServiceUrl();
    
    @JsonProperty("metadata")
    @Nullable
    abstract Metadata getMetadata();
    
}
