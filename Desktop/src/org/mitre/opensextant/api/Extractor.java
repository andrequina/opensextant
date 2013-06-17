package org.mitre.opensextant.api;

import java.io.Closeable;

import org.mitre.opensextant.api.model.ProcessedDocument;
import org.mitre.opensextant.api.model.UnprocessedDocument;

public interface Extractor extends Closeable {

    public ProcessedDocument extract(UnprocessedDocument document);
    public void addProgressListener(OSProgressListener listener);
    public void removeProgressListener(OSProgressListener listener);
    public void initialize();
    
}
