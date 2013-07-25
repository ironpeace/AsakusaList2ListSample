package ironpeace.batchapp.l2lBatch.jf.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputKey;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.ModelCsvFormat;
import ironpeace.modelgen.dmdl.model.Model;
/**
 */
public final class ShuffleKey extends AbstractDirectOutputKey {
    /**
     * Creates a new instance.
     */
    public ShuffleKey() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(Model.class, "tts/output/", ModelCsvFormat.class, Naming0001.
                    class, Ordering0001.class)});
    }
}