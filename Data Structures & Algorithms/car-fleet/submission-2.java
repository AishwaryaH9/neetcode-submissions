class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<Double>();

        HashMap<Integer, Double> time = new HashMap<>();


        for(int i =0 ; i < position.length;i++)
        {
            time.put(position[i], (double)(target - position[i]) / speed[i]);
        }  

        Arrays.sort(position); 
        stack.push(time.get(position[position.length -1 ]));
        for(int j = position.length -2 ; j >=0;j--)
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
