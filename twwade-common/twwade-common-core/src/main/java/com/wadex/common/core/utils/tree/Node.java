package com.wadex.common.core.utils.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 文件名称: TreeAction.java
 * </p>
 * <p>
 * 文件描述: 业务对象 --用户
 * <p>
 * 版权所有: 版权所有(C)2010
 * </p>
 * <p>
 * 公 司: 拓维信息系统股份有限公司
 * </p>
 * <p>
 * 内容摘要: 树的节点类
 * </p>
 * <p>
 * 其他说明: 其它需要说明的情况是…………….
 * </p>
 * <p>
 * 完成日期：Sep 20, 2010
 * </p>
 * 
 * @author yangqi
 */
public class Node implements Comparable
{

	private int id;// 节点id
	private String name;// 节点名字
	private int pid;// 父亲节点id
	private String url;// 连接地址
	private int orderid;// 排序的id
	private String target;//url弹出目标
	private String title ;
	private int isBlank ;
	private List<Node> children = new ArrayList<Node>();// 子节点

	/**
	 * 完全参数构造函数
	 * 
	 * @param id
	 * @param pid
	 * @param name
	 * @param url
	 * @param orderid
	 */
	public Node(int id, int pid, String name, String url, int orderid,String title,int IsBlank)
	{
		this.id = id;
		this.name = name;
		this.url = url;
		this.pid = pid;
		this.orderid = orderid;
		this.title = title;
		this.isBlank = IsBlank;
	}

	/**
	 * 完全参数构造函数
	 * 
	 * @param id
	 * @param pid
	 * @param name
	 * @param url
	 */
	public Node(int id, int pid, String name, String url)
	{
		this.id = id;
		this.name = name;
		this.url = url;
		this.pid = pid;
	}
	/**
	 * 完全参数构造函数
	 * 
	 * @param id
	 * @param pid
	 * @param name
	 * @param url
	 */
	public Node(int id, int pid, String name, String url,String target)
	{
		this.id = id;
		this.name = name;
		this.url = url;
		this.pid = pid;
		this.target = target;
	}
	//排序 根据id
	public int compareTo(Object o)
	{
		if (o instanceof Node)
		{
			Node temp = (Node)o;
			if(temp.getOrderid() > this.orderid)
			{
				return -1;
			}
			else if(temp.getOrderid() < this.orderid)
			{
				return 1;
			}
			else
			{
				if(temp.getId() > this.id)
				{
					return -1;
				}
				else if(temp.getId() < this.id)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
		else
		{
			return 0;
		}
	}

	
	
	
	public void setOrderid(int orderid)
	{
		this.orderid = orderid;
	}

	public int getOrderid()
	{
		return orderid;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public int getId()
	{
		return id;
	}

	public void setChildren(List<Node> children)
	{
		this.children = children;
	}

	public List<Node> getChildren()
	{
		return children;
	}

	public String getName()
	{
		return name;
	}

	public String getTarget()
	{
		return target;
	}

	public void setTarget(String target)
	{
		this.target = target;
	}

	public String getTitle() {
		if(this.title==null){
			return "";
		}
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsBlank() {
		return isBlank;
	}

	public void setIsBlank(int isBlank) {
		this.isBlank = isBlank;
	}
}
