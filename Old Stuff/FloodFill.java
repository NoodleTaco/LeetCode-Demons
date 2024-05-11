class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] == color)
        {
            return image;
        }

        floodFillHelper(image,sr,sc,color,image[sr][sc]);

        return image;
        
    }

    private void floodFillHelper(int[][] image, int sr, int sc, int color, int start)
    {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) 
        {
            return;
        }
        if (image[sr][sc] != start)
        {
            return;
        }

        image[sr][sc] = color;

        floodFillHelper(image, sr-1, sc, color, start);
        floodFillHelper(image, sr+1, sc, color, start);
        floodFillHelper(image, sr, sc-1, color, start);
        floodFillHelper(image, sr, sc+1, color, start);
    }
}