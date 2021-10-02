class MyLinkedList {
    // a basic linked list structure; initialised with parameter x;
    struct Node {
        int val;
        Node *next;
        Node(int x){
            val=x;
            next=NULL;
        }
    };
public:
    Node *head=NULL;
    Node *tail=NULL;
    int len=0;
    /** Initialize your data structure here. */
    MyLinkedList() {
        //keep track of first and last pointers
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    int get(int index) {
        if(index<len) {    
        Node *curr=head;
        int curr_index=0;
        while(curr_index!=index){
            curr=curr->next;
            curr_index++;
        }
        return curr->val;
       }
         return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    void addAtHead(int val) {
        Node *temp= new Node (val); //create a new node
        temp->next=head;
        head=temp;
        len++;
        if(tail==NULL){ // in case there is only one element after insertion, update tail 
            tail=head;
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    void addAtTail(int val) {
        Node *temp=new Node (val);
        if(tail){ //if tail is there (means atleast 1 element in linkedlist)
        tail->next = temp;
            
        }
        tail=temp;
        //worng temp->next = NULL;
        if(head==NULL){ //incase linkedlist is empty
            head=temp;
        }
        
        len++;
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    void addAtIndex(int index, int val) {
        if(index>len)
            return;
        if(index==len)
            addAtTail(val);
        else if(index==NULL)
            addAtHead(val);
        else {
            Node *temp = new Node (val);
            Node *curr=head;
            int currInd=0;
            while(currInd!=index-1){
                currInd++;
                curr=curr->next;
            }
            temp->next=curr->next;
            curr->next=temp;
            len++;
         
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    void deleteAtIndex(int index) {
        if(index>=len){ // if index is beyond range
            return ;
        }
        if(index==0){
            head=head->next;
            len--;
            if(head==NULL){ // head becomes null after removal
                tail==NULL;
            }
            return;
        }
        int currInd=0;
        Node* curr=head;
        while(currInd!=index-1)
        {
            currInd++;
            curr=curr->next;
        }
        if(index==len-1)
            tail=curr;
        curr->next=curr->next->next;
        len--;
        
    }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */