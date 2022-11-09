About MIA-DeepLearning
------------------
DEPRECATION NOTE: MIA-DeepLearning modules have now been incorporated directly into the main [MIA](https://github.com/mianalysis/MIA) plugin (since MIA v1.2.0).  These modules will only appear in MIA if the CSBDeep and StarDist update sites are enabled.

MIA-DeepLearning is a [MIA](https://github.com/mianalysis/MIA) plugin, which adds additional modules that rely on the [CSBDeep](https://imagej.net/plugins/csbdeep) Fiji plugin for deep learning.  The latest release includes the following modules:
- "StarDist detection" will apply [StarDist](https://imagej.net/plugins/stardist) to each slice of an input image and output the detected objects.

Installation
------------
1. Download the version of MIA-DeepLearning, corresponding to your copy of MIA, from the [Releases](https://github.com/mianalysis/mia-deeplearning/releases) page
2. Place this .jar file into the /plugins directory of the your Fiji installation
3. Install CSBDeep and StarDist from the ImageJ [Updater](https://imagej.net/Updater) tool 

Usage
-----
MIA-DeepLearning will add various modules to MIA.  These can be accessed in the same way as other modules.

Acknowledgements
----------------
This plugin currently relies on the [CSBDeep](https://imagej.net/plugins/csbdeep) and [StarDist](https://imagej.net/plugins/stardist) plugins for ImageJ.

Note
----
This plugin is still in development and test coverage is currently incomplete.  Please keep an eye on results and add an [issue](https://github.com/mianalysis/mia-deeplearning/issues) if any problems are encountered.
