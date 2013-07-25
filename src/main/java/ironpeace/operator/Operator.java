package ironpeace.operator;

import ironpeace.modelgen.dmdl.model.Model;

import java.util.List;

import com.asakusafw.runtime.core.Result;
import com.asakusafw.vocabulary.model.Key;
import com.asakusafw.vocabulary.operator.GroupSort;

public abstract class Operator {

	@GroupSort
	public void gsort(
			@Key(group="keycode")
			List<Model> list,
			Result<Model> result
			){

		System.out.println("***************************");
		System.out.println("list size : " + list.size());
		
		for(Model m : list){
			result.add(alarmImpl(m, list));
		}
	}
	
	private Model alarmImpl(Model target, List<Model> list){
		System.out.println("list size : " + list.size());
		
		int preTerm = target.getTerm() - 1;
		int prePreTerm = target.getTerm() - 2;
		
		Model pre = null;
		Model prePre = null;
		
		for(Model m : list){
			
			System.out.println("target term : " + target.getTerm() + "***************************");
			System.out.println("m term : " + m.getTerm() + "***************************");
			
			if(pre != null && prePre != null){
				break;
			}else{
				if(m.getTerm() == preTerm){
					pre = m;
					System.out.println("pre term : " + pre.getTerm() + "***************************");
				}
				if(m.getTerm() == prePreTerm){
					prePre = m;
					System.out.println("prePre term : " + prePre.getTerm() + "***************************");
				}
			}
		}

		if(pre != null && prePre != null){
			return alarmImplImpl(target, pre, prePre);
		}else{
			target.setFlgAsString("NONE");
			return target;
		}
		
	}
	
	private Model alarmImplImpl(Model target, Model pre, Model prePre){
	
//		System.out.println("targetField : " + target.getField());
//		System.out.println("preField : " + pre.getField());
//		System.out.println("prePreField : " + prePre.getField());
		
		double sum = target.getField() + pre.getField() + prePre.getField();
		
		if(sum > 0){
			target.setFlgAsString("OK");
		}else{
			target.setFlgAsString("NG");
		}
		
		return target;
	}
}
