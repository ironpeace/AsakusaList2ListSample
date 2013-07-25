package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractModelCsvOutputDescription;

public class ModelToCsv extends AbstractModelCsvOutputDescription {

	@Override
	public String getBasePath() {
		return "tts/output/";
	}

	@Override
	public String getResourcePattern() {
		return "model.csv";
	}

}
