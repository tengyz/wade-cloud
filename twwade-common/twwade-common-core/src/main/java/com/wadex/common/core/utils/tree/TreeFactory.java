package com.wadex.common.core.utils.tree;

import java.util.HashMap;
import java.util.Map;

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
 * 内容摘要: 树的服务类
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
public class TreeFactory
{
	/** 存放树节点的map，键为该节点的id，值为树节点对象 */
	private Map<Integer, Node> nodeTable = new HashMap<Integer, Node>();

	/** 根节点 */
	private Node root;

	/**
	 * 有参构造函数
	 * 
	 * @param id
	 *            树节点的id
	 */
	public TreeFactory(int id)
	{
		root = new Node(id, -1, "root", "", -1,"",0);
		nodeTable.put(id, root);
	}

	public Node getRoot()
	{
		return root;
	}

	/**
	 * 创建树
	 */
	public void createTree()
	{
		processTree(getRoot());
	}

	/**
	 * 根据根节点创建树
	 * 
	 * @param node
	 *            根节点
	 */
	private void processTree(Node node)
	{
		// 循环递归
		for (Map.Entry<Integer, Node> entry : nodeTable.entrySet()) {
			// 如果子节点的父亲id等于父亲节点id
			Node child = entry.getValue();
			if (child.getPid() == node.getId())
			{
				node.getChildren().add(child);
				processTree(child);
			}
		}
	}

	/**
	 * 给树添加一个节点
	 * 
	 * @param id
	 * @param pid
	 * @param name
	 * @param url
	 * @param orderid
	 */
	public void add(int id, int pid, String name, String url, int orderid,String title,int isBlank)
	{
		Node newNode = new Node(id, pid, name, url, orderid,title,isBlank);
		nodeTable.put(id, newNode);
	}

	/**
	 * 给树添加一个节点
	 * 
	 * @param id
	 * @param pid
	 * @param name
	 * @param url
	 */
	public void add(int id, int pid, String name, String url)
	{
		Node newNode = new Node(id, pid, name, url);
		nodeTable.put(id, newNode);

		// Node parent = findParent(pid);
		// if (parent==null) return ;
		// parent.getChildren().add(newNode);
		//	      
	}

	public void add(int id, int pid, String name, String url, String target)
	{
		Node newNode = new Node(id, pid, name, url, target);
		nodeTable.put(id, newNode);

		// Node parent = findParent(pid);
		// if (parent==null) return ;
		// parent.getChildren().add(newNode);
		//	      
	}

	/**
	 * 找父亲节点根据父亲id
	 * 
	 * @param pid
	 *            父亲节点id
	 * @return 结果 父亲节点
	 */
	private Node findParent(int pid)
	{
		return nodeTable.get(pid);
	}

	/**
	 * 给树添加一个节点
	 * 
	 * @param nodeId
	 * @param parentid
	 * @param name
	 * @param url
	 * @param orderId
	 */
	public void add(String nodeId, String parentid, String name, String url,
			String orderId)
	{
		int id = Integer.parseInt(nodeId);
		int pid = Integer.parseInt(parentid);
		// int orderid = Integer.parseInt(orderId);
		add(id, pid, name, url);

	}

}
