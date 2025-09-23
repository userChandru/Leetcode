class Solution {
    public int compareVersion(String version1, String version2) {
        String ver1[] = version1.split("\\.");
        String ver2[] = version2.split("\\.");
        int len1 = ver1.length;
        int len2 = ver2.length;
        int max = Math.max(len1, len2);

        for(int i = 0; i<max; i++){
            int v1 = len1 > i ? Integer.parseInt(ver1[i]):0;
            int v2 = len2 > i ? Integer.parseInt(ver2[i]):0;

            if(v1>v2)
                return 1;
            else if(v1<v2)
                return -1;
        }
        return 0;
    }
}