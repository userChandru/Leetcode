/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
 public:
  ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
    ListNode l3(0);
    ListNode* head = &l3;
    int rem = 0;

    while (l1 != nullptr || l2 != nullptr || rem > 0) {
      if (l1 != nullptr) {
        rem += l1->val;
        l1 = l1->next;
      }
      if (l2 != nullptr) {
        rem += l2->val;
        l2 = l2->next;
      }
      head->next = new ListNode(rem % 10);
      rem /= 10;
      head = head->next;
    }

    return l3.next;
  }
};