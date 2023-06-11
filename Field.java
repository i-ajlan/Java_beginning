import java.util.Random;

class Field{
    int w, h;
    char matrix[][];

    Field(int w, int h){
        this.w = w;
        this.h = h;
        matrix = new char[h][w];
    }

    Random rdm = new Random();
    void fill(){
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                int dice = rdm.nextInt(100);
                if(dice<50){
                    matrix[i][j]='_';
                }else if(dice<70){
                    matrix[i][j]='$';
                }else if(dice<90){
                    matrix[i][j]='0';
                }else{
                    matrix[i][j]='*';
                }
            }
        }
    }

    void output(){
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    void output(Unit unit){
        for(int i=0; i< h; i++){
            for(int j=0; j<w; j++){
                if(unit.x==j && unit.y==i){
                    System.out.print("P"+" ");
                }else{
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("HP: "+unit.hp+" Score: "+unit.score);
    }

    boolean canGo(int x, int y){
        if(x<0 || x>=w || y<0 || y>=h){
            return false;
        }

        return matrix[y][x] != '0';
    }

    

    boolean isObstacle(int x, int y){
        return matrix[y][x] == '0';
    }

    boolean gainPoints(int x, int y){
        return matrix[y][x] == '$';
    }

    boolean loseHp(int x, int y){
        return matrix[y][x] == '*';
    }
}