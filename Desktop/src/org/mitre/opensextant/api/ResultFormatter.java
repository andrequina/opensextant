package org.mitre.opensextant.api;

import java.io.Closeable;
import java.io.File;
import java.util.List;

import org.mitre.opensextant.api.model.Result;

public interface ResultFormatter extends Closeable {

    public void initialize(File outputFile);
    public void format(List<Result> results);
    
}
