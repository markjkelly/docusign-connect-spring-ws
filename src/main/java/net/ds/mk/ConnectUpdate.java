package net.ds.mk;

import java.sql.Timestamp;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "connectUpdates")
public class ConnectUpdate {

	private Timestamp timestamp;
	private String payload;

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "ConnectUpdate [timestamp=" + timestamp + ", payload=" + payload
				+ "]";
	}

}
