public class LinkedList {
    Node head;

    public void insert(int x) {
        //new node
        Node node = new Node(x);
        //next node is equal to empty
        node.next = null;
        //if the head node is empty, head takes on nodes value
        if (head == null) {
            head = node;
            //else create new node address and set it to head.
        } else {
            Node address = head;
            //while address's next node is not null, set address to the next address.
            while (address.next != null) {
                address = address.next;
            }
            //once null, next address is equal to the added node
            address.next = node;
        }
    }

    public void show(){
        //new node is equal to head.
        Node node = head;
        // while node's next is not empty, print out node data, print last node
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
