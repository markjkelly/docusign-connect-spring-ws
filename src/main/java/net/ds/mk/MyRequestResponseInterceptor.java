package net.ds.mk;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.sql.Timestamp;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpServletConnection;

public class MyRequestResponseInterceptor implements EndpointInterceptor {

	@Autowired
	MongoTemplate mongoTemplate;

	public boolean handleRequest(MessageContext messageContext, Object endpoint)
			throws Exception {

		System.out.println("Entering handleRequest");

		return true;
	}

	public boolean handleResponse(MessageContext messageContext, Object endpoint)
			throws Exception {

		System.out.println("Entering handleResponse");

		return true;
	}

	public boolean handleFault(MessageContext messageContext, Object endpoint)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public void afterCompletion(MessageContext messageContext, Object endpoint,
			Exception ex) throws Exception {

		System.out.println("Entering afterCompletion");

		SoapMessage soapMessage = (SoapMessage) messageContext.getRequest();

		// logRequestToFile(soapMessage, "request");

		HttpServletRequest httpServletRequest = getHttpServletRequest();

		Enumeration enumeration = httpServletRequest.getHeaderNames();

		System.out.println();
		System.out
				.println("-------------- Start Request HTTP Headers --------------");

		while (enumeration.hasMoreElements()) {
			String headerName = (String) enumeration.nextElement();
			System.out.println("Name: [" + headerName + "], value: ["
					+ getHttpHeaderValue(headerName) + "]");
		}

		System.out
				.println("-------------- End Request HTTP Headers --------------");

		// Useful for logging request when deployed on Heroku
		System.out.println();
		System.out
				.println("-------------- afterCompletion SOAP Start --------------");
		soapMessage.writeTo(System.out);
		System.out.println();
		System.out
				.println("-------------- afterCompletion SOAP End --------------");
		System.out.println();

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		soapMessage.writeTo(out);

		try {
			String strMsg = new String(out.toByteArray());

			ConnectUpdate connectUpdate = new ConnectUpdate();
			connectUpdate.setPayload(strMsg);
			java.util.Date date = new java.util.Date();
			connectUpdate.setTimestamp(new Timestamp(date.getTime()));

			System.out.println(connectUpdate.toString());

			mongoTemplate.insert(connectUpdate);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Exiting afterCompletion");

	}

	protected HttpServletRequest getHttpServletRequest() {
		TransportContext ctx = TransportContextHolder.getTransportContext();
		return (null != ctx) ? ((HttpServletConnection) ctx.getConnection())
				.getHttpServletRequest() : null;
	}

	protected String getHttpHeaderValue(final String headerName) {
		HttpServletRequest httpServletRequest = getHttpServletRequest();
		return (null != httpServletRequest) ? httpServletRequest
				.getHeader(headerName) : null;
	}

	private void logRequestToFile(SoapMessage soapMessage, String method) {
		try {

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			soapMessage.writeTo(out);
			String strMsg = new String(out.toByteArray());

			Source xmlInput = new StreamSource(new StringReader(strMsg));
			Transformer transformer = null;

			transformer = TransformerFactory.newInstance().newTransformer();

			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,
					"yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(
					"{http://xml.apache.org/xslt}indent-amount", "2");

			transformer.transform(xmlInput,
					new StreamResult(new FileOutputStream("src/test/results/"
							+ method + ".xml")));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}