package org.mitre.opensextant.api.model;

import java.util.List;

public class ProcessedDocument {

    private List<Result> results;
    private ProcessingStatistics processingStatistics;
    
    public ProcessedDocument(List<Result> results, ProcessingStatistics processingStatistics) {
        super();
        this.results = results;
        this.processingStatistics = processingStatistics;
    }
    
    public List<Result> getResults() {
        return this.results;
    }
    public ProcessingStatistics getProcessingStatistics() {
        return this.processingStatistics;
    }
    
}
