package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.model.Model;
import ironpeace.operator.OperatorFactory;
import ironpeace.operator.OperatorFactory.Gsort;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;

@JobFlow(name="JF")
public class JF extends FlowDescription {

	final In<Model> inModel;
	final Out<Model> outModel;
	final CoreOperatorFactory cp = new CoreOperatorFactory();
	
	public JF(
			@Import(name="model", description=ModelFromCsv.class)
			In<Model> inModel,
			@Export(name="ttModel", description=ModelToCsv.class)
			Out<Model> outModel
			){
		this.inModel = inModel;
		this.outModel = outModel;
	}

	@Override
	protected void describe() {

		OperatorFactory op = new OperatorFactory();
		
		Gsort gsort = op.gsort(inModel);
		
		outModel.add(gsort.result);
	}

}
