package net.ds.mk;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConnectServiceEndpoint {

	private static final String CONNECT_TARGET_NAMESPACE = "http://net/ds/mk";

	@PayloadRoot(localPart = "DocuSignConnectUpdate", namespace = CONNECT_TARGET_NAMESPACE)
	public @ResponsePayload
	DocuSignConnectUpdateResponse docusignConnectUpdate(@RequestPayload DocuSignConnectUpdate request) {

		DocuSignConnectUpdateResponse response = new DocuSignConnectUpdateResponse();
		
		response.setEnvelopeID(request.getDocuSignEnvelopeInformation().getEnvelopeStatus().getEnvelopeID());

		return response;
	}
}