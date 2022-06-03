package Hackkerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sol3 {

    public static int migratoryBirds(List<Integer> arr) {
        // Parallel Array. Bird type and tye count of the bird of that type
        ArrayList<Integer> birdType = new ArrayList<Integer>();
        ArrayList<Integer> birdCount = new ArrayList<Integer>();

// Keeping track of the type of bird & how many of that bird was seen.
        int biggestBird = -1;
        int bigBirdCount = -1;

//Checking every bird.
        for (int i : arr){
//If the bird we're looking at was seen before...
            if (birdType.contains(Integer.valueOf(i))){
//Get the index of the bird in our array.
                int index = birdType.indexOf(Integer.valueOf(i));
//Increase the count of times that bird was seen
                birdCount.set(index, birdCount.get(index) + 1);

                //If this index has more bird sighted
                //OR this bird has a lower index AND equals the seen of most sighted
                if(birdCount.get(index) > bigBirdCount ||
                        (birdCount.get(index).equals(bigBirdCount) && birdType.get(index) < biggestBird)
                ){
//Most seen bird is the type of bird we are seeing.
                    biggestBird = i;
//Set the times the bird was seen to be equal to the times we've seen this bird.
                    bigBirdCount = birdCount.get(index);
                }
            }
//If the bird was not seen before...
            else{
//Add the bird to our bird type seen
                birdType.add(Integer.valueOf(i));
//Set the bird seen once.
                birdCount.add(1);
//if this is the first bird seen at all, set this to the most seen bird
                if(birdType.size() == 1){
                    biggestBird = i;
                    bigBirdCount = 1;
                }
            }
        }
        //Return which bird we saw the most.
        return biggestBird;

    }

}
