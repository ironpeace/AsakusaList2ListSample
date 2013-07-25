package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractModelCsvInputDescription;

public class ModelFromCsv extends AbstractModelCsvInputDescription {

	@Override
	public String getBasePath() {
		return "tts/input/";
	}

	@Override
	public String getResourcePattern() {
		return "model.csv";
	}

}
