package org.cloudfoundry.client.v3.serviceofferings;

import reactor.core.publisher.Mono;

/**
 * Main entry point to the Cloud Foundry Service Offerings Client API
 */
public interface ServiceOfferings {

    /**
     * Makes the <a href="http://v3-apidocs.cloudfoundry.org/version/release-candidate/#delete-a-service-offering">Delete a service offering</a> request
     *
     * @param request the Delete Service Offering request
     * @return the response from the Delete Service Offering request
     */
    Mono<Void> delete(DeleteServiceOfferingRequest request);

    /**
     * Makes the <a href="http://v3-apidocs.cloudfoundry.org/version/release-candidate/#get-a-service-offering">Get a service offering</a> request
     *
     * @param request the Get Service Offering request
     * @return the response from the Get Service Offering request
     */
    Mono<GetServiceOfferingResponse> get(GetServiceOfferingRequest request);

    /**
     * Makes the <a href="http://v3-apidocs.cloudfoundry.org/version/release-candidate/#list-service-offerings">List service offerings</a> request
     *
     * @param request the List Service Offerings request
     * @return the response from the List Service Offerings request
     */
    Mono<ListServiceOfferingsResponse> list(ListServiceOfferingsRequest request);
    
    /**
     * Makes the <a href="http://v3-apidocs.cloudfoundry.org/version/release-candidate/#update-a-service-offering">Update a service offering</a> request
     *
     * @param request the Update Service Offering request
     * @return the response from the Update Service Offering request
     */
    Mono<UpdateServiceOfferingResponse> update(UpdateServiceOfferingRequest request);
    
}
