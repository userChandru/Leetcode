/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    struct ListNode *temp=head;
    int p=0,num=0;
    while(temp!=NULL){
        p++;
        temp=temp->next;
    }
    temp=head;
    while(temp!=NULL){
        num+=pow(2,(p--)-1)*temp->val;
        temp=temp->next;
    }
    return num;
}