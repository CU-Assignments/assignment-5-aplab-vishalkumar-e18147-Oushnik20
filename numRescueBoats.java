class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=people.length-1,j=0;
        Arrays.sort(people);
        int c=0;
        while(j<=i){
            if(people[i]+people[j]<=limit)
                j++;
            i--;
            c++;
        }
        return c;
    }
}
