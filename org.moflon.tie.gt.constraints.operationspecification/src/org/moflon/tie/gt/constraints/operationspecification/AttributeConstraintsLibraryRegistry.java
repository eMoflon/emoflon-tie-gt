package org.moflon.tie.gt.constraints.operationspecification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

public class AttributeConstraintsLibraryRegistry {

	private final Map<URI, AttributeConstraintLibrary> mapping = new HashMap<>();
	private final Collection<URI> uris = new ArrayList<>();
	private URI priorityUri = null;

	public URI getPriorityUri() {
		return priorityUri;
	}

	public void setPriorityUri(final URI priorityUri) {
		this.priorityUri = priorityUri;
	}

	public Collection<URI> getUris() {
		final Deque<URI> uris = new LinkedList<>(this.uris);
		if (this.priorityUri != null) {
			uris.remove(priorityUri);
			uris.addFirst(priorityUri);
		}
		return uris;
	}

	public AttributeConstraintLibrary getLibrary(final URI uri) {
		return this.mapping.get(uri);
	}

	public void add(final URI uri, final AttributeConstraintLibrary library) {
		mapping.put(uri, library);
		uris.add(uri);
	}

}
