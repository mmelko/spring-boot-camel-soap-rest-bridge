package com.ibm.wdata;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-sb2-740016-redhat-00001
 * 2020-03-31T10:31:59.339-04:00
 * Generated source version: 3.2.7.fuse-sb2-740016-redhat-00001
 *
 */
@WebServiceClient(name = "weatherService",
                  wsdlLocation = "file:/Users/ffang/issues/ENTESB-13174/bridge/src/main/resources/weatherprovider.wsdl",
                  targetNamespace = "http://ibm.com/wdata")
public class WeatherService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ibm.com/wdata", "weatherService");
    public final static QName WeatherPort = new QName("http://ibm.com/wdata", "WeatherPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/ffang/issues/ENTESB-13174/bridge/src/main/resources/weatherprovider.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/ffang/issues/ENTESB-13174/bridge/src/main/resources/weatherprovider.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WeatherService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WeatherService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WeatherService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WeatherPortType
     */
    @WebEndpoint(name = "WeatherPort")
    public WeatherPortType getWeatherPort() {
        return super.getPort(WeatherPort, WeatherPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherPortType
     */
    @WebEndpoint(name = "WeatherPort")
    public WeatherPortType getWeatherPort(WebServiceFeature... features) {
        return super.getPort(WeatherPort, WeatherPortType.class, features);
    }

}
