package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.Model;
/**
 * An abstract implementation of {@link Model} importer description using Direct I/O CSV.
 */
public abstract class AbstractModelCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends Model> getModelType() {
        return Model.class;
    }
    @Override public Class<ModelCsvFormat> getFormat() {
        return ModelCsvFormat.class;
    }
}