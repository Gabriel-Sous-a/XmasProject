package Map;

import Game.Items.Key.ShiningKey;
import Game.Items.heal.Bandage;
import Game.Items.heal.FistAidKit;
import Game.Items.weapon.MetalBar;
import Game.Npc.Peaceful.Casper;
import Game.Npc.Peaceful.ElderGhost;
import Game.Npc.Violent.CrazyMan;
import Game.Npc.Violent.Demon;
import Map.Rooms.*;

public class MapCreation {

    public static void setNode(Node actual, Node next, Node right, Node left, Node back, Node backLeft, Node backRight) {
        actual.setNext(next);
        actual.setRight(right);
        actual.setLeft(left);
        actual.setBack(back);
        actual.setBackLeft(backLeft);
        actual.setBackRight(backRight);
    }

    public static Node create() {
        Node nodeStart = new Node(new Start("0000"));
        Node nodeA = new Node(new A("A000"), new Casper());
        Node nodeAA = new Node(new AA("AA00"));
        Node nodeAAA = new Node(new AAA("AAA0"), new CrazyMan());
        Node nodeAB = new Node(new AB("AB00"));
        Node nodeABA = new Node(new ABA("ABA0"));
        Node nodeABB = new Node(new ABB("ABB0"));
        Node nodeABBA = new Node(new ABBA("ABBA"), new FistAidKit());
        Node nodeB = new Node(new B("B000"));
        Node nodeBA = new Node(new BA("BA00"));
        Node nodeBAA = new Node(new BAA("BAA0"));
        Node nodeBAAA = new Node(new BAAA("BAAA"), new ShiningKey("C000"));
        Node nodeBB = new Node(new BB("BB00"));
        Node nodeC = new Node(new C("C000"), false);
        Node nodeCA = new Node(new CA("CA00"));
        Node nodeCAA = new Node(new CAA("CAA0"), new ShiningKey("F000"));
        Node nodeCB = new Node(new CB("CB00"), new ElderGhost());
        Node nodeCC = new Node(new CC("CC00"));
        Node nodeF = new Node(new F("F000"), false, new Demon());
        Node nodeFA = new Node(new FA("FA00"));
        Node nodeFinal = new Node(new Final("1111"));
        setNode(nodeStart, nodeB, nodeA, nodeC, null, null, null);
        setNode(nodeA, null, nodeAB, nodeAA, nodeStart, null, null);
        setNode(nodeB, null, nodeBB, nodeBA, nodeStart, null, null);
        setNode(nodeC, nodeCB, nodeCA, nodeCC, nodeStart, null, null);
        setNode(nodeCA, nodeCAA, null, null, nodeC, null, null);
        setNode(nodeCAA, null, null, null, nodeCA, null, null);
        setNode(nodeCB, null, null, null, nodeC, null, null);
        setNode(nodeCC, nodeF, null, null, nodeC, null, null);
        setNode(nodeF, null, nodeFinal, nodeFA, nodeCC, null, null);
        setNode(nodeFA, null, null, null, nodeF, null, null);
        setNode(nodeFinal, null, null, null, nodeF, null, null);
        setNode(nodeBA, nodeBAA, null, null, nodeB, null, null);
        setNode(nodeBAA, nodeBAAA, null, null, null, nodeBA, nodeAAA);
        setNode(nodeBAAA, null, null, null, nodeBAA, null, null);
        setNode(nodeBB, nodeAAA, null, null, nodeB, null, null);
        setNode(nodeAA, nodeAAA, null, null, nodeA, null, null);
        setNode(nodeAAA, null, nodeABB, nodeBAA, nodeAA, nodeBB, nodeABA);
        setNode(nodeAB, null, nodeABB, nodeABA, nodeA, null, null);
        setNode(nodeABA, nodeAAA, null, null, nodeAB, null, null);
        setNode(nodeABB, nodeABBA, null, null, null, nodeAAA, nodeAB);
        setNode(nodeABBA, null, nodeC, nodeStart, nodeABB, null, null);
        return nodeStart;


    }

    public static Node create2() {
        Node nodeStart = new Node(new Start("0000"));
        Node nodeA = new Node(new A("A000"));
        Node nodeAA = new Node(new AA("AA00"), new MetalBar());
        Node nodeB = new Node(new B("B000"));
        Node nodeBA = new Node(new BA("BA00"));
        Node nodeBB = new Node(new BB("BB00"), new CrazyMan());
        Node nodeBBA = new Node(new BBA("BBA0"), new Bandage());
        Node nodeBBAA = new Node(new BBAA("BBAA"), new ShiningKey("1111"));
        Node nodeBBB = new Node(new BBB("BBB0"));
        Node nodeC = new Node(new C("C000"));
        Node nodeFinal = new Node(new Final("1111"), false);
        setNode(nodeStart, nodeB, nodeC, nodeA, nodeFinal, null, null);
        setNode(nodeA, nodeAA, null, null, nodeStart, null, null);
        setNode(nodeAA, null,null,null, nodeA,null,null);
        setNode(nodeB, null, nodeBB, nodeBA, nodeStart, null,null);
        setNode(nodeBA, null, null,null, nodeB, null, null);
        setNode(nodeBB, null, nodeBBB, nodeBBA, nodeB, null,null);
        setNode(nodeBBA, nodeBBAA, null,null,nodeBB, null,null);
        setNode(nodeBBAA, null,null,null, nodeBBA,null,null);
        setNode(nodeBBB, null, null, null, null, nodeBB, nodeC);
        setNode(nodeC,nodeBBB, null,null, nodeStart,null,null);
        setNode(nodeFinal, null,null, null, nodeStart, null,null);
        return nodeStart;
    }
}
