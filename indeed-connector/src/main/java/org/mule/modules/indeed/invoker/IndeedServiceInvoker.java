package org.mule.modules.indeed.invoker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.NotImplementedException;
import org.mule.modules.indeed.model.IndeedRequest;
import org.mule.modules.indeed.model.IndeedResult;
import org.mule.modules.indeed.model.JobItem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class IndeedServiceInvoker {

	private IndeedRequest request;

	private String baseUrl;

	private String publisherId;

	public IndeedServiceInvoker(String baseUrl, String publisherId, IndeedRequest request) {
		this.request = request;
		this.baseUrl = baseUrl;
		this.publisherId = publisherId;
	}

	public IndeedResult invoke() throws IOException {

		NameValuePair[] params = getRequestParams();

		HttpClient httpClient = new HttpClient();
		GetMethod getMethod = new GetMethod(baseUrl);
		getMethod.setQueryString(params);
		httpClient.executeMethod(getMethod);
		String responseBodyAsString = getMethod.getResponseBodyAsString();

		Gson gson = new GsonBuilder().create();
		IndeedResult indeedResult = gson.fromJson(responseBodyAsString, IndeedResult.class);

		return indeedResult;
	}

	private NameValuePair[] getRequestParams() {
		if (request == null) {
			throw new IllegalStateException("Indeed request must be not null");
		}

		if (request.getQuery() == null) {
			throw new IllegalStateException("Indeed request must be provide query");
		}

		ArrayList<NameValuePair> params = new ArrayList<>();

		addIfExists("publisher", publisherId, params);
		addIfExists("v", "2", params);
		addIfExists("format", "json", params);
		addIfExists("q", request.getQuery(), params);
		addIfExists("q", request.getQuery(), params);
		addIfExists("l", request.getLocation(), params);
		addIfExists("sort", request.getSort(), params);
		addIfExists("radius", request.getRadius(), params);
		addIfExists("st", request.getSiteType(), params);
		addIfExists("jt", request.getJobType(), params);
		addIfExists("start", request.getStart(), params);
		addIfExists("limit", request.getLimit(), params);
		addIfExists("fromage", request.getFromAge(), params);
		addIfExists("limit", request.getLimit(), params);
		addIfExists("highlight", request.getHighlight(), params);
		addIfExists("latlong", request.getLatlong(), params);
		addIfExists("co", request.getCountry(), params);
		addIfExists("chnl", request.getChannel(), params);

		NameValuePair[] pairs = new NameValuePair[params.size()];
		return params.toArray(pairs);
	}

	private void addIfExists(String key, Object value, List<NameValuePair> params) {
		if (value != null) {
			String val = null;

			if (value instanceof Boolean) {
				val = (Boolean) value ? "1" : "0";
			} else {
				val = value.toString();
			}
			NameValuePair nameValuePair = new NameValuePair(key, val);
			params.add(nameValuePair);
		}
	}
}
