package org.cloudfoundry.client.v3.serviceofferings;

import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v3.FilterParameter;
import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Value.Immutable
abstract class _DeleteServiceOfferingRequest {

    @JsonIgnore
    abstract String getServiceOfferingId();
    
    @FilterParameter("purge")
    @Nullable
    abstract Boolean purge();
}
