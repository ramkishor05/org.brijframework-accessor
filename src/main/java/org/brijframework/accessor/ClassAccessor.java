package org.brijframework.accessor;

import org.brijframework.accessor.Accessor;
import org.brijframework.meta.factories.ClassMetaInfoFactory;
import org.brijframework.meta.reflect.ClassMetaInfo;

public interface ClassAccessor extends Accessor {

	public <T> T getInstanse(Object...objects);

	public ClassMetaInfo getClassInfo();

	public ClassMetaInfo getClassInfo(String parentID);
	
	public ClassMetaInfoFactory getInfoFactory();

}
