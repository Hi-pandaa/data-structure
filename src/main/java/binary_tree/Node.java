package binary_tree;

/**
 * 2 * @Author: zhaoqi
 * 3 * @Date: 2019/4/12 0012 PM 4:13
 * 4
 */
public class Node {

    /**
     * 父节点
     */
    private Node parentNode;
    /**
     * node 值
     */
    private int value;

    /**
     *左孩子节点
     */
    private Node leftChild;

    /**
     * 右孩子节点
     */
    private Node rightChild;


    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
