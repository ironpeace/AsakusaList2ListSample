package ironpeace.batchapp.l2lBatch.jf.stage0001;
import com.asakusafw.runtime.flow.RuntimeResourceManager;
import ironpeace.modelgen.dmdl.model.Model;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;
/**
 * {@code [in->padding(pseud#511811991){owner=FlowBlock&#64;1482981398}]}の処理を担当するマッププログラム。
 */
@SuppressWarnings("deprecation") public final class StageMapper1 extends Mapper<NullWritable, Model, ShuffleKey, 
        ShuffleValue> {
    private Model cache = new Model();
    private RuntimeResourceManager runtimeResourceManager;
    private MapFragment1 line;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager = new RuntimeResourceManager(context.getConfiguration());
        this.runtimeResourceManager.setup();
        final MapOutputFragment1 shuffle = new MapOutputFragment1(context);
        this.line = new MapFragment1(shuffle);
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.runtimeResourceManager.cleanup();
        this.runtimeResourceManager = null;
        this.line = null;
    }
    @Override public void run(Context context) throws IOException, InterruptedException {
        this.setup(context);
        while(context.nextKeyValue()) {
            cache.copyFrom(context.getCurrentValue());
            this.line.add(cache);
        }
        this.cleanup(context);
    }
}