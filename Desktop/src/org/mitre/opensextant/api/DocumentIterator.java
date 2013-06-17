package org.mitre.opensextant.api;

import java.util.Iterator;

import org.mitre.opensextant.api.model.UnprocessedDocument;

public interface DocumentIterator extends Iterator<UnprocessedDocument> {

    public long getDocumentCount();
    
}
