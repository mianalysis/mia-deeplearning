package io.github.mianalysis.mia_deeplearning.moduledependencies;

import org.scijava.Priority;
import org.scijava.plugin.Plugin;

import io.github.mianalysis.mia.moduledependencies.Dependency;

@Plugin(type = Dependency.class, priority = Priority.LOW, visible = true)
public class StarDistDetectionDependency extends Dependency {
    @Override
    public String getModuleName() {
        return "StarDistDetection";
    }

    @Override
    public String getClassName() {
        return "de.csbdresden.stardist.StarDist2DModel";
    }

    @Override
    public String getVersionThreshold() {
        return "0.0.0";
    }

    @Override
    public Relationship getRelationship() {
        return Relationship.GREATER_THAN_OR_EQUAL_TO;
    }
}
