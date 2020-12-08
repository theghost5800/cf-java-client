package org.cloudfoundry.client.v3.serviceofferings;

import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v3.Metadata;
import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * The request payload for the Update Service Offering operation
 */
@JsonSerialize
@Value.Immutable
abstract class _UpdateServiceOfferingRequest {

    /**
     * The metadata
     */
    @JsonProperty("metadata")
    @Nullable
    abstract Metadata getMetadata();

    /**
     * The service offering id
     */
    @JsonIgnore
    abstract String getServiceOfferingId();
    
}
