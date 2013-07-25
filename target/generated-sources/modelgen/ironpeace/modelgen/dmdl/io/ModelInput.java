package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.RecordParser;
import ironpeace.modelgen.dmdl.model.Model;
import java.io.IOException;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>model</code>を読み出す
 */
public final class ModelInput implements com.asakusafw.runtime.io.ModelInput<Model> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public ModelInput(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(Model model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getKeycodeOption());
        parser.fill(model.getTermOption());
        parser.fill(model.getFieldOption());
        parser.fill(model.getFlgOption());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}