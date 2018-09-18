package org.brijframework.accessor;

import java.lang.reflect.Type;

import org.brijframework.accessor.Accessor;
import org.brijframework.meta.factories.MethodMetaInfoFactory;
import org.brijframework.meta.reflect.MethodMetaInfo;

public interface MethodAccessor extends Accessor {

	public MethodMetaInfo getMethodInfo(Type...types);
	
	public Object[] getParamValues(MethodMetaInfo info,Object... _values); 
	
	public Object call(String id,Object _instance, Object... _values);

	public String getParentID();
	
	public MethodMetaInfoFactory getInfoFactory();

}
