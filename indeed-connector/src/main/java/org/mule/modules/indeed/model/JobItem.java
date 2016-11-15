package org.mule.modules.indeed.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class JobItem {

	@SerializedName("jobtitle")
	@Expose
	private String jobtitle;
	@SerializedName("company")
	@Expose
	private String company;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("formattedLocation")
	@Expose
	private String formattedLocation;
	@SerializedName("source")
	@Expose
	private String source;
	@SerializedName("date")
	@Expose
	private String date;
	@SerializedName("snippet")
	@Expose
	private String snippet;
	@SerializedName("url")
	@Expose
	private String url;
	@SerializedName("onmousedown")
	@Expose
	private String onmousedown;
	@SerializedName("jobkey")
	@Expose
	private String jobkey;
	@SerializedName("sponsored")
	@Expose
	private Boolean sponsored;
	@SerializedName("expired")
	@Expose
	private Boolean expired;
	@SerializedName("indeedApply")
	@Expose
	private Boolean indeedApply;
	@SerializedName("formattedLocationFull")
	@Expose
	private String formattedLocationFull;
	@SerializedName("formattedRelativeTime")
	@Expose
	private String formattedRelativeTime;
	@SerializedName("stations")
	@Expose
	private String stations;
	@SerializedName("latitude")
	@Expose
	private Float latitude;
	@SerializedName("longitude")
	@Expose
	private Float longitude;

	/**
	 * 
	 * @return The jobtitle
	 */
	public String getJobtitle() {
		return jobtitle;
	}

	/**
	 * 
	 * @param jobtitle
	 *            The jobtitle
	 */
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	/**
	 * 
	 * @return The company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * 
	 * @param company
	 *            The company
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * 
	 * @return The city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 *            The city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 * @return The state
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 *            The state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return The country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 *            The country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 * @return The formattedLocation
	 */
	public String getFormattedLocation() {
		return formattedLocation;
	}

	/**
	 * 
	 * @param formattedLocation
	 *            The formattedLocation
	 */
	public void setFormattedLocation(String formattedLocation) {
		this.formattedLocation = formattedLocation;
	}

	/**
	 * 
	 * @return The source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * 
	 * @param source
	 *            The source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * 
	 * @return The date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * 
	 * @param date
	 *            The date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * 
	 * @return The snippet
	 */
	public String getSnippet() {
		return snippet;
	}

	/**
	 * 
	 * @param snippet
	 *            The snippet
	 */
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	/**
	 * 
	 * @return The url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 
	 * @param url
	 *            The url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 
	 * @return The onmousedown
	 */
	public String getOnmousedown() {
		return onmousedown;
	}

	/**
	 * 
	 * @param onmousedown
	 *            The onmousedown
	 */
	public void setOnmousedown(String onmousedown) {
		this.onmousedown = onmousedown;
	}

	/**
	 * 
	 * @return The jobkey
	 */
	public String getJobkey() {
		return jobkey;
	}

	/**
	 * 
	 * @param jobkey
	 *            The jobkey
	 */
	public void setJobkey(String jobkey) {
		this.jobkey = jobkey;
	}

	/**
	 * 
	 * @return The sponsored
	 */
	public Boolean getSponsored() {
		return sponsored;
	}

	/**
	 * 
	 * @param sponsored
	 *            The sponsored
	 */
	public void setSponsored(Boolean sponsored) {
		this.sponsored = sponsored;
	}

	/**
	 * 
	 * @return The expired
	 */
	public Boolean getExpired() {
		return expired;
	}

	/**
	 * 
	 * @param expired
	 *            The expired
	 */
	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	/**
	 * 
	 * @return The indeedApply
	 */
	public Boolean getIndeedApply() {
		return indeedApply;
	}

	/**
	 * 
	 * @param indeedApply
	 *            The indeedApply
	 */
	public void setIndeedApply(Boolean indeedApply) {
		this.indeedApply = indeedApply;
	}

	/**
	 * 
	 * @return The formattedLocationFull
	 */
	public String getFormattedLocationFull() {
		return formattedLocationFull;
	}

	/**
	 * 
	 * @param formattedLocationFull
	 *            The formattedLocationFull
	 */
	public void setFormattedLocationFull(String formattedLocationFull) {
		this.formattedLocationFull = formattedLocationFull;
	}

	/**
	 * 
	 * @return The formattedRelativeTime
	 */
	public String getFormattedRelativeTime() {
		return formattedRelativeTime;
	}

	/**
	 * 
	 * @param formattedRelativeTime
	 *            The formattedRelativeTime
	 */
	public void setFormattedRelativeTime(String formattedRelativeTime) {
		this.formattedRelativeTime = formattedRelativeTime;
	}

	/**
	 * 
	 * @return The stations
	 */
	public String getStations() {
		return stations;
	}

	/**
	 * 
	 * @param stations
	 *            The stations
	 */
	public void setStations(String stations) {
		this.stations = stations;
	}

	/**
	 * 
	 * @return The latitude
	 */
	public Float getLatitude() {
		return latitude;
	}

	/**
	 * 
	 * @param latitude
	 *            The latitude
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	/**
	 * 
	 * @return The longitude
	 */
	public Float getLongitude() {
		return longitude;
	}

	/**
	 * 
	 * @param longitude
	 *            The longitude
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

}