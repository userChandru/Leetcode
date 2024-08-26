/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     int numChildren;
 *     struct Node** children;
 * };
 */

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void preOrder(struct Node* root, int* returnSize,int*ans){
    if(root == NULL)
        return;
    ans[(*returnSize)++]=root->val;

    for(int i=0;i<root->numChildren;i++)
        preOrder(root->children[i], returnSize,ans);
}


int* preorder(struct Node* root, int* returnSize) {
    *returnSize=0;
    int *ans=(int*)malloc(sizeof(int)*10000);
    preOrder(root, returnSize,ans);
    return ans;
}