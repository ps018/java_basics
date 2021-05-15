public class Main {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        //String data array to avoid typing loads of addItem instructions:
        String stringData = ("5 7 3 2 1 0 8 9 1");

        String[] data = stringData.split(" ");
        for (String s : data){
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());
    }
}
