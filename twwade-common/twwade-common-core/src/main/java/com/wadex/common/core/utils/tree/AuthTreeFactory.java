package com.wadex.common.core.utils.tree;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.wadex.common.core.vo.org.Org;

/**
 * <p>
 * 文件名称: AuthTreeFactory.java
 * </p>
 * <p>
 * 文件描述:权限树的处理
 * <p>
 * 版权所有: 版权所有(C)2010
 * </p>
 * <p>
 * 公 司: 拓维信息系统股份有限公司
 * </p>
 * <p>
 * 内容摘要: 根据用户的查询本省 本公司 本部门和指定部门组合成一个树
 * </p>
 * <p>
 * 完成日期：Nov 20, 2010
 * </p>
 * 
 * @author 孟祥古
 */
public class AuthTreeFactory
{
	/** 存放树节点的map，键为该节点的id，值为树节点对象 */
	private Map<Long, AuthTreeNode> nodeTable = new HashMap<Long, AuthTreeNode>();

	/** 根节点 */
	private AuthTreeNode root;

	/**
	 * 有参构造函数
	 * 
	 * @param id
	 *            树节点的id
	 */
	public AuthTreeFactory(Long id)
	{
		root = new AuthTreeNode(id);
		root.setName("中国联通");
		nodeTable.put(id, root);
	}

	public void addNode(Org org, int level, String url)
	{
		AuthTreeNode authTreeNode = new AuthTreeNode(org.getId(), org
				.getDisplayName(), org.getPid(), url, org.getSeq(), level);
		nodeTable.put(authTreeNode.getId(), authTreeNode);
	}

	/**
	 * 根据根节点创建树
	 * 
	 * @param authTreeNode 根节点
	 */
	public void processTree(AuthTreeNode authTreeNode)
	{
		// 循环递归
		for (Map.Entry<Long, AuthTreeNode> entry : nodeTable.entrySet()) {
			// 如果子节点的父亲id等于父亲节点id
			AuthTreeNode child = entry.getValue();
			if (child.getPid()!=-1&&child.getPid() == authTreeNode.getId())
			{
				authTreeNode.getChildren().add(child);
				processTree(child);
			}
		}
	}
    /**
     * 获取节点的xml
     * @param authTreeNode
     * @return 结果
     */
	public String getNodeStr(AuthTreeNode authTreeNode)
	{
		StringBuffer strBuf = new StringBuffer();
		strBuf.append("<tree text=\"").append(authTreeNode.getName()).append(
				"\"");
		if (authTreeNode.getUrl() != null&&authTreeNode.getLevel()!=3)
		{
			strBuf.append(" src=\"").append(authTreeNode.getUrl()).append(
					"?orgId=").append(authTreeNode.getId()).append(
					"&amp;type=").append(authTreeNode.getLevel()+1).append("\"  ");
		}
		if(authTreeNode.getLevel()==3){
		strBuf.append(" action=\"javaScript:getInfo('").append(
				authTreeNode.getId()).append("','").append(
				authTreeNode.getName()).append("')\"");
		}
		strBuf.append(">");
		if(authTreeNode.getChildren().size()>0){
			Collections.sort(authTreeNode.getChildren());
			for(AuthTreeNode treeNode:authTreeNode.getChildren()){
				strBuf.append(getNodeStr(treeNode));
			}
		}
		strBuf.append("</tree>");
		return strBuf.toString();
	}
	
	public AuthTreeNode getRoot()
	{
		return root;
	}
}
