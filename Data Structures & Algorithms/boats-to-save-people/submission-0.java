class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        Arrays.sort(people);
        int l=0,r=people.length-1;
        while(l<=r)
        {
            if(people[l] == limit)
            {
                c++;
                l++;
                continue;
            }
            if(people[r]==limit)
            {
                c++;
                r--;
                continue;
            }
            int sum=people[l]+people[r];
            if(sum<=limit)
            {
                l++;
                r--;
                c++;
            }
            else{
                r--;
                c++;
            }
            if(l==r)
            {
                if(people[l]<limit) c++;
                break;
            }
        }
        return c;
    }
}