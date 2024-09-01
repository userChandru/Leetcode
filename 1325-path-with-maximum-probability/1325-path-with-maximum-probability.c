double maxProbability(int n, int** edges, int edgesSize, int* edgesColSize, double* succProb, int succProbSize, int start_node, int end_node) {

    double* maxProb =(double *)malloc(sizeof(double)*n);
    maxProb[start_node] = 1.0;

    for (int i = 0; i < n - 1; i++) {
        int updated = 0;
        for (int j = 0; j < edgesSize; j++) {
            int u = edges[j][0];
            int v = edges[j][1];
            double prob = succProb[j];

            if (maxProb[u] * prob > maxProb[v]) {
                maxProb[v] = maxProb[u] * prob;
                updated = 1;
            }
            if (maxProb[v] * prob > maxProb[u]) {
                maxProb[u] = maxProb[v] * prob;
                updated = 1;
            }
        }
        if (!updated) break;
    }

    return maxProb[end_node];
}
