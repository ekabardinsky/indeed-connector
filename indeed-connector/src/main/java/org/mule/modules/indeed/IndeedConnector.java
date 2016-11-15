package org.mule.modules.indeed;

import java.io.IOException;
import java.util.List;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.indeed.config.ConnectorConfig;
import org.mule.modules.indeed.invoker.IndeedServiceInvoker;
import org.mule.modules.indeed.model.IndeedRequest;
import org.mule.modules.indeed.model.IndeedResult;
import org.mule.modules.indeed.model.JobItem;

@Connector(name="indeed", friendlyName="Indeed")
public class IndeedConnector {

    @Config
    ConnectorConfig config;

    /**
     * GetJobs processor
     *
     * @return List of an results
     * @throws IOException 
     */
    @Processor
    public IndeedResult getJobs() throws IOException {
		IndeedServiceInvoker indeedServiceInvoker = 
				new IndeedServiceInvoker(config.getBaseUrl(), config.getPublisher(), config);
        return indeedServiceInvoker.invoke();
    }
    
    /**
     * GetJobs processor with custom request
     *
     * @param  IndeedRequest
     * @return List of an results
     * @throws IOException 
     */
    @Processor
    public IndeedResult getJobsByRequest(IndeedRequest request) throws IOException {
		IndeedServiceInvoker indeedServiceInvoker = 
				new IndeedServiceInvoker(config.getBaseUrl(), config.getPublisher(), request);
        return indeedServiceInvoker.invoke();
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}