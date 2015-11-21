
package org.informatika.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AssetLifecycleManagementService", targetNamespace = "http://service.informatika.org/", wsdlLocation = "http://localhost:9000/AssetLifecycleManagement?wsdl")
public class AssetLifecycleManagementService
    extends Service
{

    private final static URL ASSETLIFECYCLEMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ASSETLIFECYCLEMANAGEMENTSERVICE_EXCEPTION;
    private final static QName ASSETLIFECYCLEMANAGEMENTSERVICE_QNAME = new QName("http://service.informatika.org/", "AssetLifecycleManagementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/AssetLifecycleManagement?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ASSETLIFECYCLEMANAGEMENTSERVICE_WSDL_LOCATION = url;
        ASSETLIFECYCLEMANAGEMENTSERVICE_EXCEPTION = e;
    }

    public AssetLifecycleManagementService() {
        super(__getWsdlLocation(), ASSETLIFECYCLEMANAGEMENTSERVICE_QNAME);
    }

    public AssetLifecycleManagementService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ASSETLIFECYCLEMANAGEMENTSERVICE_QNAME, features);
    }

    public AssetLifecycleManagementService(URL wsdlLocation) {
        super(wsdlLocation, ASSETLIFECYCLEMANAGEMENTSERVICE_QNAME);
    }

    public AssetLifecycleManagementService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ASSETLIFECYCLEMANAGEMENTSERVICE_QNAME, features);
    }

    public AssetLifecycleManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AssetLifecycleManagementService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AssetLifecycleManagement
     */
    @WebEndpoint(name = "AssetLifecycleManagementPort")
    public AssetLifecycleManagement getAssetLifecycleManagementPort() {
        return super.getPort(new QName("http://service.informatika.org/", "AssetLifecycleManagementPort"), AssetLifecycleManagement.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AssetLifecycleManagement
     */
    @WebEndpoint(name = "AssetLifecycleManagementPort")
    public AssetLifecycleManagement getAssetLifecycleManagementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.informatika.org/", "AssetLifecycleManagementPort"), AssetLifecycleManagement.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ASSETLIFECYCLEMANAGEMENTSERVICE_EXCEPTION!= null) {
            throw ASSETLIFECYCLEMANAGEMENTSERVICE_EXCEPTION;
        }
        return ASSETLIFECYCLEMANAGEMENTSERVICE_WSDL_LOCATION;
    }

}
