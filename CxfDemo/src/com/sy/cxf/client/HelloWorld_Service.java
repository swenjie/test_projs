
/*
 * 
 */

package com.sy.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.2
 * Mon Jul 11 17:09:19 CST 2016
 * Generated source version: 2.2.2
 * 
 */


@WebServiceClient(name = "HelloWorld", 
                  wsdlLocation = "http://localhost:8080/CxfDemo/webservice/helloWorld?wsdl",
                  targetNamespace = "http://server.hsy.com/") 
public class HelloWorld_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://server.hsy.com/", "HelloWorld");
    public final static QName HelloWorldImplPort = new QName("http://server.hsy.com/", "HelloWorldImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/CxfDemo/webservice/helloWorld?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8080/CxfDemo/webservice/helloWorld?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public HelloWorld_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorld_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorld_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort() {
        return super.getPort(HelloWorldImplPort, HelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldImplPort, HelloWorld.class, features);
    }

}