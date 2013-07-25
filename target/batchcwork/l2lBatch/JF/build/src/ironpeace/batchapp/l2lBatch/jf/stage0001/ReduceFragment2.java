package ironpeace.batchapp.l2lBatch.jf.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.ArrayListBuffer;
import ironpeace.modelgen.dmdl.model.Model;
import ironpeace.operator.OperatorImpl;
/**
 * {@code [list->Operator.gsort(operator#648734830)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class ReduceFragment2 extends com.asakusafw.runtime.flow.Rendezvous<
        ShuffleValue> {
    private final Result<Model> result;
    private ArrayListBuffer<Model> list = new ArrayListBuffer<Model>();
    private OperatorImpl op = new OperatorImpl();
    /**
     * インスタンスを生成する。
     * @param result {@code Operator.gsort#result}への出力
     */
    public ReduceFragment2(Result<Model> result) {
        this.result = result;
    }
    @Override public void process(ShuffleValue value) {
        switch(value.getSegmentId()) {
            case 1:
                this.process0001(value.getPort1());
                break;
            default:
                throw new AssertionError(value);
        }
    }
    @Override public void begin() {
        this.list.begin();
    }
    @Override public void end() {
        this.list.end();
        this.op.gsort(this.list, this.result);
        this.list.shrink();
    }
    private void process0001(Model value) {
        if(this.list.isExpandRequired()) {
            this.list.expand(new Model());
            this.list.advance().copyFrom(value);
        }
        else {
            this.list.advance().copyFrom(value);
        }
    }
}