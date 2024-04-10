import java.util.*;

public class Pascaltriangle {
    // Method to generate Pascal's Triangle up to numRows
    public List<List<Integer>> generate(int numRows) 
    {
        // Create a list to hold the rows of Pascal's Triangle
        List<List<Integer>> pascal = new ArrayList<>();

        // If numRows is 0, return an empty list
        if(numRows == 0) return pascal;

        // Create the first row of Pascal's Triangle (containing only 1)
        List<Integer> first = new ArrayList<>();
        first.add(1);
        // Add the first row to the triangle
        pascal.add(first);

        // Iterate to generate subsequent rows
        for(int i = 1; i < numRows; i++)
        {
            // Get the previous row
            List<Integer> prev = pascal.get(i - 1);
            // Create a new row
            List<Integer> row = new ArrayList<>();
            // Add the first element of each row (always 1)
            row.add(1);
            // Iterate through the elements of the previous row to calculate the new row
            for(int j = 1; j < i; j++)
            {
                // Each element (excluding the first and last) of the new row is the sum of the corresponding elements of the previous row
                row.add(prev.get(j - 1) + prev.get(j));
            }
            // Add the last element of each row (always 1)
            row.add(1);
            // Add the new row to Pascal's Triangle
            pascal.add(row);
        }
        // Return the generated Pascal's Triangle
        return pascal;
    }
}


//time comeplexity: O(N^2)