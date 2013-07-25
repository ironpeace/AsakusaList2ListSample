package ironpeace.batchapp.l2lBatch.jf.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputMapper;
import ironpeace.modelgen.dmdl.model.Model;
/**
 */
public final class StageMapper0 extends AbstractDirectOutputMapper<Model> {
    /**
     * Creates a new instance.
     */
    public StageMapper0() {
        super(0, ShuffleKey.class, ShuffleValue.class);
    }
}