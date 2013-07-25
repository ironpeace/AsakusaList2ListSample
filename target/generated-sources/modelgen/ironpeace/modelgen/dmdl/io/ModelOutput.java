package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.RecordEmitter;
import ironpeace.modelgen.dmdl.model.Model;
import java.io.IOException;
/**
 * <code>model</code>をTSVなどのレコード形式で出力する。
 */
public final class ModelOutput implements com.asakusafw.runtime.io.ModelOutput<Model> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public ModelOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(Model model) throws IOException {
        emitter.emit(model.getKeycodeOption());
        emitter.emit(model.getTermOption());
        emitter.emit(model.getFieldOption());
        emitter.emit(model.getFlgOption());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}