/**
 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
 각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를 길이로 하겠습니다.
 최단거리는 BFS
 */

class Node3 {
    int data;
    Node3 lt, rt;

    public Node3(int val) {
        data = val;
        lt = rt = null;
    }
}

public class ShortestPath_DFS {

    Node3 root;

    public int DFS(int L, Node3 root) {
        if (root.lt==null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));

    }

    public static void main(String[] args) {
        ShortestPath_DFS tree = new ShortestPath_DFS();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
