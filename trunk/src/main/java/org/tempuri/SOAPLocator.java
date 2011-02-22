/**
 * SOAPLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SOAPLocator extends org.apache.axis.client.Service implements org.tempuri.SOAP {

    public SOAPLocator() {
    }


    public SOAPLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAP
    private java.lang.String SOAP_address = "http://services.healthindicators.gov/v1/SOAP.svc/SOAP";

    public java.lang.String getSOAPAddress() {
        return SOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPWSDDServiceName = "SOAP";

    public java.lang.String getSOAPWSDDServiceName() {
        return SOAPWSDDServiceName;
    }

    public void setSOAPWSDDServiceName(java.lang.String name) {
        SOAPWSDDServiceName = name;
    }

    public org.tempuri.ISOAP getSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAP(endpoint);
    }

    public org.tempuri.ISOAP getSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.SOAPStub _stub = new org.tempuri.SOAPStub(portAddress, this);
            _stub.setPortName(getSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPEndpointAddress(java.lang.String address) {
        SOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.ISOAP.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.SOAPStub _stub = new org.tempuri.SOAPStub(new java.net.URL(SOAP_address), this);
                _stub.setPortName(getSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SOAP".equals(inputPortName)) {
            return getSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "SOAP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "SOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SOAP".equals(portName)) {
            setSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
