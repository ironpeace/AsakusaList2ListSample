package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.DoubleOption;
import com.asakusafw.runtime.value.IntOption;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.ModelInput;
import ironpeace.modelgen.dmdl.io.ModelOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * Modelを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ModelInput.class)@ModelOutputLocation(ModelOutput.class)@PropertyOrder({
            "keycode", "term", "field", "flg"}) public class Model implements DataModel<Model>, Writable {
    private final StringOption keycode = new StringOption();
    private final IntOption term = new IntOption();
    private final DoubleOption field = new DoubleOption();
    private final StringOption flg = new StringOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.keycode.setNull();
        this.term.setNull();
        this.field.setNull();
        this.flg.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(Model other) {
        this.keycode.copyFrom(other.keycode);
        this.term.copyFrom(other.term);
        this.field.copyFrom(other.field);
        this.flg.copyFrom(other.flg);
    }
    /**
     * keycodeを返す。
     * @return keycode
     * @throws NullPointerException keycodeの値が<code>null</code>である場合
     */
    public Text getKeycode() {
        return this.keycode.get();
    }
    /**
     * keycodeを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setKeycode(Text value) {
        this.keycode.modify(value);
    }
    /**
     * <code>null</code>を許すkeycodeを返す。
     * @return keycode
     */
    public StringOption getKeycodeOption() {
        return this.keycode;
    }
    /**
     * keycodeを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setKeycodeOption(StringOption option) {
        this.keycode.copyFrom(option);
    }
    /**
     * termを返す。
     * @return term
     * @throws NullPointerException termの値が<code>null</code>である場合
     */
    public int getTerm() {
        return this.term.get();
    }
    /**
     * termを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setTerm(int value) {
        this.term.modify(value);
    }
    /**
     * <code>null</code>を許すtermを返す。
     * @return term
     */
    public IntOption getTermOption() {
        return this.term;
    }
    /**
     * termを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setTermOption(IntOption option) {
        this.term.copyFrom(option);
    }
    /**
     * fieldを返す。
     * @return field
     * @throws NullPointerException fieldの値が<code>null</code>である場合
     */
    public double getField() {
        return this.field.get();
    }
    /**
     * fieldを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setField(double value) {
        this.field.modify(value);
    }
    /**
     * <code>null</code>を許すfieldを返す。
     * @return field
     */
    public DoubleOption getFieldOption() {
        return this.field;
    }
    /**
     * fieldを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFieldOption(DoubleOption option) {
        this.field.copyFrom(option);
    }
    /**
     * flgを返す。
     * @return flg
     * @throws NullPointerException flgの値が<code>null</code>である場合
     */
    public Text getFlg() {
        return this.flg.get();
    }
    /**
     * flgを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFlg(Text value) {
        this.flg.modify(value);
    }
    /**
     * <code>null</code>を許すflgを返す。
     * @return flg
     */
    public StringOption getFlgOption() {
        return this.flg;
    }
    /**
     * flgを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFlgOption(StringOption option) {
        this.flg.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=model");
        result.append(", keycode=");
        result.append(this.keycode);
        result.append(", term=");
        result.append(this.term);
        result.append(", field=");
        result.append(this.field);
        result.append(", flg=");
        result.append(this.flg);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + keycode.hashCode();
        result = prime * result + term.hashCode();
        result = prime * result + field.hashCode();
        result = prime * result + flg.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Model other = (Model) obj;
        if(this.keycode.equals(other.keycode) == false) {
            return false;
        }
        if(this.term.equals(other.term) == false) {
            return false;
        }
        if(this.field.equals(other.field) == false) {
            return false;
        }
        if(this.flg.equals(other.flg) == false) {
            return false;
        }
        return true;
    }
    /**
     * keycodeを返す。
     * @return keycode
     * @throws NullPointerException keycodeの値が<code>null</code>である場合
     */
    public String getKeycodeAsString() {
        return this.keycode.getAsString();
    }
    /**
     * keycodeを設定する。
     * @param keycode0 設定する値
     */
    @SuppressWarnings("deprecation") public void setKeycodeAsString(String keycode0) {
        this.keycode.modify(keycode0);
    }
    /**
     * flgを返す。
     * @return flg
     * @throws NullPointerException flgの値が<code>null</code>である場合
     */
    public String getFlgAsString() {
        return this.flg.getAsString();
    }
    /**
     * flgを設定する。
     * @param flg0 設定する値
     */
    @SuppressWarnings("deprecation") public void setFlgAsString(String flg0) {
        this.flg.modify(flg0);
    }
    @Override public void write(DataOutput out) throws IOException {
        keycode.write(out);
        term.write(out);
        field.write(out);
        flg.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        keycode.readFields(in);
        term.readFields(in);
        field.readFields(in);
        flg.readFields(in);
    }
}