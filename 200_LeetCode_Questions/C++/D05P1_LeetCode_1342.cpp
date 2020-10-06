class Solution {
public:
    int numberOfSteps (int num) {
        int steps = 0;
        while(num)
        {
            if(num != 1 && num % 2 == 1)
            {
                steps++;
            }
            steps++;
            num = num >> 1;
        }
        return steps;
    }
};
