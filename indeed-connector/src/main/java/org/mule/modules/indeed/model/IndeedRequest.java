package org.mule.modules.indeed.model;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.modules.indeed.config.Country;
import org.mule.modules.indeed.config.JobType;
import org.mule.modules.indeed.config.SortType;
import org.mule.modules.indeed.config.SyteType;

public class IndeedRequest {
	/**
     * Query. By default terms are ANDed. To see what is possible, 
     * use our advanced search page (http://www.indeed.com/advanced_search)
     *  to perform a search and then check the url for the q value.
     */
    @Configurable
    @Optional
	@Placement(group = "Query")
	@FriendlyName(value = "Query")
    private String query;
    
    /**
     * Location. Use a postal code or a "city, state/province/region" combination.
     */
    @Configurable
    @Optional
	@Placement(group = "Query")
	@FriendlyName(value = "Location")
    private String location;
    
    /**
     * Sort by relevance or date. Default is relevance.
     */
    @Configurable
    @Optional
    @Default(value = "relevance")
	@Placement(group = "Additional query params")
	@FriendlyName(value = "Sort Type")
    private SortType sort;
    
    /**
     * Distance from search location ("as the crow flies"). Default is 25.
     */
    @Configurable
    @Optional
    @Default(value = "25")
	@Placement(group = "Query")
	@FriendlyName(value = "Radius")
    private Long radius;
    
    /**
     * Site type. To show only jobs from job boards use "jobsite". 
     * For jobs from direct employer websites use "employer".
     */
    @Configurable
    @Optional
	@Placement(group = "Additional query params")
	@FriendlyName(value = "Site type")
    private SyteType siteType;
    
    /**
     * Job type. Allowed values: "fulltime", "parttime", "contract", "internship", "temporary".
     */
    @Configurable
    @Optional
	@Placement(group = "Query")
	@FriendlyName(value = "Job type")
    private JobType jobType;
    
    /**
     * Start results at this result number, beginning with 0. Default is 0.
     */
    @Configurable
    @Optional
    @Default(value = "0")
	@Placement(group = "Query")
	@FriendlyName(value = "Start")
    private Long start;
    
    /**
     * Maximum number of results returned per query. Default is 10
     */
    @Configurable
    @Optional
    @Default(value = "10")
	@Placement(group = "Query")
	@FriendlyName(value = "Limit")
    private Long limit;
    
    /**
     * Number of days back to search.
     */
    @Configurable
    @Optional
	@Placement(group = "Additional query params")
	@FriendlyName(value = "From age")
    private Long fromAge;
    
    /**
     * Setting this value to true will bold terms in the snippet that are also present in q. Default is false.
     */
    @Configurable
    @Optional
    @Default(value = "false")
	@Placement(group = "Additional query params")
	@FriendlyName(value = "Highlight")
    private Boolean highlight;
    
    /**
     * Filter duplicate results. False turns off duplicate job filtering. Default is true.
     */
    @Configurable
    @Optional
    @Default(value = "true")
	@Placement(group = "Additional query params")
	@FriendlyName(value = "Filter")
    private Boolean filter;
    
    /**
     * If latlong=true, returns latitude and longitude information for each job result. Default is false.
     */
    @Configurable
    @Optional
    @Default(value = "false")
	@Placement(group = "Additional query params")
	@FriendlyName(value = "Lat Long")
    private Boolean latlong;
    
    /**
     * Search within country specified. Default is us See below for a complete list of supported countries.
     */
    @Configurable
    @Optional
    @Default(value = "us")
	@Placement(group = "Query")
	@FriendlyName(value = "Country")
    private Country country;
    
    /**
     * Channel Name: Group API requests to a specific channel
     */
    @Configurable
    @Optional
	@Placement(group = "Query")
	@FriendlyName(value = "Channel")
    private String channel;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public SortType getSort() {
		return sort;
	}

	public void setSort(SortType sort) {
		this.sort = sort;
	}

	public Long getRadius() {
		return radius;
	}

	public void setRadius(Long radius) {
		this.radius = radius;
	}

	public SyteType getSiteType() {
		return siteType;
	}

	public void setSiteType(SyteType siteType) {
		this.siteType = siteType;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = start;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getFromAge() {
		return fromAge;
	}

	public void setFromAge(Long fromAge) {
		this.fromAge = fromAge;
	}

	public Boolean getHighlight() {
		return highlight;
	}

	public void setHighlight(Boolean highlight) {
		this.highlight = highlight;
	}

	public Boolean getFilter() {
		return filter;
	}

	public void setFilter(Boolean filter) {
		this.filter = filter;
	}

	public Boolean getLatlong() {
		return latlong;
	}

	public void setLatlong(Boolean latlong) {
		this.latlong = latlong;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
}
