package ironpeace.batch;

import ironpeace.jobflow.JF;

import com.asakusafw.vocabulary.batch.Batch;
import com.asakusafw.vocabulary.batch.BatchDescription;

@Batch(name="l2lBatch")
public class Btch extends BatchDescription {

	@Override
	protected void describe() {
		run(JF.class).soon();
	}

}
