import java.util.*;

import BasicMaths.primeOrNot;

public class HuffmanCoder {

    private HashMap<String, Character> decoder;
    private HashMap<Character, String> encoder;

    private class Node implements Comparable<Node> {
        int cost ;
        Character text ;
        Node  left ;
        Node  right;

        Node(Character text , int cost){
            this.text=text;
            this.cost = cost ;
            this.left=null;
            this.right=null;
        }
        @Override
        public int compareTo(Node other) {
             return this.cost - other.cost;
        }
    }

     
    // Constructor
    public HuffmanCoder(String feeder) {
        // Step 1: Frequency map
        HashMap <Character,Integer> fmap = new HashMap<>();
        for (Character ch : feeder.toCharArray()) {
            fmap.put(ch, fmap.getOrDefault(ch, 0)+1);
        } 

        // Step 2: Min heap (Priority Queue)
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Character , Integer>  entry :  fmap.entrySet() ) {
            priorityQueue.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Step 3: Build Huffman Tree
        while (priorityQueue.size() > 1) {
            Node  leftNode =  priorityQueue.poll();
            Node  rightNode =  priorityQueue.poll();
            Node newNode = new Node('\0', leftNode.cost+rightNode.cost);
            newNode.left= leftNode;
            newNode.right= rightNode;
            priorityQueue.add(newNode);
        }

        Node root = priorityQueue.poll();

        // Step 4: Generate encoder & decoder
        encoder = new HashMap<>();
        decoder= new HashMap<>();
        buildEncoderDecoder(root, "");
    }

    private void buildEncoderDecoder(Node node, String code) {
        if (node==null)
            return ;
        if (node.left == null  && node.right== null) {
            if (code.length()==0) code ="0";
            encoder.put(node.text , code);
            decoder.put(code , node.text);
        }
        buildEncoderDecoder(node.left, code + "0");
        buildEncoderDecoder(node.right, code + "1");

    }

    // Encode text → binary string
    public String encode(String source) {
        StringBuilder sb  = new StringBuilder();
        for (Character  ch : source.toCharArray()) {
            sb.append(encoder.get(ch));
        }
        return sb.toString();
    }

    // Decode binary string → original text
    public String decode(String codedString) {
        StringBuilder ans  = new StringBuilder();
        String  key ="";

        for (char ch : codedString.toCharArray()) {
            key +=ch;
            if (decoder.containsKey(key)) {
                ans.append(decoder.get(key));
                key="";
            }
        }
        return ans.toString();
    }

    // Test / Demo
    public static void main(String[] args) {
        String text = "hello huffman";

        HuffmanCoder coder = new HuffmanCoder(text);

        String encoded = coder.encode(text);
        String decoded = coder.decode(encoded);

        System.out.println("Original: " + text);
        System.out.println("Encoded Bits: " + encoded);
        System.out.println("Decoded Back: " + decoded);
    }
}
