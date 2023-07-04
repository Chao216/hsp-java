public class Maze {
	public static void main(String[] args) {
		
		int[][] maze = new int[8][7];


		for (int i = 0; i < maze.length; i++){
			for (int j = 0; j < maze[i].length; j++){

				maze[0][j]= 1;
				maze[7][j]= 1;
			}
		}

		for (int i = 0; i < maze.length; i++){
			for (int j = 0; j < maze[i].length; j++){

				maze[i][0]= 1;
				maze[i][6]= 1;
			}
		}

		maze[3][1] = 1;
		maze[3][2] = 1;

		Solution mySol = new Solution();

		mySol.findWay(maze, 1,1);




		for (int i = 0; i < maze.length; i++){
			for (int j = 0; j < maze[i].length; j++){
				System.out.print(maze[i][j]+"\t");
			}

			System.out.println();
		}
	}
}
/* in the map, 1 means it's wall, 0 means no wall
therefore, 0 stands for walkable, 1 for not walkable, 2 for proved walkable, 3 for this way is dead way

*/
class Solution{
	public boolean findWay(int[][] map, int i, int j){// we will use this method to find possible way, return a boolean result 
							// int [][] will be the maze, i, j will represent position of our mouse
		if (map[6][5] == 2){// if the exit become 2, we think the mouse had figured out how to pass the mze
			return true;
		} else {

			if (map[i][j] == 0){
				// let us assume this way works;
				// so we set ij as 2

				map[i][j] = 2;

				if (findWay(map, i, j+1)){// how will this condition be true?
					return true;
				} else if (findWay(map, i+1, j)){// 除了map[6][5] == true;其他不可能为true
					return true;

				} else if (findWay(map, i, j-1)){
					return true;
				} else if (findWay(map, i-1, j)){
					return true;
				} else{
					map[i][j] = 3;
					return false;
				}


			} else {// if ij = 1, wall, 3 dead way, 2 means we had already tested!, no need to do test again;
				return false;
			}

		}

	}
}