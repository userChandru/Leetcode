typedef struct HashSetNode {
    int key;
    struct HashSetNode* next;
} HashSetNode;

// Function to create a new hash set node
HashSetNode* createNode(int key) {
    HashSetNode* newNode = (HashSetNode*)malloc(sizeof(HashSetNode));
    newNode->key = key;
    newNode->next = NULL;
    return newNode;
}

// Hash function
int hash(int key, int capacity) {
    return abs(key % capacity);
}

// Function to insert a key into the hash set
bool insert(HashSetNode** hashSet, int capacity, int key) {
    int index = hash(key, capacity);
    HashSetNode* current = hashSet[index];

    // Check if the key already exists
    while (current != NULL) {
        if (current->key == key) {
            return true; // Duplicate found
        }
        current = current->next;
    }

    // Insert the key as a new node
    HashSetNode* newNode = createNode(key);
    newNode->next = hashSet[index];
    hashSet[index] = newNode;
    return false;
}

// Function to check for duplicates
bool containsDuplicate(int* nums, int numsSize) {
    int capacity = numsSize;
    HashSetNode** hashSet = (HashSetNode**)calloc(capacity, sizeof(HashSetNode*));

    for (int i = 0; i < numsSize; i++) {
        if (insert(hashSet, capacity, nums[i])) {
            // Free allocated memory before returning
            for (int j = 0; j < capacity; j++) {
                HashSetNode* current = hashSet[j];
                while (current != NULL) {
                    HashSetNode* temp = current;
                    current = current->next;
                    free(temp);
                }
            }
            free(hashSet);
            return true;
        }
    }

    // Free allocated memory before returning
    for (int i = 0; i < capacity; i++) {
        HashSetNode* current = hashSet[i];
        while (current != NULL) {
            HashSetNode* temp = current;
            current = current->next;
            free(temp);
        }
    }
    free(hashSet);
    return false;
}