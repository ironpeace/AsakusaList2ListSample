package ironpeace.batchapp.l2lBatch.jf.stage0001;
import com.asakusafw.runtime.flow.SegmentedWritable;
import com.asakusafw.runtime.value.IntOption;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.model.Model;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
/**
 * ステージ#1シャッフルで利用するKeyクラス。
 */
@SuppressWarnings("deprecation") public final class ShuffleKey implements SegmentedWritable {
    /**
     * シャッフルフェーズを通した演算子のポート番号。
     */
    public int portId = -1;
    @Override public int getSegmentId() {
        return this.portId;
    }
    /**
     * Operator.gsort#listが利用するキー (keycode)
     */
    public StringOption groupElem0Term1 = new StringOption();
    /**
     * Operator.gsort#listが利用するキー (term)
     */
    public IntOption groupElem0Term2 = new IntOption();
    /**
     * Operator.gsort#listのキーの元になるモデルオブジェクトを設定する
     * @param source 設定するモデルオブジェクト
     */
    public void setPort1(Model source) {
        this.portId = 1;
        this.groupElem0Term1.copyFrom(source.getKeycodeOption());
        this.groupElem0Term2.copyFrom(source.getTermOption());
    }
    /**
     * 指定のキーのグループ情報をこのオブジェクトに複製する
     * @param original コピーするキー
     */
    public void copyGroupFrom(ShuffleKey original) {
        this.portId = original.portId;
        if(this.portId < 0) {
            return;
        }
        switch(this.portId) {
            case 1:
                this.groupElem0Term1.copyFrom(original.groupElem0Term1);
                this.groupElem0Term2.copyFrom(original.groupElem0Term2);
                break;
            default:
                throw new AssertionError(this.portId = original.portId);
        }
    }
    @Override public void write(DataOutput out) throws IOException {
        switch(this.portId) {
            case 1:
                out.writeInt(1);
                this.groupElem0Term1.write(out);
                this.groupElem0Term2.write(out);
                break;
            default:
                throw new AssertionError(this.portId);
        }
    }
    @Override public void readFields(DataInput in) throws IOException {
        this.portId = in.readInt();
        switch(this.portId) {
            case 1:
                this.groupElem0Term1.readFields(in);
                this.groupElem0Term2.readFields(in);
                break;
            default:
                throw new AssertionError(this.portId);
        }
    }
}