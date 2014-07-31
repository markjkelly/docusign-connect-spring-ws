package net.ds.mk;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpServletConnection;

@Endpoint
public class ConnectServiceEndpoint {

	private static final String CONNECT_TARGET_NAMESPACE = "http://net/ds/mk";

	@PayloadRoot(localPart = "DocuSignConnectUpdate", namespace = CONNECT_TARGET_NAMESPACE)
	public @ResponsePayload DocuSignConnectUpdateResponse docusignConnectUpdate(
			@RequestPayload DocuSignConnectUpdate request) {

		HttpServletRequest httpServletRequest = getHttpServletRequest();

		Enumeration enumeration = httpServletRequest.getHeaderNames();

		System.out.println();
		System.out.println("-------------- Start Request HTTP Headers --------------");

		while (enumeration.hasMoreElements()) {
			String headerName = (String) enumeration.nextElement();
			System.out.println("Name: [" + headerName + "], value: [" + getHttpHeaderValue(headerName) + "]");
		}
		
		System.out.println("-------------- End Request HTTP Headers --------------");

		DocuSignConnectUpdateResponse response = new DocuSignConnectUpdateResponse();

		response.setEnvelopeID(request.getDocuSignEnvelopeInformation()
				.getEnvelopeStatus().getEnvelopeID());

		return response;
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
}