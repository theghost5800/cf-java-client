package org.cloudfoundry.client.v3.serviceofferings;

import java.util.List;

import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v3.FilterParameter;
import org.cloudfoundry.client.v3.PaginatedRequest;
import org.immutables.value.Value;

@Value.Immutable
abstract class _ListServiceOfferingsRequest extends PaginatedRequest {

    /**
     * Whether the service offering is available
     */
    @FilterParameter("available")
    @Nullable
    abstract Boolean getAvailable();

    /**
     * The metadata query
     */
    @FilterParameter("label_selector")
    @Nullable
    abstract String getLabelSelector();

    /**
     * List of names to filter by
     */
    @FilterParameter("names")
    @Nullable
    abstract List<String> getNames();

    /**
     * List of organization ids to filter by
     */
    @FilterParameter("organization_guids")
    @Nullable
    abstract List<String> getOrganizationIds();
    
    /**
     * List of service broker ids to filter by
     */
    @FilterParameter("service_broker_guids")
    @Nullable
    abstract List<String> getServiceBrokerIds();
    
    /**
     * List of service broker names to filter by
     */
    @FilterParameter("service_broker_names")
    @Nullable
    abstract List<String> getServiceBrokerNames();
    
    /**
     * List of space ids to filter by
     */
    @FilterParameter("space_guids")
    @Nullable
    abstract List<String> getSpaceIds();

}
