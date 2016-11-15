
package org.mule.modules.indeed.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class IndeedResult {

    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("paginationPayload")
    @Expose
    private String paginationPayload;
    @SerializedName("dupefilter")
    @Expose
    private Boolean dupefilter;
    @SerializedName("highlight")
    @Expose
    private Boolean highlight;
    @SerializedName("totalResults")
    @Expose
    private Integer totalResults;
    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("end")
    @Expose
    private Integer end;
    @SerializedName("pageNumber")
    @Expose
    private Integer pageNumber;
    @SerializedName("results")
    @Expose
    private List<JobItem> results = new ArrayList<JobItem>();

    /**
     * 
     * @return
     *     The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The paginationPayload
     */
    public String getPaginationPayload() {
        return paginationPayload;
    }

    /**
     * 
     * @param paginationPayload
     *     The paginationPayload
     */
    public void setPaginationPayload(String paginationPayload) {
        this.paginationPayload = paginationPayload;
    }

    /**
     * 
     * @return
     *     The dupefilter
     */
    public Boolean getDupefilter() {
        return dupefilter;
    }

    /**
     * 
     * @param dupefilter
     *     The dupefilter
     */
    public void setDupefilter(Boolean dupefilter) {
        this.dupefilter = dupefilter;
    }

    /**
     * 
     * @return
     *     The highlight
     */
    public Boolean getHighlight() {
        return highlight;
    }

    /**
     * 
     * @param highlight
     *     The highlight
     */
    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    /**
     * 
     * @return
     *     The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * 
     * @param totalResults
     *     The totalResults
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * 
     * @return
     *     The start
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 
     * @return
     *     The end
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * 
     * @param end
     *     The end
     */
    public void setEnd(Integer end) {
        this.end = end;
    }

    /**
     * 
     * @return
     *     The pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * 
     * @param pageNumber
     *     The pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * 
     * @return
     *     The results
     */
    public List<JobItem> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<JobItem> results) {
        this.results = results;
    }

}
