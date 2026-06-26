class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<Double>();

        HashMap<Integer, Double> time = new HashMap<>();

        int len = position.length;


        for(int i =0 ; i < len;i++)
        {
            time.put(position[i], (double)(target - position[i]) / speed[i]);
        }  

        Arrays.sort(position); 

        stack.push(time.get(position[len -1 ]));

        for(int j = len - 2; j >=0; j--)
        {
            double currentTime = time.get(position[j]);
            if(currentTime > stack.peek())
            {
                stack.push(currentTime);
            }
                
        }
        return stack.size();


    }
}
