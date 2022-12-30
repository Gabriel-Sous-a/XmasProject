package Map;

import Game.Items.Key.ShiningKey;
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
        Node nodeStart = new Node(new Start("0000"));
        Node nodeA = new Node(new A("A000"));
        Node nodeAA = new Node(new AA("AA00"));
        Node nodeAAA = new Node(new AAA("AAA0"));
        Node nodeAB = new Node(new AB("AB00"));
        Node nodeABA = new Node(new ABA("ABA0"));
        Node nodeABB = new Node(new ABB("ABB0"));
        Node nodeABBA = new Node(new ABBA("ABBA"));
        Node nodeB = new Node(new B("B000"));
        Node nodeBA = new Node(new BA("BA00"));
        Node nodeBAA = new Node(new BAA("BAA0"));
        Node nodeBAAA = new Node(new BAAA("BAAA"), new ShiningKey("C000"));
        Node nodeBB = new Node(new BB("BB00"));
        Node nodeC = new Node(new C("C000"), false);
        Node nodeCA = new Node(new CA("CA00"));
        Node nodeCAA = new Node(new CAA("CAA0"), new ShiningKey("F000"));
        Node nodeCB = new Node(new CB("CB00"));
        Node nodeCC = new Node(new CC("CC00"));
        Node nodeF = new Node(new F("F000"), false);
        Node nodeFA = new Node(new FA("FA00"));
        Node nodeFinal = new Node(new Final("1111"));
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

    public static Node mapCreation2 () {
        Node nodeStart = new Node(new Start("0000"));
        Node nodeA = new Node(new A("A000"));
        Node nodeAA = new Node(new AA("AA00"));
        Node nodeB = new Node(new B("B000"));
        Node nodeBA = new Node(new BA("BA00"));
        Node nodeBB = new Node(new BB("BB00"));
        Node nodeC = new Node(new C("C000"), false);
        Node nodeCA = new Node(new CA("CA00"));
        Node nodeCAA = new Node(new CAA("CAA0"), new ShiningKey("F000"));
        Node nodeCB = new Node(new CB("CB00"));
        Node nodeCC = new Node(new CC("CC00"));
        Node nodeF = new Node(new F("F000"), false);
        Node nodeFA = new Node(new FA("FA00"));
        Node nodeFinal = new Node(new Final("1111"));
        return nodeStart;
    }
}
