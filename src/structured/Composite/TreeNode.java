package structured.Composite;


import java.util.Enumeration;
import java.util.Vector;

/**
 * 组合模式 又称部分整体
 * **/
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children =  new Vector<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Vector<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }
    //添加孩子节点
    public  void add(TreeNode treeNode){
        children.add(treeNode);
    }
    //删除孩子节点
    public void remove(TreeNode node){
        children.remove(node);
    }
    //获取孩子节点
    public Enumeration<TreeNode> getChildrens(){
        return children.elements();
    }
}
