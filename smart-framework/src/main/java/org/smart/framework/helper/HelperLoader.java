package org.smart.framework.helper;

import org.smart.framework.util.ClassUtil;

/**
 * 初始化框架
 * @author sunkang
 *
 */
public class HelperLoader {
	public static void init(){
		Class<?>[] classArr={BeanHelper.class,ClassHelper.class,IocHelper.class,ControllerHelper.class};
		for(Class<?> cls:classArr){
			ClassUtil.loadClass(cls.getName(),true);
		}
		
	}
}
