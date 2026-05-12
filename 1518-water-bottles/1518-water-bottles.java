class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        //no. of Bottle we can drink initially
        int answer = numBottles;

        // to exchange for a new full bottle
        while(numBottles >= numExchange) {
            // Number of new bottles obtained after exchange
            int newBottles = numBottles / numExchange;
            // Remaining empty bottles after exchange
            int remBottles = numBottles % numExchange;

            // Add newly obtained bottles to total drinks
            answer += newBottles;

            // Update total empty bottles available for next exchange
            numBottles = newBottles + remBottles;
        }

        // Return total number of bottles drunk
        return answer;
    }
}