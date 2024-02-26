class DoublyLinkedList {
    //Класс узла для двусвязного списка.
    static class Node{
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    //Первоначально для головы и хвоста установлено значение null.
    Node head, tail = null;

    //добавить узел в список
    public void addNode(int item) {
        //Создать новый узел
        Node newNode = new Node(item);

        //если список пуст, заголовок и хвост указывают на newNode
        if(head == null) {
            head = tail = newNode;
            //предыдущая глава будет нулевой
            head.previous = null;
            //следующий хвост будет нулевым
        }
        else {
            //добавьте newNode в конец списка. хвост->следующий установлен на newNode
            tail.next = newNode;
            //newNode->предыдущий установлен в хвост
            newNode.previous = tail;
            //newNode получает новый хвост
            tail = newNode;
            //следующая точка хвоста равна нулю
        }
        tail.next = null;
    }

    //распечатать все узлы двусвязного списка
    public void printNodes() {
        //Node указывает на голову
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Распечатайте каждый узел и затем перейдите к следующему.
            System.out.print(current.item + " ");
            current = current.next;
        }
    }
}
class Main{
    public static void main(String[] args) {
        //создать Object DoublyLinkedList
        DoublyLinkedList dl_List = new DoublyLinkedList();
        //Add nodes to the list
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);

        //распечатать узлы DoublyLinkedList
        dl_List.printNodes();
    }
}