package org.zendesk.client.v2.model;

import java.util.List;

public final class IncrementalResults<T> {
	private final long endTime;
	private final List<T> results;
	
	public IncrementalResults(long endTime,List<T> results) {
		this.endTime = endTime;
		this.results = results;
	}
	
	public long getEndTime() {
		return this.endTime;
	}
	
	public List<T> getResults() {
		return this.results;
	}
}
