package com.wadex.common.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>
 * 文件名称: LoadFileConfig.java
 * </p>
 * <p>
 * 文件描述: 业务对象 读取配置文件
 * <p>
 * 版权�?�?: 版权�?�?(C)2010
 * </p>
 * <p>
 * �? �?: 拓维信息系统股份有限公司
 * </p>
 * <p>
 * 内容摘要: 读取配置文件
 * </p>
 * <p>
 * 完成日期 2020、/10/14
 * </p>
 * 
 * @author 宋士宏
 */
public class LoadDataConfig
{
	private static Logger log = LoggerFactory.getLogger(LoadDataConfig.class);

	public static Properties properties;

	/**
	 * 获取配置信息
	 * 
	 * @param key
	 *            key
	 * @return �?
	 */
	public static String getKey(String key) {
		return getKey(key, null);
	}

	public static String getKey(String key, String defaul) {
		
		if (properties == null)
		{
			InputStream is = null;
			try
			{
				properties = new Properties();
				// 本地环境用这个方法
//				File f = new File(LoadFileConfig.class.getClass().getResource("config.properties").getPath());
//				is =  new FileInputStream(f);
				// 正式环境用这个方法
				is =  LoadDataConfig.class.getResourceAsStream("/datatype.properties");
				properties.load(is);
				System.getProperties().putAll(properties);
			} catch (IOException e)
			{
				log.error(e.getMessage());
				e.printStackTrace();
			} finally
			{
				try
				{
					if (is != null)
						is.close();
				} catch (Exception e)
				{
					log.error(e.getMessage());
					e.printStackTrace();
				}
			}
		}
		String value = properties.getProperty(key, defaul);
		if (value == null)
		{
			value = "";
		}
		return value;
	}
}
