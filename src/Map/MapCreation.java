package Map;

import Map.Rooms.*;

public class MapCreation {

    public static void setNode (Node actual, Node next, Node right, Node left, Node back, Node backLeft, Node backRight){
        actual.setNext(next);
        actual.setRight(right);
        actual.setLeft(left);
        actual.setBack(back);
        actual.setBackLeft(backLeft);
        actual.setBackRight(backRight);
    }

    public static Node create () {
        Node nodeStart = new Node(new Start());
        Node nodeA = new Node(new A());        //nao tem next, so right e left
        Node nodeAA = new Node(new AA());
        Node nodeAAA = new Node(new AAA());      //nao tem next, so right e left
        Node nodeAB = new Node(new AB());       //nao tem next, so right e left
        Node nodeABA = new Node(new ABA());
        Node nodeABB = new Node(new ABB());
        Node nodeABBA = new Node(new ABBA());
        Node nodeB = new Node(new B());
        Node nodeBA = new Node(new BA());
        Node nodeBAA = new Node(new BAA());      //nao tem back, so backRight e backLeft
        Node nodeBAAA = new Node(new BAAA());
        Node nodeBB = new Node(new BB());
        Node nodeC = new Node(new C());
        Node nodeCA = new Node(new CA());
        Node nodeCAA = new Node(new CAA());
        Node nodeCB = new Node(new CB());
        Node nodeCC = new Node(new CC());
        Node nodeF = new Node(new F());
        Node nodeFA = new Node(new FA());
        Node nodeFinal = new Node(new Final());
        setNode(nodeStart, nodeB, nodeA, nodeC, null,null,null);
        setNode(nodeA, null, nodeAB, nodeAA, nodeStart,null, null);
        setNode(nodeB, null, nodeBB, nodeBA, nodeStart,null,null);
        setNode(nodeC, nodeCB, nodeCA, nodeCC, nodeStart, null, null);
        setNode(nodeCA, nodeCAA, null, null, nodeC, null, null);
        setNode(nodeCAA, null, null, null, nodeCA, null, null);
        setNode(nodeCB, null, null, null, nodeC, null, null);
        setNode(nodeCC, nodeF, null, null, nodeC, null, null);
        setNode(nodeF, null, nodeFinal, nodeFA, nodeCC, null, null);
        setNode(nodeFA, null, null, null, nodeF,null,null);
        setNode(nodeFinal, null, null, null, nodeF, null, null);
        setNode(nodeBA, nodeBAA, null, null, nodeB, null, null);
        setNode(nodeBAA, nodeBAAA, null, null, null, nodeBA, nodeAAA);
        setNode(nodeBAAA,null, null, null,nodeBAA, null, null);
        setNode(nodeBB, nodeAAA, null, null, nodeB, null, null);
        setNode(nodeAA, nodeAAA, null, null, nodeA, null, null);
        setNode(nodeAAA, null, nodeABB, nodeBAA, nodeAA, nodeBB, nodeABA);
        setNode(nodeAB, null, nodeABB,  nodeABA, nodeA, null, null);
        setNode(nodeABA, nodeAAA, null, null, nodeAB, null, null);
        setNode(nodeABB, nodeABBA, null, null, null, nodeAAA, nodeAB);
        setNode(nodeABBA, null, nodeC, nodeStart, nodeABB, null, null);
        return nodeStart;
    }
}
