package ironpeace.batchapp.l2lBatch.jf.directio.epilogue;
import com.asakusafw.runtime.stage.directio.DirectOutputOrder;
import ironpeace.modelgen.dmdl.model.Model;
/**
 * An ordering output "ttModel" class for "directio".
 */
public final class Ordering0001 extends DirectOutputOrder {
    /**
     * Creates a new instance.
     */
    public Ordering0001() {
        super();
    }
    @Override public void set(Object rawObject) {
        Model object = (Model) rawObject;
    }
}