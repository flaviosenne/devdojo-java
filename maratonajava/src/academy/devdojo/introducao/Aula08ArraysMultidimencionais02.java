package academy.devdojo.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
       int[][] days = new int[3][];
       int[] array = {1,2,3};

       days[0] = new int[]{1,2};
       days[1] = array;
       days[2] = new int[]{1,2,3,4,5,6};

       int[][] arrayMulti = {{1,2}, {1,2,3,}, {1,2,3,4,5,6}};

       for(int[] day: arrayMulti){
           System.out.println("\n--------");
           for(int num: day){
               System.out.print(num+ " ");
           }
       }

    }
}
