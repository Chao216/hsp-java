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




		for (int i = 0; i < maze.length; i++){
			for (int j = 0; j < maze[i].length; j++){
				System.out.print(maze[i][j]+"\t");
			}

			System.out.println();
		}
	}
}