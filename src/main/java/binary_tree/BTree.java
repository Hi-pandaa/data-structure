package binary_tree;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 2 * @Author: zhaoqi
 * 3 * @Date: 2019/4/12 0012 PM 4:24
 * 4 二叉树
 */
public class BTree {

    /**
     * 根节点
     */
    private Node rootNode;

    /**
     * 插入某个节点
     * @param saveNode
     */
    private void insert(Node saveNode) {


        if (saveNode == null) {//如果插入的节点为空 就直接return
            return;
        }
        if (rootNode == null) {//根节点为空 直接根节点就是新增的节点
            rootNode = saveNode;
            return;
        }

        //比较值的大小 如果比
        Node tempNode=rootNode;//临时的根节点


        while (true) {
            //递归查询到这个节点的插入位置

            // 1>先查询这个值和根节点值的比较

            if (saveNode.getValue() < tempNode.getValue()) {//当前保存的节点 小于临时父节点

                //2.再判断当前的临时节点下有没有左孩子节点 有就再递归下去 没有就直接是左节点
                if (tempNode.getLeftChild() == null) {//左节点为空
                    tempNode.setLeftChild(saveNode);
                    break;
                }
                //左节点不为空 就继续递归下去 使用左节点替代temp根节点
                tempNode = tempNode.getLeftChild();
                continue;
            } else {//当前保存的节点 大于临时父节点

                //2.再判断当前的临时节点下有没有右孩子节点 有就再递归下去 没有就直接是右节点
                if (tempNode.getRightChild() == null) {//右节点为空
                    tempNode.setRightChild(saveNode);
                    break;
                }
                //右节点不为空 就继续递归下去 使用右节点替代temp根节点
                tempNode = tempNode.getRightChild();
                continue;
            }

        }
    }


    /**
     * 遍历
     * @return
     */
    public Deque<Node> ergodic() {
        Deque<Node> nodeList = new ArrayDeque<>();
        if (rootNode == null) {
            return nodeList;
        }

        //第一步先把根节点推入Deque当中
        nodeList.push(rootNode);

        //再判断有没有左节点
        //左树和右树分开获取 然后拼接

        Node tempNode = rootNode;
        while (true) {


        }





    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }
}
