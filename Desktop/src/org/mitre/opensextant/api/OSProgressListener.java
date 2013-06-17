package org.mitre.opensextant.api;

import org.mitre.opensextant.api.model.UnprocessedDocument;


public interface OSProgressListener {

    public void progressChanged(UnprocessedDocument document, int progress);
    public void processFinished(UnprocessedDocument document);
    
}
