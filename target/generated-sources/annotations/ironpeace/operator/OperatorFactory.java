package ironpeace.operator;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowBoundary;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.flow.graph.ShuffleKey;
import com.asakusafw.vocabulary.flow.processor.InputBuffer;
import com.asakusafw.vocabulary.operator.CoGroup;
import com.asakusafw.vocabulary.operator.KeyInfo;
import com.asakusafw.vocabulary.operator.OperatorInfo;
import ironpeace.modelgen.dmdl.model.Model;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
/**
 * {@link Operator}に関する演算子ファクトリークラス。
 * @see Operator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1")@com.asakusafw.vocabulary.operator.OperatorFactory(Operator.class) 
        public class OperatorFactory {
    /**
     */
    public static final class Gsort implements com.asakusafw.vocabulary.flow.Operator {
        private final FlowElementResolver $;
        /**
         */
        public final Source<Model> result;
        Gsort(Source<Model> list) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(CoGroup.class);
            builder.declare(Operator.class, OperatorImpl.class, "gsort");
            builder.declareParameter(List.class);
            builder.declareParameter(Result.class);
            builder.addInput("list", list, new ShuffleKey(Arrays.asList(new String[]{"keycode", "term"}), Arrays.asList(
                    new ShuffleKey.Order[]{})));
            builder.addOutput("result", Model.class);
            builder.addAttribute(FlowBoundary.SHUFFLE);
            builder.addAttribute(ObservationCount.DONT_CARE);
            builder.addAttribute(InputBuffer.EXPAND);
            this.$ = builder.toResolver();
            this.$.resolveInput("list", list);
            this.result = this.$.resolveOutput("result");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public OperatorFactory.Gsort as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param list
     * @return 生成した演算子オブジェクト
     * @see Operator#gsort(List, Result)
     */
    @OperatorInfo(kind = CoGroup.class, input = {@OperatorInfo.Input(name = "list", type = Model.class, position = 0)}, 
            output = {@OperatorInfo.Output(name = "result", type = Model.class)}, parameter = {}) public OperatorFactory
            .Gsort gsort(@KeyInfo(group = {@KeyInfo.Group(expression = "keycode"),@KeyInfo.Group(expression = "term")}, 
            order = {}) Source<Model> list) {
        return new OperatorFactory.Gsort(list);
    }
}