package org.cloudfoundry.client.v3.serviceofferings;

import java.util.Map;

import org.cloudfoundry.Nullable;
import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Broker Catalog information for a Service Offering
 */
@JsonDeserialize
@Value.Immutable
abstract class _BrokerCatalog {

    /**
     * The identifier that the service broker provided for this service offering
     */
    @JsonProperty("id")
    abstract String getBrokerCatalogId();

    /**
     * Broker-related features of the Service Offering
     */
    @JsonProperty("features")
    abstract Features getFeatures();

    /**
     * The maximum number of seconds that Cloud Foundry will wait for an asynchronous service broker operation
     */
    @JsonProperty("maximum_polling_duration")
    @Nullable
    abstract Integer getMaximumPollingDuration();

    /**
     * The metadata
     */
    @JsonProperty("metadata")
    @Nullable
    abstract Map<String, Object> getMetadata();

}
