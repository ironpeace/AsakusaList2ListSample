package ironpeace.batchapp.l2lBatch.jf.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.Model;
/**
 * {@code [in->padding(pseud#511811991)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<Model> {
    private final Result<Model> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment1(Result<Model> out) {
        this.out = out;
    }
    @Override public void add(Model result) {
        this.out.add(result);
    }
}