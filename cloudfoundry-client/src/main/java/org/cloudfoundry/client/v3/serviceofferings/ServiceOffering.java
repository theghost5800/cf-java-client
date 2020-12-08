package org.cloudfoundry.client.v3.serviceofferings;

import java.util.List;

import org.cloudfoundry.AllowNulls;
import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v3.Metadata;
import org.cloudfoundry.client.v3.Resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ServiceOffering extends Resource {

    @JsonProperty("available")
    public abstract Boolean getAvailable();
    
    /**
     * Information obtained from the service broker catalog
     */
    @JsonProperty("broker_catalog")
    public abstract BrokerCatalog getBrokerCatalog();
    
    /**
     * Description of the service offering
     */
    @JsonProperty("description")
    public abstract String getDescription();
    
    /**
     * Documentation URL that points to page for the service offering
     */
    @JsonProperty("documentation_url")
    public abstract String getDocumentationUrl();

    /**
     * The metadata
     */
    @AllowNulls
    @JsonProperty("metadata")
    @Nullable
    public abstract Metadata getMetadata();
    
    /**
     * The name of the service offering
     */
    @JsonProperty("name")
    public abstract String getName();
    
    /**
     * The relationships
     */
    @JsonProperty("relationships")
    public abstract ServiceOfferingRelationships getRelationships();
    
    /**
     * 
     * A list of permissions that the user would have to give the service, if they provision it
     */
    @JsonProperty("requires")
    @Nullable
    public abstract List<String> getRequires();
    
    /**
     * 
     * 	Whether or not service Instances of this service offering can be shared across organizations and spaces
     */
    @JsonProperty("shareable")
    public abstract Boolean getShareable();
    
    /**
     * Descriptive tags for the service offering
     */
    @JsonProperty("tags")
    @Nullable
    public abstract List<String> getTags();
    
}
