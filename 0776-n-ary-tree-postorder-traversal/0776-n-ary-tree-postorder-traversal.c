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
void postTravel(struct Node* root, int* returnSize,int*ans){
    if(root == NULL)
        return;

    for(int i=0;i<root->numChildren;i++)
        postTravel(root->children[i], returnSize,ans);

    ans[(*returnSize)++]=root->val;

}

int* postorder(struct Node* root, int* returnSize) {
    *returnSize=0;
    int *ans=(int*)malloc(sizeof(int)*10000);
    postTravel(root, returnSize,ans);
    return ans;
}