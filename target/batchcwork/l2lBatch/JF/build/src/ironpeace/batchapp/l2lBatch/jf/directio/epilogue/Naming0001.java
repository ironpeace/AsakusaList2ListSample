package ironpeace.batchapp.l2lBatch.jf.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import ironpeace.modelgen.dmdl.model.Model;
/**
 * A naming output "ttModel" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0001 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0001() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, "model.csv"));
    }
    @Override public void set(Object rawObject) {
        Model object = (Model) rawObject;
    }
}