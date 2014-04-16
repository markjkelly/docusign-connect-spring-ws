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
		System.out.println("******** Entering docusignConnectUpdate (New) ***************");

		DocuSignConnectUpdateResponse response = new DocuSignConnectUpdateResponse();
		
		try {
			System.out.println("Envelope ID: [" + request.getDocuSignEnvelopeInformation().getEnvelopeStatus().getEnvelopeID() + "]");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.setEnvelopeID(request.getDocuSignEnvelopeInformation().getEnvelopeStatus().getEnvelopeID());

		System.out.println("******** Exiting docusignConnectUpdate ***************");
		return response;
	}
}