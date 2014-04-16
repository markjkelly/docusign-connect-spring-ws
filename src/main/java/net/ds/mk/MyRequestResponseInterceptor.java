package net.ds.mk;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapMessage;

public class MyRequestResponseInterceptor implements EndpointInterceptor {

	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {

		SoapMessage soapMessage = (SoapMessage) messageContext.getRequest();
		
//		logRequestToFile(soapMessage, "request");
		
//		Useful for logging request when deployed on Heroku
//		soapMessage.writeTo(System.out);

		return true;
	}

	public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {

		SoapMessage soapMessage = (SoapMessage) messageContext.getResponse();
		
//		logRequestToFile(soapMessage, "response");
		
//		Useful for logging request when deployed on Heroku
//		soapMessage.writeTo(System.out);
		
		return true;
	}

	public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
		// TODO Auto-generated method stub

	}
	
	private void logRequestToFile(SoapMessage soapMessage, String method) {
		try {

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			soapMessage.writeTo(out);
			String strMsg = new String(out.toByteArray());

			Source xmlInput = new StreamSource(new StringReader(strMsg));
			Transformer transformer = null;

			transformer = TransformerFactory.newInstance().newTransformer();

			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			transformer.transform(xmlInput, new StreamResult(new FileOutputStream("src/test/results/" + method + ".xml")));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}