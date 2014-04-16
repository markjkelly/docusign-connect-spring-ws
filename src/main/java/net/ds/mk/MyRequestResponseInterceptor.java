package net.ds.mk;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapMessage;

public class MyRequestResponseInterceptor implements EndpointInterceptor {

	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {

		SoapMessage soapMessage = (SoapMessage) messageContext.getRequest();

		System.out.println("***handleRequest start***");
		soapMessage.writeTo(System.out);
		System.out.println("***handleRequest finish***");
		
//		try {
//
//			soapMessage.writeTo(System.out);
//			ByteArrayOutputStream out = new ByteArrayOutputStream();
//			soapMessage.writeTo(out);
//			String strMsg = new String(out.toByteArray());
//
//			Source xmlInput = new StreamSource(new StringReader(strMsg));
//			Transformer transformer = null;
//
//			transformer = TransformerFactory.newInstance().newTransformer();
//
//			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
//			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
//
//			transformer.transform(xmlInput, new StreamResult(System.out));
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (TransformerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		return true;
	}

	public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {

		SoapMessage soapMessage = (SoapMessage) messageContext.getResponse();
		
		System.out.println("***handleResponse start***");
		soapMessage.writeTo(System.out);
		System.out.println("***handleResponse finish***");

//		try {
//
//			soapMessage.writeTo(System.out);
//			ByteArrayOutputStream out = new ByteArrayOutputStream();
//			soapMessage.writeTo(out);
//			String strMsg = new String(out.toByteArray());
//
//			Source xmlInput = new StreamSource(new StringReader(strMsg));
//			Transformer transformer = null;
//
//			transformer = TransformerFactory.newInstance().newTransformer();
//
//			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
//			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
//
//			transformer.transform(xmlInput, new StreamResult(System.out));
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (TransformerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return true;
	}

	public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
		// TODO Auto-generated method stub

	}
}