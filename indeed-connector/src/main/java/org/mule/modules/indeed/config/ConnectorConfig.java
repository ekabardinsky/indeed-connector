package org.mule.modules.indeed.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Required;
import org.mule.modules.indeed.model.IndeedRequest;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig extends IndeedRequest{

	/**
	 * Publisher ID. This is assigned when you register as a publisher.
	 */
	@Configurable
	@Default(value = "http://api.indeed.com/ads/apisearch")
	@Placement(group = "General")
	@FriendlyName(value = "Indeed api url")
	private String baseUrl;
	
	/**
	 * Publisher ID. This is assigned when you register as a publisher.
	 */
	@Configurable
	@Required
	@Placement(group = "General")
	@FriendlyName(value = "Publisher ID")
	private String publisher;

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
}