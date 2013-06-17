package org.mitre.opensextant.api;

import java.io.File;

import org.mitre.opensextant.api.model.UnprocessedDocument;


public interface DocumentFactory {

    public DocumentIterator getDocumentsFor(File file);
    public UnprocessedDocument getDocumentFor(String contents);
    
}
