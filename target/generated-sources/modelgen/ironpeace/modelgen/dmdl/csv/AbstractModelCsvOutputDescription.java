package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.Model;
/**
 * An abstract implementation of {@link Model} exporter description using Direct I/O CSV.
 */
public abstract class AbstractModelCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends Model> getModelType() {
        return Model.class;
    }
    @Override public Class<ModelCsvFormat> getFormat() {
        return ModelCsvFormat.class;
    }
}