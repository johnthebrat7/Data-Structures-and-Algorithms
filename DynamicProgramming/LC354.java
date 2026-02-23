class Solution {
    class D implements Comparable<D>{
        int l;
        int b;
        D(int l, int b){
            this.l = l;
            this.b = b;
        }
        public int compareTo(D d){
            if(this.l == d.l) return this.b - d.b;
            return this.l - d.l;
        }
    }

    public int maxEnvelopes(int[][] e) {
        D[] a = new D[e.length];
        int i = 0;
        for(int[] arr : e){
            int row = arr[0];
            int col = arr[1];
            a[i++] = new D(row, col);
        }
        Arrays.sort(a);

        return find(a);
    }

    public int find(D[] a){
        int[] dp = new int[a.length];

        int leni = 0;
        int bredi = 0;
        int lenj = 0;
        int bredj = 0;

        int max = 1;

        for(int i = 0; i < a.length; i++){
            D curr = a[i];
            leni = curr.l;
            bredi = curr.b;

            for(int j = i-1; j >= 0; j--){
                D comp = a[j];
                lenj = comp.l;
                bredj = comp.b;

                if(leni > lenj && bredi > bredj){
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i] += 1;
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
