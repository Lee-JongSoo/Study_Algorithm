import java.util.LinkedList;
import java.util.Queue;

/**
 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
 각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를 길이로 하겠습니다.
 최단거리는 BFS
 */

class Node4 {
    int data;
    Node4 lt, rt;

    public Node4(int val) {
        data = val;
        lt = rt = null;
    }
}

public class ShortestPath_BFS {

    Node4 root;

    public int BFS(Node4 root) {
        Queue<Node4> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node4 cur = Q.poll();
                if (cur.lt ==null && cur.rt == null) return L;
                if (cur.lt !=null ) Q.offer(cur.lt);
                if (cur.rt !=null ) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        ShortestPath_BFS tree = new ShortestPath_BFS();
        tree.root = new Node4(1);
        tree.root.lt = new Node4(2);
        tree.root.rt = new Node4(3);
        tree.root.lt.lt = new Node4(4);
        tree.root.lt.rt = new Node4(5);
        System.out.println(tree.BFS(tree.root));
    }
}
