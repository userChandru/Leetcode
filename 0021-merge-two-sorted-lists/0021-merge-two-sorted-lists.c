/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {

    if (list1 == NULL) 
        return list2;
    if (list2 == NULL) 
        return list1;
    
    struct ListNode* ans =(struct ListNode*)malloc(sizeof(struct ListNode));
    if(list1->val > list2->val){
        ans ->val = list2->val;
        list2 = list2->next;
    }
    else{
        ans ->val=list1->val;
        list1=list1->next;
    }

    struct ListNode* temp = ans; 
    while(list1 != NULL && list2 != NULL){
        temp->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        temp = temp->next;
        if(list1->val >list2->val){
            temp -> val=list2->val;
            list2=list2->next;
            printf("l2-%d\n",temp->val);
        }
        else{
            temp -> val=list1->val;
            list1=list1->next;
            printf("l1-%d\n",temp->val);
        }
    }
    if(list2 != NULL)
        temp->next=list2;
    else if(list1 != NULL)
        temp->next=list1;

    return ans;
}