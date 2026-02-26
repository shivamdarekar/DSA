//trapped rainwater = (waterlevel from ground - height of bar) * width
//waterlevel = min(maxLeft boundary, maxRight boundary)
//starting mai hi left & right max boundary nikalke unko auxillary array(helper array) store karenge

public class TrappedRainwater {

    public static int trappedWater(int height[]){
        int n = height.length;

        //calculate left max boundry
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1]; // last element rightmax boundary is its height
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(rightMax[i],leftMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water: "+trappedWater(height));

    }
}

//time complexity = O(n) -> good