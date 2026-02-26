public class ShortestPath {

    public static float getShortestPath(String path){
        int x = 0 ,y = 0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            switch (dir) {
                case 'S' -> y--;
                case 'N' -> y++;
                case 'E' -> x++;
                case 'W' -> x--;
                default -> {
                    // Ignore invalid directions
                }
            }
        }

        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2 + y2);

    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        
        System.out.println(getShortestPath(path));
    }
}